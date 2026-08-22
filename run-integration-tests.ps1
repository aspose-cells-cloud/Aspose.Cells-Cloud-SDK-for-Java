<#
.SYNOPSIS
    Runs the Aspose.Cells Cloud SDK for Java test suite (unit + integration), collects the results
    from the Surefire reports, and generates a test report (Markdown + HTML).

.DESCRIPTION
    The script sets the required credentials as environment variables, invokes Maven (`mvn test`),
    parses the resulting `target/surefire-reports/TEST-*.xml` files, and emits:

      * a summary on the console (total / passed / failed / errors / skipped)
      * a Markdown report (`test-reports/test-report.md`)
      * an HTML report (`test-reports/test-report.html`)

    Integration tests self-skip (JUnit `Assumptions.assumeTrue`) when credentials are absent, so
    running without credentials exercises only the offline unit tests and reports the rest as skipped.

.PARAMETER ClientId
    Aspose Cloud client id. Defaults to the CellsCloudClientId environment variable.

.PARAMETER ClientSecret
    Aspose Cloud client secret. Defaults to the CellsCloudClientSecret environment variable.

.PARAMETER BaseUrl
    Aspose Cloud API base URL. Defaults to https://api.aspose.cloud.

.PARAMETER TestFilter
    Optional Surefire `-Dtest=` filter (e.g. "CellsControllerTest" or
    "CellsControllerTest#postClearContents").

.PARAMETER OutputDir
    Directory for the generated report files. Defaults to "test-reports".

.PARAMETER MavenGoals
    Maven goals to run. Defaults to "test" (which runs unit + integration tests together).

.EXAMPLE
    .\run-integration-tests.ps1 -ClientId "..." -ClientSecret "..."

.EXAMPLE
    .\run-integration-tests.ps1 -ClientId "..." -ClientSecret "..." -TestFilter "CellsControllerTest"

.EXAMPLE
    $env:CellsCloudClientId = "..."; $env:CellsCloudClientSecret = "..."
    .\run-integration-tests.ps1
#>
[CmdletBinding()]
param(
    [string]$ClientId = $env:CellsCloudClientId,
    [string]$ClientSecret = $env:CellsCloudClientSecret,
    [string]$BaseUrl = $env:CellsCloudApiBaseUrl,
    [string]$TestFilter = "",
    [string]$OutputDir = "test-reports",
    [string]$MavenGoals = "test"
)

$ErrorActionPreference = "Stop"

if ([string]::IsNullOrWhiteSpace($BaseUrl)) { $BaseUrl = "https://api.aspose.cloud" }

function Write-Step {
    param([string]$Message)
    Write-Host ("[{0}] {1}" -f (Get-Date -Format "HH:mm:ss"), $Message) -ForegroundColor Cyan
}

function Get-FirstLine {
    param([string]$Text)
    if ([string]::IsNullOrEmpty($Text)) { return "" }
    $idx = $Text.IndexOf("`n")
    if ($idx -ge 0) { return $Text.Substring(0, $idx).TrimEnd("`r").Trim() }
    return $Text.Trim()
}

function Resolve-Maven {
    $cmd = Get-Command mvn -ErrorAction SilentlyContinue
    if ($cmd) { return "mvn" }
    $mvnw = Join-Path $PSScriptRoot "mvnw"
    if (Test-Path $mvnw) { return $mvnw }
    throw "Maven ('mvn') was not found on PATH and no mvnw wrapper is present."
}

# ---------------------------------------------------------------------------
# 1. Prepare environment
# ---------------------------------------------------------------------------
$projectRoot = $PSScriptRoot
if (-not $projectRoot) { $projectRoot = (Get-Location).Path }

Write-Step "Project root : $projectRoot"
Write-Step "Base URL     : $BaseUrl"

if ([string]::IsNullOrWhiteSpace($ClientId) -or [string]::IsNullOrWhiteSpace($ClientSecret)) {
    Write-Warning "Credentials are not fully set. Integration tests will self-skip; only offline unit tests will run."
} else {
    Write-Step "Credentials  : provided (client id '$ClientId')"
}

$env:CellsCloudClientId = $ClientId
$env:CellsCloudClientSecret = $ClientSecret
$env:CellsCloudApiBaseUrl = $BaseUrl

$mvn = Resolve-Maven
$reportDir = Join-Path $projectRoot $OutputDir
$surefireDir = Join-Path $projectRoot "target\surefire-reports"

if (Test-Path $surefireDir) {
    Write-Step "Clearing previous Surefire reports under target/surefire-reports."
    Get-ChildItem -Path $surefireDir -Filter "TEST-*.xml" -ErrorAction SilentlyContinue |
        Remove-Item -Force -ErrorAction SilentlyContinue
}

# ---------------------------------------------------------------------------
# 2. Run Maven
# ---------------------------------------------------------------------------
$mvnArgs = @($MavenGoals, "--batch-mode")
if (-not [string]::IsNullOrWhiteSpace($TestFilter)) {
    $mvnArgs += "-Dtest=$TestFilter"
}

Write-Step ("Running: {0} {1}" -f $mvn, ($mvnArgs -join " "))
Push-Location $projectRoot
try {
    & $mvn @mvnArgs
    $mvnExit = $LASTEXITCODE
} finally {
    Pop-Location
}
Write-Step "Maven exited with code $mvnExit."

# ---------------------------------------------------------------------------
# 3. Collect results
# ---------------------------------------------------------------------------
$classes = New-Object System.Collections.ArrayList
$testCases = New-Object System.Collections.ArrayList
$total = 0; $failed = 0; $errors = 0; $skipped = 0

if (Test-Path $surefireDir) {
    foreach ($file in (Get-ChildItem -Path $surefireDir -Filter "TEST-*.xml" | Sort-Object Name)) {
        try {
            [xml]$xml = Get-Content -LiteralPath $file.FullName -Raw
        } catch {
            Write-Warning ("Could not parse report '{0}': {1}" -f $file.Name, $_)
            continue
        }
        $suite = $xml.testsuite
        if (-not $suite) { continue }

        $c = [PSCustomObject]@{
            Name     = [string]$suite.name
            Tests    = [int]$suite.tests
            Failures = [int]$suite.failures
            Errors   = [int]$suite.errors
            Skipped  = [int]$suite.skipped
            Time     = [double]$suite.time
        }
        [void]$classes.Add($c)

        $total   += $c.Tests
        $failed  += $c.Failures
        $errors  += $c.Errors
        $skipped += $c.Skipped

        foreach ($tc in $suite.testcase) {
            $status = "PASSED"
            $detail = ""
            if ($tc.failure) { $status = "FAILED"; $detail = [string]$tc.failure.message }
            elseif ($tc.error) { $status = "ERROR"; $detail = [string]$tc.error.message }
            elseif ($tc.skipped) { $status = "SKIPPED"; $detail = [string]$tc.skipped.message }
            [void]$testCases.Add([PSCustomObject]@{
                Class  = [string]$suite.name
                Name   = [string]$tc.name
                Status = $status
                Time   = [double]$tc.time
                Detail = $detail
            })
        }
    }
}

$passed = $total - $failed - $errors - $skipped
if ($passed -lt 0) { $passed = 0 }

$notOk = $testCases | Where-Object { $_.Status -eq "FAILED" -or $_.Status -eq "ERROR" }

# ---------------------------------------------------------------------------
# 4. Console summary
# ---------------------------------------------------------------------------
Write-Host ""
Write-Host "================ TEST SUMMARY ================" -ForegroundColor White
Write-Host ("Total    : {0}" -f $total)
Write-Host ("Passed   : {0}" -f $passed) -ForegroundColor Green
Write-Host ("Failed   : {0}" -f $failed) -ForegroundColor $(if ($failed -gt 0) { "Red" } else { "DarkGray" })
Write-Host ("Errors   : {0}" -f $errors) -ForegroundColor $(if ($errors -gt 0) { "Red" } else { "DarkGray" })
Write-Host ("Skipped  : {0}" -f $skipped) -ForegroundColor Yellow
Write-Host "==============================================" -ForegroundColor White

if ($notOk) {
    Write-Host ""
    Write-Host "Failed / errored tests:" -ForegroundColor Red
    foreach ($t in $notOk) {
        Write-Host ("  - {0}::{1}  [{2}]" -f $t.Class, $t.Name, $t.Status) -ForegroundColor Red
        $first = Get-FirstLine $t.Detail
        if ($first) {
            Write-Host ("      {0}" -f $first) -ForegroundColor DarkRed
        }
    }
}

# ---------------------------------------------------------------------------
# 5. Generate reports
# ---------------------------------------------------------------------------
New-Item -ItemType Directory -Force -Path $reportDir | Out-Null
$timestamp = Get-Date -Format "yyyy-MM-dd HH:mm:ss"
$credState = if ([string]::IsNullOrWhiteSpace($ClientId)) { "not provided (integration tests skipped)" } else { "provided" }
$filterNote = if ([string]::IsNullOrWhiteSpace($TestFilter)) { "(all tests)" } else { $TestFilter }

# --- Markdown report ---
$md = New-Object System.Text.StringBuilder
[void]$md.AppendLine("# Aspose.Cells Cloud SDK for Java - Test Report")
[void]$md.AppendLine("")
[void]$md.AppendLine("- **Generated**: $timestamp")
[void]$md.AppendLine("- **Base URL**: $BaseUrl")
[void]$md.AppendLine("- **Credentials**: $credState")
[void]$md.AppendLine("- **Test filter**: $filterNote")
[void]$md.AppendLine("- **Maven exit code**: $mvnExit")
[void]$md.AppendLine("")
[void]$md.AppendLine("## Summary")
[void]$md.AppendLine("")
[void]$md.AppendLine("| Metric | Count |")
[void]$md.AppendLine("|--------|-------|")
[void]$md.AppendLine("| Total | $total |")
[void]$md.AppendLine("| Passed | $passed |")
[void]$md.AppendLine("| Failed | $failed |")
[void]$md.AppendLine("| Errors | $errors |")
[void]$md.AppendLine("| Skipped | $skipped |")
[void]$md.AppendLine("")
[void]$md.AppendLine("## Results by test class")
[void]$md.AppendLine("")
[void]$md.AppendLine("| Test class | Tests | Failures | Errors | Skipped | Time (s) |")
[void]$md.AppendLine("|------------|-------|----------|--------|---------|----------|")
foreach ($c in $classes) {
    $row = "| {0} | {1} | {2} | {3} | {4} | {5:N3} |" -f $c.Name, $c.Tests, $c.Failures, $c.Errors, $c.Skipped, $c.Time
    [void]$md.AppendLine($row)
}
[void]$md.AppendLine("")
[void]$md.AppendLine("## Failures and errors")
[void]$md.AppendLine("")
if ($notOk) {
    foreach ($t in $notOk) {
        $head = "- **{0}::{1}** [{2}]" -f $t.Class, $t.Name, $t.Status
        [void]$md.AppendLine($head)
        $first = Get-FirstLine $t.Detail
        if ($first) {
            $detailLine = "  - {0}" -f $first
            [void]$md.AppendLine($detailLine)
        }
    }
} else {
    [void]$md.AppendLine("_None._")
}
[void]$md.AppendLine("")

$mdPath = Join-Path $reportDir "test-report.md"
[System.IO.File]::WriteAllText($mdPath, $md.ToString(), [System.Text.Encoding]::UTF8)

# --- HTML report ---
$rows = New-Object System.Text.StringBuilder
foreach ($c in $classes) {
    if (($c.Failures + $c.Errors) -gt 0) { $statusColor = "table-danger" }
    elseif ($c.Skipped -gt 0) { $statusColor = "table-warning" }
    else { $statusColor = "table-success" }
    $row = ('<tr class="{0}"><td>{1}</td><td>{2}</td><td>{3}</td><td>{4}</td><td>{5}</td><td>{6:N3}</td></tr>' -f $statusColor, $c.Name, $c.Tests, $c.Failures, $c.Errors, $c.Skipped, $c.Time)
    [void]$rows.AppendLine($row)
}

$failRows = New-Object System.Text.StringBuilder
if ($notOk) {
    foreach ($t in $notOk) {
        $first = Get-FirstLine $t.Detail
        $escapedDetail = [System.Security.SecurityElement]::Escape($first)
        $frow = ('<tr><td>{0}</td><td>{1}</td><td><code>{2}</code></td><td>{3}</td></tr>' -f $t.Class, $t.Name, $t.Status, $escapedDetail)
        [void]$failRows.AppendLine($frow)
    }
} else {
    [void]$failRows.AppendLine('<tr><td colspan="4" class="text-muted">None</td></tr>')
}

$overall = if (($failed + $errors) -eq 0) { "success" } else { "failure" }

$html = @"
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Aspose.Cells Cloud SDK for Java - Test Report</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container py-4">
  <h1 class="mb-1">Aspose.Cells Cloud SDK for Java</h1>
  <p class="text-muted">Test Report</p>

  <div class="alert alert-${overall}" role="alert">
    <strong>Overall:</strong> ${passed} passed, ${failed} failed, ${errors} errors, ${skipped} skipped
    (${total} total). Maven exit code: ${mvnExit}.
  </div>

  <div class="row mb-4">
    <div class="col-md-2"><div class="card text-center"><div class="card-body"><h3>${total}</h3><div>Total</div></div></div></div>
    <div class="col-md-2"><div class="card text-center"><div class="card-body text-success"><h3>${passed}</h3><div>Passed</div></div></div></div>
    <div class="col-md-2"><div class="card text-center"><div class="card-body text-danger"><h3>${failed}</h3><div>Failed</div></div></div></div>
    <div class="col-md-2"><div class="card text-center"><div class="card-body text-danger"><h3>${errors}</h3><div>Errors</div></div></div></div>
    <div class="col-md-2"><div class="card text-center"><div class="card-body text-warning"><h3>${skipped}</h3><div>Skipped</div></div></div></div>
  </div>

  <div class="card mb-4">
    <div class="card-header">Run details</div>
    <div class="card-body">
      <ul class="mb-0">
        <li><strong>Generated</strong>: ${timestamp}</li>
        <li><strong>Base URL</strong>: ${BaseUrl}</li>
        <li><strong>Credentials</strong>: ${credState}</li>
        <li><strong>Test filter</strong>: ${filterNote}</li>
      </ul>
    </div>
  </div>

  <h2>Results by test class</h2>
  <table class="table table-striped table-hover">
    <thead><tr><th>Test class</th><th>Tests</th><th>Failures</th><th>Errors</th><th>Skipped</th><th>Time (s)</th></tr></thead>
    <tbody>
${rows}    </tbody>
  </table>

  <h2>Failures and errors</h2>
  <table class="table">
    <thead><tr><th>Test class</th><th>Test</th><th>Status</th><th>Detail</th></tr></thead>
    <tbody>
${failRows}    </tbody>
  </table>

  <p class="text-muted small">Generated ${timestamp} by run-integration-tests.ps1</p>
</div>
</body>
</html>
"@

$htmlPath = Join-Path $reportDir "test-report.html"
[System.IO.File]::WriteAllText($htmlPath, $html, [System.Text.Encoding]::UTF8)

Write-Host ""
Write-Step "Report written:"
Write-Host "  Markdown : $mdPath"
Write-Host "  HTML     : $htmlPath"

# ---------------------------------------------------------------------------
# 6. Exit code
# ---------------------------------------------------------------------------
if ($mvnExit -ne 0) { exit $mvnExit }
if (($failed + $errors) -gt 0) { exit 1 }
exit 0

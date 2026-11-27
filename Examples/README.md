# Aspose.Cells Cloud Java SDK examples

These scenario examples target the new-model SDK (v26.11 / v4.0 API) and mirror
the Go SDK's `examples` directory. Each class is a standalone `main` that
creates a `CellsCloudClient` and drives one or more operations.

The examples are compiled as an extra source root of the SDK build, but are
excluded from the published SDK jar.

## Prerequisites

- JDK 17+
- Maven 3.8+
- Aspose.Cells Cloud credentials from
  <https://dashboard.aspose.cloud/#/applications>

Set the credentials for the current shell:

```bash
export CellsCloudClientId=your-client-id
export CellsCloudClientSecret=your-client-secret
# Optional; defaults to https://api.aspose.cloud
export CellsCloudApiBaseUrl=https://api.aspose.cloud
```

PowerShell:

```powershell
$env:CellsCloudClientId="your-client-id"
$env:CellsCloudClientSecret="your-client-secret"
```

## Build

From the SDK root:

```bash
mvn -B install -DskipTests
mvn -B -q compile --file examples/pom.xml
```

`examples/pom.xml` consumes the installed `com.aspose:aspose-cells-cloud`
artifact, so install the SDK first.

## Run an example

```bash
mvn -B -q exec:exec --file examples/pom.xml \
  -Dexample.mainClass=com.aspose.cells.cloud.examples.QuickStartExample
```

Examples read local fixtures by their bare file name (for example
`EmployeeSalesSummary.xlsx`). The `exec-maven-plugin` in `examples/pom.xml`
uses `exec:exec` to fork a JVM, so its working-directory setting to
`../testdata` is honored and no copying is needed. Override it when needed with
`-Dexample.workingDirectory=...`.

The class name is the file name without the `.java` suffix.

## Sample map

| Go sample | Java example | New-model API |
| --- | --- | --- |
| `Example_QuickStart.go` | `QuickStartExample` | `converter.Converter` |
| `Example_ConvertExcel.go` | `ConvertExcelExample` | `Converter`, `SaveSpreadsheetAsRequest`, `ExportRangeAsFormatRequest` |
| `Example_BatchProcessing.go` | `BatchProcessingExample` | `PostBatch*Request` |
| `Example_CloudStorageManagement.go` | `CloudStorageManagementExample` | `*FileRequest`, `*FolderRequest` |
| `Example_CreateReportFiles.go` | `CreateReportFilesExample` | smart markers, cell values, range style, list object, chart |
| `Example_ExcelSplit.go` | `ExcelSplitExample` | `DataProcessing.splitSpreadsheet` |
| `Example_Management.go` | `ManagementExample` | `Editor`, `CompressSpreadsheetRequest` |
| `Example_MergeExcelFiles.go` | `MergeExcelFilesExample` | `PostWorkbooksMergeRequest`, `DataProcessing.mergeSpreadsheet` |
| `Example_Protection.go` | `ProtectionExample` | `ProtectSpreadsheetRequest`, `UnprotectSpreadsheetRequest` |
| `Example_SplitExcelFiles.go` | `SplitExcelFilesExample` | `DataProcessing.splitSpreadsheet`, `splitRemoteSpreadsheet` |
| `Example_TextProcessing.go` | `TextProcessingExample` | `TrimCharacterRequest`, `UpdateWordCaseRequest`, `AddTextRequest`, `ConvertTextRequest` |

## What changed in the new model

- Input and output are expressed with `datasource.DataSource` /
  `datasource.DataSink` (`FilePathSource`, `BytesSource`, `StreamSource`,
  `FilePathSink`, `BytesSink`, `StreamSink`, `UrlPathSink`) instead of ad-hoc
  local path parameters.
- The convenience facades (`converter`, `dataprocessing`, `editor`,
  `datacleansing`, `searcher`, `reporting`) wrap the generated requests and
  write the response bytes to a sink.
- Raw operations use the generated `request` package with
  `CellsCloudClient.call(...)`, which validates the response and throws
  `ApiException` on any non-2xx status.
- The v4.0 local split endpoints return a zip archive; the examples extract it.
- The v4.0 local merge endpoint merges the worksheets of a single workbook; the
  legacy map-of-local-files merge form is no longer available.

## Layout

The example sources are flat files directly under this directory; Maven adds
`examples` as a source root while the classes declare the package
`com.aspose.cells.cloud.examples`.

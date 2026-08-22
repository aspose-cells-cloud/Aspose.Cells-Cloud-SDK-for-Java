# Testing Guide

## Overview

The integration test suite contains **402 test functions across 46 test groups**, generated from JSON
configuration files in `TestingData/` and executed with JUnit 5.

## Test Structure

```
integrationtests/
├── CellsControllerTest.java               # 40 tests for CellsController
├── ConversionTest.java                    # 32 tests for ConversionController
├── WorkbookControllerTest.java            # 32 tests for WorkbookController
├── WorksheetControllerTest.java           # 39 tests for WorksheetsController
├── LightCellsTest.java                    # 19 tests for LightCellsController
├── PivotTablesControllerTest.java         # 19 tests for PivotTablesController
├── ChartsControllerTest.java              # 14 tests for ChartsController
└── ...                                    # 39 more test files
```

## Test Configuration Format

Tests are defined in JSON files under `TestingData/` (same schema as the Go SDK):

```json
{
  "Name": "CellsController",
  "Folder": "CellsCloud30",
  "Variables": { "RemoteFolder": "TestData/In" },
  "Cases": [
    {
      "Name": "PostClearContents",
      "ApiMethod": "PostClearContents",
      "Description": ["Test for PostClearContents."],
      "Variables": { "LocalName": "Book1.xlsx", "RemoteName": "Book1.xlsx" },
      "Files": [
        {
          "LocalPath": "%LocalName%",
          "RemotePath": "%RemoteFolder%/%RemoteName%",
          "StorageName": ""
        }
      ],
      "Parameters": [
        { "Name": "name", "DataType": { "Identifier": "String" }, "Value": "%RemoteName%" }
      ],
      "Assertions": [
        { "Type": "EqualsInteger", "Expression": "Code", "Value": "200" }
      ]
    }
  ]
}
```

## Running Tests

### Prerequisites

1. Valid Aspose Cloud credentials.
2. JDK 8+ and Maven.
3. Test data files in `testdata/`.

### Setup

```bash
export CellsCloudClientId="your-client-id"
export CellsCloudClientSecret="your-client-secret"
export CellsCloudApiBaseUrl="https://api.aspose.cloud"
```

### Execute

```bash
# Run all tests (unit + integration); integration self-skip without credentials
mvn -q test

# Run a single controller's tests
mvn -q test -Dtest=CellsControllerTest

# Run a single test method
mvn -q test -Dtest=CellsControllerTest#postClearContents

# Run the unit tests that need no credentials (incl. the MockWebServer upload smoke tests)
mvn -q test -Dtest='SdkUnitTest,FormFileTest,MultipartUploadSmokeTest'
```

Unit tests under `src/test/java` run with no credentials. `MultipartUploadSmokeTest` drives
`CellsCloudClient.call(...)` end to end against a local `MockWebServer` (OAuth2 token handshake +
multipart body) and asserts on the exact bytes/names sent for `byte[]` and `File` uploads.

### PowerShell runner (with report)

`run-integration-tests.ps1` runs the suite, collects Surefire results, and writes a Markdown and an
HTML report under `test-reports/`:

```powershell
# Provide credentials as parameters (or via the environment variables)
.\run-integration-tests.ps1 -ClientId "..." -ClientSecret "..."

# Run a single controller and collect results
.\run-integration-tests.ps1 -ClientId "..." -ClientSecret "..." -TestFilter "CellsControllerTest"
```

The script returns exit code `0` on success, `1` when any test fails, and the Maven exit code if Maven
itself fails. The generated reports include a summary, a per-class table, and any failure details.

## Generated Test Pattern

Each test case follows this structure:

```java
import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.request.PostClearContentsRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellsControllerTest {
    private static CellsCloudClient client;

    @BeforeAll
    static void setup() {
        client = new CellsCloudClient(
            System.getenv("CellsCloudClientId"),
            System.getenv("CellsCloudClientSecret"),
            System.getenv("CellsCloudApiBaseUrl"));
    }

    @Test
    void postClearContents() {
        // 1. Build request
        PostClearContentsRequest request = new PostClearContentsRequest("Book1.xlsx", "Sheet1")
            .setRange("A1:C10")
            .setFolder("TestData/In");

        // 2. Execute (throws on failure)
        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        // 3. Verify
        assertEquals(200, response.getStatusCode());
    }
}
```

## Test Parameter Mapping

| Spec Parameter | Test Data Value | Constructor / Setter |
|---------------|----------------|----------------------|
| Required, Path, String | `"Book1.xlsx"` | `new XRequest("Book1.xlsx", ...)` |
| Required, FormData, File | `"testdata/file.xlsx"` | `new XRequest(..., "testdata/file.xlsx")` |
| Optional, Query, Integer | `0` | `.setOffset(0)` |
| Optional, Query, String | `"value"` | `.setFolder("value")` |
| Required, Body, Class | `{...}` | `.setOptions(new Model())` (placeholder) |

## Variable Resolution

Test data uses `%VariableName%` placeholders resolved against group-level and case-level `Variables`.

## Known Limitations

1. **Complex object initialization**: `Class`/`Container` parameters are built recursively from their
   nested `Properties`; where the test data omits a field, that field is left at its default (null).
2. **Unresolved variables**: undefined `%Var%` variables produce empty strings.
3. **Unmatched APIs**: test cases referencing APIs not in the spec are emitted as `// TODO` stubs.
4. **Credentials gate**: integration test classes abort via `Assumptions.assumeTrue` when the
   credentials are missing, so Surefire reports them as "0 tests" rather than "skipped".

## Adding New Tests

1. Create or update a JSON file in `TestingData/`.
2. Run `python3 generate_tests.py`.
3. Run `mvn -q verify`.
4. Add any required sample files to `testdata/`.

## Continuous Integration

Tests require credentials and network access. They are designed for local development, CI (service
principal credentials), and smoke runs (a subset of critical-path tests). In CI, set the three
environment variables and run `mvn -q verify`.

# API Reference

## Overview

The Aspose.Cells Cloud SDK for Java exposes **461 API operations across 42 controllers** through a
single `com.aspose.cells.cloud.CellsCloudClient`.

## Client

### Initialization

```java
import com.aspose.cells.cloud.CellsCloudClient;

CellsCloudClient client = new CellsCloudClient(
    "your-client-id",             // Aspose Cloud Client ID
    "your-client-secret",         // Aspose Cloud Client Secret
    "https://api.aspose.cloud"    // base URL
);

client.setTimeout(Duration.ofSeconds(30));   // default 30s
client.setRetries(3);                         // default 0
client.getConfiguration().addDefaultHeader("X-Custom", "value");
```

### Executing Requests

```java
import com.aspose.cells.cloud.request.PostCellCharactersRequest;

PostCellCharactersRequest request = new PostCellCharactersRequest("Book1.xlsx", "Sheet1", "D4")
    .setFolder("TestData/In")                 // optional
    .setOptions(Arrays.asList(fontSetting));  // optional

try {
    RichResponse response = client.call(request);   // throws ApiException on failure
    System.out.println(response.getStatusCode());
    System.out.println(response.toString());
} catch (ApiException e) {
    System.err.println("SDK error: " + e.getMessage());
}
```

`call(...)` accepts one or more request objects and returns an array of `RichResponse`. On failure it
throws an `ApiException`.

### Response

```java
public class RichResponse {
    public int getStatusCode();                       // HTTP status code
    public Map<String, List<String>> getHeaders();    // response headers
    public byte[] getBody();                          // raw body bytes

    public <T> T getJson(Class<T> target);            // parse JSON body into a model
    public byte[] toBytes();
    public String toString();                         // body decoded as UTF-8
}
```

## Controllers

Operations are grouped by controller. Each operation maps to a request class under
`src/main/java/com/aspose/cells/cloud/request/`.

### CellsController (40 operations)

Cell-level operations on worksheets.

| Operation | Method | Path |
|-----------|--------|------|
| `PostClearContents` | POST | `/cells/{name}/worksheets/{sheetName}/cells/clearcontents` |
| `PostClearFormats` | POST | `/cells/{name}/worksheets/{sheetName}/cells/clearformats` |
| `PostCopyCellIntoCell` | POST | `/cells/{name}/worksheets/{sheetName}/cells/{cellName}/copy` |
| `PostSetCellHtmlString` | POST | `/cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring` |
| `PostSetCellRangeValue` | POST | `/cells/{name}/worksheets/{sheetName}/cells` |
| `PostUpdateWorksheetRangeStyle` | POST | `/cells/{name}/worksheets/{sheetName}/cells/style` |
| `PostWorksheetMerge` | POST | `/cells/{name}/worksheets/{sheetName}/cells/merge` |
| `PostWorksheetUnmerge` | POST | `/cells/{name}/worksheets/{sheetName}/cells/unmerge` |
| `PostCellCharacters` | POST | `/cells/{name}/worksheets/{sheetName}/cells/{cellName}/characters` |
| `GetWorksheetColumns` | GET | `/cells/{name}/worksheets/{sheetName}/columns` |
| `GetWorksheetRows` | GET | `/cells/{name}/worksheets/{sheetName}/cells/rows` |
| `GetWorksheetCell` | GET | `/cells/{name}/worksheets/{sheetName}/cells/{cellName}` |
| `GetWorksheetCellStyle` | GET | `/cells/{name}/worksheets/{sheetName}/cells/{cellName}/style` |

### WorkbookController (25 operations)

| Operation | Method | Path |
|-----------|--------|------|
| `PostWorkbookSaveAs` | POST | `/cells/{name}/saveAs` |
| `PostWorkbookMerge` | POST | `/cells/{name}/merge` |
| `PostWorkbookSplit` | POST | `/cells/{name}/split` |
| `PostWorkbookProtect` | POST | `/cells/{name}/protection` |
| `PostWorkbookEncrypt` | POST | `/cells/{name}/encryption` |
| `PostWorkbookDecrypt` | POST | `/cells/{name}/decryption` |
| `PostWorkbookSettings` | POST | `/cells/{name}/settings` |
| `GetWorkbook` | GET | `/cells/{name}` |
| `GetWorkbookSettings` | GET | `/cells/{name}/settings` |
| `CreateWorkbook` | PUT | `/cells/{name}` |

### WorksheetsController (39 operations)

| Operation | Method | Path |
|-----------|--------|------|
| `PutAddNewWorksheet` | PUT | `/cells/{name}/worksheets/{sheetName}` |
| `DeleteWorksheet` | DELETE | `/cells/{name}/worksheets/{sheetName}` |
| `PostCopyWorksheet` | POST | `/cells/{name}/worksheets/{sheetName}/copy` |
| `PostRenameWorksheet` | POST | `/cells/{name}/worksheets/{sheetName}/rename` |
| `PostMoveWorksheet` | POST | `/cells/{name}/worksheets/{sheetName}/move` |
| `PostHideWorksheet` | POST | `/cells/{name}/worksheets/{sheetName}/hide` |
| `PostUnhideWorksheet` | POST | `/cells/{name}/worksheets/{sheetName}/unhide` |
| `GetWorksheet` | GET | `/cells/{name}/worksheets/{sheetName}` |
| `GetWorksheets` | GET | `/cells/{name}/worksheets` |

### ConversionController (42 operations)

| Operation | Method | Path |
|-----------|--------|------|
| `PostWorkbookSaveAs` | POST | `/cells/{name}/saveAs` |
| `PutConvertWorkbook` | PUT | `/cells/convert` |
| `GetWorksheetWithFormat` | GET | `/cells/{name}/worksheets/{sheetName}` |
| `PostWorkbookExportAs` | POST | `/cells/{name}/export` |
| `PostWorkbookToPdf` | POST | `/cells/{name}/toPdf` |
| `PostWorkbookToHtml` | POST | `/cells/{name}/toHtml` |

### ChartsController (24 operations)

| Operation | Method | Path |
|-----------|--------|------|
| `PutWorksheetAddChart` | PUT | `/cells/{name}/worksheets/{sheetName}/charts` |
| `DeleteWorksheetChart` | DELETE | `/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}` |
| `GetWorksheetChart` | GET | `/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}` |
| `GetWorksheetCharts` | GET | `/cells/{name}/worksheets/{sheetName}/charts` |
| `PostWorksheetChart` | POST | `/cells/{name}/worksheets/{sheetName}/charts/{chartIndex}` |

### DataProcessingController (23 operations)

| Operation | Method | Path |
|-----------|--------|------|
| `PostWorkbookMerge` | POST | `/cells/{name}/merge` |
| `PostWorkbookSplit` | POST | `/cells/{name}/split` |
| `PostImportData` | POST | `/cells/{name}/importdata` |
| `PostWorkbookProtect` | POST | `/cells/{name}/protection` |

### File & Storage Controllers

| Operation | Method | Path |
|-----------|--------|------|
| `UploadFile` | PUT | `/cells/storage/file/{path}` |
| `DownloadFile` | GET | `/cells/storage/file/{path}` |
| `CopyFile` | PUT | `/cells/storage/file/copy/{path}` |
| `MoveFile` | PUT | `/cells/storage/file/move/{path}` |
| `DeleteFile` | DELETE | `/cells/storage/file/{path}` |
| `CreateFolder` | PUT | `/cells/storage/folder/{path}` |
| `DeleteFolder` | DELETE | `/cells/storage/folder/{path}` |
| `GetFilesList` | GET | `/cells/storage/folder/{path}` |
| `GetDiscUsage` | GET | `/cells/storage/disc` |

### Other Notable Controllers

| Controller | Operations | Key Features |
|-----------|-----------|-------------|
| `TextProcessingController` | 24 | Add/extract/convert/trim text, word case |
| `PivotTablesController` | 21 | Pivot table CRUD and filtering |
| `LightCellsController` | 15 | Lightweight batch operations |
| `SearchController` | 14 | Text search and replace |
| `RangesController` | 14 | Named range operations |
| `AutoFilterController` | 13 | AutoFilter and date/custom filters |
| `ListObjectsController` | 13 | List objects (tables) management |
| `ConditionalFormattingsController` | 9 | Format conditions, data bars |
| `ShapesController` | 8 | Shape management |
| `PicturesController` | 7 | Picture insert/update/delete |
| `SparklineGroupsController` | 6 | Sparkline management |
| `AIController` | 5 | AI translation, summarization |
| `BatchController` | 5 | Batch convert/protect/lock/split |

## Common Parameters

Available across most operations (via fluent setters):

| Setter | Java type | Description |
|--------|-----------|-------------|
| `setFolder` | `String` | Remote folder path |
| `setStorageName` | `String` | Storage name (default: empty) |
| `setPassword` | `String` | File password for encrypted files |
| `setRegion` | `String` | Locale setting (e.g. `en-US`) |

## Error Handling

All failures throw an `ApiException` (extends `RuntimeException`):

```java
try {
    RichResponse response = client.call(request);
} catch (ApiException e) {
    System.err.println("SDK Error [" + e.getCode() + "]: " + e.getMessage());
}
```

package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetRowRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetRowsRequest;
import com.aspose.cells.cloud.request.GetCellHtmlStringRequest;
import com.aspose.cells.cloud.request.GetWorksheetCellRequest;
import com.aspose.cells.cloud.request.GetWorksheetCellStyleRequest;
import com.aspose.cells.cloud.request.GetWorksheetCellsRequest;
import com.aspose.cells.cloud.request.GetWorksheetColumnRequest;
import com.aspose.cells.cloud.request.GetWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.GetWorksheetRowRequest;
import com.aspose.cells.cloud.request.GetWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostCellCalculateRequest;
import com.aspose.cells.cloud.request.PostCellCharactersRequest;
import com.aspose.cells.cloud.request.PostClearContentsRequest;
import com.aspose.cells.cloud.request.PostClearFormatsRequest;
import com.aspose.cells.cloud.request.PostColumnStyleRequest;
import com.aspose.cells.cloud.request.PostCopyCellIntoCellRequest;
import com.aspose.cells.cloud.request.PostCopyWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PostCopyWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostGroupWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PostGroupWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostHideWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PostHideWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostRowStyleRequest;
import com.aspose.cells.cloud.request.PostSetCellHtmlStringRequest;
import com.aspose.cells.cloud.request.PostSetCellRangeValueRequest;
import com.aspose.cells.cloud.request.PostSetWorksheetColumnWidthRequest;
import com.aspose.cells.cloud.request.PostUngroupWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PostUngroupWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostUnhideWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PostUnhideWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostUpdateWorksheetCellStyleRequest;
import com.aspose.cells.cloud.request.PostUpdateWorksheetRangeStyleRequest;
import com.aspose.cells.cloud.request.PostUpdateWorksheetRowRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellSetValueRequest;
import com.aspose.cells.cloud.request.PostWorksheetMergeRequest;
import com.aspose.cells.cloud.request.PostWorksheetUnmergeRequest;
import com.aspose.cells.cloud.request.PutInsertWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PutInsertWorksheetRowRequest;
import com.aspose.cells.cloud.request.PutInsertWorksheetRowsRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.CalculationOptions;
import com.aspose.cells.cloud.model.Font;
import com.aspose.cells.cloud.model.FontSetting;
import com.aspose.cells.cloud.model.Style;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for CellsController. */
class CellsControllerTest {
    private static CellsCloudClient client;

    @BeforeAll
    static void setup() {
        String clientId = System.getenv("CellsCloudClientId");
        String clientSecret = System.getenv("CellsCloudClientSecret");
        String baseUrl = System.getenv("CellsCloudApiBaseUrl");
        Assumptions.assumeTrue(
                clientId != null && !clientId.isEmpty() && clientSecret != null && !clientSecret.isEmpty(),
                "CellsCloudClientId and CellsCloudClientSecret must be set to run integration tests");
        client = new CellsCloudClient(clientId, clientSecret,
                baseUrl == null || baseUrl.isEmpty() ? "https://api.aspose.cloud" : baseUrl);
    }

    private static void upload(String localPath, String remotePath, String storageName) {
        UploadFileRequest upload = new UploadFileRequest("testdata/" + localPath, remotePath);
        if (storageName != null && !storageName.isEmpty()) {
            upload.setStorageName(storageName);
        }
        assertDoesNotThrow(() -> client.call(upload));
    }

    @Test
    void postClearContents() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostClearContentsRequest request = new PostClearContentsRequest("Book1.xlsx", "Sheet1")
                .setRange("A1:C10")
                .setStartRow(1)
                .setStartColumn(1)
                .setEndRow(3)
                .setEndColumn(3)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postClearFormats() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostClearFormatsRequest request = new PostClearFormatsRequest("Book1.xlsx", "Sheet1")
                .setRange("A1:C10")
                .setStartRow(1)
                .setStartColumn(1)
                .setEndRow(3)
                .setEndColumn(3)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUpdateWorksheetRangeStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUpdateWorksheetRangeStyleRequest request = new PostUpdateWorksheetRangeStyleRequest("Book1.xlsx", "Sheet1", "A1:C10", new Style().setFont(new Font().setSize(16)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetMerge() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetMergeRequest request = new PostWorksheetMergeRequest("Book1.xlsx", "Sheet1", 1, 1, 4, 4)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetUnmerge() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetUnmergeRequest request = new PostWorksheetUnmergeRequest("Book1.xlsx", "Sheet1", 1, 1, 4, 4)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetCells() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCellsRequest request = new GetWorksheetCellsRequest("Book1.xlsx", "Sheet1")
                .setOffest(1)
                .setCount(10)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetCell() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCellRequest request = new GetWorksheetCellRequest("Book1.xlsx", "Sheet1", "A1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorksheetCellStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCellStyleRequest request = new GetWorksheetCellStyleRequest("Book1.xlsx", "Sheet1", "A1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellSetValue() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellSetValueRequest request = new PostWorksheetCellSetValueRequest("Book1.xlsx", "Sheet1", "A1")
                .setValue("1")
                .setType("int")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUpdateWorksheetCellStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUpdateWorksheetCellStyleRequest request = new PostUpdateWorksheetCellStyleRequest("Book1.xlsx", "Sheet1", "A1", new Style().setFont(new Font().setSize(16)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postSetCellRangeValue() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostSetCellRangeValueRequest request = new PostSetCellRangeValueRequest("Book1.xlsx", "Sheet1", "A1:C10", "Test", "string")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postCopyCellIntoCell() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostCopyCellIntoCellRequest request = new PostCopyCellIntoCellRequest("Book1.xlsx", "C1", "Sheet1", "Sheet2")
                .setCellname("A1")
                .setRow(1)
                .setColumn(1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getCellHtmlString() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetCellHtmlStringRequest request = new GetCellHtmlStringRequest("Book1.xlsx", "Sheet1", "A1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postSetCellHtmlString() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostSetCellHtmlStringRequest request = new PostSetCellHtmlStringRequest("Book1.xlsx", "Sheet1", "A1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postCellCalculate() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostCellCalculateRequest request = new PostCellCalculateRequest("Book1.xlsx", "Sheet1", "A1")
                .setOptions(new CalculationOptions().setRecursive(true).setIgnoreError(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postCellCharacters() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostCellCharactersRequest request = new PostCellCharactersRequest("Book1.xlsx", "Sheet1", "E36")
                .setOptions(Arrays.asList(new FontSetting().setLength(5).setStartIndex(0).setFont(new Font().setIsBold(true).setSize(16))))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetColumnsRequest request = new GetWorksheetColumnsRequest()
                .setName("Book1.xlsx")
                .setSheetName("Sheet1")
                .setOffset(1)
                .setCount(10)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postSetWorksheetColumnWidth() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostSetWorksheetColumnWidthRequest request = new PostSetWorksheetColumnWidthRequest("Book1.xlsx", "Sheet1", 1, 10.9)
                .setCount(10)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetColumn() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetColumnRequest request = new GetWorksheetColumnRequest("Book1.xlsx", "Sheet1", 1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putInsertWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutInsertWorksheetColumnsRequest request = new PutInsertWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 10)
                .setUpdateReference(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetColumnsRequest request = new DeleteWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 10, true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postHideWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostHideWorksheetColumnsRequest request = new PostHideWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 10)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUnhideWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUnhideWorksheetColumnsRequest request = new PostUnhideWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 10)
                .setWidth(10.9)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postGroupWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostGroupWorksheetColumnsRequest request = new PostGroupWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 9)
                .setHide(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUngroupWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUngroupWorksheetColumnsRequest request = new PostUngroupWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 9)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postCopyWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostCopyWorksheetColumnsRequest request = new PostCopyWorksheetColumnsRequest("Book1.xlsx", "Sheet1", 1, 19, 8)
                .setWorksheet("Sheet2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postColumnStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostColumnStyleRequest request = new PostColumnStyleRequest("Book1.xlsx", "Sheet1", 1, new Style().setFont(new Font().setSize(16)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetRowsRequest request = new GetWorksheetRowsRequest("Book1.xlsx", "Sheet1")
                .setOffset(1)
                .setCount(10)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetRow() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetRowRequest request = new GetWorksheetRowRequest("Book1.xlsx", "Sheet1", 1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetRow() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetRowRequest request = new DeleteWorksheetRowRequest("Book1.xlsx", "Sheet1", 1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetRowsRequest request = new DeleteWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1)
                .setTotalRows(10)
                .setUpdateReference(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putInsertWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutInsertWorksheetRowsRequest request = new PutInsertWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1)
                .setTotalRows(10)
                .setUpdateReference(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putInsertWorksheetRow() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutInsertWorksheetRowRequest request = new PutInsertWorksheetRowRequest("Book1.xlsx", "Sheet1", 1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUpdateWorksheetRow() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUpdateWorksheetRowRequest request = new PostUpdateWorksheetRowRequest("Book1.xlsx", "Sheet1", 1)
                .setHeight(10.8)
                .setCount(9)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postHideWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostHideWorksheetRowsRequest request = new PostHideWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1, 6)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUnhideWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUnhideWorksheetRowsRequest request = new PostUnhideWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1, 8)
                .setHeight(10.9)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postGroupWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostGroupWorksheetRowsRequest request = new PostGroupWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1, 9)
                .setHide(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUngroupWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUngroupWorksheetRowsRequest request = new PostUngroupWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1, 9)
                .setIsAll(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postCopyWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostCopyWorksheetRowsRequest request = new PostCopyWorksheetRowsRequest("Book1.xlsx", "Sheet1", 1, 12, 5)
                .setWorksheet("Sheet2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postRowStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostRowStyleRequest request = new PostRowStyleRequest("Book1.xlsx", "Sheet1", 1, new Style().setFont(new Font().setSize(16)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

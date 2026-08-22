package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteUnprotectWorksheetRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetBackgroundRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetCommentRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetCommentsRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetFreezePanesRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetsRequest;
import com.aspose.cells.cloud.request.GetNamedRangeValueRequest;
import com.aspose.cells.cloud.request.GetNamedRangesRequest;
import com.aspose.cells.cloud.request.GetWorksheetCalculateFormulaRequest;
import com.aspose.cells.cloud.request.GetWorksheetCommentRequest;
import com.aspose.cells.cloud.request.GetWorksheetCommentsRequest;
import com.aspose.cells.cloud.request.GetWorksheetMergedCellRequest;
import com.aspose.cells.cloud.request.GetWorksheetMergedCellsRequest;
import com.aspose.cells.cloud.request.GetWorksheetPageCountRequest;
import com.aspose.cells.cloud.request.GetWorksheetTextItemsRequest;
import com.aspose.cells.cloud.request.GetWorksheetWithFormatRequest;
import com.aspose.cells.cloud.request.GetWorksheetsRequest;
import com.aspose.cells.cloud.request.PostAutofitWorksheetColumnsRequest;
import com.aspose.cells.cloud.request.PostAutofitWorksheetRowRequest;
import com.aspose.cells.cloud.request.PostAutofitWorksheetRowsRequest;
import com.aspose.cells.cloud.request.PostCopyWorksheetRequest;
import com.aspose.cells.cloud.request.PostMoveWorksheetRequest;
import com.aspose.cells.cloud.request.PostRenameWorksheetRequest;
import com.aspose.cells.cloud.request.PostUpdateWorksheetPropertyRequest;
import com.aspose.cells.cloud.request.PostUpdateWorksheetZoomRequest;
import com.aspose.cells.cloud.request.PostWorksheetCalculateFormulaRequest;
import com.aspose.cells.cloud.request.PostWorksheetCommentRequest;
import com.aspose.cells.cloud.request.PostWorksheetRangeSortRequest;
import com.aspose.cells.cloud.request.PostWorksheetTextReplaceRequest;
import com.aspose.cells.cloud.request.PostWorksheetTextSearchRequest;
import com.aspose.cells.cloud.request.PutActiveWorksheetRequest;
import com.aspose.cells.cloud.request.PutAddNewWorksheetRequest;
import com.aspose.cells.cloud.request.PutChangeVisibilityWorksheetRequest;
import com.aspose.cells.cloud.request.PutInsertNewWorksheetRequest;
import com.aspose.cells.cloud.request.PutProtectWorksheetRequest;
import com.aspose.cells.cloud.request.PutWorksheetBackgroundRequest;
import com.aspose.cells.cloud.request.PutWorksheetCommentRequest;
import com.aspose.cells.cloud.request.PutWorksheetFreezePanesRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Comment;
import com.aspose.cells.cloud.model.CopyOptions;
import com.aspose.cells.cloud.model.DataSorter;
import com.aspose.cells.cloud.model.MatchConditionRequest;
import com.aspose.cells.cloud.model.ProtectSheetParameter;
import com.aspose.cells.cloud.model.Worksheet;
import com.aspose.cells.cloud.model.WorksheetMovingRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for WorksheetController. */
class WorksheetControllerTest {
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
    void getWorksheets() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetsRequest request = new GetWorksheetsRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetWithFormat() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetWithFormatRequest request = new GetWorksheetWithFormatRequest("Book1.xlsx", "Sheet1")
                .setFormat("png")
                .setPageIndex(0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void putChangeVisibilityWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutChangeVisibilityWorksheetRequest request = new PutChangeVisibilityWorksheetRequest("Book1.xlsx", "Sheet1", true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putActiveWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutActiveWorksheetRequest request = new PutActiveWorksheetRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putInsertNewWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutInsertNewWorksheetRequest request = new PutInsertNewWorksheetRequest("Book1.xlsx", "Sheet1", 1, "VB")
                .setNewsheetname("VBASheet")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putAddNewWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutAddNewWorksheetRequest request = new PutAddNewWorksheetRequest("Book1.xlsx", "Sheet1")
                .setPosition(0)
                .setSheettype("VB")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetRequest request = new DeleteWorksheetRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheets() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetsRequest request = new DeleteWorksheetsRequest("Book1.xlsx")
                .setMatchCondition(new MatchConditionRequest().setRegexPattern("{*}"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postMoveWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostMoveWorksheetRequest request = new PostMoveWorksheetRequest("Book1.xlsx", "Sheet1", new WorksheetMovingRequest().setDestinationWorksheet("Sheet4").setPosition("After"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putProtectWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutProtectWorksheetRequest request = new PutProtectWorksheetRequest("Book1.xlsx", "Sheet1", new ProtectSheetParameter().setProtectionType("ALL").setPassword("123"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteUnprotectWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteUnprotectWorksheetRequest request = new DeleteUnprotectWorksheetRequest("Book1.xlsx", "Sheet1", new ProtectSheetParameter().setProtectionType("ALL").setPassword("123"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetTextItems() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetTextItemsRequest request = new GetWorksheetTextItemsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetComments() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCommentsRequest request = new GetWorksheetCommentsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetComment() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCommentRequest request = new GetWorksheetCommentRequest("Book1.xlsx", "Sheet1", "B3")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetComment() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetCommentRequest request = new PutWorksheetCommentRequest("Book1.xlsx", "Sheet1", "C1", new Comment().setAuthor("aspose cells developer").setNote("aspose cells cloud api add comment."))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetComment() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCommentRequest request = new PostWorksheetCommentRequest("Book1.xlsx", "Sheet1", "B3", new Comment().setAuthor("aspose cells developer").setNote("aspose cells cloud api update comment."))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetComment() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetCommentRequest request = new DeleteWorksheetCommentRequest("Book1.xlsx", "Sheet1", "B3")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetComments() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetCommentsRequest request = new DeleteWorksheetCommentsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetMergedCells() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetMergedCellsRequest request = new GetWorksheetMergedCellsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetMergedCell() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetMergedCellRequest request = new GetWorksheetMergedCellRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetCalculateFormula() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCalculateFormulaRequest request = new GetWorksheetCalculateFormulaRequest("Book1.xlsx", "Sheet1", "=NOW()")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCalculateFormula() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCalculateFormulaRequest request = new PostWorksheetCalculateFormulaRequest("Book1.xlsx", "Sheet1", "=NOW()")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetTextSearch() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetTextSearchRequest request = new PostWorksheetTextSearchRequest("Book1.xlsx", "Sheet1", "123")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetTextReplace() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetTextReplaceRequest request = new PostWorksheetTextReplaceRequest("Book1.xlsx", "Sheet1", "123", "456")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetRangeSort() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetRangeSortRequest request = new PostWorksheetRangeSortRequest("Book1.xlsx", "Sheet1", "A1:C10", new DataSorter().setCaseSensitive(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postAutofitWorksheetRow() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostAutofitWorksheetRowRequest request = new PostAutofitWorksheetRowRequest("Book1.xlsx", "Sheet1", 1)
                .setFirstColumn(1)
                .setLastColumn(8)
                .setFolder("TestData/In")
                .setRowCount(1);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postAutofitWorksheetRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostAutofitWorksheetRowsRequest request = new PostAutofitWorksheetRowsRequest("Book1.xlsx", "Sheet1")
                .setStartRow(1)
                .setEndRow(9)
                .setOnlyAuto(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postAutofitWorksheetColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostAutofitWorksheetColumnsRequest request = new PostAutofitWorksheetColumnsRequest("Book1.xlsx", "Sheet1")
                .setStartColumn(1)
                .setEndColumn(9)
                .setOnlyAuto(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetBackground() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("WaterMark.png", "TestData/In/WaterMark.png", "");
        PutWorksheetBackgroundRequest request = new PutWorksheetBackgroundRequest("Book1.xlsx", "Sheet1")
                .setPicPath("TestData/In/WaterMark.png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetBackground() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetBackgroundRequest request = new DeleteWorksheetBackgroundRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetFreezePanes() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetFreezePanesRequest request = new PutWorksheetFreezePanesRequest("Book1.xlsx", "Sheet1", 1, 1, 4, 5)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetFreezePanes() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetFreezePanesRequest request = new DeleteWorksheetFreezePanesRequest("Book1.xlsx", "Sheet1", 1, 1, 4, 5)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postCopyWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostCopyWorksheetRequest request = new PostCopyWorksheetRequest("Book1.xlsx", "Sheet15", "Sheet6", new CopyOptions().setColumnCharacterWidth(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postRenameWorksheet() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostRenameWorksheetRequest request = new PostRenameWorksheetRequest("Book1.xlsx", "Sheet5", "Sheet55")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUpdateWorksheetProperty() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUpdateWorksheetPropertyRequest request = new PostUpdateWorksheetPropertyRequest("Book1.xlsx", "Sheet5", new Worksheet().setName("sheet65").setIsGridlinesVisible(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getNamedRanges() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetNamedRangesRequest request = new GetNamedRangesRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getNamedRangeValue() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetNamedRangeValueRequest request = new GetNamedRangeValueRequest("Book1.xlsx", "Name_2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUpdateWorksheetZoom() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUpdateWorksheetZoomRequest request = new PostUpdateWorksheetZoomRequest("Book1.xlsx", "Sheet1", 90)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetPageCount() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetPageCountRequest request = new GetWorksheetPageCountRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

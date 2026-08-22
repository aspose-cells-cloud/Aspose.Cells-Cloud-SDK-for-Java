package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetListObjectRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetListObjectsRequest;
import com.aspose.cells.cloud.request.GetWorksheetListObjectRequest;
import com.aspose.cells.cloud.request.GetWorksheetListObjectsRequest;
import com.aspose.cells.cloud.request.PostWorksheetListColumnRequest;
import com.aspose.cells.cloud.request.PostWorksheetListColumnsTotalRequest;
import com.aspose.cells.cloud.request.PostWorksheetListObjectConvertToRangeRequest;
import com.aspose.cells.cloud.request.PostWorksheetListObjectInsertSlicerRequest;
import com.aspose.cells.cloud.request.PostWorksheetListObjectRemoveDuplicatesRequest;
import com.aspose.cells.cloud.request.PostWorksheetListObjectRequest;
import com.aspose.cells.cloud.request.PostWorksheetListObjectSortTableRequest;
import com.aspose.cells.cloud.request.PostWorksheetListObjectSummarizeWithPivotTableRequest;
import com.aspose.cells.cloud.request.PutWorksheetListObjectRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.CreatePivotTableRequest;
import com.aspose.cells.cloud.model.DataSorter;
import com.aspose.cells.cloud.model.ListColumn;
import com.aspose.cells.cloud.model.ListObject;
import com.aspose.cells.cloud.model.TableTotalRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ListObjectsController. */
class ListObjectsControllerTest {
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
    void getWorksheetListObjects() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetListObjectsRequest request = new GetWorksheetListObjectsRequest("Book1.xlsx", "Sheet7")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetListObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetListObjectRequest request = new GetWorksheetListObjectRequest("Book1.xlsx", "Sheet7", 0)
                .setFormat("pdf")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void putWorksheetListObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetListObjectRequest request = new PutWorksheetListObjectRequest("Book1.xlsx", "Sheet7")
                .setStartRow(1)
                .setStartColumn(1)
                .setEndRow(6)
                .setEndColumn(6)
                .setFolder("TestData/In")
                .setHasHeaders(true)
                .setDisplayName("true")
                .setShowTotals(false);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetListObjects() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetListObjectsRequest request = new DeleteWorksheetListObjectsRequest("Book1.xlsx", "Sheet7")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetListObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetListObjectRequest request = new DeleteWorksheetListObjectRequest("Book1.xlsx", "Sheet7", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetListObjectRequest request = new PostWorksheetListObjectRequest("Book1.xlsx", "Sheet7", 0, new ListObject().setShowHeaderRow(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListObjectConvertToRange() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetListObjectConvertToRangeRequest request = new PostWorksheetListObjectConvertToRangeRequest("Book1.xlsx", "Sheet7", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListObjectSummarizeWithPivotTable() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetListObjectSummarizeWithPivotTableRequest request = new PostWorksheetListObjectSummarizeWithPivotTableRequest("Book1.xlsx", "Sheet7", 0, "Sheet2", new CreatePivotTableRequest().setDestCellName("C1").setName("testp").setSourceData("=Sheet2!A1:E8").setUseSameSource(true).setPivotFieldColumns(Arrays.asList(2)).setPivotFieldData(Arrays.asList(1)).setPivotFieldRows(Arrays.asList(0)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListObjectSortTable() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetListObjectSortTableRequest request = new PostWorksheetListObjectSortTableRequest("Book1.xlsx", "Sheet7", 0, new DataSorter().setCaseSensitive(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListColumn() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetListColumnRequest request = new PostWorksheetListColumnRequest("Book1.xlsx", "Sheet7", 0, 0, new ListColumn().setName("test cloumn"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListColumnsTotal() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetListColumnsTotalRequest request = new PostWorksheetListColumnsTotalRequest("Book1.xlsx", "Sheet7", 0, Arrays.asList(new TableTotalRequest().setListColumnIndex(1).setTotalsCalculation("Average")))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListObjectRemoveDuplicates() {
        upload("TestTables.xlsx", "TestData/In/TestTables.xlsx", "");
        PostWorksheetListObjectRemoveDuplicatesRequest request = new PostWorksheetListObjectRemoveDuplicatesRequest("TestTables.xlsx", "Sheet2", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetListObjectInsertSlicer() {
        upload("TestTables.xlsx", "TestData/In/TestTables.xlsx", "");
        PostWorksheetListObjectInsertSlicerRequest request = new PostWorksheetListObjectInsertSlicerRequest("TestTables.xlsx", "Sheet1", 0, 2, "j9")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

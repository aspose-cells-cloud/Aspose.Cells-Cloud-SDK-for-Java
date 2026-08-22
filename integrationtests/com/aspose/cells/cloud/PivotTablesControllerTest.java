package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeletePivotTableFieldRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetPivotTableFilterRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetPivotTableFiltersRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetPivotTableRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetPivotTablesRequest;
import com.aspose.cells.cloud.request.GetPivotTableFieldRequest;
import com.aspose.cells.cloud.request.GetWorksheetPivotTableFiltersRequest;
import com.aspose.cells.cloud.request.GetWorksheetPivotTableRequest;
import com.aspose.cells.cloud.request.GetWorksheetPivotTablesRequest;
import com.aspose.cells.cloud.request.PostPivotTableCellStyleRequest;
import com.aspose.cells.cloud.request.PostPivotTableFieldHideItemRequest;
import com.aspose.cells.cloud.request.PostPivotTableFieldMoveToRequest;
import com.aspose.cells.cloud.request.PostPivotTableStyleRequest;
import com.aspose.cells.cloud.request.PostPivotTableUpdatePivotFieldRequest;
import com.aspose.cells.cloud.request.PostPivotTableUpdatePivotFieldsRequest;
import com.aspose.cells.cloud.request.PostWorksheetPivotTableCalculateRequest;
import com.aspose.cells.cloud.request.PostWorksheetPivotTableMoveRequest;
import com.aspose.cells.cloud.request.PutPivotTableFieldRequest;
import com.aspose.cells.cloud.request.PutWorksheetPivotTableRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Font;
import com.aspose.cells.cloud.model.PivotField;
import com.aspose.cells.cloud.model.PivotTableFieldRequest;
import com.aspose.cells.cloud.model.Style;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for PivotTablesController. */
class PivotTablesControllerTest {
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
    void getWorksheetPivotTables() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        GetWorksheetPivotTablesRequest request = new GetWorksheetPivotTablesRequest("TestCase.xlsx", "Sheet4")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetPivotTable() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        GetWorksheetPivotTableRequest request = new GetWorksheetPivotTableRequest("TestCase.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getPivotTableField() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        GetPivotTableFieldRequest request = new GetPivotTableFieldRequest("TestCase.xlsx", "Sheet4", 0, 0, "Row")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetPivotTableFilters() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        GetWorksheetPivotTableFiltersRequest request = new GetWorksheetPivotTableFiltersRequest("TestCase.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetPivotTable() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PutWorksheetPivotTableRequest request = new PutWorksheetPivotTableRequest("TestCase.xlsx", "Sheet4")
                .setFolder("TestData/In")
                .setSourceData("=Sheet1!C6:E13")
                .setDestCellName("C1")
                .setTableName("TestPivot")
                .setUseSameSource(true);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putPivotTableField() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PutPivotTableFieldRequest request = new PutPivotTableFieldRequest("TestCase.xlsx", "Sheet4", 0, "Row", new PivotTableFieldRequest().setData(Arrays.asList(0)))
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPivotTableFieldHideItem() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostPivotTableFieldHideItemRequest request = new PostPivotTableFieldHideItemRequest("TestCase.xlsx", "Sheet4", 0, "Row", 0, 1, true)
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPivotTableFieldMoveTo() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostPivotTableFieldMoveToRequest request = new PostPivotTableFieldMoveToRequest("TestCase.xlsx", "Sheet4", 0, 0, "Row", "Column")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPivotTableCellStyle() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostPivotTableCellStyleRequest request = new PostPivotTableCellStyleRequest("TestCase.xlsx", "Sheet4", 0, 1, 1, new Style().setFont(new Font().setSize(16)))
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPivotTableStyle() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostPivotTableStyleRequest request = new PostPivotTableStyleRequest("TestCase.xlsx", "Sheet4", 0, new Style().setFont(new Font().setSize(16)))
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPivotTableUpdatePivotFields() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostPivotTableUpdatePivotFieldsRequest request = new PostPivotTableUpdatePivotFieldsRequest("TestCase.xlsx", "Sheet4", 0, "Row", new PivotField().setShowCompact(true))
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPivotTableUpdatePivotField() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostPivotTableUpdatePivotFieldRequest request = new PostPivotTableUpdatePivotFieldRequest("TestCase.xlsx", "Sheet4", 0, 0, "Row", new PivotField().setShowCompact(true))
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetPivotTableCalculate() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostWorksheetPivotTableCalculateRequest request = new PostWorksheetPivotTableCalculateRequest("TestCase.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetPivotTableMove() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostWorksheetPivotTableMoveRequest request = new PostWorksheetPivotTableMoveRequest("TestCase.xlsx", "Sheet4", 0)
                .setRow(1)
                .setColumn(1)
                .setDestCellName("C10")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetPivotTables() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeleteWorksheetPivotTablesRequest request = new DeleteWorksheetPivotTablesRequest("TestCase.xlsx", "Sheet4")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetPivotTable() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeleteWorksheetPivotTableRequest request = new DeleteWorksheetPivotTableRequest("TestCase.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deletePivotTableField() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeletePivotTableFieldRequest request = new DeletePivotTableFieldRequest("TestCase.xlsx", "Sheet4", 0, "Row", new PivotTableFieldRequest().setData(Arrays.asList(0)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetPivotTableFilters() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeleteWorksheetPivotTableFiltersRequest request = new DeleteWorksheetPivotTableFiltersRequest("TestCase.xlsx", "Sheet3", 0)
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetPivotTableFilter() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeleteWorksheetPivotTableFilterRequest request = new DeleteWorksheetPivotTableFilterRequest("TestCase.xlsx", "Sheet3", 0, 0)
                .setNeedReCalculate(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.AddWorksheetToSpreadsheetRequest;
import com.aspose.cells.cloud.request.CompressSpreadsheetRequest;
import com.aspose.cells.cloud.request.CreateSpreadsheetRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetFromSpreadsheetRequest;
import com.aspose.cells.cloud.request.GetMergedCellsInRemotedWorksheetRequest;
import com.aspose.cells.cloud.request.GetMergedCellsInWorksheetRequest;
import com.aspose.cells.cloud.request.MoveWorksheetInSpreadsheetRequest;
import com.aspose.cells.cloud.request.RenameWorksheetInSpreadsheetRequest;
import com.aspose.cells.cloud.request.RepairSpreadsheetRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Management. */
class ManagementTest {
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
    void createSpreadsheet() {
        CreateSpreadsheetRequest request = new CreateSpreadsheetRequest()
                .setFormat("xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void createSpreadsheetWithTemplate() {
        CreateSpreadsheetRequest request = new CreateSpreadsheetRequest()
                .setFormat("pdf")
                .setTemplate("SalesDataComparisonXLSX");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void addWorksheet() {
        AddWorksheetToSpreadsheetRequest request = new AddWorksheetToSpreadsheetRequest("TestData/AggregateCellsByColor.xlsx")
                .setSheetType("Worksheet")
                .setPosition(1);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void deleteWorksheet() {
        DeleteWorksheetFromSpreadsheetRequest request = new DeleteWorksheetFromSpreadsheetRequest("TestData/EmployeeSalesSummary.xlsx", "Sales");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void renameWorksheet() {
        RenameWorksheetInSpreadsheetRequest request = new RenameWorksheetInSpreadsheetRequest("TestData/EmployeeSalesSummary.xlsx", "Sales", "SalesData");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void moveWorksheet() {
        MoveWorksheetInSpreadsheetRequest request = new MoveWorksheetInSpreadsheetRequest("TestData/EmployeeSalesSummary.xlsx", "Sales", 1);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void compressSpreadsheet() {
        CompressSpreadsheetRequest request = new CompressSpreadsheetRequest("TestData/EmployeeSalesSummary.xlsx", 9);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void repairSpreadsheet() {
        RepairSpreadsheetRequest request = new RepairSpreadsheetRequest("TestData/EmployeeSalesSummary.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorksheetsWithSpreadsheet() {
        // TODO: API GetWorksheetsWithSpreadsheet not found in the specification; case skipped.
    }

    @Test
    void getMergedCellsInRemotedWorksheet() {
        upload("EmployeeSalesSummary.xlsx", "TestData/In/EmployeeSalesSummary.xlsx", "");
        GetMergedCellsInRemotedWorksheetRequest request = new GetMergedCellsInRemotedWorksheetRequest("EmployeeSalesSummary.xlsx", "Sales")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getMergedCellsInWorksheet() {
        GetMergedCellsInWorksheetRequest request = new GetMergedCellsInWorksheetRequest("TestData/EmployeeSalesSummary.xlsx", "Sales");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

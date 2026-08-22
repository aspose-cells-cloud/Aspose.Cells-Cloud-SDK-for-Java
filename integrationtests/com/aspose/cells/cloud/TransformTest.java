package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.RemoveSpreadsheetBlankColumnsRequest;
import com.aspose.cells.cloud.request.RemoveSpreadsheetBlankRowsRequest;
import com.aspose.cells.cloud.request.RemoveSpreadsheetBlankWorksheetsRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Transform. */
class TransformTest {
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

    @Test
    void removeSpreadsheetBlankRows() {
        RemoveSpreadsheetBlankRowsRequest request = new RemoveSpreadsheetBlankRowsRequest("TestData/EmployeeSalesSummary.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void removeSpreadsheetBlankColumns() {
        RemoveSpreadsheetBlankColumnsRequest request = new RemoveSpreadsheetBlankColumnsRequest("TestData/EmployeeSalesSummary.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void removeSpreadsheetBlankWorksheets() {
        RemoveSpreadsheetBlankWorksheetsRequest request = new RemoveSpreadsheetBlankWorksheetsRequest("TestData/EmployeeSalesSummary-BlankWorksheet.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void sawpRange() {
        // TODO: API SawpRange not found in the specification; case skipped.
    }
}

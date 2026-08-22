package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.ProtectSpreadsheetRequest;
import com.aspose.cells.cloud.request.UnprotectSpreadsheetRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Protection. */
class ProtectionTest {
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
    void protectSpreadsheet() {
        ProtectSpreadsheetRequest request = new ProtectSpreadsheetRequest("TestData/EmployeeSalesSummary.xlsx", "123456", "123456");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void unprotectSpreadsheet() {
        UnprotectSpreadsheetRequest request = new UnprotectSpreadsheetRequest("TestData/EmployeeSalesSummary_Locked.xlsx", "123456", "123456");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.AggregateCellsByColorRequest;
import com.aspose.cells.cloud.request.MathCalculateRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Calculate. */
class CalculateTest {
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
    void aggregateCellsByColor() {
        AggregateCellsByColorRequest request = new AggregateCellsByColorRequest("TestData/AggregateCellsByColor.xlsx")
                .setWorksheet("Sheet1");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void mathCalculate() {
        MathCalculateRequest request = new MathCalculateRequest("TestData/EmployeeSalesSummary-BlankWorksheet.xlsx", "add", "12.3");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

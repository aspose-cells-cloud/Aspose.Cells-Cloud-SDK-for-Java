package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.UpdateWordCaseRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for UpdateWordCase. */
class UpdateWordCaseTest {
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
    void updateWordCase() {
        UpdateWordCaseRequest request = new UpdateWordCaseRequest("TestData/BookText.xlsx", "ProperCase")
                .setWorksheet("Bikes");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void updateWordCaseInRange() {
        UpdateWordCaseRequest request = new UpdateWordCaseRequest("TestData/BookText.xlsx", "ProperCase")
                .setWorksheet("Bikes")
                .setRange("A1:B15");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void updateWordCaseInSpreadsheet() {
        UpdateWordCaseRequest request = new UpdateWordCaseRequest("TestData/BookText.xlsx", "ProperCase");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

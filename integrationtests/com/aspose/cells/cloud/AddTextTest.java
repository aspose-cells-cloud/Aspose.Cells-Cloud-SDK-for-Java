package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.AddTextRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for AddText. */
class AddTextTest {
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
    void addText() {
        AddTextRequest request = new AddTextRequest("TestData/BookText.xlsx", "New", "AtTheBeginning")
                .setSelectText("text");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void addTextSkipEmptyCells() {
        AddTextRequest request = new AddTextRequest("TestData/BookText.xlsx", "New", "AtTheBeginning")
                .setSkipEmptyCells(true)
                .setWorksheet("Bikes");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void addTextInRange() {
        AddTextRequest request = new AddTextRequest("TestData/BookText.xlsx", "New", "AtTheBeginning")
                .setSkipEmptyCells(true)
                .setWorksheet("Bikes")
                .setRange("A1:B15");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void addTextBeforeText() {
        AddTextRequest request = new AddTextRequest("TestData/BookText.xlsx", "New", "BeforeText")
                .setSelectText("bike")
                .setWorksheet("Bikes");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

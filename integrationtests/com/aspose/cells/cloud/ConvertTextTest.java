package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.ConvertTextRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ConvertText. */
class ConvertTextTest {
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
    void convertText() {
        ConvertTextRequest request = new ConvertTextRequest("TestData/BookText.xlsx", "ConvertNumberToText");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTextWithConvertCharacters() {
        ConvertTextRequest request = new ConvertTextRequest("TestData/BookText.xlsx", "ConvertCharacters")
                .setSourceCharacters("Bikes")
                .setTargetCharacters("MOTO");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTextWithConvertWriteSpace() {
        ConvertTextRequest request = new ConvertTextRequest("TestData/BookText.xlsx", "ConvertWriteSpace")
                .setTargetCharacters("MOTO")
                .setWorksheet("Bikes");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

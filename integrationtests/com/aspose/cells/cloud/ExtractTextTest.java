package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.ExtractTextRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ExtractText. */
class ExtractTextTest {
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
    void extractText() {
        ExtractTextRequest request = new ExtractTextRequest("TestData/BookText.xlsx", "ExtractFirstCharacter", "F1:F10")
                .setBeforePosition(10)
                .setAfterPosition(0)
                .setWorksheet("Bikes")
                .setRange("A1:A10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void extractTextWithExtractLastCharacter() {
        ExtractTextRequest request = new ExtractTextRequest("TestData/BookText.xlsx", "ExtractLastCharacter", "F1:F10")
                .setBeforePosition(0)
                .setAfterPosition(10)
                .setWorksheet("Bikes")
                .setRange("A1:A10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void extractTextWithExtractTextAfter() {
        ExtractTextRequest request = new ExtractTextRequest("TestData/BookText.xlsx", "ExtractTextAfter", "F1:F10")
                .setAfterText("bikes")
                .setBeforePosition(0)
                .setAfterPosition(0)
                .setWorksheet("Bikes")
                .setRange("A1:A10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

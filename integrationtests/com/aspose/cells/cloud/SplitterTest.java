package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.SplitRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.SplitSpreadsheetRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Splitter. */
class SplitterTest {
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
    void splitLocalFile() {
        SplitSpreadsheetRequest request = new SplitSpreadsheetRequest("TestData/Book1.xlsx")
                .setOutFormat("PDF");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void splitLocalFileToRemoteFolder() {
        SplitSpreadsheetRequest request = new SplitSpreadsheetRequest("TestData/Book1.xlsx")
                .setOutFormat("PDF")
                .setOutPath("TestData/Out");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void splitFileInRemote() {
        SplitRemoteSpreadsheetRequest request = new SplitRemoteSpreadsheetRequest("Book1.xlsx")
                .setFolder("TestData/In")
                .setOutFormat("PDF")
                .setOutPath("TestData/Out");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

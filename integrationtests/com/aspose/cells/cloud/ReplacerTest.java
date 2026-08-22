package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.ReplaceContentInRemoteRangeRequest;
import com.aspose.cells.cloud.request.ReplaceSpreadsheetContentRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Replacer. */
class ReplacerTest {
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
    void replaceTextInLocalFile() {
        ReplaceSpreadsheetContentRequest request = new ReplaceSpreadsheetContentRequest("TestData/BookText.xlsx", "Bike", "****");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void replaceTextFromWorksheetInLocalFile() {
        ReplaceSpreadsheetContentRequest request = new ReplaceSpreadsheetContentRequest("TestData/BookText.xlsx", "Bike", "****")
                .setWorksheet("Sales");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void replaceTextInRemote() {
        // TODO: API ReplaceRemoteSpreadsheetContent not found in the specification; case skipped.
    }

    @Test
    void replaceTextInRemoteSpreadsheet() {
        // TODO: API ReplaceRemoteSpreadsheetContent not found in the specification; case skipped.
    }

    @Test
    void replaceTextInRemoteRange() {
        upload("BookText.xlsx", "TestData/In/BookText.xlsx", "");
        ReplaceContentInRemoteRangeRequest request = new ReplaceContentInRemoteRangeRequest("BookText.xlsx", "Bike", "****", "Sales", "A1:A10")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetHyperlinkRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetHyperlinksRequest;
import com.aspose.cells.cloud.request.GetWorksheetHyperlinkRequest;
import com.aspose.cells.cloud.request.GetWorksheetHyperlinksRequest;
import com.aspose.cells.cloud.request.PostWorksheetHyperlinkRequest;
import com.aspose.cells.cloud.request.PutWorksheetHyperlinkRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Hyperlink;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for HypelinksController. */
class HypelinksControllerTest {
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
    void getWorksheetHyperlinks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetHyperlinksRequest request = new GetWorksheetHyperlinksRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetHyperlink() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetHyperlinkRequest request = new GetWorksheetHyperlinkRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetHyperlink() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetHyperlinkRequest request = new DeleteWorksheetHyperlinkRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetHyperlink() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetHyperlinkRequest request = new PostWorksheetHyperlinkRequest("Book1.xlsx", "Sheet1", 0, new Hyperlink().setAddress("https://products.aspose.cloud/cells/"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetHyperlink() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetHyperlinkRequest request = new PutWorksheetHyperlinkRequest("Book1.xlsx", "Sheet1", 1, 1, 2, 3, "https://products.aspose.cloud/cells/")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetHyperlinks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetHyperlinksRequest request = new DeleteWorksheetHyperlinksRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

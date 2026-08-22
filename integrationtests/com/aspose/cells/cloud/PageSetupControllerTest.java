package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteHeaderFooterRequest;
import com.aspose.cells.cloud.request.GetFooterRequest;
import com.aspose.cells.cloud.request.GetHeaderRequest;
import com.aspose.cells.cloud.request.GetPageSetupRequest;
import com.aspose.cells.cloud.request.PostFitTallToPagesRequest;
import com.aspose.cells.cloud.request.PostFitWideToPagesRequest;
import com.aspose.cells.cloud.request.PostFooterRequest;
import com.aspose.cells.cloud.request.PostHeaderRequest;
import com.aspose.cells.cloud.request.PostPageSetupRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.PageSetup;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for PageSetupController. */
class PageSetupControllerTest {
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
    void getPageSetup() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetPageSetupRequest request = new GetPageSetupRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postPageSetup() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostPageSetupRequest request = new PostPageSetupRequest("Book1.xlsx", "Sheet1", new PageSetup().setBlackAndWhite(true).setCenterHorizontally(true).setCenterVertically(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteHeaderFooter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteHeaderFooterRequest request = new DeleteHeaderFooterRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getHeader() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetHeaderRequest request = new GetHeaderRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postHeader() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostHeaderRequest request = new PostHeaderRequest("Book1.xlsx", "Sheet1", 1, "Update add header", true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getFooter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetFooterRequest request = new GetFooterRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postFooter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostFooterRequest request = new PostFooterRequest("Book1.xlsx", "Sheet1", 1, "add footer script", true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postFitWideToPages() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostFitWideToPagesRequest request = new PostFitWideToPagesRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postFitTallToPages() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostFitTallToPagesRequest request = new PostFitTallToPagesRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

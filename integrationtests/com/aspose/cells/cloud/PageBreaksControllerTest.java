package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteHorizontalPageBreakRequest;
import com.aspose.cells.cloud.request.DeleteHorizontalPageBreaksRequest;
import com.aspose.cells.cloud.request.DeleteVerticalPageBreakRequest;
import com.aspose.cells.cloud.request.DeleteVerticalPageBreaksRequest;
import com.aspose.cells.cloud.request.GetHorizontalPageBreakRequest;
import com.aspose.cells.cloud.request.GetHorizontalPageBreaksRequest;
import com.aspose.cells.cloud.request.GetVerticalPageBreakRequest;
import com.aspose.cells.cloud.request.GetVerticalPageBreaksRequest;
import com.aspose.cells.cloud.request.PutHorizontalPageBreakRequest;
import com.aspose.cells.cloud.request.PutVerticalPageBreakRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for PageBreaksController. */
class PageBreaksControllerTest {
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
    void getVerticalPageBreaks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetVerticalPageBreaksRequest request = new GetVerticalPageBreaksRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getHorizontalPageBreaks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetHorizontalPageBreaksRequest request = new GetHorizontalPageBreaksRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getVerticalPageBreak() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetVerticalPageBreakRequest request = new GetVerticalPageBreakRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getHorizontalPageBreak() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetHorizontalPageBreakRequest request = new GetHorizontalPageBreakRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putVerticalPageBreak() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutVerticalPageBreakRequest request = new PutVerticalPageBreakRequest("Book1.xlsx", "Sheet1")
                .setCellname("A1")
                .setColumn(1)
                .setRow(1)
                .setStartRow(1)
                .setEndRow(1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putHorizontalPageBreak() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutHorizontalPageBreakRequest request = new PutHorizontalPageBreakRequest("Book1.xlsx", "Sheet1")
                .setCellname("A1")
                .setRow(1)
                .setColumn(1)
                .setStartColumn(1)
                .setEndColumn(1)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteVerticalPageBreaks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteVerticalPageBreaksRequest request = new DeleteVerticalPageBreaksRequest("Book1.xlsx", "Sheet1")
                .setColumn(0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteHorizontalPageBreaks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteHorizontalPageBreaksRequest request = new DeleteHorizontalPageBreaksRequest("Book1.xlsx", "Sheet1")
                .setRow(0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteVerticalPageBreak() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteVerticalPageBreakRequest request = new DeleteVerticalPageBreakRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteHorizontalPageBreak() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteHorizontalPageBreakRequest request = new DeleteHorizontalPageBreakRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

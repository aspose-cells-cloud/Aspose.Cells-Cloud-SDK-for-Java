package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetDateFilterRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetFilterRequest;
import com.aspose.cells.cloud.request.GetWorksheetAutoFilterRequest;
import com.aspose.cells.cloud.request.PostWorksheetAutoFilterRefreshRequest;
import com.aspose.cells.cloud.request.PostWorksheetMatchBlanksRequest;
import com.aspose.cells.cloud.request.PostWorksheetMatchNonBlanksRequest;
import com.aspose.cells.cloud.request.PutWorksheetColorFilterRequest;
import com.aspose.cells.cloud.request.PutWorksheetCustomFilterRequest;
import com.aspose.cells.cloud.request.PutWorksheetDateFilterRequest;
import com.aspose.cells.cloud.request.PutWorksheetDynamicFilterRequest;
import com.aspose.cells.cloud.request.PutWorksheetFilterRequest;
import com.aspose.cells.cloud.request.PutWorksheetFilterTop10Request;
import com.aspose.cells.cloud.request.PutWorksheetIconFilterRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.CellsColor;
import com.aspose.cells.cloud.model.Color;
import com.aspose.cells.cloud.model.ColorFilterRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for AutoFilterController. */
class AutoFilterControllerTest {
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
    void getWorksheetAutoFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetAutoFilterRequest request = new GetWorksheetAutoFilterRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetDateFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetDateFilterRequest request = new PutWorksheetDateFilterRequest("Book1.xlsx", "Sheet1", "A1:B1", 0, "Year")
                .setYear(1920)
                .setMatchBlanks(false)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetFilterRequest request = new PutWorksheetFilterRequest("Book1.xlsx", "Sheet1", "A1:B1", 0, "Year")
                .setMatchBlanks(false)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetIconFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetIconFilterRequest request = new PutWorksheetIconFilterRequest("Book1.xlsx", "Sheet1", "A1:B1", 0, "ArrowsGray3", 1)
                .setMatchBlanks(false)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetCustomFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetCustomFilterRequest request = new PutWorksheetCustomFilterRequest("Book1.xlsx", "Sheet1", "A1:B1", 0, "LessOrEqual", "1")
                .setMatchBlanks(false)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetDynamicFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetDynamicFilterRequest request = new PutWorksheetDynamicFilterRequest("Book1.xlsx", "Sheet1", "A1:B1", 0, "BelowAverage")
                .setMatchBlanks(false)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetFilterTop10() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetFilterTop10Request request = new PutWorksheetFilterTop10Request("Book1.xlsx", "Sheet1", "A1:B1", 0, true, true, 1)
                .setMatchBlanks(false)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetColorFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetColorFilterRequest request = new PutWorksheetColorFilterRequest("Book1.xlsx", "Sheet1", "A1:B1", 0, new ColorFilterRequest().setPattern("Solid").setForegroundColor(new CellsColor().setType("Automatic").setColor(new Color().setR(48).setG(48).setB(48))))
                .setMatchBlanks(true)
                .setRefresh(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetMatchBlanks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetMatchBlanksRequest request = new PostWorksheetMatchBlanksRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetMatchNonBlanks() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetMatchNonBlanksRequest request = new PostWorksheetMatchNonBlanksRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetAutoFilterRefresh() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetAutoFilterRefreshRequest request = new PostWorksheetAutoFilterRefreshRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetDateFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetDateFilterRequest request = new DeleteWorksheetDateFilterRequest("Book1.xlsx", "Sheet1", 0, "Year")
                .setYear(1920)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetFilter() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetFilterRequest request = new DeleteWorksheetFilterRequest("Book1.xlsx", "Sheet1", 0)
                .setCriteria("year")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetOleObjectRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetOleObjectsRequest;
import com.aspose.cells.cloud.request.GetWorksheetOleObjectRequest;
import com.aspose.cells.cloud.request.GetWorksheetOleObjectsRequest;
import com.aspose.cells.cloud.request.PostUpdateWorksheetOleObjectRequest;
import com.aspose.cells.cloud.request.PutWorksheetOleObjectRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.OleObject;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for OleObjectsController. */
class OleObjectsControllerTest {
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
    void getWorksheetOleObjects() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetOleObjectsRequest request = new GetWorksheetOleObjectsRequest("Book1.xlsx", "Sheet6")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetOleObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetOleObjectRequest request = new GetWorksheetOleObjectRequest("Book1.xlsx", "Sheet6", 0)
                .setFormat("png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void deleteWorksheetOleObjects() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetOleObjectsRequest request = new DeleteWorksheetOleObjectsRequest("Book1.xlsx", "Sheet6")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetOleObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetOleObjectRequest request = new DeleteWorksheetOleObjectRequest("Book1.xlsx", "Sheet6", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postUpdateWorksheetOleObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostUpdateWorksheetOleObjectRequest request = new PostUpdateWorksheetOleObjectRequest("Book1.xlsx", "Sheet6", 0, new OleObject().setLeft(10).setRight(10).setHeight(90).setWidth(78))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetOleObject() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("OLEDoc.docx", "OLEDoc.docx", "");
        upload("word.jpg", "word.jpg", "");
        PutWorksheetOleObjectRequest request = new PutWorksheetOleObjectRequest("Book1.xlsx", "Sheet6")
                .setUpperLeftRow(1)
                .setUpperLeftColumn(1)
                .setHeight(100)
                .setWidth(80)
                .setOleFile("OLEDoc.docx")
                .setImageFile("word.jpg")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

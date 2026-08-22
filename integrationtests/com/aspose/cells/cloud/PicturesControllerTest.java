package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetPictureRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetPicturesRequest;
import com.aspose.cells.cloud.request.GetWorksheetPictureWithFormatRequest;
import com.aspose.cells.cloud.request.GetWorksheetPicturesRequest;
import com.aspose.cells.cloud.request.PostWorksheetPictureRequest;
import com.aspose.cells.cloud.request.PutWorksheetAddPictureRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Picture;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for PicturesController. */
class PicturesControllerTest {
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
    void getWorksheetPictures() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetPicturesRequest request = new GetWorksheetPicturesRequest("Book1.xlsx", "Sheet6")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetPictureWithFormat() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetPictureWithFormatRequest request = new GetWorksheetPictureWithFormatRequest("Book1.xlsx", "Sheet6", 0, "png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void putWorksheetAddPicture() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("WaterMark.png", "TestData/In/WaterMark.png", "");
        PutWorksheetAddPictureRequest request = new PutWorksheetAddPictureRequest("Book1.xlsx", "Sheet6")
                .setUpperLeftRow(1)
                .setUpperLeftColumn(1)
                .setLowerRightRow(10)
                .setLowerRightColumn(10)
                .setPicturePath("TestData/In/WaterMark.png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetPicture() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetPictureRequest request = new PostWorksheetPictureRequest("Book1.xlsx", "Sheet6", 0, new Picture().setLeft(10).setBottom(10))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetPicture() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetPictureRequest request = new DeleteWorksheetPictureRequest("Book1.xlsx", "Sheet6", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetPictures() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetPicturesRequest request = new DeleteWorksheetPicturesRequest("Book1.xlsx", "Sheet6")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

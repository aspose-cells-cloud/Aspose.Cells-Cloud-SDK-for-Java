package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetShapeRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetShapesRequest;
import com.aspose.cells.cloud.request.GetWorksheetShapeRequest;
import com.aspose.cells.cloud.request.GetWorksheetShapesRequest;
import com.aspose.cells.cloud.request.PostWorksheetGroupShapeRequest;
import com.aspose.cells.cloud.request.PostWorksheetShapeRequest;
import com.aspose.cells.cloud.request.PostWorksheetUngroupShapeRequest;
import com.aspose.cells.cloud.request.PutWorksheetShapeRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Shape;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ShapesController. */
class ShapesControllerTest {
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
    void getWorksheetShapes() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetShapesRequest request = new GetWorksheetShapesRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetShape() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetShapeRequest request = new GetWorksheetShapeRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetShape() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetShapeRequest request = new PutWorksheetShapeRequest("Book1.xlsx", "Sheet1")
                .setShapeDTO(new Shape())
                .setDrawingType("arc")
                .setUpperLeftRow(1)
                .setUpperLeftColumn(1)
                .setTop(10)
                .setLeft(10)
                .setWidth(100)
                .setHeight(100)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetShapes() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetShapesRequest request = new DeleteWorksheetShapesRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetShape() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetShapeRequest request = new DeleteWorksheetShapeRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetShape() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetShapeRequest request = new PostWorksheetShapeRequest("Book1.xlsx", "Sheet1", 0, new Shape().setLowerRightColumn(10))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetGroupShape() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetGroupShapeRequest request = new PostWorksheetGroupShapeRequest("Book1.xlsx", "Sheet6", Arrays.asList(0, 1))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetUngroupShape() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetUngroupShapeRequest request = new PostWorksheetUngroupShapeRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

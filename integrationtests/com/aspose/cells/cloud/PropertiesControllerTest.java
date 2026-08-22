package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteDocumentPropertiesRequest;
import com.aspose.cells.cloud.request.DeleteDocumentPropertyRequest;
import com.aspose.cells.cloud.request.GetDocumentPropertiesRequest;
import com.aspose.cells.cloud.request.GetDocumentPropertyRequest;
import com.aspose.cells.cloud.request.PutDocumentPropertyRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.CellsDocumentProperty;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for PropertiesController. */
class PropertiesControllerTest {
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
    void getDocumentProperties() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetDocumentPropertiesRequest request = new GetDocumentPropertiesRequest("Book1.xlsx")
                .setType("All")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getDocumentProperty() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetDocumentPropertyRequest request = new GetDocumentPropertyRequest("Book1.xlsx", "Author")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putDocumentProperty() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutDocumentPropertyRequest request = new PutDocumentPropertyRequest("Book1.xlsx", new CellsDocumentProperty().setName("Author").setValue("cells developer"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteDocumentProperty() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteDocumentPropertyRequest request = new DeleteDocumentPropertyRequest("Book1.xlsx", "Author")
                .setType("All")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteDocumentProperties() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteDocumentPropertiesRequest request = new DeleteDocumentPropertiesRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

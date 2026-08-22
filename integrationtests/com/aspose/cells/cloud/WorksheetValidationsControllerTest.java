package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetValidationRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetValidationsRequest;
import com.aspose.cells.cloud.request.GetWorksheetValidationRequest;
import com.aspose.cells.cloud.request.GetWorksheetValidationsRequest;
import com.aspose.cells.cloud.request.PostWorksheetValidationRequest;
import com.aspose.cells.cloud.request.PutWorksheetValidationRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Validation;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for WorksheetValidationsController. */
class WorksheetValidationsControllerTest {
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
    void getWorksheetValidations() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetValidationsRequest request = new GetWorksheetValidationsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetValidation() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetValidationRequest request = new GetWorksheetValidationRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetValidation() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetValidationRequest request = new PutWorksheetValidationRequest("Book1.xlsx", "Sheet1")
                .setRange("A1:C10")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetValidation() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetValidationRequest request = new PostWorksheetValidationRequest("Book1.xlsx", "Sheet1", 0, new Validation().setFormula1("=A1").setType("Custom"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetValidation() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetValidationRequest request = new DeleteWorksheetValidationRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetValidations() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetValidationsRequest request = new DeleteWorksheetValidationsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

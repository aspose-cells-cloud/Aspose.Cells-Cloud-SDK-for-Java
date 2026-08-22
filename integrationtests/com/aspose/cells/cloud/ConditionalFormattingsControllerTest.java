package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetConditionalFormattingAreaRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetConditionalFormattingRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetConditionalFormattingsRequest;
import com.aspose.cells.cloud.request.GetWorksheetConditionalFormattingRequest;
import com.aspose.cells.cloud.request.GetWorksheetConditionalFormattingsRequest;
import com.aspose.cells.cloud.request.PutWorksheetConditionalFormattingRequest;
import com.aspose.cells.cloud.request.PutWorksheetFormatConditionAreaRequest;
import com.aspose.cells.cloud.request.PutWorksheetFormatConditionConditionRequest;
import com.aspose.cells.cloud.request.PutWorksheetFormatConditionRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.FormatCondition;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ConditionalFormattingsController. */
class ConditionalFormattingsControllerTest {
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
    void getWorksheetConditionalFormattings() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetConditionalFormattingsRequest request = new GetWorksheetConditionalFormattingsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetConditionalFormatting() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetConditionalFormattingRequest request = new GetWorksheetConditionalFormattingRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetConditionalFormatting() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetConditionalFormattingRequest request = new PutWorksheetConditionalFormattingRequest("Book1.xlsx", "Sheet1", new FormatCondition().setType("CellValue").setOperator("Between").setFormula1("v1").setFormula2("v2"), "A1:C10")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetFormatCondition() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetFormatConditionRequest request = new PutWorksheetFormatConditionRequest("Book1.xlsx", "Sheet1", 0, "A1:C10", "CellValue", "Between", "v1", "v2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetFormatConditionArea() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetFormatConditionAreaRequest request = new PutWorksheetFormatConditionAreaRequest("Book1.xlsx", "Sheet1", 0, "A1:C10")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetFormatConditionCondition() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetFormatConditionConditionRequest request = new PutWorksheetFormatConditionConditionRequest("Book1.xlsx", "Sheet1", 0, "CellValue", "Between", "v1", "v2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetConditionalFormattings() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetConditionalFormattingsRequest request = new DeleteWorksheetConditionalFormattingsRequest("Book1.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetConditionalFormatting() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetConditionalFormattingRequest request = new DeleteWorksheetConditionalFormattingRequest("Book1.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetConditionalFormattingArea() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetConditionalFormattingAreaRequest request = new DeleteWorksheetConditionalFormattingAreaRequest("Book1.xlsx", "Sheet1", 1, 1, 4, 6)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

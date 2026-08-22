package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.PostWorkbookExportXMLRequest;
import com.aspose.cells.cloud.request.PostWorkbookImportXMLRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.DataSource;
import com.aspose.cells.cloud.model.ImportPosition;
import com.aspose.cells.cloud.model.ImportXMLRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for XmlController. */
class XmlControllerTest {
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
    void postWorkbookExportXML() {
        upload("Template.xlsx", "TestData/In/Template.xlsx", "");
        PostWorkbookExportXMLRequest request = new PostWorkbookExportXMLRequest("Template.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postWorkbookImportXML() {
        upload("Template.xlsx", "TestData/In/Template.xlsx", "");
        upload("data.xml", "TestData/In/data.xml", "");
        PostWorkbookImportXMLRequest request = new PostWorkbookImportXMLRequest("Template.xlsx", new ImportXMLRequest().setXMLFileSource(new DataSource().setDataSourceType("CloudFileSystem").setDataPath("TestData/In/data.xml")).setImportPosition(new ImportPosition().setSheetName("Sheet1").setRowIndex(3).setColumnIndex(4)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

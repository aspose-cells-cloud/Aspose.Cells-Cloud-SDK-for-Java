package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.CopyFileRequest;
import com.aspose.cells.cloud.request.DownloadFileRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for FileController. */
class FileControllerTest {
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
    void downloadFile() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DownloadFileRequest request = new DownloadFileRequest("TestData/In/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void uploadFile() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        UploadFileRequest request = new UploadFileRequest("testdata/Book1.xlsx", "TestData/In/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void copyFile() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        CopyFileRequest request = new CopyFileRequest("TestData/In/Book1.xlsx", "OutResult/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

    }
}

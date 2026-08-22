package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.GetDiscUsageRequest;
import com.aspose.cells.cloud.request.GetFileVersionsRequest;
import com.aspose.cells.cloud.request.ObjectExistsRequest;
import com.aspose.cells.cloud.request.StorageExistsRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for StorageController. */
class StorageControllerTest {
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
    void storageExists() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        StorageExistsRequest request = new StorageExistsRequest("Default");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void objectExists() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        ObjectExistsRequest request = new ObjectExistsRequest("TestData/In/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getDiscUsage() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetDiscUsageRequest request = new GetDiscUsageRequest();

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getFileVersions() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetFileVersionsRequest request = new GetFileVersionsRequest("TestData/In/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

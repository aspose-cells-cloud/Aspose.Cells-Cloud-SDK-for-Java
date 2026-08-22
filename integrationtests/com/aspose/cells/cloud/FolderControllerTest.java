package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.CopyFolderRequest;
import com.aspose.cells.cloud.request.CreateFolderRequest;
import com.aspose.cells.cloud.request.DeleteFolderRequest;
import com.aspose.cells.cloud.request.GetFilesListRequest;
import com.aspose.cells.cloud.request.MoveFolderRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for FolderController. */
class FolderControllerTest {
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
    void getFilesList() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetFilesListRequest request = new GetFilesListRequest()
                .setPath("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void createFolder() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        CreateFolderRequest request = new CreateFolderRequest("OutResult/NewFolder");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

    }

    @Test
    void copyFolder() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        CopyFolderRequest request = new CopyFolderRequest("TestData/In", "OutResult/Create");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

    }

    @Test
    void moveFolder() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        MoveFolderRequest request = new MoveFolderRequest("OutResult/Create", "OutResult/Move");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

    }

    @Test
    void deleteFolder() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteFolderRequest request = new DeleteFolderRequest("OutResult/Create")
                .setRecursive(true);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

    }
}

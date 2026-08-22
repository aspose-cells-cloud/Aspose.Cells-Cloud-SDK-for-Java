package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.PostAddTextContentRequest;
import com.aspose.cells.cloud.request.PostTrimContentRequest;
import com.aspose.cells.cloud.request.PostUpdateWordCaseRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.AddTextOptions;
import com.aspose.cells.cloud.model.DataSource;
import com.aspose.cells.cloud.model.ScopeOptions;
import com.aspose.cells.cloud.model.TrimContentOptions;
import com.aspose.cells.cloud.model.WordCaseOptions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for TextProcessingController. */
class TextProcessingControllerTest {
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
    void postAddTextContent() {
        upload("BookText.xlsx", "TestData/In/BookText.xlsx", "");
        PostAddTextContentRequest request = new PostAddTextContentRequest(new AddTextOptions().setDataSource(new DataSource().setDataSourceType("CloudFileSystem").setDataPath("TestData/In/BookText.xlsx")).setText("Aspose.Cells Cloud is an excellent product.").setScopeOptions(new ScopeOptions().setScope("Workbook")).setSelectPoistion("AtTheBeginning").setSkipEmptyCells(true));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postTrimContent() {
        upload("BookText.xlsx", "TestData/In/BookText.xlsx", "");
        PostTrimContentRequest request = new PostTrimContentRequest(new TrimContentOptions().setDataSource(new DataSource().setDataSourceType("CloudFileSystem").setDataPath("TestData/In/BookText.xlsx")).setTrimLeading(true).setTrimTrailing(true).setTrimSpaceBetweenWordTo1(true).setRemoveAllLineBreaks(true).setScopeOptions(new ScopeOptions().setScope("EntireWorkbook")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postUpdateWordCase() {
        upload("BookText.xlsx", "TestData/In/BookText.xlsx", "");
        PostUpdateWordCaseRequest request = new PostUpdateWordCaseRequest(new WordCaseOptions().setDataSource(new DataSource().setDataSourceType("CloudFileSystem").setDataPath("TestData/In/BookText.xlsx")).setWordCaseType("None").setScopeOptions(new ScopeOptions().setScope("EntireWorkbook")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

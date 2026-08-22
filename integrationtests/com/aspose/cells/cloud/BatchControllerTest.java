package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.PostBatchConvertRequest;
import com.aspose.cells.cloud.request.PostBatchLockRequest;
import com.aspose.cells.cloud.request.PostBatchProtectRequest;
import com.aspose.cells.cloud.request.PostBatchSplitRequest;
import com.aspose.cells.cloud.request.PostBatchUnlockRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.BatchConvertRequest;
import com.aspose.cells.cloud.model.BatchLockRequest;
import com.aspose.cells.cloud.model.BatchProtectRequest;
import com.aspose.cells.cloud.model.BatchSplitRequest;
import com.aspose.cells.cloud.model.MatchConditionRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for BatchController. */
class BatchControllerTest {
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
    void postBatchConvert() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("myDocument.xlsx", "TestData/In/myDocument.xlsx", "");
        PostBatchConvertRequest request = new PostBatchConvertRequest(new BatchConvertRequest().setSourceFolder("TestData/In").setFormat("pdf").setOutFolder("OutResult").setMatchCondition(new MatchConditionRequest().setRegexPattern("(^Book)(.+)(xlsx$)")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postBatchProtect() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("myDocument.xlsx", "TestData/In/myDocument.xlsx", "");
        PostBatchProtectRequest request = new PostBatchProtectRequest(new BatchProtectRequest().setSourceFolder("TestData/In").setProtectionType("All").setPassword("123456").setOutFolder("OutResult").setMatchCondition(new MatchConditionRequest().setRegexPattern("(^Book)(.+)(xlsx$)")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postBatchLock() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("myDocument.xlsx", "TestData/In/myDocument.xlsx", "");
        PostBatchLockRequest request = new PostBatchLockRequest(new BatchLockRequest().setSourceFolder("TestData/In").setPassword("123456").setOutFolder("OutResult").setMatchCondition(new MatchConditionRequest().setRegexPattern("(^Book)(.+)(xlsx$)")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postBatchUnlock() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("myDocument.xlsx", "TestData/In/myDocument.xlsx", "");
        PostBatchUnlockRequest request = new PostBatchUnlockRequest(new BatchLockRequest().setSourceFolder("TestData/In").setPassword("123456").setOutFolder("OutResult").setMatchCondition(new MatchConditionRequest().setRegexPattern("(^Book)(.+)(xlsx$)")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postBatchSplit() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("myDocument.xlsx", "TestData/In/myDocument.xlsx", "");
        PostBatchSplitRequest request = new PostBatchSplitRequest(new BatchSplitRequest().setSourceFolder("TestData/In").setFormat("Pdf").setOutFolder("OutResult").setMatchCondition(new MatchConditionRequest().setRegexPattern("(^Book)(.+)(xlsx$)")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

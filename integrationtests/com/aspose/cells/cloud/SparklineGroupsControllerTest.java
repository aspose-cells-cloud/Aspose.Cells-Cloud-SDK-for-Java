package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetSparklineGroupRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetSparklineGroupsRequest;
import com.aspose.cells.cloud.request.GetWorksheetSparklineGroupRequest;
import com.aspose.cells.cloud.request.GetWorksheetSparklineGroupsRequest;
import com.aspose.cells.cloud.request.PostWorksheetSparklineGroupRequest;
import com.aspose.cells.cloud.request.PutWorksheetSparklineGroupRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.SparklineGroup;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for SparklineGroupsController. */
class SparklineGroupsControllerTest {
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
    void getWorksheetSparklineGroups() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        GetWorksheetSparklineGroupsRequest request = new GetWorksheetSparklineGroupsRequest("TestCase.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetSparklineGroup() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        GetWorksheetSparklineGroupRequest request = new GetWorksheetSparklineGroupRequest("TestCase.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetSparklineGroups() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeleteWorksheetSparklineGroupsRequest request = new DeleteWorksheetSparklineGroupsRequest("TestCase.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetSparklineGroup() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        DeleteWorksheetSparklineGroupRequest request = new DeleteWorksheetSparklineGroupRequest("TestCase.xlsx", "Sheet1", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetSparklineGroup() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PutWorksheetSparklineGroupRequest request = new PutWorksheetSparklineGroupRequest("TestCase.xlsx", "Sheet1", "Line", "C6:E13", false, "G6:G13")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetSparklineGroup() {
        upload("TestCase.xlsx", "TestData/In/TestCase.xlsx", "");
        PostWorksheetSparklineGroupRequest request = new PostWorksheetSparklineGroupRequest("TestCase.xlsx", "Sheet1", 0, new SparklineGroup().setDisplayHidden(true).setPlotRightToLeft(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

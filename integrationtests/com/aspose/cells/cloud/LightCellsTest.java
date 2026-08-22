package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteMetadataRequest;
import com.aspose.cells.cloud.request.GetMetadataRequest;
import com.aspose.cells.cloud.request.PostAssembleRequest;
import com.aspose.cells.cloud.request.PostClearObjectsRequest;
import com.aspose.cells.cloud.request.PostCompressRequest;
import com.aspose.cells.cloud.request.PostExportRequest;
import com.aspose.cells.cloud.request.PostLockRequest;
import com.aspose.cells.cloud.request.PostMergeRequest;
import com.aspose.cells.cloud.request.PostMetadataRequest;
import com.aspose.cells.cloud.request.PostProtectRequest;
import com.aspose.cells.cloud.request.PostRepairRequest;
import com.aspose.cells.cloud.request.PostReplaceRequest;
import com.aspose.cells.cloud.request.PostReverseRequest;
import com.aspose.cells.cloud.request.PostSearchRequest;
import com.aspose.cells.cloud.request.PostSplitRequest;
import com.aspose.cells.cloud.request.PostUnlockRequest;
import com.aspose.cells.cloud.request.PostWatermarkRequest;
import com.aspose.cells.cloud.model.CellsDocumentProperty;
import com.aspose.cells.cloud.model.ProtectWorkbookRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for LightCells. */
class LightCellsTest {
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

    @Test
    void postSplit_0() {
        // outFormat=pdf
        PostSplitRequest request = new PostSplitRequest("testdata/Book1.xlsx", "pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postSplit_1() {
        // outFormat=xps
        PostSplitRequest request = new PostSplitRequest("testdata/Book1.xlsx", "xps");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postAssemble_0() {
        // format=html
        PostAssembleRequest request = new PostAssembleRequest("testdata/datasource.xlsx", "ds")
                .setOutFormat("html");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postExport_0() {
        // format=pdf, objectType=listobject
        PostExportRequest request = new PostExportRequest("testdata/Book1.xlsx")
                .setObjectType("listobject")
                .setFormat("pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postExport_1() {
        // format=md, objectType=listobject
        PostExportRequest request = new PostExportRequest("testdata/Book1.xlsx")
                .setObjectType("listobject")
                .setFormat("md");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postCompress_0() {
        // compressLevel=50
        PostCompressRequest request = new PostCompressRequest("testdata/datasource.xlsx")
                .setCompressLevel(0);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postCompress_1() {
        // compressLevel=90
        PostCompressRequest request = new PostCompressRequest("testdata/datasource.xlsx")
                .setCompressLevel(0);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postMerge_0() {
        // format=html, mergeToOneSheet=true
        PostMergeRequest request = new PostMergeRequest("testdata/datasource.xlsx")
                .setOutFormat("html")
                .setMergeToOneSheet(false);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postMerge_1() {
        // format=pdf, mergeToOneSheet=true
        PostMergeRequest request = new PostMergeRequest("testdata/datasource.xlsx")
                .setOutFormat("pdf")
                .setMergeToOneSheet(false);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postMerge_2() {
        // format=xlsx, mergeToOneSheet=true
        PostMergeRequest request = new PostMergeRequest("testdata/datasource.xlsx")
                .setOutFormat("xlsx")
                .setMergeToOneSheet(false);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postMerge_3() {
        // format=json, mergeToOneSheet=false
        PostMergeRequest request = new PostMergeRequest("testdata/datasource.xlsx")
                .setOutFormat("json")
                .setMergeToOneSheet(false);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postUnlock() {
        PostUnlockRequest request = new PostUnlockRequest("testdata/needUnlock.xlsx", "123456");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postLock() {
        PostLockRequest request = new PostLockRequest("testdata/needlock.xlsx", "123456");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postProtect() {
        PostProtectRequest request = new PostProtectRequest("testdata/assemblytest.xlsx", new ProtectWorkbookRequest().setAwaysOpenReadOnly(true).setEncryptWithPassword("123456"))
                .setPassword("123456");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postProtect_ProtectWorkbookRequest() {
        PostProtectRequest request = new PostProtectRequest("testdata/datasource.xlsx", new ProtectWorkbookRequest().setAwaysOpenReadOnly(true).setEncryptWithPassword("123456"));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(((Map<?, ?>) response.getJson(Map.class)).get("Files"));
    }

    @Test
    void postSearch() {
        PostSearchRequest request = new PostSearchRequest("testdata/datasource.xlsx", "12");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postReplace() {
        PostReplaceRequest request = new PostReplaceRequest("testdata/datasource.xlsx", "12", "newtext");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postReplaceOnlySheetname() {
        PostReplaceRequest request = new PostReplaceRequest("testdata/datasource.xlsx", "12", "newtext")
                .setSheetname("Sheet1");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postWatermark() {
        PostWatermarkRequest request = new PostWatermarkRequest("testdata/datasource.xlsx", "aspose.cells cloud sdk", "#773322");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_0() {
        // objecttype=chart
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "chart");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_1() {
        // objecttype=comment
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "comment");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_2() {
        // objecttype=picture
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "picture");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_3() {
        // objecttype=shape
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "shape");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_4() {
        // objecttype=listobject
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "listobject");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_5() {
        // objecttype=hyperlink
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "hyperlink");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_6() {
        // objecttype=oleobject
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "oleobject");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_7() {
        // objecttype=pivottable
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "pivottable");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_8() {
        // objecttype=validation
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "validation");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postClearObjects_9() {
        // objecttype=Background
        PostClearObjectsRequest request = new PostClearObjectsRequest("testdata/Book1.xlsx", "Background");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postRepair_0() {
        // format=xlsx
        PostRepairRequest request = new PostRepairRequest("testdata/Book1.xlsx")
                .setOutFormat("xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postRepair_1() {
        // format=pdf
        PostRepairRequest request = new PostRepairRequest("testdata/Book1.xlsx")
                .setOutFormat("pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postReverse_0() {
        // rotateType=rows, format=pdf
        PostReverseRequest request = new PostReverseRequest("testdata/Book1.xlsx", "rows")
                .setOutFormat("pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postReverse_1() {
        // rotateType=cols, format=pdf
        PostReverseRequest request = new PostReverseRequest("testdata/Book1.xlsx", "cols")
                .setOutFormat("pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getMetadata() {
        GetMetadataRequest request = new GetMetadataRequest("testdata/Book1.xlsx")
                .setType("all");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void deleteMetadata() {
        DeleteMetadataRequest request = new DeleteMetadataRequest("testdata/Book1.xlsx")
                .setType("all");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postMetadata() {
        PostMetadataRequest request = new PostMetadataRequest("testdata/Book1.xlsx", Arrays.asList(new CellsDocumentProperty().setName("Author").setValue("roy.wang")));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

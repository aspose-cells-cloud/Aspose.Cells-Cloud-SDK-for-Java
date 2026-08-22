package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.GetChartAreaBorderRequest;
import com.aspose.cells.cloud.request.GetChartAreaFillFormatRequest;
import com.aspose.cells.cloud.request.GetChartAreaRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ChartAreaController. */
class ChartAreaControllerTest {
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
    void getChartArea() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetChartAreaRequest request = new GetChartAreaRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getChartAreaFillFormat() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetChartAreaFillFormatRequest request = new GetChartAreaFillFormatRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getChartAreaBorder() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetChartAreaBorderRequest request = new GetChartAreaBorderRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetChartLegendRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetChartRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetChartTitleRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetChartsRequest;
import com.aspose.cells.cloud.request.GetWorksheetChartLegendRequest;
import com.aspose.cells.cloud.request.GetWorksheetChartRequest;
import com.aspose.cells.cloud.request.GetWorksheetChartTitleRequest;
import com.aspose.cells.cloud.request.GetWorksheetChartsRequest;
import com.aspose.cells.cloud.request.PostWorksheetChartLegendRequest;
import com.aspose.cells.cloud.request.PostWorksheetChartRequest;
import com.aspose.cells.cloud.request.PostWorksheetChartTitleRequest;
import com.aspose.cells.cloud.request.PutWorksheetChartLegendRequest;
import com.aspose.cells.cloud.request.PutWorksheetChartRequest;
import com.aspose.cells.cloud.request.PutWorksheetChartTitleRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Chart;
import com.aspose.cells.cloud.model.Legend;
import com.aspose.cells.cloud.model.Title;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for ChartsController. */
class ChartsControllerTest {
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
    void getWorksheetCharts() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetChartsRequest request = new GetWorksheetChartsRequest("Book1.xlsx", "Sheet4")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetChart() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetChartRequest request = new GetWorksheetChartRequest("Book1.xlsx", "Sheet4", 0)
                .setFormat("png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void putWorksheetChart() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetChartRequest request = new PutWorksheetChartRequest("Book1.xlsx", "Sheet4", "Pie")
                .setUpperLeftRow(5)
                .setUpperLeftColumn(5)
                .setLowerRightRow(10)
                .setLowerRightColumn(10)
                .setArea("C7:D11")
                .setIsVertical(true)
                .setTitle("Aspose Chart")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetChart() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetChartRequest request = new DeleteWorksheetChartRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetChart() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetChartRequest request = new PostWorksheetChartRequest("Book1.xlsx", "Sheet4", 0, new Chart().setShowLegend(true).setShowDataTable(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetChartLegend() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetChartLegendRequest request = new GetWorksheetChartLegendRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetChartLegend() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetChartLegendRequest request = new PostWorksheetChartLegendRequest("Book1.xlsx", "Sheet4", 0, new Legend().setPosition("Top"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetChartLegend() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetChartLegendRequest request = new PutWorksheetChartLegendRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetChartLegend() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetChartLegendRequest request = new DeleteWorksheetChartLegendRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetCharts() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetChartsRequest request = new DeleteWorksheetChartsRequest("Book1.xlsx", "Sheet4")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetChartTitle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetChartTitleRequest request = new GetWorksheetChartTitleRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetChartTitle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetChartTitleRequest request = new PostWorksheetChartTitleRequest("Book1.xlsx", "Sheet4", 0, new Title().setIsVisible(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetChartTitle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetChartTitleRequest request = new PutWorksheetChartTitleRequest("Book1.xlsx", "Sheet4", 0)
                .setTitle(new Title().setIsVisible(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetChartTitle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetChartTitleRequest request = new DeleteWorksheetChartTitleRequest("Book1.xlsx", "Sheet4", 0)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

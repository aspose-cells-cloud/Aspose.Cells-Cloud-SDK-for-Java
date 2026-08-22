package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteWorksheetCellsRangeRequest;
import com.aspose.cells.cloud.request.GetWorksheetCellsRangeValueRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeColumnWidthRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeMergeRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeMoveToRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeOutlineBorderRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeRowHeightRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeSortRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeStyleRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeUnMergeRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeValueRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangesCopyRequest;
import com.aspose.cells.cloud.request.PutWorksheetCellsRangeRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.Color;
import com.aspose.cells.cloud.model.DataSorter;
import com.aspose.cells.cloud.model.Font;
import com.aspose.cells.cloud.model.Range;
import com.aspose.cells.cloud.model.RangeCopyRequest;
import com.aspose.cells.cloud.model.RangeSetOutlineBorderRequest;
import com.aspose.cells.cloud.model.RangeSetStyleRequest;
import com.aspose.cells.cloud.model.RangeSortRequest;
import com.aspose.cells.cloud.model.Style;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for RangesController. */
class RangesControllerTest {
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
    void postWorksheetCellsRangesCopy() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangesCopyRequest request = new PostWorksheetCellsRangesCopyRequest("Book1.xlsx", "Sheet1", new RangeCopyRequest().setOperate("copydata").setSource(new Range().setColumnCount(3).setFirstColumn(8).setFirstRow(3).setRowCount(2)).setTarget(new Range().setColumnCount(3).setFirstColumn(8).setFirstRow(13).setRowCount(2)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeMerge() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeMergeRequest request = new PostWorksheetCellsRangeMergeRequest("Book1.xlsx", "Sheet1", new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeUnMerge() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeUnMergeRequest request = new PostWorksheetCellsRangeUnMergeRequest("Book1.xlsx", "Sheet1", new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeStyleRequest request = new PostWorksheetCellsRangeStyleRequest("Book1.xlsx", "Sheet1", new RangeSetStyleRequest().setStyle(new Style().setFont(new Font().setSize(16))).setRange(new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorksheetCellsRangeValue() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorksheetCellsRangeValueRequest request = new GetWorksheetCellsRangeValueRequest("Book1.xlsx", "Sheet1")
                .setNamerange("Name_2")
                .setFirstRow(0)
                .setFirstColumn(0)
                .setRowCount(3)
                .setColumnCount(2)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeValue() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeValueRequest request = new PostWorksheetCellsRangeValueRequest("Book1.xlsx", "Sheet1", new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10), "100")
                .setIsConverted(true)
                .setSetStyle(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeMoveTo() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeMoveToRequest request = new PostWorksheetCellsRangeMoveToRequest("Book1.xlsx", "Sheet1", new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10), 10, 10)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeOutlineBorder() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeOutlineBorderRequest request = new PostWorksheetCellsRangeOutlineBorderRequest("Book1.xlsx", "Sheet1", new RangeSetOutlineBorderRequest().setBorderEdge("LeftBorder").setBorderStyle("Dotted").setBorderColor(new Color().setR(48).setG(48).setB(48)).setRange(new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeColumnWidth() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeColumnWidthRequest request = new PostWorksheetCellsRangeColumnWidthRequest("Book1.xlsx", "Sheet1", new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10), 10.7)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeRowHeight() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorksheetCellsRangeRowHeightRequest request = new PostWorksheetCellsRangeRowHeightRequest("Book1.xlsx", "Sheet1", new Range().setColumnCount(1).setColumnWidth(10.0).setFirstRow(1).setRowCount(10), 10.9)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorksheetCellsRange() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorksheetCellsRangeRequest request = new PutWorksheetCellsRangeRequest("Book1.xlsx", "Sheet1", "A1:C6", "Down")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorksheetCellsRange() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorksheetCellsRangeRequest request = new DeleteWorksheetCellsRangeRequest("Book1.xlsx", "Sheet1", "A1:C6", "Up")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorksheetCellsRangeSort() {
        upload("Group.xlsx", "TestData/In/Group.xlsx", "");
        PostWorksheetCellsRangeSortRequest request = new PostWorksheetCellsRangeSortRequest("Group.xlsx", "book1", new RangeSortRequest().setDataSorter(new DataSorter().setCaseSensitive(true)).setCellArea(new Range().setColumnCount(3).setFirstColumn(0).setFirstRow(0).setRowCount(15)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }
}

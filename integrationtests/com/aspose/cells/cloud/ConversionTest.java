package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.ConvertChartToImageRequest;
import com.aspose.cells.cloud.request.ConvertChartToPdfRequest;
import com.aspose.cells.cloud.request.ConvertRangeToCsvRequest;
import com.aspose.cells.cloud.request.ConvertRangeToHtmlRequest;
import com.aspose.cells.cloud.request.ConvertRangeToImageRequest;
import com.aspose.cells.cloud.request.ConvertRangeToJsonRequest;
import com.aspose.cells.cloud.request.ConvertRangeToPdfRequest;
import com.aspose.cells.cloud.request.ConvertSpreadsheetRequest;
import com.aspose.cells.cloud.request.ConvertSpreadsheetToCsvRequest;
import com.aspose.cells.cloud.request.ConvertSpreadsheetToJsonRequest;
import com.aspose.cells.cloud.request.ConvertSpreadsheetToPdfRequest;
import com.aspose.cells.cloud.request.ConvertTableToCsvRequest;
import com.aspose.cells.cloud.request.ConvertTableToHtmlRequest;
import com.aspose.cells.cloud.request.ConvertTableToImageRequest;
import com.aspose.cells.cloud.request.ConvertTableToJsonRequest;
import com.aspose.cells.cloud.request.ConvertTableToPdfRequest;
import com.aspose.cells.cloud.request.ConvertWorksheetToCsvRequest;
import com.aspose.cells.cloud.request.ConvertWorksheetToHtmlRequest;
import com.aspose.cells.cloud.request.ConvertWorksheetToHtmlTableRequest;
import com.aspose.cells.cloud.request.ConvertWorksheetToImageRequest;
import com.aspose.cells.cloud.request.ConvertWorksheetToPdfRequest;
import com.aspose.cells.cloud.request.ExportChartAsFormatRequest;
import com.aspose.cells.cloud.request.ExportRangeAsFormatRequest;
import com.aspose.cells.cloud.request.ExportSpreadsheetAsFormatRequest;
import com.aspose.cells.cloud.request.ExportTableAsFormatRequest;
import com.aspose.cells.cloud.request.ExportWorksheetAsFormatRequest;
import com.aspose.cells.cloud.request.SaveSpreadsheetAsRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.SaveOptionsData;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Conversion. */
class ConversionTest {
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
    void workbookSaveAs_0() {
        // format=csv, newfilename=OutResult/PostExcelSaveAs.csv
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        SaveSpreadsheetAsRequest request = new SaveSpreadsheetAsRequest("Book1.xlsx", "csv")
                .setSaveOptionsData(new SaveOptionsData().setFilename("OutResult/PostExcelSaveAs.csv"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_1() {
        // format=pdf, newfilename=OutResult/PostExcelSaveAs.pdf
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        SaveSpreadsheetAsRequest request = new SaveSpreadsheetAsRequest("Book1.xlsx", "pdf")
                .setSaveOptionsData(new SaveOptionsData().setFilename("OutResult/PostExcelSaveAs.pdf"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void convertWorkbook_0() {
        // format=png
        ConvertSpreadsheetRequest request = new ConvertSpreadsheetRequest("TestData/Book1.xlsx", "png");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_1() {
        // format=sql
        ConvertSpreadsheetRequest request = new ConvertSpreadsheetRequest("TestData/Book1.xlsx", "sql");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertSpreadsheetToPdf() {
        ConvertSpreadsheetToPdfRequest request = new ConvertSpreadsheetToPdfRequest("TestData/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertSpreadsheetToCsv() {
        ConvertSpreadsheetToCsvRequest request = new ConvertSpreadsheetToCsvRequest("TestData/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertSpreadsheetToJSON() {
        ConvertSpreadsheetToJsonRequest request = new ConvertSpreadsheetToJsonRequest("TestData/Book1.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_0() {
        // format=csv, outPath=OutResult/ConvertWorkbook.csv
        ConvertSpreadsheetRequest request = new ConvertSpreadsheetRequest("TestData/Book1.xlsx", "csv")
                .setOutPath("OutResult/ConvertWorkbook.csv");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToSvg() {
        ConvertWorksheetToImageRequest request = new ConvertWorksheetToImageRequest("TestData/TestTables.xlsx", "Sheet2", "svg");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToPng() {
        ConvertWorksheetToImageRequest request = new ConvertWorksheetToImageRequest("TestData/TestTables.xlsx", "Sheet2", "png");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToTiff() {
        ConvertWorksheetToImageRequest request = new ConvertWorksheetToImageRequest("TestData/TestTables.xlsx", "Sheet2", "tiff");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToPdf() {
        ConvertWorksheetToPdfRequest request = new ConvertWorksheetToPdfRequest("TestData/TestTables.xlsx", "Sheet2");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToCsv() {
        ConvertWorksheetToCsvRequest request = new ConvertWorksheetToCsvRequest("TestData/TestTables.xlsx", "Sheet2");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToHtml() {
        ConvertWorksheetToHtmlRequest request = new ConvertWorksheetToHtmlRequest("TestData/TestTables.xlsx", "Sheet2");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorksheetToTable() {
        // TODO: API ConvertWorksheetToTable not found in the specification; case skipped.
    }

    @Test
    void convertWorksheetToHtmlTable() {
        ConvertWorksheetToHtmlTableRequest request = new ConvertWorksheetToHtmlTableRequest("TestData/TestTables.xlsx", "Sheet2");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTableToSvg() {
        ConvertTableToImageRequest request = new ConvertTableToImageRequest("TestData/TestTables.xlsx", "Sheet2", "Table13", "svg");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTableToPng() {
        ConvertTableToImageRequest request = new ConvertTableToImageRequest("TestData/TestTables.xlsx", "Sheet2", "Table13", "png");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTableToPdf() {
        ConvertTableToPdfRequest request = new ConvertTableToPdfRequest("TestData/TestTables.xlsx", "Sheet2", "Table13");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTableToCsv() {
        ConvertTableToCsvRequest request = new ConvertTableToCsvRequest("TestData/TestTables.xlsx", "Sheet2", "Table13");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTableToHtml() {
        ConvertTableToHtmlRequest request = new ConvertTableToHtmlRequest("TestData/TestTables.xlsx", "Sheet2", "Table13");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertTableToJson() {
        ConvertTableToJsonRequest request = new ConvertTableToJsonRequest("TestData/TestTables.xlsx", "Sheet2", "Table13");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertRangeToImage() {
        ConvertRangeToImageRequest request = new ConvertRangeToImageRequest("TestData/TestTables.xlsx", "Sheet2", "B2:F10", "svg");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertRangeToPdf() {
        ConvertRangeToPdfRequest request = new ConvertRangeToPdfRequest("TestData/TestTables.xlsx", "Sheet2", "A1:F10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertRangeToCsv() {
        ConvertRangeToCsvRequest request = new ConvertRangeToCsvRequest("TestData/TestTables.xlsx", "Sheet2", "A1:F10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertRangeToHtml() {
        ConvertRangeToHtmlRequest request = new ConvertRangeToHtmlRequest("TestData/TestTables.xlsx", "Sheet2", "A1:F10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertRangeToJson() {
        ConvertRangeToJsonRequest request = new ConvertRangeToJsonRequest("TestData/TestTables.xlsx", "Sheet2", "A1:F10");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertChartToImage_0() {
        // format=svg
        ConvertChartToImageRequest request = new ConvertChartToImageRequest("TestData/EmployeeSalesSummary.xlsx", "Sales", 0, "svg");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertChartToPdf() {
        ConvertChartToPdfRequest request = new ConvertChartToPdfRequest("TestData/EmployeeSalesSummary.xlsx", "Sales", 0);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportSpreadsheetAsFormat_0() {
        // format=pdf
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        ExportSpreadsheetAsFormatRequest request = new ExportSpreadsheetAsFormatRequest("Book1.xlsx", "pdf")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportSpreadsheetAsFormat_1() {
        // format=pptx
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        ExportSpreadsheetAsFormatRequest request = new ExportSpreadsheetAsFormatRequest("Book1.xlsx", "pptx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportSpreadsheetAsFormat_2() {
        // format=json
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        ExportSpreadsheetAsFormatRequest request = new ExportSpreadsheetAsFormatRequest("Book1.xlsx", "json")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportWorksheetAsFormat() {
        upload("EmployeeSalesSummary.xlsx", "TestData/In/EmployeeSalesSummary.xlsx", "");
        ExportWorksheetAsFormatRequest request = new ExportWorksheetAsFormatRequest("EmployeeSalesSummary.xlsx", "Sales", "svg")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportChartAsFormat_0() {
        // format=svg
        upload("EmployeeSalesSummary.xlsx", "TestData/In/EmployeeSalesSummary.xlsx", "");
        ExportChartAsFormatRequest request = new ExportChartAsFormatRequest("EmployeeSalesSummary.xlsx", "Sales", 0, "svg")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportTableAsFormat_0() {
        // format=svg
        upload("TestTables.xlsx", "TestData/In/TestTables.xlsx", "");
        ExportTableAsFormatRequest request = new ExportTableAsFormatRequest("TestTables.xlsx", "Sheet2", "Table13", "svg")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void exportRangeAsFormat_0() {
        // format=svg
        upload("EmployeeSalesSummary.xlsx", "TestData/In/EmployeeSalesSummary.xlsx", "");
        ExportRangeAsFormatRequest request = new ExportRangeAsFormatRequest("EmployeeSalesSummary.xlsx", "Sales", "A1:F16", "svg")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

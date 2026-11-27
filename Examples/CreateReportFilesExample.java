package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.model.Range;
import com.aspose.cells.cloud.model.RangeSetStyleRequest;
import com.aspose.cells.cloud.model.Style;
import com.aspose.cells.cloud.request.PostRenameWorksheetRequest;
import com.aspose.cells.cloud.request.PostWorkbookGetSmartMarkerResultRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellSetValueRequest;
import com.aspose.cells.cloud.request.PostWorksheetCellsRangeStyleRequest;
import com.aspose.cells.cloud.request.PutAddNewWorksheetRequest;
import com.aspose.cells.cloud.request.PutChangeVisibilityWorksheetRequest;
import com.aspose.cells.cloud.request.PutWorkbookCreateRequest;
import com.aspose.cells.cloud.request.PutWorksheetChartRequest;
import com.aspose.cells.cloud.request.PutWorksheetListObjectRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;

/**
 * Create a report workbook in cloud storage from smart markers and XML data,
 * then format the data range, add a chart and hide the data sheet.
 */
public final class CreateReportFilesExample {

    private static final String REMOTE_FOLDER = "JavaSDK";
    private static final String REPORT_TEMPLATE = "ProductSalteReportTemplate.xlsx";
    private static final String REPORT_NAME = "ProductSaleReport.xlsx";
    private static final String SHEET_NAME = "SalesData";
    private static final String REPORT_SHEET_NAME = "Sales Report";
    private static final String REPORT_DATA_FILE = "ReportData.xml";

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Create the template file.
        PutWorkbookCreateRequest create = new PutWorkbookCreateRequest(REPORT_TEMPLATE);
        create.setFolder(REMOTE_FOLDER);
        create.setIsWriteOver(true);
        client.call(create);
        System.out.println("Create template file.");

        // Add Sheet1.
        PutAddNewWorksheetRequest addSheet =
                new PutAddNewWorksheetRequest(REPORT_TEMPLATE, "Sheet1");
        addSheet.setFolder(REMOTE_FOLDER);
        client.call(addSheet);
        System.out.println("Add Sheet1.");

        // Upload the report data file.
        client.call(new UploadFileRequest(REMOTE_FOLDER + "/" + REPORT_DATA_FILE,
                FormFile.ofPath(REPORT_DATA_FILE)));
        System.out.println("Update data file.");

        // Fill the smart marker cells.
        setCell(client, "A1", "Product Category");
        setCell(client, "B1", "Sales");
        setCell(client, "A2", "&=ProductSaleRecord.ProductCategory");
        setCell(client, "B2", "&=ProductSaleRecord.Sales");

        // Generate the report from the smart markers.
        PostWorkbookGetSmartMarkerResultRequest marker =
                new PostWorkbookGetSmartMarkerResultRequest(REPORT_TEMPLATE);
        marker.setFolder(REMOTE_FOLDER);
        marker.setXmlFile(REMOTE_FOLDER + "/" + REPORT_DATA_FILE);
        marker.setOutPath(REMOTE_FOLDER + "/" + REPORT_NAME);
        client.call(marker);
        System.out.println("Smart Marker Successful.");

        // Apply a number format to the data range.
        Range range = new Range();
        range.setFirstColumn(1);
        range.setColumnCount(1);
        range.setFirstRow(1);
        range.setRowCount(4);
        Style style = new Style();
        style.setNumber(8);
        RangeSetStyleRequest rangeStyle = new RangeSetStyleRequest();
        rangeStyle.setRange(range);
        rangeStyle.setStyle(style);
        PostWorksheetCellsRangeStyleRequest styleRequest =
                new PostWorksheetCellsRangeStyleRequest(REPORT_NAME, rangeStyle, "Sheet1");
        styleRequest.setFolder(REMOTE_FOLDER);
        client.call(styleRequest);
        System.out.println("Set range style.");

        // Add a list object for the data range.
        PutWorksheetListObjectRequest listObject =
                new PutWorksheetListObjectRequest(REPORT_NAME, "Sheet1");
        listObject.setFolder(REMOTE_FOLDER);
        listObject.setStartRow(0);
        listObject.setStartColumn(0);
        listObject.setEndColumn(1);
        listObject.setEndRow(4);
        listObject.setHasHeaders(true);
        client.call(listObject);
        System.out.println("Add a list object.");

        // Rename Sheet1 to SalesData.
        PostRenameWorksheetRequest rename =
                new PostRenameWorksheetRequest(REPORT_NAME, SHEET_NAME, "Sheet1");
        rename.setFolder(REMOTE_FOLDER);
        client.call(rename);
        System.out.println("Create simple report.");

        // Add the report sheet.
        PutAddNewWorksheetRequest addReportSheet =
                new PutAddNewWorksheetRequest(REPORT_NAME, REPORT_SHEET_NAME);
        addReportSheet.setFolder(REMOTE_FOLDER);
        client.call(addReportSheet);
        System.out.println("Add Sale Report Sheet.");

        // Hide the data sheet.
        PutChangeVisibilityWorksheetRequest hide =
                new PutChangeVisibilityWorksheetRequest(false, REPORT_NAME, SHEET_NAME);
        hide.setFolder(REMOTE_FOLDER);
        client.call(hide);
        System.out.println("Set Sheet visibility.");

        // Add a chart in the report sheet.
        PutWorksheetChartRequest chart =
                new PutWorksheetChartRequest("Pie", REPORT_NAME, REPORT_SHEET_NAME);
        chart.setFolder(REMOTE_FOLDER);
        chart.setIsVertical(true);
        chart.setTitle("Aspose Chart");
        chart.setUpperLeftRow(5);
        chart.setUpperLeftColumn(3);
        chart.setLowerRightColumn(9);
        chart.setLowerRightRow(15);
        chart.setArea(SHEET_NAME + "!A1:B5");
        client.call(chart);
        System.out.println("Add Chart in Sheet.");
    }

    /** Writes a string value into a cell of the template's Sheet1. */
    private static void setCell(CellsCloudClient client, String cellName, String value) {
        PostWorksheetCellSetValueRequest request = new PostWorksheetCellSetValueRequest(
                cellName, REPORT_TEMPLATE, "Sheet1");
        request.setFolder(REMOTE_FOLDER);
        request.setValue(value);
        request.setType("string");
        client.call(request);
        System.out.printf("Set %s Value.%n", cellName);
    }
}

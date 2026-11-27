package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.WorkbookRef;
import com.aspose.cells.cloud.converter.Converter;
import com.aspose.cells.cloud.converter.Formats;
import com.aspose.cells.cloud.datasource.BytesSink;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.model.SaveOptionsData;
import com.aspose.cells.cloud.request.ExportRangeAsFormatRequest;
import com.aspose.cells.cloud.request.SaveSpreadsheetAsRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Spreadsheet conversion and export, both local and cloud-based.
 *
 * <p>Demonstrates one-step and two-step local conversion, saving a cloud
 * workbook/worksheet/range in another format, and converting to every commonly
 * used output format.</p>
 */
public final class ConvertExcelExample {

    private static final String REMOTE_FOLDER = "JavaSDK";

    public static void main(String[] args) throws Exception {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        String input = "EmployeeSalesSummary.xlsx";

        // ---------------------------------------------------------------------
        // Local file processing
        // ---------------------------------------------------------------------

        // Convert a local Excel file to another format and save it to a local
        // file. This completes in one step.
        Converter.convert(client,
                new FilePathSource(input),
                new FilePathSink("EmployeeSalesSummary.pdf"),
                Formats.FORMAT_PDF);

        // The same conversion completed in two steps: convert the local Excel
        // file to byte data, then save the bytes yourself.
        BytesSink sink = new BytesSink();
        Converter.convert(client,
                new FilePathSource(input),
                sink,
                Formats.FORMAT_PDF);
        Files.write(Paths.get("EmployeeSalesSummary1.pdf"), sink.value());

        // ---------------------------------------------------------------------
        // Cloud file processing
        // ---------------------------------------------------------------------

        // 1. Upload a local Excel file to Cells Cloud storage.
        upload(client, input, REMOTE_FOLDER + "/" + input);

        // 2.1 Save an Excel file in Cells Cloud as another format in Cells
        // Cloud.
        SaveSpreadsheetAsRequest save = new SaveSpreadsheetAsRequest("pdf", input);
        save.setFolder(REMOTE_FOLDER);
        SaveOptionsData saveOptions = new SaveOptionsData();
        saveOptions.setFilename("EmployeeSalesSummaryXlsx.pdf");
        save.setSaveOptionsData(saveOptions);
        client.call(save);

        WorkbookRef ref = new WorkbookRef(input, REMOTE_FOLDER, "");

        // 2.2 Export a worksheet of a cloud Excel file to another format.
        Converter.worksheet(client, ref, "Sales",
                new FilePathSink("EmployeeSalesSummary_Sales.pdf"),
                Formats.FORMAT_PDF);

        // 2.3 Export a worksheet of a cloud Excel file as PNG.
        Converter.worksheet(client, ref, "Sales",
                new FilePathSink("EmployeeSalesSummary_Sale_1.png"),
                Formats.FORMAT_PNG);

        // 2.4 Export a specified cells area (B5:L36) of a worksheet as PNG.
        ExportRangeAsFormatRequest exportRange =
                new ExportRangeAsFormatRequest("png", input, "B5:L36", "Sales");
        exportRange.setFolder(REMOTE_FOLDER);
        RichResponse rangeResponse = client.call(exportRange);
        Files.write(Paths.get("EmployeeSalesSummary_Sale_Area.png"),
                rangeResponse.getBody());

        // Get the conversion result: export a cloud workbook as PDF.
        Converter.workbook(client, ref,
                new FilePathSink("EmployeeSalesSummary2.pdf"),
                Formats.FORMAT_PDF);

        // Convert a local Excel file to the other supported formats.
        String[][] localConversions = {
                {"EmployeeSalesSummary3.pdf", Formats.FORMAT_PDF},
                {"EmployeeSalesSummary.json", Formats.FORMAT_JSON},
                {"EmployeeSalesSummary.docx", Formats.FORMAT_DOCX},
                {"EmployeeSalesSummary.png", Formats.FORMAT_PNG},
                {"EmployeeSalesSummary.pptx", Formats.FORMAT_PPTX},
                {"EmployeeSalesSummary.html", Formats.FORMAT_HTML},
        };
        for (String[] conversion : localConversions) {
            Converter.convert(client,
                    new FilePathSource(input),
                    new FilePathSink(conversion[0]),
                    conversion[1]);
        }

        System.out.println("Successful conversion of Excel files.");
    }

    /** Uploads a local file to the given path in cloud storage. */
    private static void upload(CellsCloudClient client, String localPath, String remotePath) {
        client.call(new UploadFileRequest(remotePath, FormFile.ofPath(localPath)));
    }
}

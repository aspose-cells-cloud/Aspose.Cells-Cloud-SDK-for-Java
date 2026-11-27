package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.editor.Editor;
import com.aspose.cells.cloud.editor.EditorOptions;
import com.aspose.cells.cloud.request.CompressSpreadsheetRequest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Manage worksheets of a local spreadsheet and compress the result.
 *
 * <p>Every edit uploads the current workbook, applies the change on the
 * server, and writes the updated workbook back to the output path.</p>
 */
public final class ManagementExample {

    private static final String INPUT_PATH = "EmployeeSalesSummary.xlsx";
    private static final String OUTPUT_PATH = "EmployeeSalesSummary_Output.xlsx";

    public static void main(String[] args) throws IOException {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Add a new worksheet to a local Excel file.
        Editor.addWorksheet(client,
                INPUT_PATH,
                OUTPUT_PATH,
                "Sheet1",
                EditorOptions.position(0));

        // Rename a worksheet in the Excel file.
        Editor.renameWorksheet(client,
                OUTPUT_PATH,
                OUTPUT_PATH,
                "Sheet1",
                "NewSheet");

        // Move a worksheet to a new position in the Excel file.
        Editor.moveWorksheet(client,
                OUTPUT_PATH,
                OUTPUT_PATH,
                "NewSheet",
                2);

        // Delete a worksheet from the Excel file.
        Editor.deleteWorksheet(client,
                OUTPUT_PATH,
                OUTPUT_PATH,
                "NewSheet");

        // Compress the Excel file.
        byte[] data = Files.readAllBytes(Paths.get(OUTPUT_PATH));
        CompressSpreadsheetRequest compress =
                new CompressSpreadsheetRequest(9, FormFile.of(data, "Spreadsheet"));
        RichResponse response = client.call(compress);
        Files.write(Paths.get(OUTPUT_PATH), response.getBody());

        System.out.println("Worksheet management completed.");
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.request.ProtectSpreadsheetRequest;
import com.aspose.cells.cloud.request.UnprotectSpreadsheetRequest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Protect and unprotect a local spreadsheet.
 *
 * <p>The workbook bytes are attached directly to the request; the server
 * returns the updated workbook, which is written to a local file.</p>
 */
public final class ProtectionExample {

    private static final String INPUT_PATH = "EmployeeSalesSummary.xlsx";
    private static final String LOCKED_PATH = "EmployeeSalesSummary_Lock.xlsx";
    private static final String UNLOCKED_PATH = "EmployeeSalesSummary_unlock.xlsx";

    public static void main(String[] args) throws IOException {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Protect an Excel file.
        byte[] input = Files.readAllBytes(Paths.get(INPUT_PATH));
        ProtectSpreadsheetRequest protect =
                new ProtectSpreadsheetRequest("123456", "123456",
                        FormFile.of(input, "Spreadsheet"));
        RichResponse protectedResponse = client.call(protect);
        Files.write(Paths.get(LOCKED_PATH), protectedResponse.getBody());

        // Unprotect an Excel file.
        byte[] locked = Files.readAllBytes(Paths.get(LOCKED_PATH));
        UnprotectSpreadsheetRequest unprotect =
                new UnprotectSpreadsheetRequest("123456", "123456",
                        FormFile.of(locked, "Spreadsheet"));
        RichResponse unprotectedResponse = client.call(unprotect);
        Files.write(Paths.get(UNLOCKED_PATH), unprotectedResponse.getBody());

        System.out.println("Protected and unprotected EmployeeSalesSummary.xlsx.");
    }
}

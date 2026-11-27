package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.converter.Converter;
import com.aspose.cells.cloud.converter.Formats;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;

/**
 * Quick start: convert a local spreadsheet to PDF.
 *
 * <p>Uses the {@link Converter} facade, which uploads the local workbook,
 * converts it in one request, and writes the returned bytes to a local file.</p>
 */
public final class QuickStartExample {

    public static void main(String[] args) {
        // If no environment variables are configured, obtain the ClientId and
        // ClientSecret from https://dashboard.aspose.cloud/#/applications and
        // pass them to the CellsCloudClient constructor explicitly:
        //   new CellsCloudClient("YourClientId", "YourClientSecret", "");
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Convert a local spreadsheet to PDF and write the result to a local file.
        Converter.convert(client,
                new FilePathSource("EmployeeSalesSummary.xlsx"),
                new FilePathSink("EmployeeSalesSummary.pdf"),
                Formats.FORMAT_PDF);

        System.out.println("Converted EmployeeSalesSummary.xlsx to PDF.");
    }
}

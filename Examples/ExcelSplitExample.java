package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.dataprocessing.DataProcessing;
import com.aspose.cells.cloud.dataprocessing.DataProcessingOptions;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Split a local spreadsheet into one file per worksheet.
 *
 * <p>The v4.0 local split endpoint returns a zip archive containing the
 * generated files; this example extracts every entry into the working
 * directory.</p>
 */
public final class ExcelSplitExample {

    private static final String ZIP_PATH = "splittedFiles.zip";

    public static void main(String[] args) throws IOException {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        DataProcessing.splitSpreadsheet(client,
                new FilePathSource("EmployeeSalesSummary.xlsx"),
                new FilePathSink(ZIP_PATH),
                DataProcessingOptions.outFormat("xlsx"),
                DataProcessingOptions.from(0),
                DataProcessingOptions.to(2));

        System.out.println("Successful split Excel files.");

        unzip(ZIP_PATH);
    }

    /** Extracts every entry of the archive at {@code zipPath} into the working directory. */
    private static void unzip(String zipPath) throws IOException {
        Path destination = Paths.get("").toAbsolutePath().normalize();
        try (InputStream input = Files.newInputStream(Paths.get(zipPath));
             ZipInputStream zip = new ZipInputStream(input)) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                Path target = destination.resolve(entry.getName()).normalize();
                if (!target.startsWith(destination)) {
                    throw new IOException("Archive entry escapes the target directory: "
                            + entry.getName());
                }
                if (entry.isDirectory()) {
                    Files.createDirectories(target);
                } else {
                    Files.createDirectories(target.getParent());
                    Files.copy(zip, target, StandardCopyOption.REPLACE_EXISTING);
                }
                zip.closeEntry();
            }
        }
    }
}

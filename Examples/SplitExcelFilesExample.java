package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.WorkbookRef;
import com.aspose.cells.cloud.dataprocessing.DataProcessing;
import com.aspose.cells.cloud.dataprocessing.DataProcessingOptions;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.request.CreateFolderRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Split spreadsheets, both in cloud storage and locally.
 */
public final class SplitExcelFilesExample {

    private static final String REMOTE_FOLDER = "JavaSDK";
    private static final String EMPLOYEE_SALES_SUMMARY = "EmployeeSalesSummary.xlsx";
    private static final String COMPANY_SALES = "CompanySales.xlsx";

    public static void main(String[] args) throws IOException {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Split a spreadsheet in cloud storage and write the generated files to
        // a cloud output folder.
        upload(client, EMPLOYEE_SALES_SUMMARY, REMOTE_FOLDER + "/" + EMPLOYEE_SALES_SUMMARY);
        client.call(new CreateFolderRequest(REMOTE_FOLDER + "/Output"));

        WorkbookRef ref = new WorkbookRef(EMPLOYEE_SALES_SUMMARY, REMOTE_FOLDER, "");
        DataProcessing.splitRemoteSpreadsheet(client, ref, REMOTE_FOLDER + "/Output",
                DataProcessingOptions.outFormat("pdf"),
                DataProcessingOptions.to(3));
        System.out.println("Successful split Excel files.");

        // Split a local Excel file to PNG files.
        splitLocal(client, COMPANY_SALES, "png", "CompanySales_png.zip", 3);
        // Split a local Excel file to PDF files.
        splitLocal(client, COMPANY_SALES, "pdf", "CompanySales_pdf.zip", 3);
    }

    /**
     * Splits a local spreadsheet into one file per worksheet, saves the
     * returned zip archive and extracts every generated file.
     */
    private static void splitLocal(CellsCloudClient client, String input, String format,
                                   String zipPath, int to) throws IOException {
        DataProcessing.splitSpreadsheet(client,
                new FilePathSource(input),
                new FilePathSink(zipPath),
                DataProcessingOptions.outFormat(format),
                DataProcessingOptions.to(to));
        System.out.printf("Successful split %s. Begin to write every file.%n", input);

        unzip(zipPath);
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

    /** Uploads a local file to the given path in cloud storage. */
    private static void upload(CellsCloudClient client, String localPath, String remotePath) {
        client.call(new UploadFileRequest(remotePath, FormFile.ofPath(localPath)));
    }
}

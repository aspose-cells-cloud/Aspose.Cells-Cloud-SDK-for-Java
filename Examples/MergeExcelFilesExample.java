package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.dataprocessing.DataProcessing;
import com.aspose.cells.cloud.dataprocessing.DataProcessingOptions;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.request.PostWorkbooksMergeRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;

/**
 * Merge workbooks, both in cloud storage and locally.
 */
public final class MergeExcelFilesExample {

    private static final String REMOTE_FOLDER = "JavaSDK";
    private static final String EMPLOYEE_SALES_SUMMARY = "EmployeeSalesSummary.xlsx";
    private static final String COMPANY_SALES = "CompanySales.xlsx";

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        upload(client, COMPANY_SALES, REMOTE_FOLDER + "/" + COMPANY_SALES);
        upload(client, EMPLOYEE_SALES_SUMMARY, REMOTE_FOLDER + "/" + EMPLOYEE_SALES_SUMMARY);

        // Merge a cloud workbook into another cloud workbook in place.
        PostWorkbooksMergeRequest merge = new PostWorkbooksMergeRequest(
                REMOTE_FOLDER + "/" + EMPLOYEE_SALES_SUMMARY, COMPANY_SALES);
        merge.setFolder(REMOTE_FOLDER);
        client.call(merge);
        System.out.println("Successful merge Excel files.");

        // Merge the worksheets of a local spreadsheet into a single consolidated
        // workbook. The v4.0 local merge endpoint merges the worksheets of one
        // workbook; the legacy map-of-local-files form is no longer supported.
        DataProcessing.mergeSpreadsheet(client,
                new FilePathSource(COMPANY_SALES),
                new FilePathSink("MergedExcel.xlsx"),
                DataProcessingOptions.outFormat("xlsx"),
                DataProcessingOptions.mergeInOneSheet(true));
    }

    /** Uploads a local file to the given path in cloud storage. */
    private static void upload(CellsCloudClient client, String localPath, String remotePath) {
        client.call(new UploadFileRequest(remotePath, FormFile.ofPath(localPath)));
    }
}

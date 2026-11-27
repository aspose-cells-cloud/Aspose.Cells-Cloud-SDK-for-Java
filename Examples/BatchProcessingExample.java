package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.model.BatchConvertRequest;
import com.aspose.cells.cloud.model.BatchLockRequest;
import com.aspose.cells.cloud.model.BatchSplitRequest;
import com.aspose.cells.cloud.model.MatchConditionRequest;
import com.aspose.cells.cloud.request.PostBatchConvertRequest;
import com.aspose.cells.cloud.request.PostBatchLockRequest;
import com.aspose.cells.cloud.request.PostBatchSplitRequest;
import com.aspose.cells.cloud.request.PostBatchUnlockRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;

/**
 * Batch processing over the files stored in Aspose.Cells Cloud storage.
 *
 * <p>Uploads a few workbooks, then runs batch convert, lock, unlock and split
 * operations against every {@code *.xlsx} file in the source folder.</p>
 */
public final class BatchProcessingExample {

    private static final String REMOTE_FOLDER = "JavaSDK";
    private static final String REMOTE_OUTPUT_FOLDER = "JavaSDK/Output";

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        upload(client, "CompanySales.xlsx", REMOTE_FOLDER + "/CompanySales.xlsx");
        upload(client, "EmployeeSalesSummary.xlsx",
                REMOTE_FOLDER + "/EmployeeSalesSummary.xlsx");

        // Batch convert Excel files.
        BatchConvertRequest convert = new BatchConvertRequest();
        convert.setSourceFolder(REMOTE_FOLDER);
        convert.setFormat("Pdf");
        convert.setOutFolder(REMOTE_OUTPUT_FOLDER);
        convert.setMatchCondition(matchXlsx());
        client.call(new PostBatchConvertRequest(convert));
        System.out.println("Successful batch conversion of Excel files.");

        // Batch lock Excel files.
        BatchLockRequest lock = new BatchLockRequest();
        lock.setSourceFolder(REMOTE_FOLDER);
        lock.setPassword("123456");
        lock.setOutFolder(REMOTE_OUTPUT_FOLDER);
        lock.setMatchCondition(matchXlsx());
        client.call(new PostBatchLockRequest(lock));
        System.out.println("Successful batch lock of Excel files.");

        // Batch unlock Excel files.
        BatchLockRequest unlock = new BatchLockRequest();
        unlock.setSourceFolder(REMOTE_FOLDER);
        unlock.setPassword("123456");
        unlock.setOutFolder(REMOTE_OUTPUT_FOLDER);
        unlock.setMatchCondition(matchXlsx());
        client.call(new PostBatchUnlockRequest(unlock));
        System.out.println("Successful batch unlock of Excel files.");

        // Batch split Excel files.
        BatchSplitRequest split = new BatchSplitRequest();
        split.setSourceFolder(REMOTE_FOLDER);
        split.setFormat("pdf");
        split.setOutFolder(REMOTE_OUTPUT_FOLDER);
        split.setMatchCondition(matchXlsx());
        client.call(new PostBatchSplitRequest(split));
        System.out.println("Successful batch split of Excel files.");
    }

    private static MatchConditionRequest matchXlsx() {
        MatchConditionRequest match = new MatchConditionRequest();
        match.setRegexPattern("xlsx");
        return match;
    }

    /** Uploads a local file to the given path in cloud storage. */
    private static void upload(CellsCloudClient client, String localPath, String remotePath) {
        client.call(new UploadFileRequest(remotePath, FormFile.ofPath(localPath)));
    }
}

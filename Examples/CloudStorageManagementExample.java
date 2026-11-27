package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.model.FilesList;
import com.aspose.cells.cloud.model.ObjectExist;
import com.aspose.cells.cloud.model.StorageFile;
import com.aspose.cells.cloud.request.CopyFileRequest;
import com.aspose.cells.cloud.request.CreateFolderRequest;
import com.aspose.cells.cloud.request.DeleteFileRequest;
import com.aspose.cells.cloud.request.DeleteFolderRequest;
import com.aspose.cells.cloud.request.GetFilesListRequest;
import com.aspose.cells.cloud.request.MoveFileRequest;
import com.aspose.cells.cloud.request.MoveFolderRequest;
import com.aspose.cells.cloud.request.ObjectExistsRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;

/**
 * Cloud storage management: folders, uploads, moves, copies, listing and
 * deletions.
 */
public final class CloudStorageManagementExample {

    private static final String REMOTE_FOLDER = "JavaSDK";
    private static final String COMPANY_SALES = "CompanySales.xlsx";
    private static final String EMPLOYEE_SALES_SUMMARY = "EmployeeSalesSummary.xlsx";

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));

        // Check if the folder exists, and create it when it does not.
        ObjectExist exists = client.call(new ObjectExistsRequest(REMOTE_FOLDER))
                .getJson(ObjectExist.class);
        if (!Boolean.TRUE.equals(exists.getExists())) {
            client.call(new CreateFolderRequest(REMOTE_FOLDER));
        }

        // Upload source files.
        upload(client, COMPANY_SALES, REMOTE_FOLDER + "/" + COMPANY_SALES);
        upload(client, EMPLOYEE_SALES_SUMMARY, REMOTE_FOLDER + "/" + EMPLOYEE_SALES_SUMMARY);

        // Create a folder on cloud storage.
        client.call(new CreateFolderRequest(REMOTE_FOLDER + "/CellsCloud"));

        // Move a file to another folder on cloud storage.
        client.call(new MoveFileRequest(
                REMOTE_FOLDER + "/CellsCloud/" + COMPANY_SALES,
                REMOTE_FOLDER + "/" + COMPANY_SALES));

        // Copy a file to another folder on cloud storage.
        client.call(new CopyFileRequest(
                REMOTE_FOLDER + "/CellsCloud/" + EMPLOYEE_SALES_SUMMARY,
                REMOTE_FOLDER + "/" + EMPLOYEE_SALES_SUMMARY));

        // Move a folder on cloud storage.
        client.call(new MoveFolderRequest(
                REMOTE_FOLDER + "/CellsCloud2",
                REMOTE_FOLDER + "/CellsCloud"));

        // Get the files list in a folder.
        GetFilesListRequest listRequest = new GetFilesListRequest();
        listRequest.setPath(REMOTE_FOLDER + "/CellsCloud2");
        FilesList fileList = client.call(listRequest).getJson(FilesList.class);
        if (fileList.getValue() != null) {
            int index = 0;
            for (StorageFile storageFile : fileList.getValue()) {
                System.out.printf("Get File %d %s%n", index++, storageFile.getName());
            }
        }

        // Delete the folder (and its contents) on cloud storage.
        DeleteFolderRequest deleteFolder = new DeleteFolderRequest(REMOTE_FOLDER + "/CellsCloud2");
        deleteFolder.setRecursive(true);
        client.call(deleteFolder);

        // Delete the copy that stayed outside the moved folder.
        client.call(new DeleteFileRequest(REMOTE_FOLDER + "/" + EMPLOYEE_SALES_SUMMARY));
    }

    /** Uploads a local file to the given path in cloud storage. */
    private static void upload(CellsCloudClient client, String localPath, String remotePath) {
        client.call(new UploadFileRequest(remotePath, FormFile.ofPath(localPath)));
    }
}

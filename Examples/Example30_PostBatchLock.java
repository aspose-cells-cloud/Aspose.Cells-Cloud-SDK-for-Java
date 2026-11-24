package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostBatchLock {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostBatchLock().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localBook1 = "Book1.xlsx";
            String remoteBook1 = "Book1.xlsx";
            String localMyDoc = "myDocument.xlsx";
            String remoteMyDoc = "myDocument.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteBook1, FormFile.ofPath(localBook1)));
            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteMyDoc, FormFile.ofPath(localMyDoc)));

            BatchLockRequest batchLockRequest = new BatchLockRequest();
            batchLockRequest.setSourceFolder(remoteFolder);

            batchLockRequest.setPassword("123456");

            batchLockRequest.setOutFolder("OutResult");

            MatchConditionRequest matchCondition = new MatchConditionRequest();
            matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

            batchLockRequest.setMatchCondition(matchCondition);

            PostBatchLockRequest request = new PostBatchLockRequest(batchLockRequest);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostBatchProtect {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostBatchProtect().run(client);
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

            BatchProtectRequest batchProtectRequest = new BatchProtectRequest();
            batchProtectRequest.setSourceFolder(remoteFolder);

            batchProtectRequest.setProtectionType("All");

            batchProtectRequest.setPassword("123456");

            batchProtectRequest.setOutFolder("OutResult");

            MatchConditionRequest matchCondition = new MatchConditionRequest();
            matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

            batchProtectRequest.setMatchCondition(matchCondition);

            PostBatchProtectRequest request = new PostBatchProtectRequest(batchProtectRequest);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostBatchSplit {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostBatchSplit().run(client);
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

            BatchSplitRequest batchSplitRequest = new BatchSplitRequest();
            batchSplitRequest.setSourceFolder(remoteFolder);

            batchSplitRequest.setFormat("Pdf");

            batchSplitRequest.setOutFolder("OutResult");

            MatchConditionRequest matchCondition = new MatchConditionRequest();
            matchCondition.setRegexPattern("(^Book)(.+)(xlsx$)");

            batchSplitRequest.setMatchCondition(matchCondition);

            PostBatchSplitRequest request = new PostBatchSplitRequest(batchSplitRequest);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

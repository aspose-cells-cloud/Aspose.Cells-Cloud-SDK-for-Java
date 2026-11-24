package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorkbookDataDeduplication {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorkbookDataDeduplication().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "BookCsvDuplicateData.csv";
            String remoteName = "BookCsvDuplicateData.csv";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            DeduplicationRegion deduplicationRegion = new DeduplicationRegion();

            ArrayList<Range> deduplicationRegionRanges = new ArrayList<Range>();
            deduplicationRegion.setRanges(deduplicationRegionRanges);

            PostWorkbookDataDeduplicationRequest request = new PostWorkbookDataDeduplicationRequest(deduplicationRegion, remoteName);
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

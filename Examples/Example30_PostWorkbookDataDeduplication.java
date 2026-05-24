package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorkbookDataDeduplication {
    private  CellsApi api;
    public ExamplePostWorkbookDataDeduplication(){
        try {
            api = new CellsApi(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                "v3.0",
                System.getenv("CellsCloudApiBaseUrl")
            );
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public void Run(){
        try{
            String remoteFolder = "TestData/In";

            String localName = "BookCsvDuplicateData.csv";
            String remoteName = "BookCsvDuplicateData.csv";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostWorkbookDataDeduplicationRequest request = new PostWorkbookDataDeduplicationRequest();
            request.setName(remoteName);

            DeduplicationRegion deduplicationRegion = new DeduplicationRegion();
             
            ArrayList<Range> deduplicationRegionRanges = new ArrayList<Range>();
            deduplicationRegion.setRanges(deduplicationRegionRanges);

            request.setDeduplicationRegion(deduplicationRegion);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postWorkbookDataDeduplication(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

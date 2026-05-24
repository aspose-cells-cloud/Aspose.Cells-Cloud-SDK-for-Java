package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorksheetCellsRangeUnMerge {
    private  CellsApi api;
    public ExamplePostWorksheetCellsRangeUnMerge(){
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

            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostWorksheetCellsRangeUnMergeRequest request = new PostWorksheetCellsRangeUnMergeRequest();
            request.setName(remoteName);

            request.setSheetName("Sheet1");

            Range range = new Range();
            range.setColumnCount(1);


            range.setColumnWidth(10.0);


            range.setFirstRow(1);


            range.setRowCount(10);

            request.setRange(range);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postWorksheetCellsRangeUnMerge(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

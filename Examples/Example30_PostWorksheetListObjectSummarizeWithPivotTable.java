package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorksheetListObjectSummarizeWithPivotTable {
    private  CellsApi api;
    public ExamplePostWorksheetListObjectSummarizeWithPivotTable(){
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
   
            PostWorksheetListObjectSummarizeWithPivotTableRequest request = new PostWorksheetListObjectSummarizeWithPivotTableRequest();
            request.setName(remoteName);

            request.setSheetName("Sheet7");

            request.setListObjectIndex(0);

            request.setDestsheetName("Sheet2");

            CreatePivotTableRequest createPivotTableRequest = new CreatePivotTableRequest();
            createPivotTableRequest.setDestCellName("C1");


            createPivotTableRequest.setName("testp");


            createPivotTableRequest.setSourceData("=Sheet2!A1:E8");


            createPivotTableRequest.setUseSameSource(true);

             
            ArrayList<Integer> createPivotTableRequestPivotFieldColumns = new ArrayList<Integer>();
            createPivotTableRequest.setPivotFieldColumns(createPivotTableRequestPivotFieldColumns);

             
            ArrayList<Integer> createPivotTableRequestPivotFieldData = new ArrayList<Integer>();
            createPivotTableRequest.setPivotFieldData(createPivotTableRequestPivotFieldData);

             
            ArrayList<Integer> createPivotTableRequestPivotFieldRows = new ArrayList<Integer>();
            createPivotTableRequest.setPivotFieldRows(createPivotTableRequestPivotFieldRows);

            request.setCreatePivotTableRequest(createPivotTableRequest);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postWorksheetListObjectSummarizeWithPivotTable(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

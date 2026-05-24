package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostImportData {
    private  CellsApi api;
    public ExamplePostImportData(){
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
   
            PostImportDataRequest request = new PostImportDataRequest();
            ImportIntArrayOption importOption = new ImportIntArrayOption();
            importOption.setDestinationWorksheet("Sheet1");


            importOption.setFirstColumn(1);


            importOption.setFirstRow(3);


            importOption.setImportDataType("IntArray");


            importOption.setIsInsert(true);


            importOption.setIsVertical(true);

             
            ArrayList<Integer> importOptionData = new ArrayList<Integer>();
            importOption.setData(importOptionData);

            request.setImportOption(importOption);

            request.setName(remoteName);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postImportData(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

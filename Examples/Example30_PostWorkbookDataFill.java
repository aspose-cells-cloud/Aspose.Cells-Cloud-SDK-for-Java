package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorkbookDataFill {
    private  CellsApi api;
    public ExamplePostWorkbookDataFill(){
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
   
            PostWorkbookDataFillRequest request = new PostWorkbookDataFillRequest();
            request.setName(remoteName);

            DataFill dataFill = new DataFill();
            DataFillValue dataFillDefaultValue = new DataFillValue();
            dataFillDefaultValue.setDefaultDate("2024-01-01");


            dataFillDefaultValue.setDefaultNumber(0);


            dataFillDefaultValue.setDefaultBoolean(false);

            dataFill.setDataFillDefaultValue(dataFillDefaultValue);

            request.setDataFill(dataFill);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postWorkbookDataFill(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

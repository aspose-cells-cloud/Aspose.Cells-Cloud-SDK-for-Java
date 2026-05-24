package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleSearchContentInRemoteRange {
    private  CellsApi api;
    public ExampleSearchContentInRemoteRange(){
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
            String bookTextXlsx = "BookText.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + bookTextXlsx );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( bookTextXlsx , new File(bookTextXlsx ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            SearchContentInRemoteRangeRequest request = new SearchContentInRemoteRangeRequest();
            request.setName(bookTextXlsx);

            request.setSearchText("Bike");

            request.setIgnoringCase(false);

            request.setWorksheet("Sales");

            request.setCellArea("A1:A10");

            request.setFolder(remoteFolder);

            this.api.searchContentInRemoteRange(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

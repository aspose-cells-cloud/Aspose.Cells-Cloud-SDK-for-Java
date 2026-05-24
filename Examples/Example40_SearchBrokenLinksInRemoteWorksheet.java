package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleSearchBrokenLinksInRemoteWorksheet {
    private  CellsApi api;
    public ExampleSearchBrokenLinksInRemoteWorksheet(){
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
            String bookFormulaXlsx = "BookFormula.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + bookFormulaXlsx );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( bookFormulaXlsx , new File(bookFormulaXlsx ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            SearchBrokenLinksInRemoteWorksheetRequest request = new SearchBrokenLinksInRemoteWorksheetRequest();
            request.setName(bookFormulaXlsx);

            request.setWorksheet("Sheet1");

            request.setFolder(remoteFolder);

            this.api.searchBrokenLinksInRemoteWorksheet(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorkbookSaveAs {
    private  CellsApi api;
    public ExamplePostWorkbookSaveAs(){
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
            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";
            String remoteFolder = "TestData/In";

            String format = "csv";
            String newfilename = "OutResult/PostExcelSaveAs.csv";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest();
            request.setName(remoteName);

            request.setNewfilename(newfilename);

            SaveOptions saveOptions = new SaveOptions();
            saveOptions.setSaveFormat(format);

            request.setSaveOptions(saveOptions);

            request.setFolder(remoteFolder);

            this.api.postWorkbookSaveAs(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

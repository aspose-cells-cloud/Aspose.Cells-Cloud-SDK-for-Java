package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostCellCharacters {
    private  CellsApi api;
    public ExamplePostCellCharacters(){
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
   
            PostCellCharactersRequest request = new PostCellCharactersRequest();
             
            ArrayList<FontSetting> options = new ArrayList<FontSetting>();
            FontSetting value = new FontSetting();
            value.setLength(5);


            value.setStartIndex(0);


            Font font = new Font();
            font.setIsBold(true);


            font.setSize(16);

            value.setFont(font);

            options.add(value);

            request.setOptions(options);

            request.setName(remoteName);

            request.setSheetName("Sheet1");

            request.setCellName("E36");

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postCellCharacters(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

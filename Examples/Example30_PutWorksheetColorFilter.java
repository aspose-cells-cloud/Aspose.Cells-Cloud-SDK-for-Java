package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePutWorksheetColorFilter {
    private  CellsApi api;
    public ExamplePutWorksheetColorFilter(){
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
   
            PutWorksheetColorFilterRequest request = new PutWorksheetColorFilterRequest();
            request.setName(remoteName);

            request.setSheetName("Sheet1");

            request.setRange("A1:B1");

            request.setFieldIndex(0);

            ColorFilterRequest colorFilter = new ColorFilterRequest();
            colorFilter.setPattern("Solid");


            CellsColor foregroundColor = new CellsColor();
            foregroundColor.setType("Automatic");


            Color color = new Color();
            color.setR(48);


            color.setG(48);


            color.setB(48);

            foregroundColor.setColor(color);

            colorFilter.setForegroundColor(foregroundColor);

            request.setColorFilter(colorFilter);

            request.setMatchBlanks(true);

            request.setRefresh(true);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.putWorksheetColorFilter(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

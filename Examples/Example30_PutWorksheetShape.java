package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePutWorksheetShape {
    private  CellsApi api;
    public ExamplePutWorksheetShape(){
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
   
            PutWorksheetShapeRequest request = new PutWorksheetShapeRequest();
            Shape shapeDTO = new Shape();
            request.setShapeDTO(shapeDTO);

            request.setName(remoteName);

            request.setSheetName("Sheet1");

            request.setDrawingType("arc");

            request.setUpperLeftRow(1);

            request.setUpperLeftColumn(1);

            request.setTop(10);

            request.setLeft(10);

            request.setWidth(100);

            request.setHeight(100);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.putWorksheetShape(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

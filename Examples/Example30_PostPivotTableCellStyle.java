package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostPivotTableCellStyle {
    private  CellsApi api;
    public ExamplePostPivotTableCellStyle(){
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

            String localName = "TestCase.xlsx";
            String remoteName = "TestCase.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostPivotTableCellStyleRequest request = new PostPivotTableCellStyleRequest();
            request.setName(remoteName);

            request.setSheetName("Sheet4");

            request.setPivotTableIndex(0);

            request.setColumn(1);

            request.setRow(1);

            Style style = new Style();
            Font font = new Font();
            font.setSize(16);

            style.setFont(font);

            request.setStyle(style);

            request.setNeedReCalculate(true);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postPivotTableCellStyle(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

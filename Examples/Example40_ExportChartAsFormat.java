package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleExportChartAsFormat {
    private  CellsApi api;
    public ExampleExportChartAsFormat(){
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
            String localName = "EmployeeSalesSummary.xlsx";
            String remoteName = "EmployeeSalesSummary.xlsx";
            String remoteFolder = "TestData/In";

            String format = "svg";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            ExportChartAsFormatRequest request = new ExportChartAsFormatRequest();
            request.setName(localName);

            request.setWorksheet("Sales");

            request.setChartIndex(0);

            request.setFormat(format);

            request.setFolder(remoteFolder);

            this.api.exportChartAsFormat(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

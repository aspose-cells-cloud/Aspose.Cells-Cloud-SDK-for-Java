package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleSplitRemoteSpreadsheet {
    private  CellsApi api;
    public ExampleSplitRemoteSpreadsheet(){
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
            String book1Xlsx = "Book1.xlsx";
            String outFormat = "PDF";

   
            SplitRemoteSpreadsheetRequest request = new SplitRemoteSpreadsheetRequest();
            request.setName(book1Xlsx);

            request.setOutFormat(outFormat);

            request.setFolder(remoteFolder);

            request.setOutPath("TestData/Out");

            this.api.splitRemoteSpreadsheet(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

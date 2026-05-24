package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleReplaceSpreadsheetContent {
    private  CellsApi api;
    public ExampleReplaceSpreadsheetContent(){
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
            String bookTextXlsx = "BookText.xlsx";

   
            ReplaceSpreadsheetContentRequest request = new ReplaceSpreadsheetContentRequest();
            request.setSpreadsheet("TestData/" + bookTextXlsx);

            request.setSearchText("Bike");

            request.setReplaceText("****");

            this.api.replaceSpreadsheetContent(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleConvertSpreadsheet {
    private  CellsApi api;
    public ExampleConvertSpreadsheet(){
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

            String format = "png";

   
            ConvertSpreadsheetRequest request = new ConvertSpreadsheetRequest();
            request.setSpreadsheet("TestData/" + localName);

            request.setFormat(format);

            this.api.convertSpreadsheet(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

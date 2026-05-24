package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleConvertChartToImage {
    private  CellsApi api;
    public ExampleConvertChartToImage(){
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

            String format = "svg";

   
            ConvertChartToImageRequest request = new ConvertChartToImageRequest();
            request.setWorksheet("Sales");

            request.setChartIndex(0);

            request.setFormat(format);

            request.setSpreadsheet("TestData/" + localName);

            this.api.convertChartToImage(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

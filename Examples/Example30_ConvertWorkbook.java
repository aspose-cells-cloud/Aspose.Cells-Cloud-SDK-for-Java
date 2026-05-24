package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePutConvertWorkbook {
    private  CellsApi api;
    public ExamplePutConvertWorkbook(){
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

            String format = "csv";

   
            PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
            request.setFormat(format);
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
            request.setFile(fileMap);
            this.api.putConvertWorkbook(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostClearObjects {
    private  CellsApi api;
    public ExamplePostClearObjects(){
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
            String book1Xlsx = "Book1.xlsx";

            String objecttype = "chart";

   
            PostClearObjectsRequest request = new PostClearObjectsRequest();
            request.setObjecttype(objecttype);
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
            request.setFile(fileMap);
            this.api.postClearObjects(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

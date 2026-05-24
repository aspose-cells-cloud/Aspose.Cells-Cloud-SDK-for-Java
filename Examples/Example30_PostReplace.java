package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostReplace {
    private  CellsApi api;
    public ExamplePostReplace(){
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
            String dataSourceXlsx = "datasource.xlsx";

   
            PostReplaceRequest request = new PostReplaceRequest();
            request.setText("12");

            request.setNewtext("newtext");
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
            request.setFile(fileMap);
            this.api.postReplace(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

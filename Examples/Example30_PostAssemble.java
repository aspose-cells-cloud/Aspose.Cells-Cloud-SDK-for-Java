package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostAssemble {
    private  CellsApi api;
    public ExamplePostAssemble(){
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
            String assemblyTestXlsx = "assemblytest.xlsx";
            String dataSourceXlsx = "datasource.xlsx";

            String format = "csv";

   
            PostAssembleRequest request = new PostAssembleRequest();
            request.setOutFormat(format);

            request.setDatasource("ds");
             
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(assemblyTestXlsx ,CellsApiUtil.GetFileHolder(assemblyTestXlsx) ); 
            fileMap.put(dataSourceXlsx ,CellsApiUtil.GetFileHolder(dataSourceXlsx) ); 
            request.setFile(fileMap);
            this.api.postAssemble(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

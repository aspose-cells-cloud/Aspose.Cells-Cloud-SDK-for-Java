package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostUnlock {
    private  CellsApi api;
    public ExamplePostUnlock(){
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
            String needUnlockXlsx = "needUnlock.xlsx";

   
            PostUnlockRequest request = new PostUnlockRequest();
            request.setPassword("123456");
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(needUnlockXlsx ,CellsApiUtil.GetFileHolder(needUnlockXlsx) ); 
            request.setFile(fileMap);
            this.api.postUnlock(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

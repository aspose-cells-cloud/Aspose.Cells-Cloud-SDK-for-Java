package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostLock {
    private  CellsApi api;
    public ExamplePostLock(){
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
            String needlockXlsx = "needlock.xlsx";

   
            PostLockRequest request = new PostLockRequest();
            request.setPassword("123456");
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(needlockXlsx ,CellsApiUtil.GetFileHolder(needlockXlsx) ); 
            request.setFile(fileMap);
            this.api.postLock(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

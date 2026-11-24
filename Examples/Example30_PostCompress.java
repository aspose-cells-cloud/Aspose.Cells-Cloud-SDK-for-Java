package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostCompress {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostCompress().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String dataSourceXlsx = "datasource.xlsx";

            Integer compressLevel = 50;

             

            PostCompressRequest request = new PostCompressRequest(FormFile.ofPath(dataSourceXlsx));
            request.setCompressLevel(compressLevel);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

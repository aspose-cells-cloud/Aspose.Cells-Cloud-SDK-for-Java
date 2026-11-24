package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostAssemble {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostAssemble().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String assemblyTestXlsx = "assemblytest.xlsx";
            String dataSourceXlsx = "datasource.xlsx";

            String format = "csv";

             

            PostAssembleRequest request = new PostAssembleRequest("ds", FormFile.ofPath(assemblyTestXlsx));
            request.setOutFormat(format);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

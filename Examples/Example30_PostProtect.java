package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostProtect {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostProtect().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String assemblyTestXlsx = "assemblytest.xlsx";

            ProtectWorkbookRequest protectWorkbookRequest = new ProtectWorkbookRequest();
            protectWorkbookRequest.setAwaysOpenReadOnly(true);

            protectWorkbookRequest.setEncryptWithPassword("123456");

            PostProtectRequest request = new PostProtectRequest(FormFile.ofPath(assemblyTestXlsx), protectWorkbookRequest);
            request.setPassword("123456");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

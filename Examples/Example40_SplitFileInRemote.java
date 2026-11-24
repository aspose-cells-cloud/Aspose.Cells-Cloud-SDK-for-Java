package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_SplitFileInRemote {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_SplitFileInRemote().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";
            String book1Xlsx = "Book1.xlsx";
            String outFormat = "PDF";

            SplitRemoteSpreadsheetRequest request = new SplitRemoteSpreadsheetRequest(book1Xlsx);
            request.setOutFormat(outFormat);
            request.setFolder(remoteFolder);
            request.setOutPath("TestData/Out");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

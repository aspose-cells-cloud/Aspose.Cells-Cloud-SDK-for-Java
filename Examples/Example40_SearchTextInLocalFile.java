package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_SearchTextInLocalFile {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_SearchTextInLocalFile().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String bookTextXlsx = "BookText.xlsx";

            SearchSpreadsheetContentRequest request = new SearchSpreadsheetContentRequest("Bike", FormFile.ofPath(bookTextXlsx));
            request.setIgnoringCase(false);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

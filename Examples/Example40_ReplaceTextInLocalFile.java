package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_ReplaceTextInLocalFile {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_ReplaceTextInLocalFile().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String bookTextXlsx = "BookText.xlsx";

            ReplaceSpreadsheetContentRequest request = new ReplaceSpreadsheetContentRequest("****", "Bike", FormFile.ofPath(bookTextXlsx));
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

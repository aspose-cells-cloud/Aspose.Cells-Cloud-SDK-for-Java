package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_SplitLocalFile {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_SplitLocalFile().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String book1Xlsx = "Book1.xlsx";
            String outFormat = "PDF";

            SplitSpreadsheetRequest request = new SplitSpreadsheetRequest(FormFile.ofPath(book1Xlsx));
            request.setOutFormat(outFormat);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

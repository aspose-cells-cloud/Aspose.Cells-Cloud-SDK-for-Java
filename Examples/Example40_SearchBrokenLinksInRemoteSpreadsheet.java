package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_SearchBrokenLinksInRemoteSpreadsheet {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_SearchBrokenLinksInRemoteSpreadsheet().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";
            String bookFormulaXlsx = "BookFormula.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + bookFormulaXlsx, FormFile.ofPath(bookFormulaXlsx)));

            SearchBrokenLinksInRemoteSpreadsheetRequest request = new SearchBrokenLinksInRemoteSpreadsheetRequest(bookFormulaXlsx);
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

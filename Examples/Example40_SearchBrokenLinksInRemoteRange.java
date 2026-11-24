package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_SearchBrokenLinksInRemoteRange {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_SearchBrokenLinksInRemoteRange().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";
            String bookFormulaXlsx = "BookFormula.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + bookFormulaXlsx, FormFile.ofPath(bookFormulaXlsx)));

            SearchBrokenLinksInRemoteRangeRequest request = new SearchBrokenLinksInRemoteRangeRequest("A1:F40", bookFormulaXlsx, "Sheet1");
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

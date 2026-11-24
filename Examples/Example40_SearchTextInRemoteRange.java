package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_SearchTextInRemoteRange {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_SearchTextInRemoteRange().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";
            String bookTextXlsx = "BookText.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + bookTextXlsx, FormFile.ofPath(bookTextXlsx)));

            SearchContentInRemoteRangeRequest request = new SearchContentInRemoteRangeRequest("A1:A10", bookTextXlsx, "Bike", "Sales");
            request.setIgnoringCase(false);
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

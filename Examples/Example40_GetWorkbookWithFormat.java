package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_GetWorkbookWithFormat {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_GetWorkbookWithFormat().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";
            String remoteFolder = "TestData/In";

            String format = "pdf";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            ExportSpreadsheetAsFormatRequest request = new ExportSpreadsheetAsFormatRequest(format, remoteName);
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

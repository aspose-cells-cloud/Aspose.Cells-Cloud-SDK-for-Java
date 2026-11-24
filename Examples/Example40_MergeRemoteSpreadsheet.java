package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_MergeRemoteSpreadsheet {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_MergeRemoteSpreadsheet().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";
            String book1Xlsx = "Book1.xlsx";
            String bookTextXlsx = "BookText.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + bookTextXlsx, FormFile.ofPath(bookTextXlsx)));
            client.call(new UploadFileRequest(
                    remoteFolder + "/" + book1Xlsx, FormFile.ofPath(book1Xlsx)));

            MergeRemoteSpreadsheetRequest request = new MergeRemoteSpreadsheetRequest(remoteFolder + "/" + book1Xlsx, bookTextXlsx);
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

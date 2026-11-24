package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PutWorksheetOleObject {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PutWorksheetOleObject().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String oLEDoc = "OLEDoc.docx";
            String wordJPG = "word.jpg";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));
            client.call(new UploadFileRequest(
                    "OLEDoc.docx", FormFile.ofPath(oLEDoc)));
            client.call(new UploadFileRequest(
                    "word.jpg", FormFile.ofPath(wordJPG)));

            PutWorksheetOleObjectRequest request = new PutWorksheetOleObjectRequest(remoteName, "Sheet6");
            request.setUpperLeftRow(1);
            request.setUpperLeftColumn(1);
            request.setHeight(100);
            request.setWidth(80);
            request.setOleFile("OLEDoc.docx");
            request.setImageFile("word.jpg");
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

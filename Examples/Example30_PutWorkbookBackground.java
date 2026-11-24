package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PutWorkbookBackground {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PutWorkbookBackground().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String waterMarkPNG = "WaterMark.png";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));
            client.call(new UploadFileRequest(
                    remoteFolder + "/WaterMark.png", FormFile.ofPath(waterMarkPNG)));

            PutWorkbookBackgroundRequest request = new PutWorkbookBackgroundRequest(remoteName);
            request.setPicPath(remoteFolder + "/WaterMark.png");
            request.setFolder(remoteFolder);
            request.setStorageName("");
            request.setFile("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

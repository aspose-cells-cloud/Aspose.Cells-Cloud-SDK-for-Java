package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_UploadFile {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_UploadFile().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";
            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";
            UploadFileRequest upload = new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName));
            upload.setStorageName("");
            client.call(upload);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_WorkbookSaveAs {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_WorkbookSaveAs().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";
            String remoteFolder = "TestData/In";

            String format = "csv";
            String newfilename = "OutResult/PostExcelSaveAs.csv";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            SaveOptions saveOptions = new SaveOptions();
            saveOptions.setSaveFormat(format);

            PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest(remoteName, newfilename);
            request.setSaveOptions(saveOptions);
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PutWorksheetColorFilter {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PutWorksheetColorFilter().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            ColorFilterRequest colorFilter = new ColorFilterRequest();
            colorFilter.setPattern("Solid");

            CellsColor foregroundColor = new CellsColor();
            foregroundColor.setType("Automatic");

            Color color = new Color();
            color.setR(48);

            color.setG(48);

            color.setB(48);

            foregroundColor.setColor(color);

            colorFilter.setForegroundColor(foregroundColor);

            PutWorksheetColorFilterRequest request = new PutWorksheetColorFilterRequest(colorFilter, 0, remoteName, "A1:B1", "Sheet1");
            request.setMatchBlanks(true);
            request.setRefresh(true);
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

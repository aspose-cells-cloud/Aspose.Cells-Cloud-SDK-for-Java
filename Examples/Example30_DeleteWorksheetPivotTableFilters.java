package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_DeleteWorksheetPivotTableFilters {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_DeleteWorksheetPivotTableFilters().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "TestCase.xlsx";
            String remoteName = "TestCase.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            DeleteWorksheetPivotTableFiltersRequest request = new DeleteWorksheetPivotTableFiltersRequest(remoteName, 0, "Sheet3");
            request.setNeedReCalculate(true);
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

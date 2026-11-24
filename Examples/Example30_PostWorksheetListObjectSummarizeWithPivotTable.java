package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorksheetListObjectSummarizeWithPivotTable {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorksheetListObjectSummarizeWithPivotTable().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            CreatePivotTableRequest createPivotTableRequest = new CreatePivotTableRequest();
            createPivotTableRequest.setDestCellName("C1");

            createPivotTableRequest.setName("testp");

            createPivotTableRequest.setSourceData("=Sheet2!A1:E8");

            createPivotTableRequest.setUseSameSource(true);

            ArrayList<Integer> createPivotTableRequestPivotFieldColumns = new ArrayList<Integer>();
            createPivotTableRequest.setPivotFieldColumns(createPivotTableRequestPivotFieldColumns);

            ArrayList<Integer> createPivotTableRequestPivotFieldData = new ArrayList<Integer>();
            createPivotTableRequest.setPivotFieldData(createPivotTableRequestPivotFieldData);

            ArrayList<Integer> createPivotTableRequestPivotFieldRows = new ArrayList<Integer>();
            createPivotTableRequest.setPivotFieldRows(createPivotTableRequestPivotFieldRows);

            PostWorksheetListObjectSummarizeWithPivotTableRequest request = new PostWorksheetListObjectSummarizeWithPivotTableRequest(createPivotTableRequest, "Sheet2", 0, remoteName, "Sheet7");
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

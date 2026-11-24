package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorksheetCellsRangeSort {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorksheetCellsRangeSort().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Group.xlsx";
            String remoteName = "Group.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            RangeSortRequest rangeSortRequest = new RangeSortRequest();
            DataSorter dataSorter = new DataSorter();
            dataSorter.setCaseSensitive(true);

            rangeSortRequest.setDataSorter(dataSorter);

            Range cellArea = new Range();
            cellArea.setColumnCount(3);

            cellArea.setFirstColumn(0);

            cellArea.setFirstRow(0);

            cellArea.setRowCount(15);

            rangeSortRequest.setCellArea(cellArea);

            PostWorksheetCellsRangeSortRequest request = new PostWorksheetCellsRangeSortRequest(remoteName, rangeSortRequest, "book1");
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

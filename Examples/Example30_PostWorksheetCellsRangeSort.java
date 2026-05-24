package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorksheetCellsRangeSort {
    private  CellsApi api;
    public ExamplePostWorksheetCellsRangeSort(){
        try {
            api = new CellsApi(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                "v3.0",
                System.getenv("CellsCloudApiBaseUrl")
            );
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public void Run(){
        try{
            String remoteFolder = "TestData/In";

            String localName = "Group.xlsx";
            String remoteName = "Group.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostWorksheetCellsRangeSortRequest request = new PostWorksheetCellsRangeSortRequest();
            request.setName(remoteName);

            request.setSheetName("book1");

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

            request.setRangeSortRequest(rangeSortRequest);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postWorksheetCellsRangeSort(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

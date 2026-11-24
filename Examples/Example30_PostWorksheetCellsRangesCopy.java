package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorksheetCellsRangesCopy {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorksheetCellsRangesCopy().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            RangeCopyRequest rangeOperate = new RangeCopyRequest();
            rangeOperate.setOperate("copydata");

            Range source = new Range();
            source.setColumnCount(3);

            source.setFirstColumn(8);

            source.setFirstRow(3);

            source.setRowCount(2);

            rangeOperate.setSource(source);

            Range target = new Range();
            target.setColumnCount(3);

            target.setFirstColumn(8);

            target.setFirstRow(13);

            target.setRowCount(2);

            rangeOperate.setTarget(target);

            PostWorksheetCellsRangesCopyRequest request = new PostWorksheetCellsRangesCopyRequest(remoteName, rangeOperate, "Sheet1");
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

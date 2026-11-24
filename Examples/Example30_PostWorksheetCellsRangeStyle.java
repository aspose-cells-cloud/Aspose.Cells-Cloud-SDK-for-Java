package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorksheetCellsRangeStyle {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorksheetCellsRangeStyle().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            RangeSetStyleRequest rangeOperate = new RangeSetStyleRequest();
            Style style = new Style();
            Font font = new Font();
            font.setSize(16);

            style.setFont(font);

            rangeOperate.setStyle(style);

            Range range = new Range();
            range.setColumnCount(1);

            range.setColumnWidth(10.0);

            range.setFirstRow(1);

            range.setRowCount(10);

            rangeOperate.setRange(range);

            PostWorksheetCellsRangeStyleRequest request = new PostWorksheetCellsRangeStyleRequest(remoteName, rangeOperate, "Sheet1");
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

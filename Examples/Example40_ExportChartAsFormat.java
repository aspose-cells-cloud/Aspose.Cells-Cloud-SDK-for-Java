package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example40_ExportChartAsFormat {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example40_ExportChartAsFormat().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String localName = "EmployeeSalesSummary.xlsx";
            String remoteName = "EmployeeSalesSummary.xlsx";
            String remoteFolder = "TestData/In";

            String format = "svg";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            ExportChartAsFormatRequest request = new ExportChartAsFormatRequest(0, format, localName, "Sales");
            request.setFolder(remoteFolder);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

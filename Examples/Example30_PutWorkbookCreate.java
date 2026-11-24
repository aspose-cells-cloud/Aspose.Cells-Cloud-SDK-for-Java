package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PutWorkbookCreate {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PutWorkbookCreate().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Book1.xlsx";
            String reportDataXML = "ReportData.xml";
            String remoteName = "Book1.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));
            client.call(new UploadFileRequest(
                    remoteFolder + "/ReportData.xml", FormFile.ofPath(reportDataXML)));

            PutWorkbookCreateRequest request = new PutWorkbookCreateRequest("PutWorkbookCreate.xlsx");
            request.setTemplateFile(remoteFolder + "/" + remoteName);
            request.setDataFile(remoteFolder + "/ReportData.xml");
            request.setIsWriteOver(true);
            request.setFolder(remoteFolder);
            request.setStorageName("");
            request.setCheckExcelRestriction(true);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

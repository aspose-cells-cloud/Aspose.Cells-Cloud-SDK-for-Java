package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorkbookImportXML {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorkbookImportXML().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "Template.xlsx";
            String dataXML = "data.xml";
            String remoteName = "Template.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));
            client.call(new UploadFileRequest(
                    remoteFolder + "/data.xml", FormFile.ofPath(dataXML)));

            ImportXMLRequest importXMLRequest = new ImportXMLRequest();
            DataSource xMLFileSource = new DataSource();
            xMLFileSource.setDataSourceType("CloudFileSystem");

            xMLFileSource.setDataPath(remoteFolder + "/data.xml");

            importXMLRequest.setXMLFileSource(xMLFileSource);

            ImportPosition importPosition = new ImportPosition();
            importPosition.setSheetName("Sheet1");

            importPosition.setRowIndex(3);

            importPosition.setColumnIndex(4);

            importXMLRequest.setImportPosition(importPosition);

            PostWorkbookImportXMLRequest request = new PostWorkbookImportXMLRequest(importXMLRequest, remoteName);
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

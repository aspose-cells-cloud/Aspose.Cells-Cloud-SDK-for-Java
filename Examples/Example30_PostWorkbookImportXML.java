package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostWorkbookImportXML {
    private  CellsApi api;
    public ExamplePostWorkbookImportXML(){
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

            String localName = "Template.xlsx";
            String dataXML = "data.xml";
            String remoteName = "Template.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/data.xml" );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( dataXML , new File(dataXML ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostWorkbookImportXMLRequest request = new PostWorkbookImportXMLRequest();
            request.setName(remoteName);

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

            request.setImportXMLRequest(importXMLRequest);

            request.setFolder(remoteFolder);

            request.setStorageName("");

            this.api.postWorkbookImportXML(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

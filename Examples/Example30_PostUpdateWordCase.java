package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostUpdateWordCase {
    private  CellsApi api;
    public ExamplePostUpdateWordCase(){
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

            String localName = "BookText.xlsx";
            String remoteName = "BookText.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostUpdateWordCaseRequest request = new PostUpdateWordCaseRequest();
            WordCaseOptions wordCaseOptions = new WordCaseOptions();
            DataSource dataSource = new DataSource();
            dataSource.setDataSourceType("CloudFileSystem");


            dataSource.setDataPath("TestData/In/BookText.xlsx");

            wordCaseOptions.setDataSource(dataSource);


            wordCaseOptions.setWordCaseType("None");


            ScopeOptions scopeOptions = new ScopeOptions();
            scopeOptions.setScope("EntireWorkbook");

            wordCaseOptions.setScopeOptions(scopeOptions);

            request.setWordCaseOptions(wordCaseOptions);

            this.api.postUpdateWordCase(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

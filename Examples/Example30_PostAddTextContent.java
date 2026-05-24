package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostAddTextContent {
    private  CellsApi api;
    public ExamplePostAddTextContent(){
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
   
            PostAddTextContentRequest request = new PostAddTextContentRequest();
            AddTextOptions addTextOptions = new AddTextOptions();
            DataSource dataSource = new DataSource();
            dataSource.setDataSourceType("CloudFileSystem");


            dataSource.setDataPath("TestData/In/BookText.xlsx");

            addTextOptions.setDataSource(dataSource);


            addTextOptions.setText("Aspose.Cells Cloud is an excellent product.");


            addTextOptions.setWorksheet("202401");


            addTextOptions.setSelectPoistion("AtTheBeginning");


            addTextOptions.setSkipEmptyCells(true);

            request.setAddTextOptions(addTextOptions);

            this.api.postAddTextContent(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

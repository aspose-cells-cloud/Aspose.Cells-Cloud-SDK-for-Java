package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostMetadata {
    private  CellsApi api;
    public ExamplePostMetadata(){
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
            String book1Xlsx = "Book1.xlsx";

   
            PostMetadataRequest request = new PostMetadataRequest();
             
            ArrayList<CellsDocumentProperty> cellsDocuments = new ArrayList<CellsDocumentProperty>();
            CellsDocumentProperty cellsDocument = new CellsDocumentProperty();
            cellsDocument.setName("Author");


            cellsDocument.setValue("roy.wang");

            cellsDocuments.add(cellsDocument);

            request.setCellsDocuments(cellsDocuments);
             

            HashMap<String,File> fileMap = new HashMap<String,File>(); 
            fileMap.put(book1Xlsx ,CellsApiUtil.GetFileHolder(book1Xlsx) ); 
            request.setFile(fileMap);
            this.api.postMetadata(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

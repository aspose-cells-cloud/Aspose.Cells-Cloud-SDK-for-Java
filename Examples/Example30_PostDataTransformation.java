package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExamplePostDataTransformation {
    private  CellsApi api;
    public ExamplePostDataTransformation(){
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

            String localName = "BookTableL2W.xlsx";
            String remoteName = "BookTableL2W.xlsx";

            UploadFileRequest  uploadFileRequest = new UploadFileRequest();
            uploadFileRequest.setPath( remoteFolder + "/" + remoteName );
            uploadFileRequest.setStorageName( "");
            HashMap<String,File> files = new HashMap<String,File>();
            files.put( localName , new File(localName ));
            uploadFileRequest.setUploadFiles(files);
            cellsApi.uploadFile(uploadFileRequest);
   
            PostDataTransformationRequest request = new PostDataTransformationRequest();
            DataTransformationRequest dataTransformationRequest = new DataTransformationRequest();
            LoadData loadData = new LoadData();
            LoadTo loadTo = new LoadTo();
            loadTo.setBeginColumnIndex(2);


            loadTo.setBeginRowIndex(3);


            loadTo.setWorksheet("L2W");

            loadData.setLoadTo(loadTo);


            DataQuery dataQuery = new DataQuery();
            dataQuery.setName("DataQuery");


            DataItem dataItem = new DataItem();
            dataItem.setDataItemType("Table");


            dataItem.setValue("Table1");

            dataQuery.setDataItem(dataItem);


            DataSource dataSource = new DataSource();
            dataSource.setDataSourceType("CloudFileSystem");


            dataSource.setDataPath("TestData/In/BookTableL2W.xlsx");

            dataQuery.setDataSource(dataSource);


            dataQuery.setDataSourceDataType("ListObject");

            loadData.setDataQuery(dataQuery);

            dataTransformationRequest.setLoadData(loadData);

             
            ArrayList<AppliedStep> dataTransformationRequestAppliedSteps = new ArrayList<AppliedStep>();
            dataTransformationRequest.setAppliedSteps(dataTransformationRequestAppliedSteps);

            request.setDataTransformationRequest(dataTransformationRequest);

            this.api.postDataTransformation(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostDataTransformation {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostDataTransformation().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "BookTableL2W.xlsx";
            String remoteName = "BookTableL2W.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

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

            PostDataTransformationRequest request = new PostDataTransformationRequest(dataTransformationRequest);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

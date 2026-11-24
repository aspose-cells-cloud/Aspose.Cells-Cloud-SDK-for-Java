package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostWorkbookDataCleansing {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostWorkbookDataCleansing().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "BookCsvDuplicateData.csv";
            String remoteName = "BookCsvDuplicateData.csv";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            DataCleansing dataCleansing = new DataCleansing();
            dataCleansing.setNeedFillData(true);

            DataFill dataFill = new DataFill();
            DataFillValue dataFillDefaultValue = new DataFillValue();
            dataFillDefaultValue.setDefaultDate("2024-01-01");

            dataFillDefaultValue.setDefaultNumber(0);

            dataFillDefaultValue.setDefaultBoolean(false);

            dataFill.setDataFillDefaultValue(dataFillDefaultValue);

            dataCleansing.setDataFill(dataFill);

            PostWorkbookDataCleansingRequest request = new PostWorkbookDataCleansingRequest(dataCleansing, remoteName);
            request.setFolder(remoteFolder);
            request.setStorageName("");
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostAddTextContent {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostAddTextContent().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "BookText.xlsx";
            String remoteName = "BookText.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            AddTextOptions addTextOptions = new AddTextOptions();
            DataSource dataSource = new DataSource();
            dataSource.setDataSourceType("CloudFileSystem");

            dataSource.setDataPath("TestData/In/BookText.xlsx");

            addTextOptions.setDataSource(dataSource);

            addTextOptions.setText("Aspose.Cells Cloud is an excellent product.");

            addTextOptions.setSelectPoistion("AtTheBeginning");

            addTextOptions.setSkipEmptyCells(true);

            PostAddTextContentRequest request = new PostAddTextContentRequest(addTextOptions);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostTrimContent {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostTrimContent().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String remoteFolder = "TestData/In";

            String localName = "BookText.xlsx";
            String remoteName = "BookText.xlsx";

            client.call(new UploadFileRequest(
                    remoteFolder + "/" + remoteName, FormFile.ofPath(localName)));

            TrimContentOptions trimContentOptions = new TrimContentOptions();
            DataSource dataSource = new DataSource();
            dataSource.setDataSourceType("CloudFileSystem");

            dataSource.setDataPath("TestData/In/BookText.xlsx");

            trimContentOptions.setDataSource(dataSource);

            trimContentOptions.setTrimLeading(true);

            trimContentOptions.setTrimTrailing(true);

            trimContentOptions.setTrimSpaceBetweenWordTo1(true);

            trimContentOptions.setRemoveAllLineBreaks(true);

            ScopeOptions scopeOptions = new ScopeOptions();
            scopeOptions.setScope("EntireWorkbook");

            trimContentOptions.setScopeOptions(scopeOptions);

            PostTrimContentRequest request = new PostTrimContentRequest(trimContentOptions);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

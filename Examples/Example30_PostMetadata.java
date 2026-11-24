package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostMetadata {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostMetadata().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String book1Xlsx = "Book1.xlsx";

             
            ArrayList<CellsDocumentProperty> cellsDocuments = new ArrayList<CellsDocumentProperty>();
            CellsDocumentProperty cellsDocument = new CellsDocumentProperty();
            cellsDocument.setName("Author");

            cellsDocument.setValue("roy.wang");

            cellsDocuments.add(cellsDocument);

            PostMetadataRequest request = new PostMetadataRequest(cellsDocuments, FormFile.ofPath(book1Xlsx));
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

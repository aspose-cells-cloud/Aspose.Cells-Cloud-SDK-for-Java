package com.aspose.cells.cloud.examples;

import com.aspose.cells.cloud.*;
import com.aspose.cells.cloud.model.*;
import com.aspose.cells.cloud.request.*;
import java.io.File;
import java.util.*;

/** Migrated from the legacy Java examples. */
public final class Example30_PostReverse {

    public static void main(String[] args) {
        CellsCloudClient client = new CellsCloudClient(
                System.getenv("CellsCloudClientId"),
                System.getenv("CellsCloudClientSecret"),
                System.getenv("CellsCloudApiBaseUrl"));
        new Example30_PostReverse().run(client);
    }

    public void run(CellsCloudClient client) {

        try{
            String book1Xlsx = "Book1.xlsx";

            String rotateType = "rows";
            String format = "pdf";

            PostReverseRequest request = new PostReverseRequest(FormFile.ofPath(book1Xlsx), rotateType);
            request.setOutFormat(format);
            client.call(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    
    }
}

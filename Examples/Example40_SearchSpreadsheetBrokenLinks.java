package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;

public class ExampleSearchSpreadsheetBrokenLinks {
    private  CellsApi api;
    public ExampleSearchSpreadsheetBrokenLinks(){
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
            String bookFormulaXlsx = "BookFormula.xlsx";

   
            SearchSpreadsheetBrokenLinksRequest request = new SearchSpreadsheetBrokenLinksRequest();
            request.setSpreadsheet("TestData/" + bookFormulaXlsx);

            this.api.searchSpreadsheetBrokenLinks(request);

        } catch (ApiException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
    }
}

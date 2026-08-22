package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.PostDataTransformationRequest;
import com.aspose.cells.cloud.request.PostWorkbookDataCleansingRequest;
import com.aspose.cells.cloud.request.PostWorkbookDataDeduplicationRequest;
import com.aspose.cells.cloud.request.PostWorkbookDataFillRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.AppliedStep;
import com.aspose.cells.cloud.model.DataCleansing;
import com.aspose.cells.cloud.model.DataFill;
import com.aspose.cells.cloud.model.DataFillValue;
import com.aspose.cells.cloud.model.DataItem;
import com.aspose.cells.cloud.model.DataQuery;
import com.aspose.cells.cloud.model.DataSource;
import com.aspose.cells.cloud.model.DataTransformationRequest;
import com.aspose.cells.cloud.model.DeduplicationRegion;
import com.aspose.cells.cloud.model.LoadData;
import com.aspose.cells.cloud.model.LoadTo;
import com.aspose.cells.cloud.model.UnpivotColumn;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for DataProcessingController. */
class DataProcessingControllerTest {
    private static CellsCloudClient client;

    @BeforeAll
    static void setup() {
        String clientId = System.getenv("CellsCloudClientId");
        String clientSecret = System.getenv("CellsCloudClientSecret");
        String baseUrl = System.getenv("CellsCloudApiBaseUrl");
        Assumptions.assumeTrue(
                clientId != null && !clientId.isEmpty() && clientSecret != null && !clientSecret.isEmpty(),
                "CellsCloudClientId and CellsCloudClientSecret must be set to run integration tests");
        client = new CellsCloudClient(clientId, clientSecret,
                baseUrl == null || baseUrl.isEmpty() ? "https://api.aspose.cloud" : baseUrl);
    }

    private static void upload(String localPath, String remotePath, String storageName) {
        UploadFileRequest upload = new UploadFileRequest("testdata/" + localPath, remotePath);
        if (storageName != null && !storageName.isEmpty()) {
            upload.setStorageName(storageName);
        }
        assertDoesNotThrow(() -> client.call(upload));
    }

    @Test
    void postWorkbookDataCleansing() {
        upload("BookCsvDuplicateData.csv", "TestData/In/BookCsvDuplicateData.csv", "");
        PostWorkbookDataCleansingRequest request = new PostWorkbookDataCleansingRequest("BookCsvDuplicateData.csv", new DataCleansing().setNeedFillData(true).setDataFill(new DataFill().setDataFillDefaultValue(new DataFillValue().setDefaultDate("2024-01-01").setDefaultNumber(0).setDefaultBoolean(false))))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postWorkbookDataDeduplication() {
        upload("BookCsvDuplicateData.csv", "TestData/In/BookCsvDuplicateData.csv", "");
        PostWorkbookDataDeduplicationRequest request = new PostWorkbookDataDeduplicationRequest("BookCsvDuplicateData.csv", new DeduplicationRegion().setRanges(Arrays.asList()))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postWorkbookDataFill() {
        upload("BookCsvDuplicateData.csv", "TestData/In/BookCsvDuplicateData.csv", "");
        PostWorkbookDataFillRequest request = new PostWorkbookDataFillRequest("BookCsvDuplicateData.csv", new DataFill().setDataFillDefaultValue(new DataFillValue().setDefaultDate("2024-01-01").setDefaultNumber(0).setDefaultBoolean(false)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void postDataTransformation() {
        upload("BookTableL2W.xlsx", "TestData/In/BookTableL2W.xlsx", "");
        PostDataTransformationRequest request = new PostDataTransformationRequest(new DataTransformationRequest().setLoadData(new LoadData().setLoadTo(new LoadTo().setBeginColumnIndex(2).setBeginRowIndex(3).setWorksheet("L2W")).setDataQuery(new DataQuery().setName("DataQuery").setDataItem(new DataItem().setDataItemType("Table").setValue("Table1")).setDataSource(new DataSource().setDataSourceType("CloudFileSystem").setDataPath("TestData/In/BookTableL2W.xlsx")).setDataSourceDataType("ListObject"))).setAppliedSteps(Arrays.asList(new AppliedStep().setStepName("UnpivotColumn").setAppliedOperate(new UnpivotColumn().setAppliedOperateType("UnpivotColumn").setValueMapName("Count").setColumnMapName("Date").setUnpivotColumnNames(Arrays.asList("2017", "2018", "2019"))))));

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

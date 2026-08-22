package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.DeleteDecryptWorkbookRequest;
import com.aspose.cells.cloud.request.DeleteDocumentUnProtectFromChangesRequest;
import com.aspose.cells.cloud.request.DeleteUnProtectWorkbookRequest;
import com.aspose.cells.cloud.request.DeleteWorkbookBackgroundRequest;
import com.aspose.cells.cloud.request.DeleteWorkbookNameRequest;
import com.aspose.cells.cloud.request.DeleteWorkbookNamesRequest;
import com.aspose.cells.cloud.request.GetPageCountRequest;
import com.aspose.cells.cloud.request.GetWorkbookDefaultStyleRequest;
import com.aspose.cells.cloud.request.GetWorkbookNameRequest;
import com.aspose.cells.cloud.request.GetWorkbookNameValueRequest;
import com.aspose.cells.cloud.request.GetWorkbookNamesRequest;
import com.aspose.cells.cloud.request.GetWorkbookSettingsRequest;
import com.aspose.cells.cloud.request.GetWorkbookTextItemsRequest;
import com.aspose.cells.cloud.request.PostAutofitWorkbookColumnsRequest;
import com.aspose.cells.cloud.request.PostAutofitWorkbookRowsRequest;
import com.aspose.cells.cloud.request.PostDigitalSignatureRequest;
import com.aspose.cells.cloud.request.PostEncryptWorkbookRequest;
import com.aspose.cells.cloud.request.PostImportDataRequest;
import com.aspose.cells.cloud.request.PostProtectWorkbookRequest;
import com.aspose.cells.cloud.request.PostWorkbookCalculateFormulaRequest;
import com.aspose.cells.cloud.request.PostWorkbookGetSmartMarkerResultRequest;
import com.aspose.cells.cloud.request.PostWorkbookNameRequest;
import com.aspose.cells.cloud.request.PostWorkbookSettingsRequest;
import com.aspose.cells.cloud.request.PostWorkbookSplitRequest;
import com.aspose.cells.cloud.request.PostWorkbookTextReplaceRequest;
import com.aspose.cells.cloud.request.PostWorkbooksMergeRequest;
import com.aspose.cells.cloud.request.PostWorkbooksTextSearchRequest;
import com.aspose.cells.cloud.request.PutDocumentProtectFromChangesRequest;
import com.aspose.cells.cloud.request.PutWorkbookBackgroundRequest;
import com.aspose.cells.cloud.request.PutWorkbookCreateRequest;
import com.aspose.cells.cloud.request.PutWorkbookNameRequest;
import com.aspose.cells.cloud.request.PutWorkbookWaterMarkerRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.CalculationOptions;
import com.aspose.cells.cloud.model.ImportIntArrayOption;
import com.aspose.cells.cloud.model.Name;
import com.aspose.cells.cloud.model.PasswordRequest;
import com.aspose.cells.cloud.model.ProtectWorkbookRequest;
import com.aspose.cells.cloud.model.TextWaterMarkerRequest;
import com.aspose.cells.cloud.model.WorkbookEncryptionRequest;
import com.aspose.cells.cloud.model.WorkbookSettings;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for WorkbookController. */
class WorkbookControllerTest {
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
    void postDigitalSignature() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("roywang.pfx", "TestData/In/roywang.pfx", "");
        PostDigitalSignatureRequest request = new PostDigitalSignatureRequest("Book1.xlsx", "TestData/In/roywang.pfx", "123456")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postEncryptWorkbook() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostEncryptWorkbookRequest request = new PostEncryptWorkbookRequest("Book1.xlsx", new WorkbookEncryptionRequest().setPassword("123456").setEncryptionType("XOR").setKeyLength(128))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteDecryptWorkbook() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteDecryptWorkbookRequest request = new DeleteDecryptWorkbookRequest("Book1.xlsx", new WorkbookEncryptionRequest().setPassword("123456").setEncryptionType("XOR").setKeyLength(128))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postProtectWorkbook() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostProtectWorkbookRequest request = new PostProtectWorkbookRequest("Book1.xlsx", new ProtectWorkbookRequest().setEncryptWithPassword("123456").setProtectWorkbookStructure("ALL"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteUnProtectWorkbook() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteUnProtectWorkbookRequest request = new DeleteUnProtectWorkbookRequest("Book1.xlsx", "Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookDefaultStyle() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookDefaultStyleRequest request = new GetWorkbookDefaultStyleRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookTextItems() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookTextItemsRequest request = new GetWorkbookTextItemsRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookNames() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookNamesRequest request = new GetWorkbookNamesRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorkbookName() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorkbookNameRequest request = new PutWorkbookNameRequest("Book1.xlsx", new Name().setText("name_1804").setComment("KeepSourceFormatting").setRefersTo("=Sheet1!$I$4"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookName() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookNameRequest request = new GetWorkbookNameRequest("Book1.xlsx", "Name_2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbookName() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookNameRequest request = new PostWorkbookNameRequest("Book1.xlsx", "Name_2", new Name().setText("name_1804").setComment("KeepSourceFormatting").setRefersTo("=Sheet1!$I$4"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookNameValue() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookNameValueRequest request = new GetWorkbookNameValueRequest("Book1.xlsx", "Name_2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorkbookNames() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorkbookNamesRequest request = new DeleteWorkbookNamesRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorkbookName() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorkbookNameRequest request = new DeleteWorkbookNameRequest("Book1.xlsx", "Name_2")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putDocumentProtectFromChanges() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutDocumentProtectFromChangesRequest request = new PutDocumentProtectFromChangesRequest("Book1.xlsx", new PasswordRequest().setPassword("123456"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteDocumentUnProtectFromChanges() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteDocumentUnProtectFromChangesRequest request = new DeleteDocumentUnProtectFromChangesRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbooksMerge() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("myDocument.xlsx", "TestData/In/myDocument.xlsx", "");
        PostWorkbooksMergeRequest request = new PostWorkbooksMergeRequest("Book1.xlsx", "TestData/In/myDocument.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbooksTextSearch() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbooksTextSearchRequest request = new PostWorkbooksTextSearchRequest("Book1.xlsx", "1234")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbookTextReplace() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookTextReplaceRequest request = new PostWorkbookTextReplaceRequest("Book1.xlsx", "1234", "5678")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbookGetSmartMarkerResult() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("ReportData.xml", "TestData/In/ReportData.xml", "");
        PostWorkbookGetSmartMarkerResultRequest request = new PostWorkbookGetSmartMarkerResultRequest("Book1.xlsx")
                .setXmlFile("TestData/In/ReportData.xml")
                .setFolder("TestData/In")
                .setOutPath("OutResult/SmartMarkerResult.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void putWorkbookCreate() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("ReportData.xml", "TestData/In/ReportData.xml", "");
        PutWorkbookCreateRequest request = new PutWorkbookCreateRequest("PutWorkbookCreate.xlsx")
                .setTemplateFile("TestData/In/Book1.xlsx")
                .setDataFile("TestData/In/ReportData.xml")
                .setIsWriteOver(true)
                .setFolder("TestData/In")
                .setCheckExcelRestriction(true);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbookSplit() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSplitRequest request = new PostWorkbookSplitRequest("Book1.xlsx")
                .setFormat("png")
                .setOutFolder("OutResult")
                .setFrom(1)
                .setTo(5)
                .setHorizontalResolution(96)
                .setVerticalResolution(96)
                .setSplitNameRule("sheetname")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postImportData() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostImportDataRequest request = new PostImportDataRequest("Book1.xlsx")
                .setImportOption(new ImportIntArrayOption().setDestinationWorksheet("Sheet1").setFirstColumn(1).setFirstRow(3).setImportDataType("IntArray").setIsInsert(true).setIsVertical(true).setData(Arrays.asList(1, 2, 3, 4)))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbookCalculateFormula() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookCalculateFormulaRequest request = new PostWorkbookCalculateFormulaRequest("Book1.xlsx")
                .setOptions(new CalculationOptions().setIgnoreError(true).setRecursive(true))
                .setIgnoreError(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postAutofitWorkbookRows() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostAutofitWorkbookRowsRequest request = new PostAutofitWorkbookRowsRequest("Book1.xlsx")
                .setStartRow(1)
                .setEndRow(100)
                .setOnlyAuto(true)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postAutofitWorkbookColumns() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostAutofitWorkbookColumnsRequest request = new PostAutofitWorkbookColumnsRequest("Book1.xlsx")
                .setStartColumn(1)
                .setEndColumn(20)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookSettings() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookSettingsRequest request = new GetWorkbookSettingsRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void postWorkbookSettings() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSettingsRequest request = new PostWorkbookSettingsRequest("Book1.xlsx", new WorkbookSettings().setAutoCompressPictures(true).setHidePivotFieldList(true))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorkbookBackground() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        upload("WaterMark.png", "TestData/In/WaterMark.png", "");
        PutWorkbookBackgroundRequest request = new PutWorkbookBackgroundRequest("Book1.xlsx")
                .setPicPath("TestData/In/WaterMark.png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void deleteWorkbookBackground() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        DeleteWorkbookBackgroundRequest request = new DeleteWorkbookBackgroundRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void putWorkbookWaterMarker() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PutWorkbookWaterMarkerRequest request = new PutWorkbookWaterMarkerRequest("Book1.xlsx", new TextWaterMarkerRequest().setText("Aspose Cells Cloud").setFontSize(12))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getPageCount() {
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetPageCountRequest request = new GetPageCountRequest("Book1.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

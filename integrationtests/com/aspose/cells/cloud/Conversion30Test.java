package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.GetWorkbookRequest;
import com.aspose.cells.cloud.request.PostWorkbookSaveAsRequest;
import com.aspose.cells.cloud.request.PutConvertWorkbookRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import com.aspose.cells.cloud.model.SaveOptions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Conversion30. */
class Conversion30Test {
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
    void workbookSaveAs_0() {
        // format=csv, newfilename=OutResult/PostExcelSaveAs.csv
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.csv")
                .setSaveOptions(new SaveOptions().setSaveFormat("csv"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_1() {
        // format=html, newfilename=OutResult/PostExcelSaveAs.html
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.html")
                .setSaveOptions(new SaveOptions().setSaveFormat("html"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_2() {
        // format=mhtml, newfilename=OutResult/PostExcelSaveAs.mhtml
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.mhtml")
                .setSaveOptions(new SaveOptions().setSaveFormat("mhtml"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_3() {
        // format=ods, newfilename=OutResult/PostExcelSaveAs.ods
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.ods")
                .setSaveOptions(new SaveOptions().setSaveFormat("ods"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_4() {
        // format=pdf, newfilename=OutResult/PostExcelSaveAs.pdf
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.pdf")
                .setSaveOptions(new SaveOptions().setSaveFormat("pdf"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_5() {
        // format=xml, newfilename=OutResult/PostExcelSaveAs.xml
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.xml")
                .setSaveOptions(new SaveOptions().setSaveFormat("xml"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_6() {
        // format=txt, newfilename=OutResult/PostExcelSaveAs.txt
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.txt")
                .setSaveOptions(new SaveOptions().setSaveFormat("txt"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_7() {
        // format=tif, newfilename=OutResult/PostExcelSaveAs.tif
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.tif")
                .setSaveOptions(new SaveOptions().setSaveFormat("tif"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_8() {
        // format=xlsb, newfilename=OutResult/PostExcelSaveAs.xlsb
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.xlsb")
                .setSaveOptions(new SaveOptions().setSaveFormat("xlsb"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_9() {
        // format=xps, newfilename=OutResult/PostExcelSaveAs.xps
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.xps")
                .setSaveOptions(new SaveOptions().setSaveFormat("xps"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_10() {
        // format=png, newfilename=OutResult/PostExcelSaveAs.png
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.png")
                .setSaveOptions(new SaveOptions().setSaveFormat("png"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_11() {
        // format=md, newfilename=OutResult/PostExcelSaveAs.md
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.md")
                .setSaveOptions(new SaveOptions().setSaveFormat("md"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_12() {
        // format=svg, newfilename=OutResult/PostExcelSaveAs.svg
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.svg")
                .setSaveOptions(new SaveOptions().setSaveFormat("svg"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_13() {
        // format=docx, newfilename=OutResult/PostExcelSaveAs.docx
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.docx")
                .setSaveOptions(new SaveOptions().setSaveFormat("docx"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_14() {
        // format=pptx, newfilename=OutResult/PostExcelSaveAs.pptx
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.pptx")
                .setSaveOptions(new SaveOptions().setSaveFormat("pptx"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_15() {
        // format=json, newfilename=OutResult/PostExcelSaveAs.json
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.json")
                .setSaveOptions(new SaveOptions().setSaveFormat("json"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void workbookSaveAs_16() {
        // format=sql, newfilename=OutResult/PostExcelSaveAs.sql
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        PostWorkbookSaveAsRequest request = new PostWorkbookSaveAsRequest("Book1.xlsx", "OutResult/PostExcelSaveAs.sql")
                .setSaveOptions(new SaveOptions().setSaveFormat("sql"))
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertEquals(200, response.getStatusCode());
    }

    @Test
    void getWorkbookFormat_0() {
        // format=csv
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("csv")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_1() {
        // format=html
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("html")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_2() {
        // format=mhtml
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("mhtml")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_3() {
        // format=ods
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("ods")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_4() {
        // format=pdf
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("pdf")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_5() {
        // format=xml
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("xml")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_6() {
        // format=txt
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("txt")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_7() {
        // format=tif
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("tif")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_8() {
        // format=xps
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("xps")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_9() {
        // format=png
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("png")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_10() {
        // format=md
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("md")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_11() {
        // format=svg
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("svg")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_12() {
        // format=docx
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("docx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_13() {
        // format=pptx
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("pptx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_14() {
        // format=json
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("json")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void getWorkbookFormat_15() {
        // format=sql
        upload("Book1.xlsx", "TestData/In/Book1.xlsx", "");
        GetWorkbookRequest request = new GetWorkbookRequest("Book1.xlsx")
                .setFormat("sql")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_0() {
        // format=csv
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "csv");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_1() {
        // format=xls
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xls");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_2() {
        // format=html
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "html");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_3() {
        // format=mhtml
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "mhtml");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_4() {
        // format=ods
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "ods");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_5() {
        // format=pdf
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_6() {
        // format=xml
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xml");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_7() {
        // format=txt
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "txt");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_8() {
        // format=tif
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "tif");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_9() {
        // format=xlsb
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xlsb");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_10() {
        // format=xps
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xps");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_11() {
        // format=png
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "png");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_12() {
        // format=md
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "md");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_13() {
        // format=svg
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "svg");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_14() {
        // format=docx
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "docx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_15() {
        // format=pptx
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "pptx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_16() {
        // format=json
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "json");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbook_17() {
        // format=sql
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "sql");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_0() {
        // format=csv, outPath=OutResult/ConvertWorkbook.csv
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "csv")
                .setOutPath("OutResult/ConvertWorkbook.csv");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_1() {
        // format=xls, outPath=OutResult/ConvertWorkbook.xls
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xls")
                .setOutPath("OutResult/ConvertWorkbook.xls");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_2() {
        // format=html, outPath=OutResult/ConvertWorkbook.html
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "html")
                .setOutPath("OutResult/ConvertWorkbook.html");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_3() {
        // format=mhtml, outPath=OutResult/ConvertWorkbook.mhtml
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "mhtml")
                .setOutPath("OutResult/ConvertWorkbook.mhtml");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_4() {
        // format=ods, outPath=OutResult/ConvertWorkbook.ods
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "ods")
                .setOutPath("OutResult/ConvertWorkbook.ods");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_5() {
        // format=pdf, outPath=OutResult/ConvertWorkbook.pdf
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "pdf")
                .setOutPath("OutResult/ConvertWorkbook.pdf");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_6() {
        // format=xml, outPath=OutResult/ConvertWorkbook.xml
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xml")
                .setOutPath("OutResult/ConvertWorkbook.xml");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_7() {
        // format=txt, outPath=OutResult/ConvertWorkbook.txt
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "txt")
                .setOutPath("OutResult/ConvertWorkbook.txt");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_8() {
        // format=tif, outPath=OutResult/ConvertWorkbook.tif
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "tif")
                .setOutPath("OutResult/ConvertWorkbook.tif");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_9() {
        // format=xlsb, outPath=OutResult/ConvertWorkbook.xlsb
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xlsb")
                .setOutPath("OutResult/ConvertWorkbook.xlsb");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_10() {
        // format=xltm, outPath=OutResult/ConvertWorkbook.xltm
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xltm")
                .setOutPath("OutResult/ConvertWorkbook.xltm");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_11() {
        // format=xps, outPath=OutResult/ConvertWorkbook.xps
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "xps")
                .setOutPath("OutResult/ConvertWorkbook.xps");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_12() {
        // format=png, outPath=OutResult/ConvertWorkbook.png
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "png")
                .setOutPath("OutResult/ConvertWorkbook.png");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_13() {
        // format=md, outPath=OutResult/ConvertWorkbook.md
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "md")
                .setOutPath("OutResult/ConvertWorkbook.md");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_14() {
        // format=svg, outPath=OutResult/ConvertWorkbook.svg
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "svg")
                .setOutPath("OutResult/ConvertWorkbook.svg");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_15() {
        // format=docx, outPath=OutResult/ConvertWorkbook.docx
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "docx")
                .setOutPath("OutResult/ConvertWorkbook.docx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_16() {
        // format=pptx, outPath=OutResult/ConvertWorkbook.pptx
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "pptx")
                .setOutPath("OutResult/ConvertWorkbook.pptx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_17() {
        // format=json, outPath=OutResult/ConvertWorkbook.json
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "json")
                .setOutPath("OutResult/ConvertWorkbook.json");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void convertWorkbookSaveCloud_18() {
        // format=sql, outPath=OutResult/ConvertWorkbook.sql
        PutConvertWorkbookRequest request = new PutConvertWorkbookRequest("testdata/Book1.xlsx", "sql")
                .setOutPath("OutResult/ConvertWorkbook.sql");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

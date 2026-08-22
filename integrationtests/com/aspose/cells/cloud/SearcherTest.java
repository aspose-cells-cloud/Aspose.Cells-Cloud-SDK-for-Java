package com.aspose.cells.cloud;

import com.aspose.cells.cloud.request.SearchAllTextItemsInRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.SearchBrokenLinksInRemoteRangeRequest;
import com.aspose.cells.cloud.request.SearchBrokenLinksInRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.SearchBrokenLinksInRemoteWorksheetRequest;
import com.aspose.cells.cloud.request.SearchContentInRemoteRangeRequest;
import com.aspose.cells.cloud.request.SearchContentInRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.SearchSpreadsheetAllTextItemsRequest;
import com.aspose.cells.cloud.request.SearchSpreadsheetBrokenLinksRequest;
import com.aspose.cells.cloud.request.SearchSpreadsheetContentRequest;
import com.aspose.cells.cloud.request.UploadFileRequest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Integration tests for Searcher. */
class SearcherTest {
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
    void searchTextInLocalFile() {
        SearchSpreadsheetContentRequest request = new SearchSpreadsheetContentRequest("TestData/BookText.xlsx", "Bike")
                .setIgnoringCase(false);

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchTextFromWorksheetInLocalFile() {
        SearchSpreadsheetContentRequest request = new SearchSpreadsheetContentRequest("TestData/BookText.xlsx", "Bike")
                .setIgnoringCase(false)
                .setWorksheet("Sales");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchTextInRemoteSpreadsheet() {
        upload("BookText.xlsx", "TestData/In/BookText.xlsx", "");
        SearchContentInRemoteSpreadsheetRequest request = new SearchContentInRemoteSpreadsheetRequest("BookText.xlsx", "Bike")
                .setIgnoringCase(false)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchTextInRemoteRange() {
        upload("BookText.xlsx", "TestData/In/BookText.xlsx", "");
        SearchContentInRemoteRangeRequest request = new SearchContentInRemoteRangeRequest("BookText.xlsx", "Sales", "A1:A10", "Bike")
                .setIgnoringCase(false)
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchSpreadsheetBrokenLinks() {
        SearchSpreadsheetBrokenLinksRequest request = new SearchSpreadsheetBrokenLinksRequest("TestData/BookFormula.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchBrokenLinksInRemoteSpreadsheet() {
        upload("BookFormula.xlsx", "TestData/In/BookFormula.xlsx", "");
        SearchBrokenLinksInRemoteSpreadsheetRequest request = new SearchBrokenLinksInRemoteSpreadsheetRequest("BookFormula.xlsx")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchBrokenLinksInRemoteWorksheet() {
        upload("BookFormula.xlsx", "TestData/In/BookFormula.xlsx", "");
        SearchBrokenLinksInRemoteWorksheetRequest request = new SearchBrokenLinksInRemoteWorksheetRequest("BookFormula.xlsx", "Sheet1")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchBrokenLinksInRemoteRange() {
        upload("BookFormula.xlsx", "TestData/In/BookFormula.xlsx", "");
        SearchBrokenLinksInRemoteRangeRequest request = new SearchBrokenLinksInRemoteRangeRequest("BookFormula.xlsx", "Sheet1", "A1:F40")
                .setFolder("TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchAllTextItemsInRemoteSpreadsheet() {
        upload("BookFormula.xlsx", "TestData/In/BookFormula.xlsx", "");
        SearchAllTextItemsInRemoteSpreadsheetRequest request = new SearchAllTextItemsInRemoteSpreadsheetRequest("BookFormula.xlsx", "TestData/In");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }

    @Test
    void searchSpreadsheetAllTextItems() {
        SearchSpreadsheetAllTextItemsRequest request = new SearchSpreadsheetAllTextItemsRequest("TestData/EmployeeSalesSummary.xlsx");

        RichResponse response = assertDoesNotThrow(() -> client.call(request));

        assertNotNull(response.getBody());
    }
}

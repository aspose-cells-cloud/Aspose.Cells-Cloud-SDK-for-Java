package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Search text in the local spreadsheet. */
public class SearchSpreadsheetContentRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String searchText;

    private Boolean ignoringCase;
    private String worksheet;
    private String cellArea;
    private String region;
    private String password;

    public SearchSpreadsheetContentRequest(String spreadsheet, String searchText) {
        this(FormFile.ofPath(spreadsheet), searchText);
    }

    public SearchSpreadsheetContentRequest(File spreadsheet, String searchText) {
        this(FormFile.of(spreadsheet), searchText);
    }

    public SearchSpreadsheetContentRequest(FormFile spreadsheet, String searchText) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (searchText == null || searchText.isEmpty()) throw new IllegalArgumentException("searchText is required");
        this.spreadsheet = spreadsheet;
        this.searchText = searchText;
    }

    public SearchSpreadsheetContentRequest(byte[] spreadsheet, String spreadsheetFileName, String searchText) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), searchText);
    }

    public SearchSpreadsheetContentRequest setIgnoringCase(Boolean ignoringCase) { this.ignoringCase = ignoringCase; return this; }
    public SearchSpreadsheetContentRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public SearchSpreadsheetContentRequest setCellArea(String cellArea) { this.cellArea = cellArea; return this; }
    public SearchSpreadsheetContentRequest setRegion(String region) { this.region = region; return this; }
    public SearchSpreadsheetContentRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/search/content";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("searchText", searchText);
        if (ignoringCase != null) query.put("ignoringCase", String.valueOf(ignoringCase));
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (cellArea != null && !cellArea.isEmpty()) query.put("cellArea", cellArea);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (password != null && !password.isEmpty()) query.put("password", password);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "multipart/form-data");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        Map<String, Object> form = new HashMap<>();
        form.put("Spreadsheet", spreadsheet);
        return form;
    }
}

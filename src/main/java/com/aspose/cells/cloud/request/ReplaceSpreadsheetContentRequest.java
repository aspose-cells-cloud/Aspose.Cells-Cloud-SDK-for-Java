package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Replace text in the local spreadsheet. */
public class ReplaceSpreadsheetContentRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String searchText;
    private final String replaceText;

    private String worksheet;
    private String cellArea;
    private String region;
    private String password;

    public ReplaceSpreadsheetContentRequest(String spreadsheet, String searchText, String replaceText) {
        this(FormFile.ofPath(spreadsheet), searchText, replaceText);
    }

    public ReplaceSpreadsheetContentRequest(File spreadsheet, String searchText, String replaceText) {
        this(FormFile.of(spreadsheet), searchText, replaceText);
    }

    public ReplaceSpreadsheetContentRequest(FormFile spreadsheet, String searchText, String replaceText) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (searchText == null || searchText.isEmpty()) throw new IllegalArgumentException("searchText is required");
        if (replaceText == null || replaceText.isEmpty()) throw new IllegalArgumentException("replaceText is required");
        this.spreadsheet = spreadsheet;
        this.searchText = searchText;
        this.replaceText = replaceText;
    }

    public ReplaceSpreadsheetContentRequest(byte[] spreadsheet, String spreadsheetFileName, String searchText, String replaceText) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), searchText, replaceText);
    }

    public ReplaceSpreadsheetContentRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public ReplaceSpreadsheetContentRequest setCellArea(String cellArea) { this.cellArea = cellArea; return this; }
    public ReplaceSpreadsheetContentRequest setRegion(String region) { this.region = region; return this; }
    public ReplaceSpreadsheetContentRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/replace/content";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("searchText", searchText);
        query.put("replaceText", replaceText);
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

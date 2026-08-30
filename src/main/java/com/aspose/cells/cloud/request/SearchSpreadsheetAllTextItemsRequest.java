package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Get all text items in the remote spreadsheet. */
public class SearchSpreadsheetAllTextItemsRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String region;
    private String password;

    public SearchSpreadsheetAllTextItemsRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public SearchSpreadsheetAllTextItemsRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public SearchSpreadsheetAllTextItemsRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public SearchSpreadsheetAllTextItemsRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public SearchSpreadsheetAllTextItemsRequest setRegion(String region) { this.region = region; return this; }
    public SearchSpreadsheetAllTextItemsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/search/content/all-textitems";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
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

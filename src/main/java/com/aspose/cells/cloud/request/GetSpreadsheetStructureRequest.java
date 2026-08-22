package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Structurally convert the core metadata, worksheets, tables, pivot tables, charts, shapes, and other information of an Excel workbook into a JObject type JSON object, for scenarios such as data export, API responses, and log recording. */
public class GetSpreadsheetStructureRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String region;
    private String password;

    public GetSpreadsheetStructureRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public GetSpreadsheetStructureRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public GetSpreadsheetStructureRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public GetSpreadsheetStructureRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public GetSpreadsheetStructureRequest setRegion(String region) { this.region = region; return this; }
    public GetSpreadsheetStructureRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/spreadsheet/structure";
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

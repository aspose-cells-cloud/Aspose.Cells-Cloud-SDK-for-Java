package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Switch rows and columns in the spreadsheet. */
public class UnpivotTableRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final Integer index;

    private Boolean skipEmptyValue;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public UnpivotTableRequest(String spreadsheet, String worksheet, Integer index) {
        this(FormFile.ofPath(spreadsheet), worksheet, index);
    }

    public UnpivotTableRequest(File spreadsheet, String worksheet, Integer index) {
        this(FormFile.of(spreadsheet), worksheet, index);
    }

    public UnpivotTableRequest(FormFile spreadsheet, String worksheet, Integer index) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (index == null) throw new IllegalArgumentException("index is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.index = index;
    }

    public UnpivotTableRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, Integer index) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, index);
    }

    public UnpivotTableRequest setSkipEmptyValue(Boolean skipEmptyValue) { this.skipEmptyValue = skipEmptyValue; return this; }
    public UnpivotTableRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public UnpivotTableRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public UnpivotTableRequest setRegion(String region) { this.region = region; return this; }
    public UnpivotTableRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/unpivot/table";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("index", String.valueOf(index));
        if (skipEmptyValue != null) query.put("skipEmptyValue", String.valueOf(skipEmptyValue));
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
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

    @Override public boolean isBinaryResponse() { return true; }
}

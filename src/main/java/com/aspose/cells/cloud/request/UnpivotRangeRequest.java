package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Switch rows and columns in the spreadsheet. */
public class UnpivotRangeRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final String cellArea;

    private Boolean skipEmptyValue;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public UnpivotRangeRequest(String spreadsheet, String worksheet, String cellArea) {
        this(FormFile.ofPath(spreadsheet), worksheet, cellArea);
    }

    public UnpivotRangeRequest(File spreadsheet, String worksheet, String cellArea) {
        this(FormFile.of(spreadsheet), worksheet, cellArea);
    }

    public UnpivotRangeRequest(FormFile spreadsheet, String worksheet, String cellArea) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.cellArea = cellArea;
    }

    public UnpivotRangeRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, String cellArea) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, cellArea);
    }

    public UnpivotRangeRequest setSkipEmptyValue(Boolean skipEmptyValue) { this.skipEmptyValue = skipEmptyValue; return this; }
    public UnpivotRangeRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public UnpivotRangeRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public UnpivotRangeRequest setRegion(String region) { this.region = region; return this; }
    public UnpivotRangeRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/unpivot/range";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("cellArea", cellArea);
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
}

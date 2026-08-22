package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** MathCalculate request. */
public class MathCalculateRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String operation;
    private final String value;

    private String worksheet;
    private String range;
    private String region;
    private String password;

    public MathCalculateRequest(String spreadsheet, String operation, String value) {
        this(FormFile.ofPath(spreadsheet), operation, value);
    }

    public MathCalculateRequest(File spreadsheet, String operation, String value) {
        this(FormFile.of(spreadsheet), operation, value);
    }

    public MathCalculateRequest(FormFile spreadsheet, String operation, String value) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (operation == null || operation.isEmpty()) throw new IllegalArgumentException("operation is required");
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("value is required");
        this.spreadsheet = spreadsheet;
        this.operation = operation;
        this.value = value;
    }

    public MathCalculateRequest(byte[] spreadsheet, String spreadsheetFileName, String operation, String value) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), operation, value);
    }

    public MathCalculateRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public MathCalculateRequest setRange(String range) { this.range = range; return this; }
    public MathCalculateRequest setRegion(String region) { this.region = region; return this; }
    public MathCalculateRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/calculate/math";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("operation", operation);
        query.put("value", value);
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (range != null && !range.isEmpty()) query.put("range", range);
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

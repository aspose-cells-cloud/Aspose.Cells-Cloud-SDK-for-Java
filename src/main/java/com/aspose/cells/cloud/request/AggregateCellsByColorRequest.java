package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** The Aggregate by Color API provides a convenient way to perform calculations on cells that share the same fill or font color. This API supports a range of aggregate operations, including count, sum, maximum value, minimum value, and average value, enabling you to analyze and summarize data based on color distinctions. */
public class AggregateCellsByColorRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String worksheet;
    private String range;
    private String operation;
    private String colorPosition;
    private String region;
    private String password;

    public AggregateCellsByColorRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public AggregateCellsByColorRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public AggregateCellsByColorRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public AggregateCellsByColorRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public AggregateCellsByColorRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public AggregateCellsByColorRequest setRange(String range) { this.range = range; return this; }
    public AggregateCellsByColorRequest setOperation(String operation) { this.operation = operation; return this; }
    public AggregateCellsByColorRequest setColorPosition(String colorPosition) { this.colorPosition = colorPosition; return this; }
    public AggregateCellsByColorRequest setRegion(String region) { this.region = region; return this; }
    public AggregateCellsByColorRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/calculate/aggergate/color";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (range != null && !range.isEmpty()) query.put("range", range);
        if (operation != null && !operation.isEmpty()) query.put("operation", operation);
        if (colorPosition != null && !colorPosition.isEmpty()) query.put("colorPosition", colorPosition);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Removes duplicate values in the worksheet/range/table. */
public class RemoveDuplicatesRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String worksheet;
    private String range;
    private String table;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RemoveDuplicatesRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public RemoveDuplicatesRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public RemoveDuplicatesRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public RemoveDuplicatesRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public RemoveDuplicatesRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public RemoveDuplicatesRequest setRange(String range) { this.range = range; return this; }
    public RemoveDuplicatesRequest setTable(String table) { this.table = table; return this; }
    public RemoveDuplicatesRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RemoveDuplicatesRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RemoveDuplicatesRequest setRegion(String region) { this.region = region; return this; }
    public RemoveDuplicatesRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/remove/duplicates";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (range != null && !range.isEmpty()) query.put("range", range);
        if (table != null && !table.isEmpty()) query.put("table", table);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** The Web API endpoint allows users to compress a spreadsheet to reduce its file size. This function provides a straightforward way to optimize the storage and performance of spreadsheets by applying a specified compression level. */
public class CompressSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final Integer level;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public CompressSpreadsheetRequest(String spreadsheet, Integer level) {
        this(FormFile.ofPath(spreadsheet), level);
    }

    public CompressSpreadsheetRequest(File spreadsheet, Integer level) {
        this(FormFile.of(spreadsheet), level);
    }

    public CompressSpreadsheetRequest(FormFile spreadsheet, Integer level) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (level == null) throw new IllegalArgumentException("level is required");
        this.spreadsheet = spreadsheet;
        this.level = level;
    }

    public CompressSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName, Integer level) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), level);
    }

    public CompressSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public CompressSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public CompressSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public CompressSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/spreadsheet/compress";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("level", String.valueOf(level));
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** SpreadsheetDigitalsignature request. */
public class SpreadsheetDigitalsignatureRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String password;

    private String outPath;
    private String outStorageName;
    private String region;

    public SpreadsheetDigitalsignatureRequest(String spreadsheet, String password) {
        this(FormFile.ofPath(spreadsheet), password);
    }

    public SpreadsheetDigitalsignatureRequest(File spreadsheet, String password) {
        this(FormFile.of(spreadsheet), password);
    }

    public SpreadsheetDigitalsignatureRequest(FormFile spreadsheet, String password) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (password == null || password.isEmpty()) throw new IllegalArgumentException("password is required");
        this.spreadsheet = spreadsheet;
        this.password = password;
    }

    public SpreadsheetDigitalsignatureRequest(byte[] spreadsheet, String spreadsheetFileName, String password) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), password);
    }

    public SpreadsheetDigitalsignatureRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SpreadsheetDigitalsignatureRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SpreadsheetDigitalsignatureRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/digitalsignature/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("password", password);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (region != null && !region.isEmpty()) query.put("region", region);
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

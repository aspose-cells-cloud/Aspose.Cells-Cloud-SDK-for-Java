package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Applies dual-layer password protection to Excel spreadsheets, supporting both open and modify passwords with encryption. */
public class ProtectSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String password;
    private final String modifyPassword;

    private String outPath;
    private String outStorageName;
    private String region;

    public ProtectSpreadsheetRequest(String spreadsheet, String password, String modifyPassword) {
        this(FormFile.ofPath(spreadsheet), password, modifyPassword);
    }

    public ProtectSpreadsheetRequest(File spreadsheet, String password, String modifyPassword) {
        this(FormFile.of(spreadsheet), password, modifyPassword);
    }

    public ProtectSpreadsheetRequest(FormFile spreadsheet, String password, String modifyPassword) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (password == null || password.isEmpty()) throw new IllegalArgumentException("password is required");
        if (modifyPassword == null || modifyPassword.isEmpty()) throw new IllegalArgumentException("modifyPassword is required");
        this.spreadsheet = spreadsheet;
        this.password = password;
        this.modifyPassword = modifyPassword;
    }

    public ProtectSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName, String password, String modifyPassword) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), password, modifyPassword);
    }

    public ProtectSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ProtectSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ProtectSpreadsheetRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/protection/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("password", password);
        query.put("modifyPassword", modifyPassword);
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
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** The Web API endpoint allows users to rename a specified worksheet within a workbook. This function provides a straightforward way to update worksheet names, enhancing workbook organization and readability. */
public class RenameWorksheetInSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String sourceName;
    private final String targetName;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RenameWorksheetInSpreadsheetRequest(String spreadsheet, String sourceName, String targetName) {
        this(FormFile.ofPath(spreadsheet), sourceName, targetName);
    }

    public RenameWorksheetInSpreadsheetRequest(File spreadsheet, String sourceName, String targetName) {
        this(FormFile.of(spreadsheet), sourceName, targetName);
    }

    public RenameWorksheetInSpreadsheetRequest(FormFile spreadsheet, String sourceName, String targetName) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (sourceName == null || sourceName.isEmpty()) throw new IllegalArgumentException("sourceName is required");
        if (targetName == null || targetName.isEmpty()) throw new IllegalArgumentException("targetName is required");
        this.spreadsheet = spreadsheet;
        this.sourceName = sourceName;
        this.targetName = targetName;
    }

    public RenameWorksheetInSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName, String sourceName, String targetName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), sourceName, targetName);
    }

    public RenameWorksheetInSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RenameWorksheetInSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RenameWorksheetInSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public RenameWorksheetInSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/spreadsheet/rename/worksheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("sourceName", sourceName);
        query.put("targetName", targetName);
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

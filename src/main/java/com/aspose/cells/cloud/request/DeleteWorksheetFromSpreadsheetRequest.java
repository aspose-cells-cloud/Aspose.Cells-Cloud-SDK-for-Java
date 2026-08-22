package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** The Web API endpoint allows users to delete a specified worksheet from a workbook. This function provides a straightforward way to manage workbook structure by removing unnecessary or redundant worksheets. */
public class DeleteWorksheetFromSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String sheetName;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public DeleteWorksheetFromSpreadsheetRequest(String spreadsheet, String sheetName) {
        this(FormFile.ofPath(spreadsheet), sheetName);
    }

    public DeleteWorksheetFromSpreadsheetRequest(File spreadsheet, String sheetName) {
        this(FormFile.of(spreadsheet), sheetName);
    }

    public DeleteWorksheetFromSpreadsheetRequest(FormFile spreadsheet, String sheetName) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.spreadsheet = spreadsheet;
        this.sheetName = sheetName;
    }

    public DeleteWorksheetFromSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName, String sheetName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), sheetName);
    }

    public DeleteWorksheetFromSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public DeleteWorksheetFromSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public DeleteWorksheetFromSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public DeleteWorksheetFromSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/spreadsheet/delete/worksheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("sheetName", sheetName);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** The Web API enables users to add a new worksheet to a workbook, specifying the worksheet's type, position, and name. This function provides flexibility in managing workbook structure by allowing detailed control over worksheet addition. */
public class AddWorksheetToSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String sheetType;
    private Integer position;
    private String sheetName;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public AddWorksheetToSpreadsheetRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public AddWorksheetToSpreadsheetRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public AddWorksheetToSpreadsheetRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public AddWorksheetToSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public AddWorksheetToSpreadsheetRequest setSheetType(String sheetType) { this.sheetType = sheetType; return this; }
    public AddWorksheetToSpreadsheetRequest setPosition(Integer position) { this.position = position; return this; }
    public AddWorksheetToSpreadsheetRequest setSheetName(String sheetName) { this.sheetName = sheetName; return this; }
    public AddWorksheetToSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public AddWorksheetToSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public AddWorksheetToSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public AddWorksheetToSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/spreadsheet/add/worksheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (sheetType != null && !sheetType.isEmpty()) query.put("sheetType", sheetType);
        if (position != null) query.put("position", String.valueOf(position));
        if (sheetName != null && !sheetName.isEmpty()) query.put("sheetName", sheetName);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** The Web API endpoint allows users to move a specified worksheet within a workbook. This function provides a straightforward way to move a worksheet, enhancing workbook organization. */
public class MoveWorksheetInSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final Integer position;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public MoveWorksheetInSpreadsheetRequest(String spreadsheet, String worksheet, Integer position) {
        this(FormFile.ofPath(spreadsheet), worksheet, position);
    }

    public MoveWorksheetInSpreadsheetRequest(File spreadsheet, String worksheet, Integer position) {
        this(FormFile.of(spreadsheet), worksheet, position);
    }

    public MoveWorksheetInSpreadsheetRequest(FormFile spreadsheet, String worksheet, Integer position) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (position == null) throw new IllegalArgumentException("position is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.position = position;
    }

    public MoveWorksheetInSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, Integer position) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, position);
    }

    public MoveWorksheetInSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public MoveWorksheetInSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public MoveWorksheetInSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public MoveWorksheetInSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/spreadsheet/move/worksheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("position", String.valueOf(position));
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

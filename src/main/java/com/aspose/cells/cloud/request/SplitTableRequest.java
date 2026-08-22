package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Split an Excel worksheet tale into multiple sheets by column value. */
public class SplitTableRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;
    private final String tableName;
    private final String splitColumnName;
    private final Boolean saveSplitColumn;
    private final Integer splitRowNumber;
    private final Boolean toNewWorkbook;
    private final Boolean toMultipleFiles;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public SplitTableRequest(String spreadsheet, String worksheet, String tableName, String splitColumnName, Boolean saveSplitColumn, Integer splitRowNumber, Boolean toNewWorkbook, Boolean toMultipleFiles) {
        this(FormFile.ofPath(spreadsheet), worksheet, tableName, splitColumnName, saveSplitColumn, splitRowNumber, toNewWorkbook, toMultipleFiles);
    }

    public SplitTableRequest(File spreadsheet, String worksheet, String tableName, String splitColumnName, Boolean saveSplitColumn, Integer splitRowNumber, Boolean toNewWorkbook, Boolean toMultipleFiles) {
        this(FormFile.of(spreadsheet), worksheet, tableName, splitColumnName, saveSplitColumn, splitRowNumber, toNewWorkbook, toMultipleFiles);
    }

    public SplitTableRequest(FormFile spreadsheet, String worksheet, String tableName, String splitColumnName, Boolean saveSplitColumn, Integer splitRowNumber, Boolean toNewWorkbook, Boolean toMultipleFiles) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (tableName == null || tableName.isEmpty()) throw new IllegalArgumentException("tableName is required");
        if (splitColumnName == null || splitColumnName.isEmpty()) throw new IllegalArgumentException("splitColumnName is required");
        if (saveSplitColumn == null) throw new IllegalArgumentException("saveSplitColumn is required");
        if (splitRowNumber == null) throw new IllegalArgumentException("splitRowNumber is required");
        if (toNewWorkbook == null) throw new IllegalArgumentException("toNewWorkbook is required");
        if (toMultipleFiles == null) throw new IllegalArgumentException("toMultipleFiles is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.tableName = tableName;
        this.splitColumnName = splitColumnName;
        this.saveSplitColumn = saveSplitColumn;
        this.splitRowNumber = splitRowNumber;
        this.toNewWorkbook = toNewWorkbook;
        this.toMultipleFiles = toMultipleFiles;
    }

    public SplitTableRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet, String tableName, String splitColumnName, Boolean saveSplitColumn, Integer splitRowNumber, Boolean toNewWorkbook, Boolean toMultipleFiles) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet, tableName, splitColumnName, saveSplitColumn, splitRowNumber, toNewWorkbook, toMultipleFiles);
    }

    public SplitTableRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SplitTableRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SplitTableRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public SplitTableRequest setRegion(String region) { this.region = region; return this; }
    public SplitTableRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/split/table";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("tableName", tableName);
        query.put("splitColumnName", splitColumnName);
        query.put("saveSplitColumn", String.valueOf(saveSplitColumn));
        query.put("splitRowNumber", String.valueOf(splitRowNumber));
        query.put("toNewWorkbook", String.valueOf(toNewWorkbook));
        query.put("toMultipleFiles", String.valueOf(toMultipleFiles));
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
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

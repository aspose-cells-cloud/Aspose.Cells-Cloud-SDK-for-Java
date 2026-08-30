package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Import JSON data file into the local spreadsheet. */
public class ImportJSONDataIntoSpreadsheetRequest implements RequestOption {
    private final FormFile datafile;
    private final FormFile spreadsheet;
    private final String worksheet;
    private final String startcell;

    private Boolean insert;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public ImportJSONDataIntoSpreadsheetRequest(String datafile, String spreadsheet, String worksheet, String startcell) {
        this(FormFile.ofPath(datafile), FormFile.ofPath(spreadsheet), worksheet, startcell);
    }

    public ImportJSONDataIntoSpreadsheetRequest(File datafile, File spreadsheet, String worksheet, String startcell) {
        this(FormFile.of(datafile), FormFile.of(spreadsheet), worksheet, startcell);
    }

    public ImportJSONDataIntoSpreadsheetRequest(FormFile datafile, FormFile spreadsheet, String worksheet, String startcell) {
        if (datafile == null) throw new IllegalArgumentException("datafile is required");
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (startcell == null || startcell.isEmpty()) throw new IllegalArgumentException("startcell is required");
        this.datafile = datafile;
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
        this.startcell = startcell;
    }

    public ImportJSONDataIntoSpreadsheetRequest setInsert(Boolean insert) { this.insert = insert; return this; }
    public ImportJSONDataIntoSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ImportJSONDataIntoSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ImportJSONDataIntoSpreadsheetRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ImportJSONDataIntoSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public ImportJSONDataIntoSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/import/data/json";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        query.put("startcell", startcell);
        if (insert != null) query.put("insert", String.valueOf(insert));
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
        form.put("datafile", datafile);
        form.put("Spreadsheet", spreadsheet);
        return form;
    }

    @Override public boolean isBinaryResponse() { return true; }
}

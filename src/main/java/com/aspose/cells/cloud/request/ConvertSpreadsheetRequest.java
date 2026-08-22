package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a spreadsheet on a local drive to the specified format. */
public class ConvertSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String format;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String region;
    private String password;

    public ConvertSpreadsheetRequest(String spreadsheet, String format) {
        this(FormFile.ofPath(spreadsheet), format);
    }

    public ConvertSpreadsheetRequest(File spreadsheet, String format) {
        this(FormFile.of(spreadsheet), format);
    }

    public ConvertSpreadsheetRequest(FormFile spreadsheet, String format) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.spreadsheet = spreadsheet;
        this.format = format;
    }

    public ConvertSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName, String format) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), format);
    }

    public ConvertSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ConvertSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ConvertSpreadsheetRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ConvertSpreadsheetRequest setAutoRowsFit(Boolean autoRowsFit) { this.autoRowsFit = autoRowsFit; return this; }
    public ConvertSpreadsheetRequest setAutoColumnsFit(Boolean autoColumnsFit) { this.autoColumnsFit = autoColumnsFit; return this; }
    public ConvertSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public ConvertSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/convert/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("format", format);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
        if (autoRowsFit != null) query.put("AutoRowsFit", String.valueOf(autoRowsFit));
        if (autoColumnsFit != null) query.put("AutoColumnsFit", String.valueOf(autoColumnsFit));
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

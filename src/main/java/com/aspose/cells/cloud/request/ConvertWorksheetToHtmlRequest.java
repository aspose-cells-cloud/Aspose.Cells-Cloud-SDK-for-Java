package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Converts a worksheet of spreadsheet on a local drive to the html file. */
public class ConvertWorksheetToHtmlRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet;

    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String region;
    private String password;

    public ConvertWorksheetToHtmlRequest(String spreadsheet, String worksheet) {
        this(FormFile.ofPath(spreadsheet), worksheet);
    }

    public ConvertWorksheetToHtmlRequest(File spreadsheet, String worksheet) {
        this(FormFile.of(spreadsheet), worksheet);
    }

    public ConvertWorksheetToHtmlRequest(FormFile spreadsheet, String worksheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        this.spreadsheet = spreadsheet;
        this.worksheet = worksheet;
    }

    public ConvertWorksheetToHtmlRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet);
    }

    public ConvertWorksheetToHtmlRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ConvertWorksheetToHtmlRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ConvertWorksheetToHtmlRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ConvertWorksheetToHtmlRequest setAutoRowsFit(Boolean autoRowsFit) { this.autoRowsFit = autoRowsFit; return this; }
    public ConvertWorksheetToHtmlRequest setAutoColumnsFit(Boolean autoColumnsFit) { this.autoColumnsFit = autoColumnsFit; return this; }
    public ConvertWorksheetToHtmlRequest setRegion(String region) { this.region = region; return this; }
    public ConvertWorksheetToHtmlRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/convert/worksheet/html";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
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

    @Override public boolean isBinaryResponse() { return true; }
}

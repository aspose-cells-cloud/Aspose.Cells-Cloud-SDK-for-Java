package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a table of spreadsheet in cloud storage to the specified format. */
public class ExportTableAsFormatRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String tableName;
    private final String format;

    private String folder;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String region;
    private String password;

    public ExportTableAsFormatRequest(String name, String worksheet, String tableName, String format) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (tableName == null || tableName.isEmpty()) throw new IllegalArgumentException("tableName is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.name = name;
        this.worksheet = worksheet;
        this.tableName = tableName;
        this.format = format;
    }

    public ExportTableAsFormatRequest setFolder(String folder) { this.folder = folder; return this; }
    public ExportTableAsFormatRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public ExportTableAsFormatRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ExportTableAsFormatRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ExportTableAsFormatRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public ExportTableAsFormatRequest setAutoRowsFit(Boolean autoRowsFit) { this.autoRowsFit = autoRowsFit; return this; }
    public ExportTableAsFormatRequest setAutoColumnsFit(Boolean autoColumnsFit) { this.autoColumnsFit = autoColumnsFit; return this; }
    public ExportTableAsFormatRequest setRegion(String region) { this.region = region; return this; }
    public ExportTableAsFormatRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/tables/" + urlEncode(tableName);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("format", format);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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
        return new HashMap<>();
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }

    @Override public boolean isBinaryResponse() { return true; }
}

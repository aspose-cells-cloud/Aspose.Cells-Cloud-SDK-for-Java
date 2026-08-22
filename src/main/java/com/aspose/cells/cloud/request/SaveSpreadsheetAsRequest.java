package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.SaveOptionsData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Converts a spreadsheet in cloud storage to the specified format. */
public class SaveSpreadsheetAsRequest implements RequestOption {
    private final String name;
    private final String format;

    private SaveOptionsData saveOptionsData;
    private String folder;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String region;
    private String password;

    public SaveSpreadsheetAsRequest(String name, String format) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (format == null || format.isEmpty()) throw new IllegalArgumentException("format is required");
        this.name = name;
        this.format = format;
    }

    public SaveSpreadsheetAsRequest setSaveOptionsData(SaveOptionsData saveOptionsData) { this.saveOptionsData = saveOptionsData; return this; }
    public SaveSpreadsheetAsRequest setFolder(String folder) { this.folder = folder; return this; }
    public SaveSpreadsheetAsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public SaveSpreadsheetAsRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SaveSpreadsheetAsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SaveSpreadsheetAsRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public SaveSpreadsheetAsRequest setAutoRowsFit(Boolean autoRowsFit) { this.autoRowsFit = autoRowsFit; return this; }
    public SaveSpreadsheetAsRequest setAutoColumnsFit(Boolean autoColumnsFit) { this.autoColumnsFit = autoColumnsFit; return this; }
    public SaveSpreadsheetAsRequest setRegion(String region) { this.region = region; return this; }
    public SaveSpreadsheetAsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/saveas";
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
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return saveOptionsData;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

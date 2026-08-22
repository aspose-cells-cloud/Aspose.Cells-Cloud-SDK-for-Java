package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Split a spreadsheet in cloud storage into the specified format, multi-file. */
public class SplitRemoteSpreadsheetRequest implements RequestOption {
    private final String name;

    private String folder;
    private Integer from;
    private Integer to;
    private String outFormat;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public SplitRemoteSpreadsheetRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public SplitRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public SplitRemoteSpreadsheetRequest setFrom(Integer from) { this.from = from; return this; }
    public SplitRemoteSpreadsheetRequest setTo(Integer to) { this.to = to; return this; }
    public SplitRemoteSpreadsheetRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public SplitRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public SplitRemoteSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SplitRemoteSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SplitRemoteSpreadsheetRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public SplitRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public SplitRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/split/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (from != null) query.put("from", String.valueOf(from));
        if (to != null) query.put("to", String.valueOf(to));
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
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
}

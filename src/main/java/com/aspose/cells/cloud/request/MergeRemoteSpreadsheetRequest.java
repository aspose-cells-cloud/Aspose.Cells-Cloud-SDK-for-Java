package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Merge a spreadsheet file into other spreadsheet in cloud storage, and output a specified format file. */
public class MergeRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String mergedSpreadsheet;

    private String folder;
    private String outFormat;
    private Boolean mergeInOneSheet;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public MergeRemoteSpreadsheetRequest(String name, String mergedSpreadsheet) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (mergedSpreadsheet == null || mergedSpreadsheet.isEmpty()) throw new IllegalArgumentException("mergedSpreadsheet is required");
        this.name = name;
        this.mergedSpreadsheet = mergedSpreadsheet;
    }

    public MergeRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public MergeRemoteSpreadsheetRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public MergeRemoteSpreadsheetRequest setMergeInOneSheet(Boolean mergeInOneSheet) { this.mergeInOneSheet = mergeInOneSheet; return this; }
    public MergeRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public MergeRemoteSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public MergeRemoteSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public MergeRemoteSpreadsheetRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public MergeRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public MergeRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/merge/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("mergedSpreadsheet", mergedSpreadsheet);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
        if (mergeInOneSheet != null) query.put("mergeInOneSheet", String.valueOf(mergeInOneSheet));
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

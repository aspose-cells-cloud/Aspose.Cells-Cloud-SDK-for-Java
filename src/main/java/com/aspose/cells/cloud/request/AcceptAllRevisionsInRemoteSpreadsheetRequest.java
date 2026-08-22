package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** AcceptAllRevisionsInRemoteSpreadsheet request. */
public class AcceptAllRevisionsInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;

    private String folder;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public AcceptAllRevisionsInRemoteSpreadsheetRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public AcceptAllRevisionsInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public AcceptAllRevisionsInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public AcceptAllRevisionsInRemoteSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public AcceptAllRevisionsInRemoteSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public AcceptAllRevisionsInRemoteSpreadsheetRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public AcceptAllRevisionsInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public AcceptAllRevisionsInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/accept-all-revisions";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
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

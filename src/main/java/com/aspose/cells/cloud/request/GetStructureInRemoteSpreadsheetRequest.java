package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Structurally convert the core metadata, worksheets, tables, pivot tables, charts, shapes, and other information of an Excel workbook into a JObject type JSON object, for scenarios such as data export, API responses, and log recording. */
public class GetStructureInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;

    private String folder;
    private String storageName;
    private String region;
    private String password;

    public GetStructureInRemoteSpreadsheetRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public GetStructureInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetStructureInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public GetStructureInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public GetStructureInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/structure";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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

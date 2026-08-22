package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Get all text items in the remote spreadsheet. */
public class SearchAllTextItemsInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String folder;

    private String storageName;
    private String region;
    private String password;

    public SearchAllTextItemsInRemoteSpreadsheetRequest(String name, String folder) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (folder == null || folder.isEmpty()) throw new IllegalArgumentException("folder is required");
        this.name = name;
        this.folder = folder;
    }

    public SearchAllTextItemsInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public SearchAllTextItemsInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public SearchAllTextItemsInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/search/content/all-textitems";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("folder", folder);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Replace text in the worksheet of remoted spreadsheet. */
public class ReplaceContentInRemoteWorksheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String searchText;
    private final String replaceText;

    private String folder;
    private String storageName;
    private String region;
    private String password;

    public ReplaceContentInRemoteWorksheetRequest(String name, String worksheet, String searchText, String replaceText) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (searchText == null || searchText.isEmpty()) throw new IllegalArgumentException("searchText is required");
        if (replaceText == null || replaceText.isEmpty()) throw new IllegalArgumentException("replaceText is required");
        this.name = name;
        this.worksheet = worksheet;
        this.searchText = searchText;
        this.replaceText = replaceText;
    }

    public ReplaceContentInRemoteWorksheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public ReplaceContentInRemoteWorksheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public ReplaceContentInRemoteWorksheetRequest setRegion(String region) { this.region = region; return this; }
    public ReplaceContentInRemoteWorksheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/replace/content";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("searchText", searchText);
        query.put("replaceText", replaceText);
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

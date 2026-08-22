package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Search broken links in the worksheet of remoted spreadsheet. */
public class SearchBrokenLinksInRemoteWorksheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;

    private String folder;
    private String storageName;
    private String region;
    private String password;

    public SearchBrokenLinksInRemoteWorksheetRequest(String name, String worksheet) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        this.name = name;
        this.worksheet = worksheet;
    }

    public SearchBrokenLinksInRemoteWorksheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public SearchBrokenLinksInRemoteWorksheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public SearchBrokenLinksInRemoteWorksheetRequest setRegion(String region) { this.region = region; return this; }
    public SearchBrokenLinksInRemoteWorksheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/search/broken-links";
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

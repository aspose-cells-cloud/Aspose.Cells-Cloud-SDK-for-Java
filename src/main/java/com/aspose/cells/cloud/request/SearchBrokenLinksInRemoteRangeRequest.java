package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Search broken links in the range of remoted spreadsheet. */
public class SearchBrokenLinksInRemoteRangeRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String cellArea;

    private String folder;
    private String storageName;
    private String region;
    private String password;

    public SearchBrokenLinksInRemoteRangeRequest(String name, String worksheet, String cellArea) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        this.name = name;
        this.worksheet = worksheet;
        this.cellArea = cellArea;
    }

    public SearchBrokenLinksInRemoteRangeRequest setFolder(String folder) { this.folder = folder; return this; }
    public SearchBrokenLinksInRemoteRangeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public SearchBrokenLinksInRemoteRangeRequest setRegion(String region) { this.region = region; return this; }
    public SearchBrokenLinksInRemoteRangeRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/ranges/" + urlEncode(cellArea) + "/search/broken-links";
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

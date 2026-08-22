package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Search broken links in the remoted spreadsheet. */
public class SearchBrokenLinksInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;

    private String worksheet;
    private String cellArea;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public SearchBrokenLinksInRemoteSpreadsheetRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public SearchBrokenLinksInRemoteSpreadsheetRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public SearchBrokenLinksInRemoteSpreadsheetRequest setCellArea(String cellArea) { this.cellArea = cellArea; return this; }
    public SearchBrokenLinksInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public SearchBrokenLinksInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public SearchBrokenLinksInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public SearchBrokenLinksInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/search/broken-links";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (cellArea != null && !cellArea.isEmpty()) query.put("cellArea", cellArea);
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

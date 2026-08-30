package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Group rows in the worksheet. */
public class PostGroupWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer firstIndex;
    private final Integer lastIndex;

    private Boolean hide;
    private String folder;
    private String storageName;

    public PostGroupWorksheetRowsRequest(String name, String sheetName, Integer firstIndex, Integer lastIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (firstIndex == null) throw new IllegalArgumentException("firstIndex is required");
        if (lastIndex == null) throw new IllegalArgumentException("lastIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.firstIndex = firstIndex;
        this.lastIndex = lastIndex;
    }

    public PostGroupWorksheetRowsRequest setHide(Boolean hide) { this.hide = hide; return this; }
    public PostGroupWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostGroupWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/group";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("firstIndex", String.valueOf(firstIndex));
        query.put("lastIndex", String.valueOf(lastIndex));
        if (hide != null) query.put("hide", String.valueOf(hide));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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

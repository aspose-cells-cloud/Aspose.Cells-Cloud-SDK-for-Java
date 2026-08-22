package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Ungroup rows in the worksheet. */
public class PostUngroupWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer firstIndex;
    private final Integer lastIndex;

    private Boolean isAll;
    private String folder;
    private String storageName;

    public PostUngroupWorksheetRowsRequest(String name, String sheetName, Integer firstIndex, Integer lastIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (firstIndex == null) throw new IllegalArgumentException("firstIndex is required");
        if (lastIndex == null) throw new IllegalArgumentException("lastIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.firstIndex = firstIndex;
        this.lastIndex = lastIndex;
    }

    public PostUngroupWorksheetRowsRequest setIsAll(Boolean isAll) { this.isAll = isAll; return this; }
    public PostUngroupWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUngroupWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/ungroup";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("firstIndex", String.valueOf(firstIndex));
        query.put("lastIndex", String.valueOf(lastIndex));
        if (isAll != null) query.put("isAll", String.valueOf(isAll));
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

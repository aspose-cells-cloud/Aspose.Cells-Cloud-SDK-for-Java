package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Range;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Unmerge merged cells within this range. */
public class PostWorksheetCellsRangeUnMergeRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Range range;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeUnMergeRequest(String name, String sheetName, Range range) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null) throw new IllegalArgumentException("range is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
    }

    public PostWorksheetCellsRangeUnMergeRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeUnMergeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/unmerge";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return range;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

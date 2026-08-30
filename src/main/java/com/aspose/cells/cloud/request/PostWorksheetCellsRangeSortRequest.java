package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.RangeSortRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Perform data sorting around a range of cells. */
public class PostWorksheetCellsRangeSortRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final RangeSortRequest rangeSortRequest;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeSortRequest(String name, String sheetName, RangeSortRequest rangeSortRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rangeSortRequest == null) throw new IllegalArgumentException("rangeSortRequest is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rangeSortRequest = rangeSortRequest;
    }

    public PostWorksheetCellsRangeSortRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeSortRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/sort";
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
        return rangeSortRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

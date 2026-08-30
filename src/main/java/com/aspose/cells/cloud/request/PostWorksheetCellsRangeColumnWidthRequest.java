package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Range;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set the column width of the specified range. */
public class PostWorksheetCellsRangeColumnWidthRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Range range;
    private final Double value;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeColumnWidthRequest(String name, String sheetName, Range range, Double value) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null) throw new IllegalArgumentException("range is required");
        if (value == null) throw new IllegalArgumentException("value is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.value = value;
    }

    public PostWorksheetCellsRangeColumnWidthRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeColumnWidthRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/columnWidth";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("value", String.valueOf(value));
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

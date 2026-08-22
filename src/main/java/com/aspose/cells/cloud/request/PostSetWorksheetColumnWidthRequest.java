package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set worksheet column width. */
public class PostSetWorksheetColumnWidthRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer columnIndex;
    private final Double width;

    private Integer count;
    private String folder;
    private String storageName;

    public PostSetWorksheetColumnWidthRequest(String name, String sheetName, Integer columnIndex, Double width) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (columnIndex == null) throw new IllegalArgumentException("columnIndex is required");
        if (width == null) throw new IllegalArgumentException("width is required");
        this.name = name;
        this.sheetName = sheetName;
        this.columnIndex = columnIndex;
        this.width = width;
    }

    public PostSetWorksheetColumnWidthRequest setCount(Integer count) { this.count = count; return this; }
    public PostSetWorksheetColumnWidthRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostSetWorksheetColumnWidthRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/columns/" + urlEncode(String.valueOf(columnIndex));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("width", String.valueOf(width));
        if (count != null) query.put("count", String.valueOf(count));
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

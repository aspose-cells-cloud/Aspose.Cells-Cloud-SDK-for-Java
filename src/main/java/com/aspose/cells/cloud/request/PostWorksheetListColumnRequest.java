package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ListColumn;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update list column in list object. */
public class PostWorksheetListColumnRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer listObjectIndex;
    private final Integer columnIndex;
    private final ListColumn listColumn;

    private String folder;
    private String storageName;

    public PostWorksheetListColumnRequest(String name, String sheetName, Integer listObjectIndex, Integer columnIndex, ListColumn listColumn) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (listObjectIndex == null) throw new IllegalArgumentException("listObjectIndex is required");
        if (columnIndex == null) throw new IllegalArgumentException("columnIndex is required");
        if (listColumn == null) throw new IllegalArgumentException("listColumn is required");
        this.name = name;
        this.sheetName = sheetName;
        this.listObjectIndex = listObjectIndex;
        this.columnIndex = columnIndex;
        this.listColumn = listColumn;
    }

    public PostWorksheetListColumnRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetListColumnRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/listobjects/" + urlEncode(String.valueOf(listObjectIndex)) + "/listcolumns/" + urlEncode(String.valueOf(columnIndex));
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
        return listColumn;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

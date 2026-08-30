package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set the value of the range in the worksheet. */
public class PostSetCellRangeValueRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String cellarea;
    private final String value;
    private final String type;

    private String folder;
    private String storageName;

    public PostSetCellRangeValueRequest(String name, String sheetName, String cellarea, String value, String type) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (cellarea == null || cellarea.isEmpty()) throw new IllegalArgumentException("cellarea is required");
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("value is required");
        if (type == null || type.isEmpty()) throw new IllegalArgumentException("type is required");
        this.name = name;
        this.sheetName = sheetName;
        this.cellarea = cellarea;
        this.value = value;
        this.type = type;
    }

    public PostSetCellRangeValueRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostSetCellRangeValueRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("cellarea", cellarea);
        query.put("value", value);
        query.put("type", type);
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

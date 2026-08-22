package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update height of rows in the worksheet. */
public class PostUpdateWorksheetRowRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer rowIndex;

    private Double height;
    private Integer count;
    private String folder;
    private String storageName;

    public PostUpdateWorksheetRowRequest(String name, String sheetName, Integer rowIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rowIndex == null) throw new IllegalArgumentException("rowIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rowIndex = rowIndex;
    }

    public PostUpdateWorksheetRowRequest setHeight(Double height) { this.height = height; return this; }
    public PostUpdateWorksheetRowRequest setCount(Integer count) { this.count = count; return this; }
    public PostUpdateWorksheetRowRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUpdateWorksheetRowRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/" + urlEncode(String.valueOf(rowIndex));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (height != null) query.put("height", String.valueOf(height));
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

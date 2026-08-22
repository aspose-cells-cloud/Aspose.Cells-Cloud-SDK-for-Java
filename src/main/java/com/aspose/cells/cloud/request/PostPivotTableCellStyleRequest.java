package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Style;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update cell style in the PivotTable. */
public class PostPivotTableCellStyleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final Integer column;
    private final Integer row;
    private final Style style;

    private Boolean needReCalculate;
    private String folder;
    private String storageName;

    public PostPivotTableCellStyleRequest(String name, String sheetName, Integer pivotTableIndex, Integer column, Integer row, Style style) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (column == null) throw new IllegalArgumentException("column is required");
        if (row == null) throw new IllegalArgumentException("row is required");
        if (style == null) throw new IllegalArgumentException("style is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.column = column;
        this.row = row;
        this.style = style;
    }

    public PostPivotTableCellStyleRequest setNeedReCalculate(Boolean needReCalculate) { this.needReCalculate = needReCalculate; return this; }
    public PostPivotTableCellStyleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostPivotTableCellStyleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/Format";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("column", String.valueOf(column));
        query.put("row", String.valueOf(row));
        if (needReCalculate != null) query.put("needReCalculate", String.valueOf(needReCalculate));
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
        return style;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Style;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update style in the PivotTable. */
public class PostPivotTableStyleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final Style style;

    private Boolean needReCalculate;
    private String folder;
    private String storageName;

    public PostPivotTableStyleRequest(String name, String sheetName, Integer pivotTableIndex, Style style) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (style == null) throw new IllegalArgumentException("style is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.style = style;
    }

    public PostPivotTableStyleRequest setNeedReCalculate(Boolean needReCalculate) { this.needReCalculate = needReCalculate; return this; }
    public PostPivotTableStyleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostPivotTableStyleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/FormatAll";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
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

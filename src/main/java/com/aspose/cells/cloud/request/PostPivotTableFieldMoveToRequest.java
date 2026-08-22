package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Move a pivot field in the PivotTable. */
public class PostPivotTableFieldMoveToRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final Integer fieldIndex;
    private final String from;
    private final String to;

    private String folder;
    private String storageName;

    public PostPivotTableFieldMoveToRequest(String name, String sheetName, Integer pivotTableIndex, Integer fieldIndex, String from, String to) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (from == null || from.isEmpty()) throw new IllegalArgumentException("from is required");
        if (to == null || to.isEmpty()) throw new IllegalArgumentException("to is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.fieldIndex = fieldIndex;
        this.from = from;
        this.to = to;
    }

    public PostPivotTableFieldMoveToRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostPivotTableFieldMoveToRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/PivotField/Move";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("from", from);
        query.put("to", to);
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

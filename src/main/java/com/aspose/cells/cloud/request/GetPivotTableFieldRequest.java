package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve descriptions of pivot fields in the PivotTable. */
public class GetPivotTableFieldRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final Integer pivotFieldIndex;
    private final String pivotFieldType;

    private String folder;
    private String storageName;

    public GetPivotTableFieldRequest(String name, String sheetName, Integer pivotTableIndex, Integer pivotFieldIndex, String pivotFieldType) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (pivotFieldIndex == null) throw new IllegalArgumentException("pivotFieldIndex is required");
        if (pivotFieldType == null || pivotFieldType.isEmpty()) throw new IllegalArgumentException("pivotFieldType is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.pivotFieldIndex = pivotFieldIndex;
        this.pivotFieldType = pivotFieldType;
    }

    public GetPivotTableFieldRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetPivotTableFieldRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/PivotField";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("pivotFieldIndex", String.valueOf(pivotFieldIndex));
        query.put("pivotFieldType", pivotFieldType);
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

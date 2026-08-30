package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.PivotTableFieldRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a pivot field in the PivotTable. */
public class PutPivotTableFieldRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final String pivotFieldType;
    private final PivotTableFieldRequest pivotTableFieldRequest;

    private Boolean needReCalculate;
    private String folder;
    private String storageName;

    public PutPivotTableFieldRequest(String name, String sheetName, Integer pivotTableIndex, String pivotFieldType, PivotTableFieldRequest pivotTableFieldRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (pivotFieldType == null || pivotFieldType.isEmpty()) throw new IllegalArgumentException("pivotFieldType is required");
        if (pivotTableFieldRequest == null) throw new IllegalArgumentException("pivotTableFieldRequest is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.pivotFieldType = pivotFieldType;
        this.pivotTableFieldRequest = pivotTableFieldRequest;
    }

    public PutPivotTableFieldRequest setNeedReCalculate(Boolean needReCalculate) { this.needReCalculate = needReCalculate; return this; }
    public PutPivotTableFieldRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutPivotTableFieldRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/PivotField";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("pivotFieldType", pivotFieldType);
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
        return pivotTableFieldRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

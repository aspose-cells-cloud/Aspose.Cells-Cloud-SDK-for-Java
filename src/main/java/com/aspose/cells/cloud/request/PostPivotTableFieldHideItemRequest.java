package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Hide a pivot field item in the PivotTable. */
public class PostPivotTableFieldHideItemRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final String pivotFieldType;
    private final Integer fieldIndex;
    private final Integer itemIndex;
    private final Boolean isHide;

    private Boolean needReCalculate;
    private String folder;
    private String storageName;

    public PostPivotTableFieldHideItemRequest(String name, String sheetName, Integer pivotTableIndex, String pivotFieldType, Integer fieldIndex, Integer itemIndex, Boolean isHide) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (pivotFieldType == null || pivotFieldType.isEmpty()) throw new IllegalArgumentException("pivotFieldType is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (itemIndex == null) throw new IllegalArgumentException("itemIndex is required");
        if (isHide == null) throw new IllegalArgumentException("isHide is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.pivotFieldType = pivotFieldType;
        this.fieldIndex = fieldIndex;
        this.itemIndex = itemIndex;
        this.isHide = isHide;
    }

    public PostPivotTableFieldHideItemRequest setNeedReCalculate(Boolean needReCalculate) { this.needReCalculate = needReCalculate; return this; }
    public PostPivotTableFieldHideItemRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostPivotTableFieldHideItemRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/PivotField/Hide";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("pivotFieldType", pivotFieldType);
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("itemIndex", String.valueOf(itemIndex));
        query.put("isHide", String.valueOf(isHide));
        if (needReCalculate != null) query.put("needReCalculate", String.valueOf(needReCalculate));
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

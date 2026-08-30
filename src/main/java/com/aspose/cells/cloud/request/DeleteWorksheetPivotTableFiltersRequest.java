package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete all pivot filters in the PivotTable. */
public class DeleteWorksheetPivotTableFiltersRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;

    private Boolean needReCalculate;
    private String folder;
    private String storageName;

    public DeleteWorksheetPivotTableFiltersRequest(String name, String sheetName, Integer pivotTableIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
    }

    public DeleteWorksheetPivotTableFiltersRequest setNeedReCalculate(Boolean needReCalculate) { this.needReCalculate = needReCalculate; return this; }
    public DeleteWorksheetPivotTableFiltersRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetPivotTableFiltersRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/PivotFilters";
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

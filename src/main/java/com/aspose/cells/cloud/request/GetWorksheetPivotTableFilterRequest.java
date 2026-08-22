package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve PivotTable filters in the worksheet. */
public class GetWorksheetPivotTableFilterRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;
    private final Integer filterIndex;

    private String folder;
    private String storageName;

    public GetWorksheetPivotTableFilterRequest(String name, String sheetName, Integer pivotTableIndex, Integer filterIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        if (filterIndex == null) throw new IllegalArgumentException("filterIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
        this.filterIndex = filterIndex;
    }

    public GetWorksheetPivotTableFilterRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetPivotTableFilterRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/PivotFilters/" + urlEncode(String.valueOf(filterIndex));
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

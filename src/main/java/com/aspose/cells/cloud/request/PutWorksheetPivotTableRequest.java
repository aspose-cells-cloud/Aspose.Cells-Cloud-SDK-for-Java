package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a PivotTable in the worksheet. */
public class PutWorksheetPivotTableRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String folder;
    private String sourceData;
    private String destCellName;
    private String tableName;
    private Boolean useSameSource;
    private String storageName;

    public PutWorksheetPivotTableRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutWorksheetPivotTableRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetPivotTableRequest setSourceData(String sourceData) { this.sourceData = sourceData; return this; }
    public PutWorksheetPivotTableRequest setDestCellName(String destCellName) { this.destCellName = destCellName; return this; }
    public PutWorksheetPivotTableRequest setTableName(String tableName) { this.tableName = tableName; return this; }
    public PutWorksheetPivotTableRequest setUseSameSource(Boolean useSameSource) { this.useSameSource = useSameSource; return this; }
    public PutWorksheetPivotTableRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (sourceData != null && !sourceData.isEmpty()) query.put("sourceData", sourceData);
        if (destCellName != null && !destCellName.isEmpty()) query.put("destCellName", destCellName);
        if (tableName != null && !tableName.isEmpty()) query.put("tableName", tableName);
        if (useSameSource != null) query.put("useSameSource", String.valueOf(useSameSource));
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

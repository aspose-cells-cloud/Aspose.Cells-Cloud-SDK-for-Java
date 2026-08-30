package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Move PivotTable in the worksheet. */
public class PostWorksheetPivotTableMoveRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pivotTableIndex;

    private Integer row;
    private Integer column;
    private String destCellName;
    private String folder;
    private String storageName;

    public PostWorksheetPivotTableMoveRequest(String name, String sheetName, Integer pivotTableIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pivotTableIndex == null) throw new IllegalArgumentException("pivotTableIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pivotTableIndex = pivotTableIndex;
    }

    public PostWorksheetPivotTableMoveRequest setRow(Integer row) { this.row = row; return this; }
    public PostWorksheetPivotTableMoveRequest setColumn(Integer column) { this.column = column; return this; }
    public PostWorksheetPivotTableMoveRequest setDestCellName(String destCellName) { this.destCellName = destCellName; return this; }
    public PostWorksheetPivotTableMoveRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetPivotTableMoveRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pivottables/" + urlEncode(String.valueOf(pivotTableIndex)) + "/Move";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (row != null) query.put("row", String.valueOf(row));
        if (column != null) query.put("column", String.valueOf(column));
        if (destCellName != null && !destCellName.isEmpty()) query.put("destCellName", destCellName);
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

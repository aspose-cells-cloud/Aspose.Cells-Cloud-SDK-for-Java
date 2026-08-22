package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve the values of cells within the specified range. */
public class GetWorksheetCellsRangeValueRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String namerange;
    private Integer firstRow;
    private Integer firstColumn;
    private Integer rowCount;
    private Integer columnCount;
    private String folder;
    private String storageName;

    public GetWorksheetCellsRangeValueRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public GetWorksheetCellsRangeValueRequest setNamerange(String namerange) { this.namerange = namerange; return this; }
    public GetWorksheetCellsRangeValueRequest setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }
    public GetWorksheetCellsRangeValueRequest setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }
    public GetWorksheetCellsRangeValueRequest setRowCount(Integer rowCount) { this.rowCount = rowCount; return this; }
    public GetWorksheetCellsRangeValueRequest setColumnCount(Integer columnCount) { this.columnCount = columnCount; return this; }
    public GetWorksheetCellsRangeValueRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetCellsRangeValueRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/value";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (namerange != null && !namerange.isEmpty()) query.put("namerange", namerange);
        if (firstRow != null) query.put("firstRow", String.valueOf(firstRow));
        if (firstColumn != null) query.put("firstColumn", String.valueOf(firstColumn));
        if (rowCount != null) query.put("rowCount", String.valueOf(rowCount));
        if (columnCount != null) query.put("columnCount", String.valueOf(columnCount));
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

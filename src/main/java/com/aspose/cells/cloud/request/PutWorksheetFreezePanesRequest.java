package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set freeze panes in the worksheet. */
public class PutWorksheetFreezePanesRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer row;
    private final Integer column;
    private final Integer freezedRows;
    private final Integer freezedColumns;

    private String folder;
    private String storageName;

    public PutWorksheetFreezePanesRequest(String name, String sheetName, Integer row, Integer column, Integer freezedRows, Integer freezedColumns) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (row == null) throw new IllegalArgumentException("row is required");
        if (column == null) throw new IllegalArgumentException("column is required");
        if (freezedRows == null) throw new IllegalArgumentException("freezedRows is required");
        if (freezedColumns == null) throw new IllegalArgumentException("freezedColumns is required");
        this.name = name;
        this.sheetName = sheetName;
        this.row = row;
        this.column = column;
        this.freezedRows = freezedRows;
        this.freezedColumns = freezedColumns;
    }

    public PutWorksheetFreezePanesRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetFreezePanesRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/freezepanes";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("row", String.valueOf(row));
        query.put("column", String.valueOf(column));
        query.put("freezedRows", String.valueOf(freezedRows));
        query.put("freezedColumns", String.valueOf(freezedColumns));
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

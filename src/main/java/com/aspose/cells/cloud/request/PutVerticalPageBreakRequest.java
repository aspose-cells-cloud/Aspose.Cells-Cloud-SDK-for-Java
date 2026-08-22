package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a vertical page break in the worksheet. */
public class PutVerticalPageBreakRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String cellname;
    private Integer column;
    private Integer row;
    private Integer startRow;
    private Integer endRow;
    private String folder;
    private String storageName;

    public PutVerticalPageBreakRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutVerticalPageBreakRequest setCellname(String cellname) { this.cellname = cellname; return this; }
    public PutVerticalPageBreakRequest setColumn(Integer column) { this.column = column; return this; }
    public PutVerticalPageBreakRequest setRow(Integer row) { this.row = row; return this; }
    public PutVerticalPageBreakRequest setStartRow(Integer startRow) { this.startRow = startRow; return this; }
    public PutVerticalPageBreakRequest setEndRow(Integer endRow) { this.endRow = endRow; return this; }
    public PutVerticalPageBreakRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutVerticalPageBreakRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/verticalpagebreaks";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (cellname != null && !cellname.isEmpty()) query.put("cellname", cellname);
        if (column != null) query.put("column", String.valueOf(column));
        if (row != null) query.put("row", String.valueOf(row));
        if (startRow != null) query.put("startRow", String.valueOf(startRow));
        if (endRow != null) query.put("endRow", String.valueOf(endRow));
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

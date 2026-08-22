package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a horizontal page breaks in the worksheet. */
public class PutHorizontalPageBreakRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String cellname;
    private Integer row;
    private Integer column;
    private Integer startColumn;
    private Integer endColumn;
    private String folder;
    private String storageName;

    public PutHorizontalPageBreakRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutHorizontalPageBreakRequest setCellname(String cellname) { this.cellname = cellname; return this; }
    public PutHorizontalPageBreakRequest setRow(Integer row) { this.row = row; return this; }
    public PutHorizontalPageBreakRequest setColumn(Integer column) { this.column = column; return this; }
    public PutHorizontalPageBreakRequest setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }
    public PutHorizontalPageBreakRequest setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }
    public PutHorizontalPageBreakRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutHorizontalPageBreakRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/horizontalpagebreaks";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (cellname != null && !cellname.isEmpty()) query.put("cellname", cellname);
        if (row != null) query.put("row", String.valueOf(row));
        if (column != null) query.put("column", String.valueOf(column));
        if (startColumn != null) query.put("startColumn", String.valueOf(startColumn));
        if (endColumn != null) query.put("endColumn", String.valueOf(endColumn));
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

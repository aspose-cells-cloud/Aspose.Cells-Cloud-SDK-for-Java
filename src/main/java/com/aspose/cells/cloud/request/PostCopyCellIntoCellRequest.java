package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Copy data from a source cell to a destination cell in the worksheet. */
public class PostCopyCellIntoCellRequest implements RequestOption {
    private final String name;
    private final String destCellName;
    private final String sheetName;
    private final String worksheet;

    private String cellname;
    private Integer row;
    private Integer column;
    private String folder;
    private String storageName;

    public PostCopyCellIntoCellRequest(String name, String destCellName, String sheetName, String worksheet) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (destCellName == null || destCellName.isEmpty()) throw new IllegalArgumentException("destCellName is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        this.name = name;
        this.destCellName = destCellName;
        this.sheetName = sheetName;
        this.worksheet = worksheet;
    }

    public PostCopyCellIntoCellRequest setCellname(String cellname) { this.cellname = cellname; return this; }
    public PostCopyCellIntoCellRequest setRow(Integer row) { this.row = row; return this; }
    public PostCopyCellIntoCellRequest setColumn(Integer column) { this.column = column; return this; }
    public PostCopyCellIntoCellRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostCopyCellIntoCellRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/" + urlEncode(destCellName) + "/copy";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet", worksheet);
        if (cellname != null && !cellname.isEmpty()) query.put("cellname", cellname);
        if (row != null) query.put("row", String.valueOf(row));
        if (column != null) query.put("column", String.valueOf(column));
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Remove cell area from conditional formatting. */
public class DeleteWorksheetConditionalFormattingAreaRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer startRow;
    private final Integer startColumn;
    private final Integer totalRows;
    private final Integer totalColumns;

    private String folder;
    private String storageName;

    public DeleteWorksheetConditionalFormattingAreaRequest(String name, String sheetName, Integer startRow, Integer startColumn, Integer totalRows, Integer totalColumns) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (startRow == null) throw new IllegalArgumentException("startRow is required");
        if (startColumn == null) throw new IllegalArgumentException("startColumn is required");
        if (totalRows == null) throw new IllegalArgumentException("totalRows is required");
        if (totalColumns == null) throw new IllegalArgumentException("totalColumns is required");
        this.name = name;
        this.sheetName = sheetName;
        this.startRow = startRow;
        this.startColumn = startColumn;
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
    }

    public DeleteWorksheetConditionalFormattingAreaRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetConditionalFormattingAreaRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/conditionalFormattings/area";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("startRow", String.valueOf(startRow));
        query.put("startColumn", String.valueOf(startColumn));
        query.put("totalRows", String.valueOf(totalRows));
        query.put("totalColumns", String.valueOf(totalColumns));
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

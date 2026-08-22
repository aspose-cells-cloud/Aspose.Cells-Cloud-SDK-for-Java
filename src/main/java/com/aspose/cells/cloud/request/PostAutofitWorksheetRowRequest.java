package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Autofit a row in the worksheet. */
public class PostAutofitWorksheetRowRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer rowIndex;

    private Integer firstColumn;
    private Integer lastColumn;
    private String folder;
    private String storageName;
    private Integer rowCount;

    public PostAutofitWorksheetRowRequest(String name, String sheetName, Integer rowIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rowIndex == null) throw new IllegalArgumentException("rowIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rowIndex = rowIndex;
    }

    public PostAutofitWorksheetRowRequest setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }
    public PostAutofitWorksheetRowRequest setLastColumn(Integer lastColumn) { this.lastColumn = lastColumn; return this; }
    public PostAutofitWorksheetRowRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostAutofitWorksheetRowRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostAutofitWorksheetRowRequest setRowCount(Integer rowCount) { this.rowCount = rowCount; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autofitrow";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("rowIndex", String.valueOf(rowIndex));
        if (firstColumn != null) query.put("firstColumn", String.valueOf(firstColumn));
        if (lastColumn != null) query.put("lastColumn", String.valueOf(lastColumn));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (rowCount != null) query.put("rowCount", String.valueOf(rowCount));
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

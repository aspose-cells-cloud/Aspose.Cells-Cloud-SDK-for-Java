package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a ListObject in the worksheet. */
public class PutWorksheetListObjectRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Integer startRow;
    private Integer startColumn;
    private Integer endRow;
    private Integer endColumn;
    private String folder;
    private Boolean hasHeaders;
    private String displayName;
    private Boolean showTotals;
    private String storageName;

    public PutWorksheetListObjectRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutWorksheetListObjectRequest setStartRow(Integer startRow) { this.startRow = startRow; return this; }
    public PutWorksheetListObjectRequest setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }
    public PutWorksheetListObjectRequest setEndRow(Integer endRow) { this.endRow = endRow; return this; }
    public PutWorksheetListObjectRequest setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }
    public PutWorksheetListObjectRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetListObjectRequest setHasHeaders(Boolean hasHeaders) { this.hasHeaders = hasHeaders; return this; }
    public PutWorksheetListObjectRequest setDisplayName(String displayName) { this.displayName = displayName; return this; }
    public PutWorksheetListObjectRequest setShowTotals(Boolean showTotals) { this.showTotals = showTotals; return this; }
    public PutWorksheetListObjectRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/listobjects";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (startRow != null) query.put("startRow", String.valueOf(startRow));
        if (startColumn != null) query.put("startColumn", String.valueOf(startColumn));
        if (endRow != null) query.put("endRow", String.valueOf(endRow));
        if (endColumn != null) query.put("endColumn", String.valueOf(endColumn));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (hasHeaders != null) query.put("hasHeaders", String.valueOf(hasHeaders));
        if (displayName != null && !displayName.isEmpty()) query.put("displayName", displayName);
        if (showTotals != null) query.put("showTotals", String.valueOf(showTotals));
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

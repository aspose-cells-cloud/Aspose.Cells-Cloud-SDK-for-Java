package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Unhide rows in the worksheet. */
public class PostUnhideWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer startrow;
    private final Integer totalRows;

    private Double height;
    private String folder;
    private String storageName;

    public PostUnhideWorksheetRowsRequest(String name, String sheetName, Integer startrow, Integer totalRows) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (startrow == null) throw new IllegalArgumentException("startrow is required");
        if (totalRows == null) throw new IllegalArgumentException("totalRows is required");
        this.name = name;
        this.sheetName = sheetName;
        this.startrow = startrow;
        this.totalRows = totalRows;
    }

    public PostUnhideWorksheetRowsRequest setHeight(Double height) { this.height = height; return this; }
    public PostUnhideWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUnhideWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/unhide";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("startrow", String.valueOf(startrow));
        query.put("totalRows", String.valueOf(totalRows));
        if (height != null) query.put("height", String.valueOf(height));
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

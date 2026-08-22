package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete several rows in the worksheet. */
public class DeleteWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer startrow;

    private Integer totalRows;
    private Boolean updateReference;
    private String folder;
    private String storageName;

    public DeleteWorksheetRowsRequest(String name, String sheetName, Integer startrow) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (startrow == null) throw new IllegalArgumentException("startrow is required");
        this.name = name;
        this.sheetName = sheetName;
        this.startrow = startrow;
    }

    public DeleteWorksheetRowsRequest setTotalRows(Integer totalRows) { this.totalRows = totalRows; return this; }
    public DeleteWorksheetRowsRequest setUpdateReference(Boolean updateReference) { this.updateReference = updateReference; return this; }
    public DeleteWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("startrow", String.valueOf(startrow));
        if (totalRows != null) query.put("totalRows", String.valueOf(totalRows));
        if (updateReference != null) query.put("updateReference", String.valueOf(updateReference));
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Insert worksheet columns in the worksheet. */
public class PutInsertWorksheetColumnsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer columnIndex;
    private final Integer columns;

    private Boolean updateReference;
    private String folder;
    private String storageName;

    public PutInsertWorksheetColumnsRequest(String name, String sheetName, Integer columnIndex, Integer columns) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (columnIndex == null) throw new IllegalArgumentException("columnIndex is required");
        if (columns == null) throw new IllegalArgumentException("columns is required");
        this.name = name;
        this.sheetName = sheetName;
        this.columnIndex = columnIndex;
        this.columns = columns;
    }

    public PutInsertWorksheetColumnsRequest setUpdateReference(Boolean updateReference) { this.updateReference = updateReference; return this; }
    public PutInsertWorksheetColumnsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutInsertWorksheetColumnsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/columns/" + urlEncode(String.valueOf(columnIndex));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("columns", String.valueOf(columns));
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete a filter for a column in the worksheet. */
public class DeleteWorksheetFilterRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer fieldIndex;

    private String criteria;
    private String folder;
    private String storageName;

    public DeleteWorksheetFilterRequest(String name, String sheetName, Integer fieldIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.fieldIndex = fieldIndex;
    }

    public DeleteWorksheetFilterRequest setCriteria(String criteria) { this.criteria = criteria; return this; }
    public DeleteWorksheetFilterRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetFilterRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/filter";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("fieldIndex", String.valueOf(fieldIndex));
        if (criteria != null && !criteria.isEmpty()) query.put("criteria", criteria);
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

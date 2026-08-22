package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a filter for a column in the worksheet. */
public class PutWorksheetFilterRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final Integer fieldIndex;
    private final String criteria;

    private Boolean matchBlanks;
    private Boolean refresh;
    private String folder;
    private String storageName;

    public PutWorksheetFilterRequest(String name, String sheetName, String range, Integer fieldIndex, String criteria) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (criteria == null || criteria.isEmpty()) throw new IllegalArgumentException("criteria is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.fieldIndex = fieldIndex;
        this.criteria = criteria;
    }

    public PutWorksheetFilterRequest setMatchBlanks(Boolean matchBlanks) { this.matchBlanks = matchBlanks; return this; }
    public PutWorksheetFilterRequest setRefresh(Boolean refresh) { this.refresh = refresh; return this; }
    public PutWorksheetFilterRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetFilterRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/filter";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("criteria", criteria);
        if (matchBlanks != null) query.put("matchBlanks", String.valueOf(matchBlanks));
        if (refresh != null) query.put("refresh", String.valueOf(refresh));
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

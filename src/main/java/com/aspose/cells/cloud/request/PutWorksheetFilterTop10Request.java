package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Filter the top 10 items in the list in the worksheet. */
public class PutWorksheetFilterTop10Request implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final Integer fieldIndex;
    private final Boolean isTop;
    private final Boolean isPercent;
    private final Integer itemCount;

    private Boolean matchBlanks;
    private Boolean refresh;
    private String folder;
    private String storageName;

    public PutWorksheetFilterTop10Request(String name, String sheetName, String range, Integer fieldIndex, Boolean isTop, Boolean isPercent, Integer itemCount) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (isTop == null) throw new IllegalArgumentException("isTop is required");
        if (isPercent == null) throw new IllegalArgumentException("isPercent is required");
        if (itemCount == null) throw new IllegalArgumentException("itemCount is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.fieldIndex = fieldIndex;
        this.isTop = isTop;
        this.isPercent = isPercent;
        this.itemCount = itemCount;
    }

    public PutWorksheetFilterTop10Request setMatchBlanks(Boolean matchBlanks) { this.matchBlanks = matchBlanks; return this; }
    public PutWorksheetFilterTop10Request setRefresh(Boolean refresh) { this.refresh = refresh; return this; }
    public PutWorksheetFilterTop10Request setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetFilterTop10Request setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/filterTop10";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("isTop", String.valueOf(isTop));
        query.put("isPercent", String.valueOf(isPercent));
        query.put("itemCount", String.valueOf(itemCount));
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

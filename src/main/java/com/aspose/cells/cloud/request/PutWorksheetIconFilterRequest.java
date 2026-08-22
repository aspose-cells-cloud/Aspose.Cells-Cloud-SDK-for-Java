package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add an icon filter in the worksheet. */
public class PutWorksheetIconFilterRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final Integer fieldIndex;
    private final String iconSetType;
    private final Integer iconId;

    private Boolean matchBlanks;
    private Boolean refresh;
    private String folder;
    private String storageName;

    public PutWorksheetIconFilterRequest(String name, String sheetName, String range, Integer fieldIndex, String iconSetType, Integer iconId) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (iconSetType == null || iconSetType.isEmpty()) throw new IllegalArgumentException("iconSetType is required");
        if (iconId == null) throw new IllegalArgumentException("iconId is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.fieldIndex = fieldIndex;
        this.iconSetType = iconSetType;
        this.iconId = iconId;
    }

    public PutWorksheetIconFilterRequest setMatchBlanks(Boolean matchBlanks) { this.matchBlanks = matchBlanks; return this; }
    public PutWorksheetIconFilterRequest setRefresh(Boolean refresh) { this.refresh = refresh; return this; }
    public PutWorksheetIconFilterRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetIconFilterRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/iconFilter";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("iconSetType", iconSetType);
        query.put("iconId", String.valueOf(iconId));
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a sparkline group in the worksheet. */
public class PutWorksheetSparklineGroupRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String type;
    private final String dataRange;
    private final Boolean isVertical;
    private final String locationRange;

    private String folder;
    private String storageName;

    public PutWorksheetSparklineGroupRequest(String name, String sheetName, String type, String dataRange, Boolean isVertical, String locationRange) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (type == null || type.isEmpty()) throw new IllegalArgumentException("type is required");
        if (dataRange == null || dataRange.isEmpty()) throw new IllegalArgumentException("dataRange is required");
        if (isVertical == null) throw new IllegalArgumentException("isVertical is required");
        if (locationRange == null || locationRange.isEmpty()) throw new IllegalArgumentException("locationRange is required");
        this.name = name;
        this.sheetName = sheetName;
        this.type = type;
        this.dataRange = dataRange;
        this.isVertical = isVertical;
        this.locationRange = locationRange;
    }

    public PutWorksheetSparklineGroupRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetSparklineGroupRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/sparklineGroups";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("type", type);
        query.put("dataRange", dataRange);
        query.put("isVertical", String.valueOf(isVertical));
        query.put("locationRange", locationRange);
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

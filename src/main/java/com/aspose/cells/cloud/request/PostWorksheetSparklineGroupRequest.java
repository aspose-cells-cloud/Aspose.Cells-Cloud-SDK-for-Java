package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.SparklineGroup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update a sparkline group in the worksheet. */
public class PostWorksheetSparklineGroupRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer sparklineGroupIndex;
    private final SparklineGroup sparklineGroup;

    private String folder;
    private String storageName;

    public PostWorksheetSparklineGroupRequest(String name, String sheetName, Integer sparklineGroupIndex, SparklineGroup sparklineGroup) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (sparklineGroupIndex == null) throw new IllegalArgumentException("sparklineGroupIndex is required");
        if (sparklineGroup == null) throw new IllegalArgumentException("sparklineGroup is required");
        this.name = name;
        this.sheetName = sheetName;
        this.sparklineGroupIndex = sparklineGroupIndex;
        this.sparklineGroup = sparklineGroup;
    }

    public PostWorksheetSparklineGroupRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetSparklineGroupRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/sparklineGroups/" + urlEncode(String.valueOf(sparklineGroupIndex));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return sparklineGroup;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

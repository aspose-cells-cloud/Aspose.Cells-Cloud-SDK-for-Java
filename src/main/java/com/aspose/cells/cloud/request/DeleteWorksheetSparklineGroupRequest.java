package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete a sparkline group in the worksheet. */
public class DeleteWorksheetSparklineGroupRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer sparklineIndex;

    private String folder;
    private String storageName;

    public DeleteWorksheetSparklineGroupRequest(String name, String sheetName, Integer sparklineIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (sparklineIndex == null) throw new IllegalArgumentException("sparklineIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.sparklineIndex = sparklineIndex;
    }

    public DeleteWorksheetSparklineGroupRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetSparklineGroupRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/sparklineGroups/" + urlEncode(String.valueOf(sparklineIndex));
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

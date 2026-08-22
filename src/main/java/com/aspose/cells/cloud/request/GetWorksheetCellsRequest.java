package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve cell descriptions in a specified format. */
public class GetWorksheetCellsRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Integer offest;
    private Integer count;
    private String folder;
    private String storageName;

    public GetWorksheetCellsRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public GetWorksheetCellsRequest setOffest(Integer offest) { this.offest = offest; return this; }
    public GetWorksheetCellsRequest setCount(Integer count) { this.count = count; return this; }
    public GetWorksheetCellsRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetCellsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (offest != null) query.put("offest", String.valueOf(offest));
        if (count != null) query.put("count", String.valueOf(count));
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

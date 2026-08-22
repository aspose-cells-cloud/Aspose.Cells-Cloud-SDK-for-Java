package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve descriptions of rows in the worksheet. */
public class GetWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Integer offset;
    private Integer count;
    private String folder;
    private String storageName;

    public GetWorksheetRowsRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public GetWorksheetRowsRequest setOffset(Integer offset) { this.offset = offset; return this; }
    public GetWorksheetRowsRequest setCount(Integer count) { this.count = count; return this; }
    public GetWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (offset != null) query.put("offset", String.valueOf(offset));
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

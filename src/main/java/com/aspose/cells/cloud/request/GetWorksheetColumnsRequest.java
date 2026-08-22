package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve descriptions of worksheet columns. */
public class GetWorksheetColumnsRequest implements RequestOption {
    private String name;
    private String sheetName;
    private Integer offset;
    private Integer count;
    private String folder;
    private String storageName;

    public GetWorksheetColumnsRequest setName(String name) { this.name = name; return this; }
    public GetWorksheetColumnsRequest setSheetName(String sheetName) { this.sheetName = sheetName; return this; }
    public GetWorksheetColumnsRequest setOffset(Integer offset) { this.offset = offset; return this; }
    public GetWorksheetColumnsRequest setCount(Integer count) { this.count = count; return this; }
    public GetWorksheetColumnsRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetColumnsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/columns/";
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve values in range. */
public class GetNamedRangeValueRequest implements RequestOption {
    private final String name;
    private final String namerange;

    private String folder;
    private String storageName;

    public GetNamedRangeValueRequest(String name, String namerange) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (namerange == null || namerange.isEmpty()) throw new IllegalArgumentException("namerange is required");
        this.name = name;
        this.namerange = namerange;
    }

    public GetNamedRangeValueRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetNamedRangeValueRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/ranges/" + urlEncode(namerange) + "/value";
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

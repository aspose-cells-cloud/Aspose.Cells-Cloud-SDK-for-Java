package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve descriptions of Excel file properties. */
public class GetDocumentPropertiesRequest implements RequestOption {
    private final String name;

    private String type;
    private String folder;
    private String storageName;

    public GetDocumentPropertiesRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public GetDocumentPropertiesRequest setType(String type) { this.type = type; return this; }
    public GetDocumentPropertiesRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetDocumentPropertiesRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/documentproperties";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (type != null && !type.isEmpty()) query.put("type", type);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Get Excel property by name. */
public class GetDocumentPropertyRequest implements RequestOption {
    private final String name;
    private final String propertyName;

    private String folder;
    private String storageName;

    public GetDocumentPropertyRequest(String name, String propertyName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (propertyName == null || propertyName.isEmpty()) throw new IllegalArgumentException("propertyName is required");
        this.name = name;
        this.propertyName = propertyName;
    }

    public GetDocumentPropertyRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetDocumentPropertyRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/documentproperties/" + urlEncode(propertyName);
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

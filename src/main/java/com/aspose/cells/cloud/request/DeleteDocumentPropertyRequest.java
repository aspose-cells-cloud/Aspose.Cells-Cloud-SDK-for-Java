package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete an Excel property. */
public class DeleteDocumentPropertyRequest implements RequestOption {
    private final String name;
    private final String propertyName;

    private String type;
    private String folder;
    private String storageName;

    public DeleteDocumentPropertyRequest(String name, String propertyName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (propertyName == null || propertyName.isEmpty()) throw new IllegalArgumentException("propertyName is required");
        this.name = name;
        this.propertyName = propertyName;
    }

    public DeleteDocumentPropertyRequest setType(String type) { this.type = type; return this; }
    public DeleteDocumentPropertyRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteDocumentPropertyRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/documentproperties/" + urlEncode(propertyName);
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

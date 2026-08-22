package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CellsDocumentProperty;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set or add an Excel property. */
public class PutDocumentPropertyRequest implements RequestOption {
    private final String name;
    private final CellsDocumentProperty property;

    private String folder;
    private String storageName;

    public PutDocumentPropertyRequest(String name, CellsDocumentProperty property) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (property == null) throw new IllegalArgumentException("property is required");
        this.name = name;
        this.property = property;
    }

    public PutDocumentPropertyRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutDocumentPropertyRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/documentproperties";
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
        return property;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

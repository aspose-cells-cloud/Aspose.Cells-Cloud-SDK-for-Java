package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Name;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Define a new name in the workbook. */
public class PutWorkbookNameRequest implements RequestOption {
    private final String name;
    private final Name newName;

    private String folder;
    private String storageName;

    public PutWorkbookNameRequest(String name, Name newName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (newName == null) throw new IllegalArgumentException("newName is required");
        this.name = name;
        this.newName = newName;
    }

    public PutWorkbookNameRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorkbookNameRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/names";
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
        return newName;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

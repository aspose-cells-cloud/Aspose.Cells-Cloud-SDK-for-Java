package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Name;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update a named range in the workbook. */
public class PostWorkbookNameRequest implements RequestOption {
    private final String name;
    private final String nameName;
    private final Name newName;

    private String folder;
    private String storageName;

    public PostWorkbookNameRequest(String name, String nameName, Name newName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (nameName == null || nameName.isEmpty()) throw new IllegalArgumentException("nameName is required");
        if (newName == null) throw new IllegalArgumentException("newName is required");
        this.name = name;
        this.nameName = nameName;
        this.newName = newName;
    }

    public PostWorkbookNameRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookNameRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/names/" + urlEncode(nameName);
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

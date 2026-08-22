package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve description of a named range in the workbook. */
public class GetWorkbookNameRequest implements RequestOption {
    private final String name;
    private final String nameName;

    private String folder;
    private String storageName;

    public GetWorkbookNameRequest(String name, String nameName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (nameName == null || nameName.isEmpty()) throw new IllegalArgumentException("nameName is required");
        this.name = name;
        this.nameName = nameName;
    }

    public GetWorkbookNameRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorkbookNameRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

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

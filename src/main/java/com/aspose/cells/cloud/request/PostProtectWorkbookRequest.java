package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ProtectWorkbookRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Excel protection. */
public class PostProtectWorkbookRequest implements RequestOption {
    private final String name;
    private final ProtectWorkbookRequest protectWorkbookRequest;

    private String folder;
    private String storageName;

    public PostProtectWorkbookRequest(String name, ProtectWorkbookRequest protectWorkbookRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (protectWorkbookRequest == null) throw new IllegalArgumentException("protectWorkbookRequest is required");
        this.name = name;
        this.protectWorkbookRequest = protectWorkbookRequest;
    }

    public PostProtectWorkbookRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostProtectWorkbookRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/protection";
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
        return protectWorkbookRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

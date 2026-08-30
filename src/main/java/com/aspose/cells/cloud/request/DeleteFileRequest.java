package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** DeleteFile request. */
public class DeleteFileRequest implements RequestOption {
    private final String path;

    private String storageName;
    private String versionId;

    public DeleteFileRequest(String path) {
        if (path == null || path.isEmpty()) throw new IllegalArgumentException("path is required");
        this.path = path;
    }

    public DeleteFileRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public DeleteFileRequest setVersionId(String versionId) { this.versionId = versionId; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/storage/file/" + urlEncode(path);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (versionId != null && !versionId.isEmpty()) query.put("versionId", versionId);
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

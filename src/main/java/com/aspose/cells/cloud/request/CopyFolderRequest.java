package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** CopyFolder request. */
public class CopyFolderRequest implements RequestOption {
    private final String srcPath;
    private final String destPath;

    private String srcStorageName;
    private String destStorageName;

    public CopyFolderRequest(String srcPath, String destPath) {
        if (srcPath == null || srcPath.isEmpty()) throw new IllegalArgumentException("srcPath is required");
        if (destPath == null || destPath.isEmpty()) throw new IllegalArgumentException("destPath is required");
        this.srcPath = srcPath;
        this.destPath = destPath;
    }

    public CopyFolderRequest setSrcStorageName(String srcStorageName) { this.srcStorageName = srcStorageName; return this; }
    public CopyFolderRequest setDestStorageName(String destStorageName) { this.destStorageName = destStorageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/storage/folder/copy/" + urlEncode(srcPath);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("destPath", destPath);
        if (srcStorageName != null && !srcStorageName.isEmpty()) query.put("srcStorageName", srcStorageName);
        if (destStorageName != null && !destStorageName.isEmpty()) query.put("destStorageName", destStorageName);
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

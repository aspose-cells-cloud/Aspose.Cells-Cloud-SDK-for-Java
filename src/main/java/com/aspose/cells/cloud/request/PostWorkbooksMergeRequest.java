package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Merge a workbook into the existing workbook. */
public class PostWorkbooksMergeRequest implements RequestOption {
    private final String name;
    private final String mergeWith;

    private String folder;
    private String storageName;
    private String mergedStorageName;

    public PostWorkbooksMergeRequest(String name, String mergeWith) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (mergeWith == null || mergeWith.isEmpty()) throw new IllegalArgumentException("mergeWith is required");
        this.name = name;
        this.mergeWith = mergeWith;
    }

    public PostWorkbooksMergeRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbooksMergeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbooksMergeRequest setMergedStorageName(String mergedStorageName) { this.mergedStorageName = mergedStorageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/merge";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("mergeWith", mergeWith);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (mergedStorageName != null && !mergedStorageName.isEmpty()) query.put("mergedStorageName", mergedStorageName);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.WorkbookSettings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update setting in the workbook. */
public class PostWorkbookSettingsRequest implements RequestOption {
    private final String name;
    private final WorkbookSettings settings;

    private String folder;
    private String storageName;

    public PostWorkbookSettingsRequest(String name, WorkbookSettings settings) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (settings == null) throw new IllegalArgumentException("settings is required");
        this.name = name;
        this.settings = settings;
    }

    public PostWorkbookSettingsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookSettingsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/settings";
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
        return settings;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

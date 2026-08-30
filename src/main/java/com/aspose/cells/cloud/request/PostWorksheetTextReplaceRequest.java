package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Replace old text with new text in the worksheet. */
public class PostWorksheetTextReplaceRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String oldValue;
    private final String newValue;

    private String folder;
    private String storageName;

    public PostWorksheetTextReplaceRequest(String name, String sheetName, String oldValue, String newValue) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (oldValue == null || oldValue.isEmpty()) throw new IllegalArgumentException("oldValue is required");
        if (newValue == null || newValue.isEmpty()) throw new IllegalArgumentException("newValue is required");
        this.name = name;
        this.sheetName = sheetName;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public PostWorksheetTextReplaceRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetTextReplaceRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/replaceText";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("oldValue", oldValue);
        query.put("newValue", newValue);
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

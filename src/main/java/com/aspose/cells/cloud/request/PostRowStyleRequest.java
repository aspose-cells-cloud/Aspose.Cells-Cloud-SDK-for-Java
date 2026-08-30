package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Style;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Apply formats to an entire row in the worksheet. */
public class PostRowStyleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer rowIndex;
    private final Style style;

    private String folder;
    private String storageName;

    public PostRowStyleRequest(String name, String sheetName, Integer rowIndex, Style style) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rowIndex == null) throw new IllegalArgumentException("rowIndex is required");
        if (style == null) throw new IllegalArgumentException("style is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rowIndex = rowIndex;
        this.style = style;
    }

    public PostRowStyleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostRowStyleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/" + urlEncode(String.valueOf(rowIndex)) + "/style";
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
        return style;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Style;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update cell range styles in the worksheet. */
public class PostUpdateWorksheetRangeStyleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final Style style;

    private String folder;
    private String storageName;

    public PostUpdateWorksheetRangeStyleRequest(String name, String sheetName, String range, Style style) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (style == null) throw new IllegalArgumentException("style is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.style = style;
    }

    public PostUpdateWorksheetRangeStyleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUpdateWorksheetRangeStyleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/style";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Style;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set cell style using cell name in the worksheet. */
public class PostUpdateWorksheetCellStyleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String cellName;
    private final Style style;

    private String folder;
    private String storageName;

    public PostUpdateWorksheetCellStyleRequest(String name, String sheetName, String cellName, Style style) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (cellName == null || cellName.isEmpty()) throw new IllegalArgumentException("cellName is required");
        if (style == null) throw new IllegalArgumentException("style is required");
        this.name = name;
        this.sheetName = sheetName;
        this.cellName = cellName;
        this.style = style;
    }

    public PostUpdateWorksheetCellStyleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUpdateWorksheetCellStyleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/" + urlEncode(cellName) + "/style";
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

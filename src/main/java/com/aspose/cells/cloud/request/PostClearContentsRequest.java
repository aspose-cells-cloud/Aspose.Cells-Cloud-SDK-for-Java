package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Clear cell area contents in the worksheet. */
public class PostClearContentsRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String range;
    private Integer startRow;
    private Integer startColumn;
    private Integer endRow;
    private Integer endColumn;
    private String folder;
    private String storageName;

    public PostClearContentsRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PostClearContentsRequest setRange(String range) { this.range = range; return this; }
    public PostClearContentsRequest setStartRow(Integer startRow) { this.startRow = startRow; return this; }
    public PostClearContentsRequest setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }
    public PostClearContentsRequest setEndRow(Integer endRow) { this.endRow = endRow; return this; }
    public PostClearContentsRequest setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }
    public PostClearContentsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostClearContentsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/clearcontents";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (range != null && !range.isEmpty()) query.put("range", range);
        if (startRow != null) query.put("startRow", String.valueOf(startRow));
        if (startColumn != null) query.put("startColumn", String.valueOf(startColumn));
        if (endRow != null) query.put("endRow", String.valueOf(endRow));
        if (endColumn != null) query.put("endColumn", String.valueOf(endColumn));
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

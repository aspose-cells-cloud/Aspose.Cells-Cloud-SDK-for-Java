package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Clear cell formats in the worksheet. */
public class PostClearFormatsRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String range;
    private Integer startRow;
    private Integer startColumn;
    private Integer endRow;
    private Integer endColumn;
    private String folder;
    private String storageName;

    public PostClearFormatsRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PostClearFormatsRequest setRange(String range) { this.range = range; return this; }
    public PostClearFormatsRequest setStartRow(Integer startRow) { this.startRow = startRow; return this; }
    public PostClearFormatsRequest setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }
    public PostClearFormatsRequest setEndRow(Integer endRow) { this.endRow = endRow; return this; }
    public PostClearFormatsRequest setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }
    public PostClearFormatsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostClearFormatsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/clearformats";
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

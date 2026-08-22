package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Hide worksheet columns in the worksheet. */
public class PostHideWorksheetColumnsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer startColumn;
    private final Integer totalColumns;

    private String folder;
    private String storageName;

    public PostHideWorksheetColumnsRequest(String name, String sheetName, Integer startColumn, Integer totalColumns) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (startColumn == null) throw new IllegalArgumentException("startColumn is required");
        if (totalColumns == null) throw new IllegalArgumentException("totalColumns is required");
        this.name = name;
        this.sheetName = sheetName;
        this.startColumn = startColumn;
        this.totalColumns = totalColumns;
    }

    public PostHideWorksheetColumnsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostHideWorksheetColumnsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/columns/hide";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("startColumn", String.valueOf(startColumn));
        query.put("totalColumns", String.valueOf(totalColumns));
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

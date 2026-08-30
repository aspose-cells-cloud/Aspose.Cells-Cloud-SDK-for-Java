package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Worksheet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update worksheet properties in the workbook. */
public class PostUpdateWorksheetPropertyRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Worksheet sheet;

    private String folder;
    private String storageName;

    public PostUpdateWorksheetPropertyRequest(String name, String sheetName, Worksheet sheet) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (sheet == null) throw new IllegalArgumentException("sheet is required");
        this.name = name;
        this.sheetName = sheetName;
        this.sheet = sheet;
    }

    public PostUpdateWorksheetPropertyRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUpdateWorksheetPropertyRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName);
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
        return sheet;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

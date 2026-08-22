package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Range;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Assign a value to the range; if necessary, the value will be converted to another data type, and the cell's number format will be reset. */
public class PostWorksheetCellsRangeValueRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Range range;
    private final String value;

    private Boolean isConverted;
    private Boolean setStyle;
    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeValueRequest(String name, String sheetName, Range range, String value) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null) throw new IllegalArgumentException("range is required");
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("value is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.value = value;
    }

    public PostWorksheetCellsRangeValueRequest setIsConverted(Boolean isConverted) { this.isConverted = isConverted; return this; }
    public PostWorksheetCellsRangeValueRequest setSetStyle(Boolean setStyle) { this.setStyle = setStyle; return this; }
    public PostWorksheetCellsRangeValueRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeValueRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/value";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("Value", value);
        if (isConverted != null) query.put("isConverted", String.valueOf(isConverted));
        if (setStyle != null) query.put("setStyle", String.valueOf(setStyle));
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
        return range;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

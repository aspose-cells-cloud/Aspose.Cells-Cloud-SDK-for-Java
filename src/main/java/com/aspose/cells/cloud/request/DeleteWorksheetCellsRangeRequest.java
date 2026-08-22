package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete a range of cells and shift existing cells based on the specified shift option. */
public class DeleteWorksheetCellsRangeRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final String shift;

    private String folder;
    private String storageName;

    public DeleteWorksheetCellsRangeRequest(String name, String sheetName, String range, String shift) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (shift == null || shift.isEmpty()) throw new IllegalArgumentException("shift is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.shift = shift;
    }

    public DeleteWorksheetCellsRangeRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetCellsRangeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
        query.put("shift", shift);
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

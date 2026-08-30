package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Range;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Move the current range to the destination range. */
public class PostWorksheetCellsRangeMoveToRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Range range;
    private final Integer destRow;
    private final Integer destColumn;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeMoveToRequest(String name, String sheetName, Range range, Integer destRow, Integer destColumn) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null) throw new IllegalArgumentException("range is required");
        if (destRow == null) throw new IllegalArgumentException("destRow is required");
        if (destColumn == null) throw new IllegalArgumentException("destColumn is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.destRow = destRow;
        this.destColumn = destColumn;
    }

    public PostWorksheetCellsRangeMoveToRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeMoveToRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/moveto";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("destRow", String.valueOf(destRow));
        query.put("destColumn", String.valueOf(destColumn));
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

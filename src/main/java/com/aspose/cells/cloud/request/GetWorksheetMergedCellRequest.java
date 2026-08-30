package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve description of a merged cell by its index in the worksheet. */
public class GetWorksheetMergedCellRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer mergedCellIndex;

    private String folder;
    private String storageName;

    public GetWorksheetMergedCellRequest(String name, String sheetName, Integer mergedCellIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (mergedCellIndex == null) throw new IllegalArgumentException("mergedCellIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.mergedCellIndex = mergedCellIndex;
    }

    public GetWorksheetMergedCellRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetMergedCellRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/mergedCells/" + urlEncode(String.valueOf(mergedCellIndex));
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

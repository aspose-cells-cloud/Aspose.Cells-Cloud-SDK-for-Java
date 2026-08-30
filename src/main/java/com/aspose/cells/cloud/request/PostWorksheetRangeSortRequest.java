package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataSorter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Sort a range in the worksheet. */
public class PostWorksheetRangeSortRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String cellArea;
    private final DataSorter dataSorter;

    private String folder;
    private String storageName;

    public PostWorksheetRangeSortRequest(String name, String sheetName, String cellArea, DataSorter dataSorter) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        if (dataSorter == null) throw new IllegalArgumentException("dataSorter is required");
        this.name = name;
        this.sheetName = sheetName;
        this.cellArea = cellArea;
        this.dataSorter = dataSorter;
    }

    public PostWorksheetRangeSortRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetRangeSortRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/sort";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("cellArea", cellArea);
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
        return dataSorter;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CreatePivotTableRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Create a pivot table with a list object in the worksheet. */
public class PostWorksheetListObjectSummarizeWithPivotTableRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer listObjectIndex;
    private final String destsheetName;
    private final CreatePivotTableRequest createPivotTableRequest;

    private String folder;
    private String storageName;

    public PostWorksheetListObjectSummarizeWithPivotTableRequest(String name, String sheetName, Integer listObjectIndex, String destsheetName, CreatePivotTableRequest createPivotTableRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (listObjectIndex == null) throw new IllegalArgumentException("listObjectIndex is required");
        if (destsheetName == null || destsheetName.isEmpty()) throw new IllegalArgumentException("destsheetName is required");
        if (createPivotTableRequest == null) throw new IllegalArgumentException("createPivotTableRequest is required");
        this.name = name;
        this.sheetName = sheetName;
        this.listObjectIndex = listObjectIndex;
        this.destsheetName = destsheetName;
        this.createPivotTableRequest = createPivotTableRequest;
    }

    public PostWorksheetListObjectSummarizeWithPivotTableRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetListObjectSummarizeWithPivotTableRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/listobjects/" + urlEncode(String.valueOf(listObjectIndex)) + "/SummarizeWithPivotTable";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("destsheetName", destsheetName);
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
        return createPivotTableRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

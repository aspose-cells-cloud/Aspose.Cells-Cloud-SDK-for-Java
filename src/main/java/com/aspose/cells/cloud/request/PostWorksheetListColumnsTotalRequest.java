package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.TableTotalRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update total of list columns in the table. */
public class PostWorksheetListColumnsTotalRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer listObjectIndex;
    private final List<TableTotalRequest> tableTotalRequests;

    private String folder;
    private String storageName;

    public PostWorksheetListColumnsTotalRequest(String name, String sheetName, Integer listObjectIndex, List<TableTotalRequest> tableTotalRequests) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (listObjectIndex == null) throw new IllegalArgumentException("listObjectIndex is required");
        if (tableTotalRequests == null) throw new IllegalArgumentException("tableTotalRequests is required");
        this.name = name;
        this.sheetName = sheetName;
        this.listObjectIndex = listObjectIndex;
        this.tableTotalRequests = tableTotalRequests;
    }

    public PostWorksheetListColumnsTotalRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetListColumnsTotalRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/listobjects/" + urlEncode(String.valueOf(listObjectIndex)) + "/listcolumns/total";
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
        return tableTotalRequests;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

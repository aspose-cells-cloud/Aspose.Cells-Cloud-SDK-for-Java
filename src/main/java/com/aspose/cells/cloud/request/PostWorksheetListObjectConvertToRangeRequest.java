package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Convert list object to range in the worksheet. */
public class PostWorksheetListObjectConvertToRangeRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer listObjectIndex;

    private String folder;
    private String storageName;

    public PostWorksheetListObjectConvertToRangeRequest(String name, String sheetName, Integer listObjectIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (listObjectIndex == null) throw new IllegalArgumentException("listObjectIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.listObjectIndex = listObjectIndex;
    }

    public PostWorksheetListObjectConvertToRangeRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetListObjectConvertToRangeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/listobjects/" + urlEncode(String.valueOf(listObjectIndex)) + "/ConvertToRange";
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

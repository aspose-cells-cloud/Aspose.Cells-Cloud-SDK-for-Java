package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Shape;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update a shape in the worksheet. */
public class PostWorksheetShapeRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer shapeindex;
    private final Shape dto;

    private String folder;
    private String storageName;

    public PostWorksheetShapeRequest(String name, String sheetName, Integer shapeindex, Shape dto) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (shapeindex == null) throw new IllegalArgumentException("shapeindex is required");
        if (dto == null) throw new IllegalArgumentException("dto is required");
        this.name = name;
        this.sheetName = sheetName;
        this.shapeindex = shapeindex;
        this.dto = dto;
    }

    public PostWorksheetShapeRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetShapeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/shapes/" + urlEncode(String.valueOf(shapeindex));
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
        return dto;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

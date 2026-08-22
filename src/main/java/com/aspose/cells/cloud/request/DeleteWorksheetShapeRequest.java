package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete a shape in the worksheet. */
public class DeleteWorksheetShapeRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer shapeindex;

    private String folder;
    private String storageName;

    public DeleteWorksheetShapeRequest(String name, String sheetName, Integer shapeindex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (shapeindex == null) throw new IllegalArgumentException("shapeindex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.shapeindex = shapeindex;
    }

    public DeleteWorksheetShapeRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetShapeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/shapes/" + urlEncode(String.valueOf(shapeindex));
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

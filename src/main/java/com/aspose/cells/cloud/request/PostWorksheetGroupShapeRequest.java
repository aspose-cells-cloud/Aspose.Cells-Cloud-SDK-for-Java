package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Group shapes in the worksheet. */
public class PostWorksheetGroupShapeRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final List<Integer> listShape;

    private String folder;
    private String storageName;

    public PostWorksheetGroupShapeRequest(String name, String sheetName, List<Integer> listShape) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (listShape == null) throw new IllegalArgumentException("listShape is required");
        this.name = name;
        this.sheetName = sheetName;
        this.listShape = listShape;
    }

    public PostWorksheetGroupShapeRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetGroupShapeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/shapes/group";
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
        return listShape;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

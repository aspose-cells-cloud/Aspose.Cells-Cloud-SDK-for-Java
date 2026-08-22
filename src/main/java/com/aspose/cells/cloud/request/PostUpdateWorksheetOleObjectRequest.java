package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.OleObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update an OLE object in worksheet. */
public class PostUpdateWorksheetOleObjectRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer oleObjectIndex;
    private final OleObject ole;

    private String folder;
    private String storageName;

    public PostUpdateWorksheetOleObjectRequest(String name, String sheetName, Integer oleObjectIndex, OleObject ole) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (oleObjectIndex == null) throw new IllegalArgumentException("oleObjectIndex is required");
        if (ole == null) throw new IllegalArgumentException("ole is required");
        this.name = name;
        this.sheetName = sheetName;
        this.oleObjectIndex = oleObjectIndex;
        this.ole = ole;
    }

    public PostUpdateWorksheetOleObjectRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostUpdateWorksheetOleObjectRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/oleobjects/" + urlEncode(String.valueOf(oleObjectIndex));
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
        return ole;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

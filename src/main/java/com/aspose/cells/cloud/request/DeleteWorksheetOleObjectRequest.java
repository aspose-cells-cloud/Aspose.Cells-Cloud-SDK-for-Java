package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete an OLE object in the worksheet. */
public class DeleteWorksheetOleObjectRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer oleObjectIndex;

    private String folder;
    private String storageName;

    public DeleteWorksheetOleObjectRequest(String name, String sheetName, Integer oleObjectIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (oleObjectIndex == null) throw new IllegalArgumentException("oleObjectIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.oleObjectIndex = oleObjectIndex;
    }

    public DeleteWorksheetOleObjectRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetOleObjectRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

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

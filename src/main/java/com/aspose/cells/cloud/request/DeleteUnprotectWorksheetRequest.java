package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ProtectSheetParameter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Unprotect worksheet. */
public class DeleteUnprotectWorksheetRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final ProtectSheetParameter protectParameter;

    private String folder;
    private String storageName;

    public DeleteUnprotectWorksheetRequest(String name, String sheetName, ProtectSheetParameter protectParameter) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (protectParameter == null) throw new IllegalArgumentException("protectParameter is required");
        this.name = name;
        this.sheetName = sheetName;
        this.protectParameter = protectParameter;
    }

    public DeleteUnprotectWorksheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteUnprotectWorksheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/protection";
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
        return protectParameter;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

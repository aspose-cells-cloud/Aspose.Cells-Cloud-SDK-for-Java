package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a new worksheet in the workbook. */
public class PutAddNewWorksheetRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Integer position;
    private String sheettype;
    private String folder;
    private String storageName;

    public PutAddNewWorksheetRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutAddNewWorksheetRequest setPosition(Integer position) { this.position = position; return this; }
    public PutAddNewWorksheetRequest setSheettype(String sheettype) { this.sheettype = sheettype; return this; }
    public PutAddNewWorksheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutAddNewWorksheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (position != null) query.put("position", String.valueOf(position));
        if (sheettype != null && !sheettype.isEmpty()) query.put("sheettype", sheettype);
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

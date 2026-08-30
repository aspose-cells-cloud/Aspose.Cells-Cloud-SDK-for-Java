package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Insert a new worksheet in the workbook. */
public class PutInsertNewWorksheetRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer index;
    private final String sheettype;

    private String newsheetname;
    private String folder;
    private String storageName;

    public PutInsertNewWorksheetRequest(String name, String sheetName, Integer index, String sheettype) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (index == null) throw new IllegalArgumentException("index is required");
        if (sheettype == null || sheettype.isEmpty()) throw new IllegalArgumentException("sheettype is required");
        this.name = name;
        this.sheetName = sheetName;
        this.index = index;
        this.sheettype = sheettype;
    }

    public PutInsertNewWorksheetRequest setNewsheetname(String newsheetname) { this.newsheetname = newsheetname; return this; }
    public PutInsertNewWorksheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutInsertNewWorksheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/insert";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("sheetName", sheetName);
        query.put("index", String.valueOf(index));
        query.put("sheettype", sheettype);
        if (newsheetname != null && !newsheetname.isEmpty()) query.put("newsheetname", newsheetname);
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

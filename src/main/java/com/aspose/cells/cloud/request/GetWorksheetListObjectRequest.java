package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve list object description by index in the worksheet. */
public class GetWorksheetListObjectRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer listobjectindex;

    private String format;
    private String folder;
    private String storageName;

    public GetWorksheetListObjectRequest(String name, String sheetName, Integer listobjectindex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (listobjectindex == null) throw new IllegalArgumentException("listobjectindex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.listobjectindex = listobjectindex;
    }

    public GetWorksheetListObjectRequest setFormat(String format) { this.format = format; return this; }
    public GetWorksheetListObjectRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetListObjectRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/listobjects/" + urlEncode(String.valueOf(listobjectindex));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (format != null && !format.isEmpty()) query.put("format", format);
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

    @Override public boolean isBinaryResponse() { return true; }
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve the OLE object in a specified format in the worksheet. */
public class GetWorksheetOleObjectRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer objectNumber;

    private String format;
    private String folder;
    private String storageName;

    public GetWorksheetOleObjectRequest(String name, String sheetName, Integer objectNumber) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (objectNumber == null) throw new IllegalArgumentException("objectNumber is required");
        this.name = name;
        this.sheetName = sheetName;
        this.objectNumber = objectNumber;
    }

    public GetWorksheetOleObjectRequest setFormat(String format) { this.format = format; return this; }
    public GetWorksheetOleObjectRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetOleObjectRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/oleobjects/" + urlEncode(String.valueOf(objectNumber));
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
}

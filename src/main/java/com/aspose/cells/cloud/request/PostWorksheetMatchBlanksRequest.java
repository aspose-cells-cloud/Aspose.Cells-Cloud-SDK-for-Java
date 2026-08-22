package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Match all blank cells in the list. */
public class PostWorksheetMatchBlanksRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer fieldIndex;

    private String folder;
    private String storageName;

    public PostWorksheetMatchBlanksRequest(String name, String sheetName, Integer fieldIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.fieldIndex = fieldIndex;
    }

    public PostWorksheetMatchBlanksRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetMatchBlanksRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/matchBlanks";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("fieldIndex", String.valueOf(fieldIndex));
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

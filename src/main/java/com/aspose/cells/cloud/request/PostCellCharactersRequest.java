package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.FontSetting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set cell characters in the worksheet. */
public class PostCellCharactersRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String cellName;

    private List<FontSetting> options;
    private String folder;
    private String storageName;

    public PostCellCharactersRequest(String name, String sheetName, String cellName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (cellName == null || cellName.isEmpty()) throw new IllegalArgumentException("cellName is required");
        this.name = name;
        this.sheetName = sheetName;
        this.cellName = cellName;
    }

    public PostCellCharactersRequest setOptions(List<FontSetting> options) { this.options = options; return this; }
    public PostCellCharactersRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostCellCharactersRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/" + urlEncode(cellName) + "/characters";
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
        return options;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

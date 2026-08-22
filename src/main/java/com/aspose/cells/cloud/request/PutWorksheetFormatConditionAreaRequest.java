package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a cell area for the format condition in the worksheet. */
public class PutWorksheetFormatConditionAreaRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer index;
    private final String cellArea;

    private String folder;
    private String storageName;

    public PutWorksheetFormatConditionAreaRequest(String name, String sheetName, Integer index, String cellArea) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (index == null) throw new IllegalArgumentException("index is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        this.name = name;
        this.sheetName = sheetName;
        this.index = index;
        this.cellArea = cellArea;
    }

    public PutWorksheetFormatConditionAreaRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetFormatConditionAreaRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/conditionalFormattings/" + urlEncode(String.valueOf(index)) + "/area";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("cellArea", cellArea);
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

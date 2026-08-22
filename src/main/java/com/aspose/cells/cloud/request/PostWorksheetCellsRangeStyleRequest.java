package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.RangeSetStyleRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set the style for the specified range. */
public class PostWorksheetCellsRangeStyleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final RangeSetStyleRequest rangeOperate;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeStyleRequest(String name, String sheetName, RangeSetStyleRequest rangeOperate) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rangeOperate == null) throw new IllegalArgumentException("rangeOperate is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rangeOperate = rangeOperate;
    }

    public PostWorksheetCellsRangeStyleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeStyleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/style";
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
        return rangeOperate;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

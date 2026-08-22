package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.RangeCopyRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Copy content from the source range to the destination range in the worksheet. */
public class PostWorksheetCellsRangesCopyRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final RangeCopyRequest rangeOperate;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangesCopyRequest(String name, String sheetName, RangeCopyRequest rangeOperate) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rangeOperate == null) throw new IllegalArgumentException("rangeOperate is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rangeOperate = rangeOperate;
    }

    public PostWorksheetCellsRangesCopyRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangesCopyRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/copy";
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

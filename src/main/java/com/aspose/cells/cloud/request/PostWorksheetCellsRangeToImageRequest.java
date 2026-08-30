package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.RangeConvertRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** PostWorksheetCellsRangeToImage request. */
public class PostWorksheetCellsRangeToImageRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final RangeConvertRequest rangeConvertRequest;

    private String folder;
    private String storageName;

    public PostWorksheetCellsRangeToImageRequest(String name, String sheetName, RangeConvertRequest rangeConvertRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (rangeConvertRequest == null) throw new IllegalArgumentException("rangeConvertRequest is required");
        this.name = name;
        this.sheetName = sheetName;
        this.rangeConvertRequest = rangeConvertRequest;
    }

    public PostWorksheetCellsRangeToImageRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetCellsRangeToImageRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/ranges/convertToImage";
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
        return rangeConvertRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }

    @Override public boolean isBinaryResponse() { return true; }
}

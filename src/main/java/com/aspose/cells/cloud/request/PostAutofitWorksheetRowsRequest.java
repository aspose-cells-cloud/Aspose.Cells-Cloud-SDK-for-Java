package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Autofit rows in the worksheet. */
public class PostAutofitWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Integer startRow;
    private Integer endRow;
    private Boolean onlyAuto;
    private String folder;
    private String storageName;

    public PostAutofitWorksheetRowsRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PostAutofitWorksheetRowsRequest setStartRow(Integer startRow) { this.startRow = startRow; return this; }
    public PostAutofitWorksheetRowsRequest setEndRow(Integer endRow) { this.endRow = endRow; return this; }
    public PostAutofitWorksheetRowsRequest setOnlyAuto(Boolean onlyAuto) { this.onlyAuto = onlyAuto; return this; }
    public PostAutofitWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostAutofitWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autofitrows";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (startRow != null) query.put("startRow", String.valueOf(startRow));
        if (endRow != null) query.put("endRow", String.valueOf(endRow));
        if (onlyAuto != null) query.put("onlyAuto", String.valueOf(onlyAuto));
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Autofit rows in the workbook. */
public class PostAutofitWorkbookRowsRequest implements RequestOption {
    private final String name;

    private Integer startRow;
    private Integer endRow;
    private Boolean onlyAuto;
    private String folder;
    private String storageName;
    private Integer firstColumn;
    private Integer lastColumn;

    public PostAutofitWorkbookRowsRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostAutofitWorkbookRowsRequest setStartRow(Integer startRow) { this.startRow = startRow; return this; }
    public PostAutofitWorkbookRowsRequest setEndRow(Integer endRow) { this.endRow = endRow; return this; }
    public PostAutofitWorkbookRowsRequest setOnlyAuto(Boolean onlyAuto) { this.onlyAuto = onlyAuto; return this; }
    public PostAutofitWorkbookRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostAutofitWorkbookRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostAutofitWorkbookRowsRequest setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }
    public PostAutofitWorkbookRowsRequest setLastColumn(Integer lastColumn) { this.lastColumn = lastColumn; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/autofitrows";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (startRow != null) query.put("startRow", String.valueOf(startRow));
        if (endRow != null) query.put("endRow", String.valueOf(endRow));
        if (onlyAuto != null) query.put("onlyAuto", String.valueOf(onlyAuto));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (firstColumn != null) query.put("firstColumn", String.valueOf(firstColumn));
        if (lastColumn != null) query.put("lastColumn", String.valueOf(lastColumn));
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

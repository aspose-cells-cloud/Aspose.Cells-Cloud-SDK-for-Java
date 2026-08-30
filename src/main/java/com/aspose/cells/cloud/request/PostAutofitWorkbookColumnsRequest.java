package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Autofit columns in the workbook. */
public class PostAutofitWorkbookColumnsRequest implements RequestOption {
    private final String name;

    private Integer startColumn;
    private Integer endColumn;
    private String folder;
    private String storageName;

    public PostAutofitWorkbookColumnsRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostAutofitWorkbookColumnsRequest setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }
    public PostAutofitWorkbookColumnsRequest setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }
    public PostAutofitWorkbookColumnsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostAutofitWorkbookColumnsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/autofitcolumns";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (startColumn != null) query.put("startColumn", String.valueOf(startColumn));
        if (endColumn != null) query.put("endColumn", String.valueOf(endColumn));
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

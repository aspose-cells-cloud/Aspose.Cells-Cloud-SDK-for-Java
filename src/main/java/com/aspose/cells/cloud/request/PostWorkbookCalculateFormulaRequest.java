package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CalculationOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Calculate all formulas in the workbook. */
public class PostWorkbookCalculateFormulaRequest implements RequestOption {
    private final String name;

    private CalculationOptions options;
    private Boolean ignoreError;
    private String folder;
    private String storageName;

    public PostWorkbookCalculateFormulaRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostWorkbookCalculateFormulaRequest setOptions(CalculationOptions options) { this.options = options; return this; }
    public PostWorkbookCalculateFormulaRequest setIgnoreError(Boolean ignoreError) { this.ignoreError = ignoreError; return this; }
    public PostWorkbookCalculateFormulaRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookCalculateFormulaRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/calculateformula";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (ignoreError != null) query.put("ignoreError", String.valueOf(ignoreError));
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

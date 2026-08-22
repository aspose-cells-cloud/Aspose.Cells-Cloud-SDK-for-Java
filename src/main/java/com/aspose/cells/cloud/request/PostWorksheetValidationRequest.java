package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Validation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update a validation by index in the worksheet. */
public class PostWorksheetValidationRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer validationIndex;
    private final Validation validation;

    private String folder;
    private String storageName;

    public PostWorksheetValidationRequest(String name, String sheetName, Integer validationIndex, Validation validation) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (validationIndex == null) throw new IllegalArgumentException("validationIndex is required");
        if (validation == null) throw new IllegalArgumentException("validation is required");
        this.name = name;
        this.sheetName = sheetName;
        this.validationIndex = validationIndex;
        this.validation = validation;
    }

    public PostWorksheetValidationRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetValidationRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/validations/" + urlEncode(String.valueOf(validationIndex));
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
        return validation;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.FormatCondition;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add conditional formatting in the worksheet. */
public class PutWorksheetConditionalFormattingRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final FormatCondition formatcondition;
    private final String cellArea;

    private String folder;
    private String storageName;

    public PutWorksheetConditionalFormattingRequest(String name, String sheetName, FormatCondition formatcondition, String cellArea) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (formatcondition == null) throw new IllegalArgumentException("formatcondition is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        this.name = name;
        this.sheetName = sheetName;
        this.formatcondition = formatcondition;
        this.cellArea = cellArea;
    }

    public PutWorksheetConditionalFormattingRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetConditionalFormattingRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/conditionalFormattings";
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
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return formatcondition;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

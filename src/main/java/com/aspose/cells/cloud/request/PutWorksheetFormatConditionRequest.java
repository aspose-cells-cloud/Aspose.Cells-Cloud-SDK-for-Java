package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a format condition in the worksheet. */
public class PutWorksheetFormatConditionRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer index;
    private final String cellArea;
    private final String type;
    private final String operatorType;
    private final String formula1;
    private final String formula2;

    private String folder;
    private String storageName;

    public PutWorksheetFormatConditionRequest(String name, String sheetName, Integer index, String cellArea, String type, String operatorType, String formula1, String formula2) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (index == null) throw new IllegalArgumentException("index is required");
        if (cellArea == null || cellArea.isEmpty()) throw new IllegalArgumentException("cellArea is required");
        if (type == null || type.isEmpty()) throw new IllegalArgumentException("type is required");
        if (operatorType == null || operatorType.isEmpty()) throw new IllegalArgumentException("operatorType is required");
        if (formula1 == null || formula1.isEmpty()) throw new IllegalArgumentException("formula1 is required");
        if (formula2 == null || formula2.isEmpty()) throw new IllegalArgumentException("formula2 is required");
        this.name = name;
        this.sheetName = sheetName;
        this.index = index;
        this.cellArea = cellArea;
        this.type = type;
        this.operatorType = operatorType;
        this.formula1 = formula1;
        this.formula2 = formula2;
    }

    public PutWorksheetFormatConditionRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetFormatConditionRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/conditionalFormattings/" + urlEncode(String.valueOf(index));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("cellArea", cellArea);
        query.put("type", type);
        query.put("operatorType", operatorType);
        query.put("formula1", formula1);
        query.put("formula2", formula2);
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

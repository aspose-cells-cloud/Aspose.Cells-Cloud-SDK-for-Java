package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Filter a list with custom criteria in the worksheet. */
public class PutWorksheetCustomFilterRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String range;
    private final Integer fieldIndex;
    private final String operatorType1;
    private final String criteria1;

    private Boolean isAnd;
    private String operatorType2;
    private String criteria2;
    private Boolean matchBlanks;
    private Boolean refresh;
    private String folder;
    private String storageName;

    public PutWorksheetCustomFilterRequest(String name, String sheetName, String range, Integer fieldIndex, String operatorType1, String criteria1) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (fieldIndex == null) throw new IllegalArgumentException("fieldIndex is required");
        if (operatorType1 == null || operatorType1.isEmpty()) throw new IllegalArgumentException("operatorType1 is required");
        if (criteria1 == null || criteria1.isEmpty()) throw new IllegalArgumentException("criteria1 is required");
        this.name = name;
        this.sheetName = sheetName;
        this.range = range;
        this.fieldIndex = fieldIndex;
        this.operatorType1 = operatorType1;
        this.criteria1 = criteria1;
    }

    public PutWorksheetCustomFilterRequest setIsAnd(Boolean isAnd) { this.isAnd = isAnd; return this; }
    public PutWorksheetCustomFilterRequest setOperatorType2(String operatorType2) { this.operatorType2 = operatorType2; return this; }
    public PutWorksheetCustomFilterRequest setCriteria2(String criteria2) { this.criteria2 = criteria2; return this; }
    public PutWorksheetCustomFilterRequest setMatchBlanks(Boolean matchBlanks) { this.matchBlanks = matchBlanks; return this; }
    public PutWorksheetCustomFilterRequest setRefresh(Boolean refresh) { this.refresh = refresh; return this; }
    public PutWorksheetCustomFilterRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetCustomFilterRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/autoFilter/custom";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("range", range);
        query.put("fieldIndex", String.valueOf(fieldIndex));
        query.put("operatorType1", operatorType1);
        query.put("criteria1", criteria1);
        if (isAnd != null) query.put("isAnd", String.valueOf(isAnd));
        if (operatorType2 != null && !operatorType2.isEmpty()) query.put("operatorType2", operatorType2);
        if (criteria2 != null && !criteria2.isEmpty()) query.put("criteria2", criteria2);
        if (matchBlanks != null) query.put("matchBlanks", String.valueOf(matchBlanks));
        if (refresh != null) query.put("refresh", String.valueOf(refresh));
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

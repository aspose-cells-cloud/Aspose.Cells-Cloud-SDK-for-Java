package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Copy data from source columns to destination columns in the worksheet. */
public class PostCopyWorksheetColumnsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer sourceColumnIndex;
    private final Integer destinationColumnIndex;
    private final Integer columnNumber;

    private String worksheet;
    private String folder;
    private String storageName;

    public PostCopyWorksheetColumnsRequest(String name, String sheetName, Integer sourceColumnIndex, Integer destinationColumnIndex, Integer columnNumber) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (sourceColumnIndex == null) throw new IllegalArgumentException("sourceColumnIndex is required");
        if (destinationColumnIndex == null) throw new IllegalArgumentException("destinationColumnIndex is required");
        if (columnNumber == null) throw new IllegalArgumentException("columnNumber is required");
        this.name = name;
        this.sheetName = sheetName;
        this.sourceColumnIndex = sourceColumnIndex;
        this.destinationColumnIndex = destinationColumnIndex;
        this.columnNumber = columnNumber;
    }

    public PostCopyWorksheetColumnsRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public PostCopyWorksheetColumnsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostCopyWorksheetColumnsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/columns/copy";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("sourceColumnIndex", String.valueOf(sourceColumnIndex));
        query.put("destinationColumnIndex", String.valueOf(destinationColumnIndex));
        query.put("columnNumber", String.valueOf(columnNumber));
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
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

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Copy data and formats from specific entire rows in the worksheet. */
public class PostCopyWorksheetRowsRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer sourceRowIndex;
    private final Integer destinationRowIndex;
    private final Integer rowNumber;

    private String worksheet;
    private String folder;
    private String storageName;

    public PostCopyWorksheetRowsRequest(String name, String sheetName, Integer sourceRowIndex, Integer destinationRowIndex, Integer rowNumber) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (sourceRowIndex == null) throw new IllegalArgumentException("sourceRowIndex is required");
        if (destinationRowIndex == null) throw new IllegalArgumentException("destinationRowIndex is required");
        if (rowNumber == null) throw new IllegalArgumentException("rowNumber is required");
        this.name = name;
        this.sheetName = sheetName;
        this.sourceRowIndex = sourceRowIndex;
        this.destinationRowIndex = destinationRowIndex;
        this.rowNumber = rowNumber;
    }

    public PostCopyWorksheetRowsRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public PostCopyWorksheetRowsRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostCopyWorksheetRowsRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/cells/rows/copy";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("sourceRowIndex", String.valueOf(sourceRowIndex));
        query.put("destinationRowIndex", String.valueOf(destinationRowIndex));
        query.put("rowNumber", String.valueOf(rowNumber));
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

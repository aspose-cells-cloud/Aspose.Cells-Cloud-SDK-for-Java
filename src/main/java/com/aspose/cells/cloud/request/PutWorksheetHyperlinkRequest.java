package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add hyperlink in the worksheet. */
public class PutWorksheetHyperlinkRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer firstRow;
    private final Integer firstColumn;
    private final Integer totalRows;
    private final Integer totalColumns;
    private final String address;

    private String folder;
    private String storageName;

    public PutWorksheetHyperlinkRequest(String name, String sheetName, Integer firstRow, Integer firstColumn, Integer totalRows, Integer totalColumns, String address) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (firstRow == null) throw new IllegalArgumentException("firstRow is required");
        if (firstColumn == null) throw new IllegalArgumentException("firstColumn is required");
        if (totalRows == null) throw new IllegalArgumentException("totalRows is required");
        if (totalColumns == null) throw new IllegalArgumentException("totalColumns is required");
        if (address == null || address.isEmpty()) throw new IllegalArgumentException("address is required");
        this.name = name;
        this.sheetName = sheetName;
        this.firstRow = firstRow;
        this.firstColumn = firstColumn;
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
        this.address = address;
    }

    public PutWorksheetHyperlinkRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetHyperlinkRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/hyperlinks";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("firstRow", String.valueOf(firstRow));
        query.put("firstColumn", String.valueOf(firstColumn));
        query.put("totalRows", String.valueOf(totalRows));
        query.put("totalColumns", String.valueOf(totalColumns));
        query.put("address", address);
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

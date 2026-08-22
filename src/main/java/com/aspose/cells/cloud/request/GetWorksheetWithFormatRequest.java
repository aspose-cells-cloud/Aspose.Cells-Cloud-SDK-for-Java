package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve the worksheet in a specified format from the workbook. */
public class GetWorksheetWithFormatRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private String format;
    private Integer verticalResolution;
    private Integer horizontalResolution;
    private String area;
    private Integer pageIndex;
    private Boolean onePagePerSheet;
    private Boolean printHeadings;
    private String folder;
    private String storageName;

    public GetWorksheetWithFormatRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public GetWorksheetWithFormatRequest setFormat(String format) { this.format = format; return this; }
    public GetWorksheetWithFormatRequest setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }
    public GetWorksheetWithFormatRequest setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }
    public GetWorksheetWithFormatRequest setArea(String area) { this.area = area; return this; }
    public GetWorksheetWithFormatRequest setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }
    public GetWorksheetWithFormatRequest setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }
    public GetWorksheetWithFormatRequest setPrintHeadings(Boolean printHeadings) { this.printHeadings = printHeadings; return this; }
    public GetWorksheetWithFormatRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetWithFormatRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (format != null && !format.isEmpty()) query.put("format", format);
        if (verticalResolution != null) query.put("verticalResolution", String.valueOf(verticalResolution));
        if (horizontalResolution != null) query.put("horizontalResolution", String.valueOf(horizontalResolution));
        if (area != null && !area.isEmpty()) query.put("area", area);
        if (pageIndex != null) query.put("pageIndex", String.valueOf(pageIndex));
        if (onePagePerSheet != null) query.put("onePagePerSheet", String.valueOf(onePagePerSheet));
        if (printHeadings != null) query.put("printHeadings", String.valueOf(printHeadings));
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

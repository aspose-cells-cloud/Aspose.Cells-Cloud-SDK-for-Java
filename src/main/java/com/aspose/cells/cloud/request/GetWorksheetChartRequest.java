package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Retrieve the chart in a specified format. */
public class GetWorksheetChartRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer chartNumber;

    private String format;
    private String folder;
    private String storageName;

    public GetWorksheetChartRequest(String name, String sheetName, Integer chartNumber) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (chartNumber == null) throw new IllegalArgumentException("chartNumber is required");
        this.name = name;
        this.sheetName = sheetName;
        this.chartNumber = chartNumber;
    }

    public GetWorksheetChartRequest setFormat(String format) { this.format = format; return this; }
    public GetWorksheetChartRequest setFolder(String folder) { this.folder = folder; return this; }
    public GetWorksheetChartRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "GET"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/charts/" + urlEncode(String.valueOf(chartNumber));
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (format != null && !format.isEmpty()) query.put("format", format);
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

    @Override public boolean isBinaryResponse() { return true; }
}

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Title;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Set chart title in the worksheet. */
public class PutWorksheetChartTitleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer chartIndex;

    private Title title;
    private String folder;
    private String storageName;

    public PutWorksheetChartTitleRequest(String name, String sheetName, Integer chartIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (chartIndex == null) throw new IllegalArgumentException("chartIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.chartIndex = chartIndex;
    }

    public PutWorksheetChartTitleRequest setTitle(Title title) { this.title = title; return this; }
    public PutWorksheetChartTitleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetChartTitleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/charts/" + urlEncode(String.valueOf(chartIndex)) + "/title";
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
        return title;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

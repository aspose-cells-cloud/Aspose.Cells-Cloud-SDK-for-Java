package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Title;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update chart title in the worksheet. */
public class PostWorksheetChartTitleRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer chartIndex;
    private final Title title;

    private String folder;
    private String storageName;

    public PostWorksheetChartTitleRequest(String name, String sheetName, Integer chartIndex, Title title) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (chartIndex == null) throw new IllegalArgumentException("chartIndex is required");
        if (title == null) throw new IllegalArgumentException("title is required");
        this.name = name;
        this.sheetName = sheetName;
        this.chartIndex = chartIndex;
        this.title = title;
    }

    public PostWorksheetChartTitleRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetChartTitleRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/charts/" + urlEncode(String.valueOf(chartIndex)) + "/title";
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

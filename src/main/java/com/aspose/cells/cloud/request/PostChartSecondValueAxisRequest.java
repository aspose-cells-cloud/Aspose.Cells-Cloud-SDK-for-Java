package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Axis;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update chart sencond value axis in the chart. */
public class PostChartSecondValueAxisRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer chartIndex;
    private final Axis axis;

    private String folder;
    private String storageName;

    public PostChartSecondValueAxisRequest(String name, String sheetName, Integer chartIndex, Axis axis) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (chartIndex == null) throw new IllegalArgumentException("chartIndex is required");
        if (axis == null) throw new IllegalArgumentException("axis is required");
        this.name = name;
        this.sheetName = sheetName;
        this.chartIndex = chartIndex;
        this.axis = axis;
    }

    public PostChartSecondValueAxisRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostChartSecondValueAxisRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/charts/" + urlEncode(String.valueOf(chartIndex)) + "/secondvalueaxis";
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
        return axis;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}

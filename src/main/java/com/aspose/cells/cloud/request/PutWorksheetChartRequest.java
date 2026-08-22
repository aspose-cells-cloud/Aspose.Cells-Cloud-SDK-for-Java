package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a new chart in the worksheet. */
public class PutWorksheetChartRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String chartType;

    private Integer upperLeftRow;
    private Integer upperLeftColumn;
    private Integer lowerRightRow;
    private Integer lowerRightColumn;
    private String area;
    private Boolean isVertical;
    private String categoryData;
    private Boolean isAutoGetSerialName;
    private String title;
    private String folder;
    private Boolean dataLabels;
    private String dataLabelsPosition;
    private String pivotTableSheet;
    private String pivotTableName;
    private String storageName;

    public PutWorksheetChartRequest(String name, String sheetName, String chartType) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (chartType == null || chartType.isEmpty()) throw new IllegalArgumentException("chartType is required");
        this.name = name;
        this.sheetName = sheetName;
        this.chartType = chartType;
    }

    public PutWorksheetChartRequest setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }
    public PutWorksheetChartRequest setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }
    public PutWorksheetChartRequest setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }
    public PutWorksheetChartRequest setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }
    public PutWorksheetChartRequest setArea(String area) { this.area = area; return this; }
    public PutWorksheetChartRequest setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }
    public PutWorksheetChartRequest setCategoryData(String categoryData) { this.categoryData = categoryData; return this; }
    public PutWorksheetChartRequest setIsAutoGetSerialName(Boolean isAutoGetSerialName) { this.isAutoGetSerialName = isAutoGetSerialName; return this; }
    public PutWorksheetChartRequest setTitle(String title) { this.title = title; return this; }
    public PutWorksheetChartRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetChartRequest setDataLabels(Boolean dataLabels) { this.dataLabels = dataLabels; return this; }
    public PutWorksheetChartRequest setDataLabelsPosition(String dataLabelsPosition) { this.dataLabelsPosition = dataLabelsPosition; return this; }
    public PutWorksheetChartRequest setPivotTableSheet(String pivotTableSheet) { this.pivotTableSheet = pivotTableSheet; return this; }
    public PutWorksheetChartRequest setPivotTableName(String pivotTableName) { this.pivotTableName = pivotTableName; return this; }
    public PutWorksheetChartRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/charts";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("chartType", chartType);
        if (upperLeftRow != null) query.put("upperLeftRow", String.valueOf(upperLeftRow));
        if (upperLeftColumn != null) query.put("upperLeftColumn", String.valueOf(upperLeftColumn));
        if (lowerRightRow != null) query.put("lowerRightRow", String.valueOf(lowerRightRow));
        if (lowerRightColumn != null) query.put("lowerRightColumn", String.valueOf(lowerRightColumn));
        if (area != null && !area.isEmpty()) query.put("area", area);
        if (isVertical != null) query.put("isVertical", String.valueOf(isVertical));
        if (categoryData != null && !categoryData.isEmpty()) query.put("categoryData", categoryData);
        if (isAutoGetSerialName != null) query.put("isAutoGetSerialName", String.valueOf(isAutoGetSerialName));
        if (title != null && !title.isEmpty()) query.put("title", title);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (dataLabels != null) query.put("dataLabels", String.valueOf(dataLabels));
        if (dataLabelsPosition != null && !dataLabelsPosition.isEmpty()) query.put("dataLabelsPosition", dataLabelsPosition);
        if (pivotTableSheet != null && !pivotTableSheet.isEmpty()) query.put("pivotTableSheet", pivotTableSheet);
        if (pivotTableName != null && !pivotTableName.isEmpty()) query.put("pivotTableName", pivotTableName);
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

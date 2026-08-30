package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartOperateParameter — Represents chart operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartOperateParameter extends OperateParameter {
    /** Represents chart index. */
    @JsonProperty("ChartIndex")
    private Integer chartIndex;

    /** Represents chart type. */
    @JsonProperty("ChartType")
    private String chartType;

    /** Represents upper left row index of chart. */
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    /** Represents upper left column index of chart. */
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    /** Represents lower right row index of chart. */
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    /** Represents lower right column index of chart. */
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    /** Represents chart area. */
    @JsonProperty("Area")
    private String area;

    /** Represents whether to plot the series from a range of cell values by row or by column. */
    @JsonProperty("IsVertical")
    private Boolean isVertical;

    /** Represents chart category data. */
    @JsonProperty("CategoryData")
    private String categoryData;

    /** Represents whether auto get serial name. */
    @JsonProperty("IsAutoGetSerialName")
    private Boolean isAutoGetSerialName;

    /** Represents chart title. */
    @JsonProperty("Title")
    private String title;

    public Integer getChartIndex() { return chartIndex; }
    public ChartOperateParameter setChartIndex(Integer chartIndex) { this.chartIndex = chartIndex; return this; }

    public String getChartType() { return chartType; }
    public ChartOperateParameter setChartType(String chartType) { this.chartType = chartType; return this; }

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public ChartOperateParameter setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public ChartOperateParameter setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public ChartOperateParameter setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public ChartOperateParameter setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public String getArea() { return area; }
    public ChartOperateParameter setArea(String area) { this.area = area; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ChartOperateParameter setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public String getCategoryData() { return categoryData; }
    public ChartOperateParameter setCategoryData(String categoryData) { this.categoryData = categoryData; return this; }

    public Boolean getIsAutoGetSerialName() { return isAutoGetSerialName; }
    public ChartOperateParameter setIsAutoGetSerialName(Boolean isAutoGetSerialName) { this.isAutoGetSerialName = isAutoGetSerialName; return this; }

    public String getTitle() { return title; }
    public ChartOperateParameter setTitle(String title) { this.title = title; return this; }


    /** Covariant override: keeps fluent chains returning ChartOperateParameter. */
    @Override public ChartOperateParameter setOperateType(String operateType) { return (ChartOperateParameter) super.setOperateType(operateType); }

}

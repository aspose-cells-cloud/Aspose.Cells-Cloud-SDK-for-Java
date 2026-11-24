/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChartOperateParameter.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ChartOperateParameter extends OperateParameter {

    @SerializedName("ChartIndex")
    @JsonProperty("ChartIndex")
    private Integer chartIndex;

    public ChartOperateParameter chartIndex(Integer chartIndex) {
        this.chartIndex = chartIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getChartIndex() {
        return chartIndex;
    }

    public void setChartIndex(Integer chartIndex) {
        this.chartIndex = chartIndex;
    }

    @SerializedName("ChartType")
    @JsonProperty("ChartType")
    private String chartType;

    public ChartOperateParameter chartType(String chartType) {
        this.chartType = chartType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getChartType() {
        return chartType;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    @SerializedName("UpperLeftRow")
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    public ChartOperateParameter upperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getUpperLeftRow() {
        return upperLeftRow;
    }

    public void setUpperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
    }

    @SerializedName("UpperLeftColumn")
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    public ChartOperateParameter upperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getUpperLeftColumn() {
        return upperLeftColumn;
    }

    public void setUpperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
    }

    @SerializedName("LowerRightRow")
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    public ChartOperateParameter lowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLowerRightRow() {
        return lowerRightRow;
    }

    public void setLowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
    }

    @SerializedName("LowerRightColumn")
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    public ChartOperateParameter lowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getLowerRightColumn() {
        return lowerRightColumn;
    }

    public void setLowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
    }

    @SerializedName("Area")
    @JsonProperty("Area")
    private String area;

    public ChartOperateParameter area(String area) {
        this.area = area;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @SerializedName("IsVertical")
    @JsonProperty("IsVertical")
    private Boolean isVertical;

    public ChartOperateParameter isVertical(Boolean isVertical) {
        this.isVertical = isVertical;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(Boolean isVertical) {
        this.isVertical = isVertical;
    }

    @SerializedName("CategoryData")
    @JsonProperty("CategoryData")
    private String categoryData;

    public ChartOperateParameter categoryData(String categoryData) {
        this.categoryData = categoryData;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCategoryData() {
        return categoryData;
    }

    public void setCategoryData(String categoryData) {
        this.categoryData = categoryData;
    }

    @SerializedName("IsAutoGetSerialName")
    @JsonProperty("IsAutoGetSerialName")
    private Boolean isAutoGetSerialName;

    public ChartOperateParameter isAutoGetSerialName(Boolean isAutoGetSerialName) {
        this.isAutoGetSerialName = isAutoGetSerialName;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoGetSerialName() {
        return isAutoGetSerialName;
    }

    public void setIsAutoGetSerialName(Boolean isAutoGetSerialName) {
        this.isAutoGetSerialName = isAutoGetSerialName;
    }

    @SerializedName("Title")
    @JsonProperty("Title")
    private String title;

    public ChartOperateParameter title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ChartOperateParameter other = (ChartOperateParameter) o;
        return Objects.equals(this.chartIndex, other.chartIndex)
            && Objects.equals(this.chartType, other.chartType)
            && Objects.equals(this.upperLeftRow, other.upperLeftRow)
            && Objects.equals(this.upperLeftColumn, other.upperLeftColumn)
            && Objects.equals(this.lowerRightRow, other.lowerRightRow)
            && Objects.equals(this.lowerRightColumn, other.lowerRightColumn)
            && Objects.equals(this.area, other.area)
            && Objects.equals(this.isVertical, other.isVertical)
            && Objects.equals(this.categoryData, other.categoryData)
            && Objects.equals(this.isAutoGetSerialName, other.isAutoGetSerialName)
            && Objects.equals(this.title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartIndex, chartType, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName, title, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartOperateParameter {\n");
        sb.append("    chartIndex: ").append(chartIndex).append("\n");
        sb.append("    chartType: ").append(chartType).append("\n");
        sb.append("    upperLeftRow: ").append(upperLeftRow).append("\n");
        sb.append("    upperLeftColumn: ").append(upperLeftColumn).append("\n");
        sb.append("    lowerRightRow: ").append(lowerRightRow).append("\n");
        sb.append("    lowerRightColumn: ").append(lowerRightColumn).append("\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    isVertical: ").append(isVertical).append("\n");
        sb.append("    categoryData: ").append(categoryData).append("\n");
        sb.append("    isAutoGetSerialName: ").append(isAutoGetSerialName).append("\n");
        sb.append("    title: ").append(title).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

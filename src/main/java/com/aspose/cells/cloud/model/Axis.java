/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Axis.java">
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

public class Axis extends LinkElement {

    @SerializedName("Area")
    @JsonProperty("Area")
    private Area area;

    public Axis area(Area area) {
        this.area = area;
        return this;
    }

    @ApiModelProperty(value = "")
    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @SerializedName("AxisBetweenCategories")
    @JsonProperty("AxisBetweenCategories")
    private Boolean axisBetweenCategories;

    public Axis axisBetweenCategories(Boolean axisBetweenCategories) {
        this.axisBetweenCategories = axisBetweenCategories;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAxisBetweenCategories() {
        return axisBetweenCategories;
    }

    public void setAxisBetweenCategories(Boolean axisBetweenCategories) {
        this.axisBetweenCategories = axisBetweenCategories;
    }

    @SerializedName("AxisLine")
    @JsonProperty("AxisLine")
    private Line axisLine;

    public Axis axisLine(Line axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(Line axisLine) {
        this.axisLine = axisLine;
    }

    @SerializedName("BaseUnitScale")
    @JsonProperty("BaseUnitScale")
    private String baseUnitScale;

    public Axis baseUnitScale(String baseUnitScale) {
        this.baseUnitScale = baseUnitScale;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBaseUnitScale() {
        return baseUnitScale;
    }

    public void setBaseUnitScale(String baseUnitScale) {
        this.baseUnitScale = baseUnitScale;
    }

    @SerializedName("CategoryType")
    @JsonProperty("CategoryType")
    private String categoryType;

    public Axis categoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @SerializedName("CrossAt")
    @JsonProperty("CrossAt")
    private Double crossAt;

    public Axis crossAt(Double crossAt) {
        this.crossAt = crossAt;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getCrossAt() {
        return crossAt;
    }

    public void setCrossAt(Double crossAt) {
        this.crossAt = crossAt;
    }

    @SerializedName("CrossType")
    @JsonProperty("CrossType")
    private String crossType;

    public Axis crossType(String crossType) {
        this.crossType = crossType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCrossType() {
        return crossType;
    }

    public void setCrossType(String crossType) {
        this.crossType = crossType;
    }

    @SerializedName("DisplayUnit")
    @JsonProperty("DisplayUnit")
    private String displayUnit;

    public Axis displayUnit(String displayUnit) {
        this.displayUnit = displayUnit;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDisplayUnit() {
        return displayUnit;
    }

    public void setDisplayUnit(String displayUnit) {
        this.displayUnit = displayUnit;
    }

    @SerializedName("DisplayUnitLabel")
    @JsonProperty("DisplayUnitLabel")
    private DisplayUnitLabel displayUnitLabel;

    public Axis displayUnitLabel(DisplayUnitLabel displayUnitLabel) {
        this.displayUnitLabel = displayUnitLabel;
        return this;
    }

    @ApiModelProperty(value = "")
    public DisplayUnitLabel getDisplayUnitLabel() {
        return displayUnitLabel;
    }

    public void setDisplayUnitLabel(DisplayUnitLabel displayUnitLabel) {
        this.displayUnitLabel = displayUnitLabel;
    }

    @SerializedName("HasMultiLevelLabels")
    @JsonProperty("HasMultiLevelLabels")
    private Boolean hasMultiLevelLabels;

    public Axis hasMultiLevelLabels(Boolean hasMultiLevelLabels) {
        this.hasMultiLevelLabels = hasMultiLevelLabels;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasMultiLevelLabels() {
        return hasMultiLevelLabels;
    }

    public void setHasMultiLevelLabels(Boolean hasMultiLevelLabels) {
        this.hasMultiLevelLabels = hasMultiLevelLabels;
    }

    @SerializedName("IsAutomaticMajorUnit")
    @JsonProperty("IsAutomaticMajorUnit")
    private Boolean isAutomaticMajorUnit;

    public Axis isAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
        this.isAutomaticMajorUnit = isAutomaticMajorUnit;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutomaticMajorUnit() {
        return isAutomaticMajorUnit;
    }

    public void setIsAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
        this.isAutomaticMajorUnit = isAutomaticMajorUnit;
    }

    @SerializedName("IsAutomaticMaxValue")
    @JsonProperty("IsAutomaticMaxValue")
    private Boolean isAutomaticMaxValue;

    public Axis isAutomaticMaxValue(Boolean isAutomaticMaxValue) {
        this.isAutomaticMaxValue = isAutomaticMaxValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutomaticMaxValue() {
        return isAutomaticMaxValue;
    }

    public void setIsAutomaticMaxValue(Boolean isAutomaticMaxValue) {
        this.isAutomaticMaxValue = isAutomaticMaxValue;
    }

    @SerializedName("IsAutomaticMinorUnit")
    @JsonProperty("IsAutomaticMinorUnit")
    private Boolean isAutomaticMinorUnit;

    public Axis isAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
        this.isAutomaticMinorUnit = isAutomaticMinorUnit;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutomaticMinorUnit() {
        return isAutomaticMinorUnit;
    }

    public void setIsAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
        this.isAutomaticMinorUnit = isAutomaticMinorUnit;
    }

    @SerializedName("IsAutomaticMinValue")
    @JsonProperty("IsAutomaticMinValue")
    private Boolean isAutomaticMinValue;

    public Axis isAutomaticMinValue(Boolean isAutomaticMinValue) {
        this.isAutomaticMinValue = isAutomaticMinValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutomaticMinValue() {
        return isAutomaticMinValue;
    }

    public void setIsAutomaticMinValue(Boolean isAutomaticMinValue) {
        this.isAutomaticMinValue = isAutomaticMinValue;
    }

    @SerializedName("IsDisplayUnitLabelShown")
    @JsonProperty("IsDisplayUnitLabelShown")
    private Boolean isDisplayUnitLabelShown;

    public Axis isDisplayUnitLabelShown(Boolean isDisplayUnitLabelShown) {
        this.isDisplayUnitLabelShown = isDisplayUnitLabelShown;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsDisplayUnitLabelShown() {
        return isDisplayUnitLabelShown;
    }

    public void setIsDisplayUnitLabelShown(Boolean isDisplayUnitLabelShown) {
        this.isDisplayUnitLabelShown = isDisplayUnitLabelShown;
    }

    @SerializedName("IsLogarithmic")
    @JsonProperty("IsLogarithmic")
    private Boolean isLogarithmic;

    public Axis isLogarithmic(Boolean isLogarithmic) {
        this.isLogarithmic = isLogarithmic;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsLogarithmic() {
        return isLogarithmic;
    }

    public void setIsLogarithmic(Boolean isLogarithmic) {
        this.isLogarithmic = isLogarithmic;
    }

    @SerializedName("IsPlotOrderReversed")
    @JsonProperty("IsPlotOrderReversed")
    private Boolean isPlotOrderReversed;

    public Axis isPlotOrderReversed(Boolean isPlotOrderReversed) {
        this.isPlotOrderReversed = isPlotOrderReversed;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsPlotOrderReversed() {
        return isPlotOrderReversed;
    }

    public void setIsPlotOrderReversed(Boolean isPlotOrderReversed) {
        this.isPlotOrderReversed = isPlotOrderReversed;
    }

    @SerializedName("IsVisible")
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    public Axis isVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @SerializedName("LogBase")
    @JsonProperty("LogBase")
    private Double logBase;

    public Axis logBase(Double logBase) {
        this.logBase = logBase;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getLogBase() {
        return logBase;
    }

    public void setLogBase(Double logBase) {
        this.logBase = logBase;
    }

    @SerializedName("MajorGridLines")
    @JsonProperty("MajorGridLines")
    private Line majorGridLines;

    public Axis majorGridLines(Line majorGridLines) {
        this.majorGridLines = majorGridLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getMajorGridLines() {
        return majorGridLines;
    }

    public void setMajorGridLines(Line majorGridLines) {
        this.majorGridLines = majorGridLines;
    }

    @SerializedName("MajorTickMark")
    @JsonProperty("MajorTickMark")
    private String majorTickMark;

    public Axis majorTickMark(String majorTickMark) {
        this.majorTickMark = majorTickMark;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMajorTickMark() {
        return majorTickMark;
    }

    public void setMajorTickMark(String majorTickMark) {
        this.majorTickMark = majorTickMark;
    }

    @SerializedName("MajorUnit")
    @JsonProperty("MajorUnit")
    private Double majorUnit;

    public Axis majorUnit(Double majorUnit) {
        this.majorUnit = majorUnit;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMajorUnit() {
        return majorUnit;
    }

    public void setMajorUnit(Double majorUnit) {
        this.majorUnit = majorUnit;
    }

    @SerializedName("MajorUnitScale")
    @JsonProperty("MajorUnitScale")
    private String majorUnitScale;

    public Axis majorUnitScale(String majorUnitScale) {
        this.majorUnitScale = majorUnitScale;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMajorUnitScale() {
        return majorUnitScale;
    }

    public void setMajorUnitScale(String majorUnitScale) {
        this.majorUnitScale = majorUnitScale;
    }

    @SerializedName("MaxValue")
    @JsonProperty("MaxValue")
    private Double maxValue;

    public Axis maxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    @SerializedName("MinorGridLines")
    @JsonProperty("MinorGridLines")
    private Line minorGridLines;

    public Axis minorGridLines(Line minorGridLines) {
        this.minorGridLines = minorGridLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getMinorGridLines() {
        return minorGridLines;
    }

    public void setMinorGridLines(Line minorGridLines) {
        this.minorGridLines = minorGridLines;
    }

    @SerializedName("MinorTickMark")
    @JsonProperty("MinorTickMark")
    private String minorTickMark;

    public Axis minorTickMark(String minorTickMark) {
        this.minorTickMark = minorTickMark;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMinorTickMark() {
        return minorTickMark;
    }

    public void setMinorTickMark(String minorTickMark) {
        this.minorTickMark = minorTickMark;
    }

    @SerializedName("MinorUnit")
    @JsonProperty("MinorUnit")
    private Double minorUnit;

    public Axis minorUnit(Double minorUnit) {
        this.minorUnit = minorUnit;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMinorUnit() {
        return minorUnit;
    }

    public void setMinorUnit(Double minorUnit) {
        this.minorUnit = minorUnit;
    }

    @SerializedName("MinorUnitScale")
    @JsonProperty("MinorUnitScale")
    private String minorUnitScale;

    public Axis minorUnitScale(String minorUnitScale) {
        this.minorUnitScale = minorUnitScale;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMinorUnitScale() {
        return minorUnitScale;
    }

    public void setMinorUnitScale(String minorUnitScale) {
        this.minorUnitScale = minorUnitScale;
    }

    @SerializedName("MinValue")
    @JsonProperty("MinValue")
    private Double minValue;

    public Axis minValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    @SerializedName("TickLabelPosition")
    @JsonProperty("TickLabelPosition")
    private String tickLabelPosition;

    public Axis tickLabelPosition(String tickLabelPosition) {
        this.tickLabelPosition = tickLabelPosition;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTickLabelPosition() {
        return tickLabelPosition;
    }

    public void setTickLabelPosition(String tickLabelPosition) {
        this.tickLabelPosition = tickLabelPosition;
    }

    @SerializedName("TickLabels")
    @JsonProperty("TickLabels")
    private TickLabels tickLabels;

    public Axis tickLabels(TickLabels tickLabels) {
        this.tickLabels = tickLabels;
        return this;
    }

    @ApiModelProperty(value = "")
    public TickLabels getTickLabels() {
        return tickLabels;
    }

    public void setTickLabels(TickLabels tickLabels) {
        this.tickLabels = tickLabels;
    }

    @SerializedName("TickLabelSpacing")
    @JsonProperty("TickLabelSpacing")
    private Integer tickLabelSpacing;

    public Axis tickLabelSpacing(Integer tickLabelSpacing) {
        this.tickLabelSpacing = tickLabelSpacing;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getTickLabelSpacing() {
        return tickLabelSpacing;
    }

    public void setTickLabelSpacing(Integer tickLabelSpacing) {
        this.tickLabelSpacing = tickLabelSpacing;
    }

    @SerializedName("TickMarkSpacing")
    @JsonProperty("TickMarkSpacing")
    private Integer tickMarkSpacing;

    public Axis tickMarkSpacing(Integer tickMarkSpacing) {
        this.tickMarkSpacing = tickMarkSpacing;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getTickMarkSpacing() {
        return tickMarkSpacing;
    }

    public void setTickMarkSpacing(Integer tickMarkSpacing) {
        this.tickMarkSpacing = tickMarkSpacing;
    }

    @SerializedName("Title")
    @JsonProperty("Title")
    private Title title;

    public Axis title(Title title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(value = "")
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
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
        Axis other = (Axis) o;
        return Objects.equals(this.area, other.area)
            && Objects.equals(this.axisBetweenCategories, other.axisBetweenCategories)
            && Objects.equals(this.axisLine, other.axisLine)
            && Objects.equals(this.baseUnitScale, other.baseUnitScale)
            && Objects.equals(this.categoryType, other.categoryType)
            && Objects.equals(this.crossAt, other.crossAt)
            && Objects.equals(this.crossType, other.crossType)
            && Objects.equals(this.displayUnit, other.displayUnit)
            && Objects.equals(this.displayUnitLabel, other.displayUnitLabel)
            && Objects.equals(this.hasMultiLevelLabels, other.hasMultiLevelLabels)
            && Objects.equals(this.isAutomaticMajorUnit, other.isAutomaticMajorUnit)
            && Objects.equals(this.isAutomaticMaxValue, other.isAutomaticMaxValue)
            && Objects.equals(this.isAutomaticMinorUnit, other.isAutomaticMinorUnit)
            && Objects.equals(this.isAutomaticMinValue, other.isAutomaticMinValue)
            && Objects.equals(this.isDisplayUnitLabelShown, other.isDisplayUnitLabelShown)
            && Objects.equals(this.isLogarithmic, other.isLogarithmic)
            && Objects.equals(this.isPlotOrderReversed, other.isPlotOrderReversed)
            && Objects.equals(this.isVisible, other.isVisible)
            && Objects.equals(this.logBase, other.logBase)
            && Objects.equals(this.majorGridLines, other.majorGridLines)
            && Objects.equals(this.majorTickMark, other.majorTickMark)
            && Objects.equals(this.majorUnit, other.majorUnit)
            && Objects.equals(this.majorUnitScale, other.majorUnitScale)
            && Objects.equals(this.maxValue, other.maxValue)
            && Objects.equals(this.minorGridLines, other.minorGridLines)
            && Objects.equals(this.minorTickMark, other.minorTickMark)
            && Objects.equals(this.minorUnit, other.minorUnit)
            && Objects.equals(this.minorUnitScale, other.minorUnitScale)
            && Objects.equals(this.minValue, other.minValue)
            && Objects.equals(this.tickLabelPosition, other.tickLabelPosition)
            && Objects.equals(this.tickLabels, other.tickLabels)
            && Objects.equals(this.tickLabelSpacing, other.tickLabelSpacing)
            && Objects.equals(this.tickMarkSpacing, other.tickMarkSpacing)
            && Objects.equals(this.title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, axisBetweenCategories, axisLine, baseUnitScale, categoryType, crossAt, crossType, displayUnit, displayUnitLabel, hasMultiLevelLabels, isAutomaticMajorUnit, isAutomaticMaxValue, isAutomaticMinorUnit, isAutomaticMinValue, isDisplayUnitLabelShown, isLogarithmic, isPlotOrderReversed, isVisible, logBase, majorGridLines, majorTickMark, majorUnit, majorUnitScale, maxValue, minorGridLines, minorTickMark, minorUnit, minorUnitScale, minValue, tickLabelPosition, tickLabels, tickLabelSpacing, tickMarkSpacing, title, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Axis {\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    axisBetweenCategories: ").append(axisBetweenCategories).append("\n");
        sb.append("    axisLine: ").append(axisLine).append("\n");
        sb.append("    baseUnitScale: ").append(baseUnitScale).append("\n");
        sb.append("    categoryType: ").append(categoryType).append("\n");
        sb.append("    crossAt: ").append(crossAt).append("\n");
        sb.append("    crossType: ").append(crossType).append("\n");
        sb.append("    displayUnit: ").append(displayUnit).append("\n");
        sb.append("    displayUnitLabel: ").append(displayUnitLabel).append("\n");
        sb.append("    hasMultiLevelLabels: ").append(hasMultiLevelLabels).append("\n");
        sb.append("    isAutomaticMajorUnit: ").append(isAutomaticMajorUnit).append("\n");
        sb.append("    isAutomaticMaxValue: ").append(isAutomaticMaxValue).append("\n");
        sb.append("    isAutomaticMinorUnit: ").append(isAutomaticMinorUnit).append("\n");
        sb.append("    isAutomaticMinValue: ").append(isAutomaticMinValue).append("\n");
        sb.append("    isDisplayUnitLabelShown: ").append(isDisplayUnitLabelShown).append("\n");
        sb.append("    isLogarithmic: ").append(isLogarithmic).append("\n");
        sb.append("    isPlotOrderReversed: ").append(isPlotOrderReversed).append("\n");
        sb.append("    isVisible: ").append(isVisible).append("\n");
        sb.append("    logBase: ").append(logBase).append("\n");
        sb.append("    majorGridLines: ").append(majorGridLines).append("\n");
        sb.append("    majorTickMark: ").append(majorTickMark).append("\n");
        sb.append("    majorUnit: ").append(majorUnit).append("\n");
        sb.append("    majorUnitScale: ").append(majorUnitScale).append("\n");
        sb.append("    maxValue: ").append(maxValue).append("\n");
        sb.append("    minorGridLines: ").append(minorGridLines).append("\n");
        sb.append("    minorTickMark: ").append(minorTickMark).append("\n");
        sb.append("    minorUnit: ").append(minorUnit).append("\n");
        sb.append("    minorUnitScale: ").append(minorUnitScale).append("\n");
        sb.append("    minValue: ").append(minValue).append("\n");
        sb.append("    tickLabelPosition: ").append(tickLabelPosition).append("\n");
        sb.append("    tickLabels: ").append(tickLabels).append("\n");
        sb.append("    tickLabelSpacing: ").append(tickLabelSpacing).append("\n");
        sb.append("    tickMarkSpacing: ").append(tickMarkSpacing).append("\n");
        sb.append("    title: ").append(title).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

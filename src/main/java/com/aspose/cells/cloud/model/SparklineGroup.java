/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SparklineGroup.java">
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

public class SparklineGroup {

    @SerializedName("DisplayHidden")
    @JsonProperty("DisplayHidden")
    private Boolean displayHidden;

    public SparklineGroup displayHidden(Boolean displayHidden) {
        this.displayHidden = displayHidden;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDisplayHidden() {
        return displayHidden;
    }

    public void setDisplayHidden(Boolean displayHidden) {
        this.displayHidden = displayHidden;
    }

    @SerializedName("FirstPointColor")
    @JsonProperty("FirstPointColor")
    private CellsColor firstPointColor;

    public SparklineGroup firstPointColor(CellsColor firstPointColor) {
        this.firstPointColor = firstPointColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getFirstPointColor() {
        return firstPointColor;
    }

    public void setFirstPointColor(CellsColor firstPointColor) {
        this.firstPointColor = firstPointColor;
    }

    @SerializedName("HighPointColor")
    @JsonProperty("HighPointColor")
    private CellsColor highPointColor;

    public SparklineGroup highPointColor(CellsColor highPointColor) {
        this.highPointColor = highPointColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getHighPointColor() {
        return highPointColor;
    }

    public void setHighPointColor(CellsColor highPointColor) {
        this.highPointColor = highPointColor;
    }

    @SerializedName("HorizontalAxisColor")
    @JsonProperty("HorizontalAxisColor")
    private CellsColor horizontalAxisColor;

    public SparklineGroup horizontalAxisColor(CellsColor horizontalAxisColor) {
        this.horizontalAxisColor = horizontalAxisColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getHorizontalAxisColor() {
        return horizontalAxisColor;
    }

    public void setHorizontalAxisColor(CellsColor horizontalAxisColor) {
        this.horizontalAxisColor = horizontalAxisColor;
    }

    @SerializedName("HorizontalAxisDateRange")
    @JsonProperty("HorizontalAxisDateRange")
    private String horizontalAxisDateRange;

    public SparklineGroup horizontalAxisDateRange(String horizontalAxisDateRange) {
        this.horizontalAxisDateRange = horizontalAxisDateRange;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHorizontalAxisDateRange() {
        return horizontalAxisDateRange;
    }

    public void setHorizontalAxisDateRange(String horizontalAxisDateRange) {
        this.horizontalAxisDateRange = horizontalAxisDateRange;
    }

    @SerializedName("LastPointColor")
    @JsonProperty("LastPointColor")
    private CellsColor lastPointColor;

    public SparklineGroup lastPointColor(CellsColor lastPointColor) {
        this.lastPointColor = lastPointColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getLastPointColor() {
        return lastPointColor;
    }

    public void setLastPointColor(CellsColor lastPointColor) {
        this.lastPointColor = lastPointColor;
    }

    @SerializedName("LineWeight")
    @JsonProperty("LineWeight")
    private Double lineWeight;

    public SparklineGroup lineWeight(Double lineWeight) {
        this.lineWeight = lineWeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getLineWeight() {
        return lineWeight;
    }

    public void setLineWeight(Double lineWeight) {
        this.lineWeight = lineWeight;
    }

    @SerializedName("LowPointColor")
    @JsonProperty("LowPointColor")
    private CellsColor lowPointColor;

    public SparklineGroup lowPointColor(CellsColor lowPointColor) {
        this.lowPointColor = lowPointColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getLowPointColor() {
        return lowPointColor;
    }

    public void setLowPointColor(CellsColor lowPointColor) {
        this.lowPointColor = lowPointColor;
    }

    @SerializedName("MarkersColor")
    @JsonProperty("MarkersColor")
    private CellsColor markersColor;

    public SparklineGroup markersColor(CellsColor markersColor) {
        this.markersColor = markersColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getMarkersColor() {
        return markersColor;
    }

    public void setMarkersColor(CellsColor markersColor) {
        this.markersColor = markersColor;
    }

    @SerializedName("NegativePointsColor")
    @JsonProperty("NegativePointsColor")
    private CellsColor negativePointsColor;

    public SparklineGroup negativePointsColor(CellsColor negativePointsColor) {
        this.negativePointsColor = negativePointsColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getNegativePointsColor() {
        return negativePointsColor;
    }

    public void setNegativePointsColor(CellsColor negativePointsColor) {
        this.negativePointsColor = negativePointsColor;
    }

    @SerializedName("PlotEmptyCellsType")
    @JsonProperty("PlotEmptyCellsType")
    private String plotEmptyCellsType;

    public SparklineGroup plotEmptyCellsType(String plotEmptyCellsType) {
        this.plotEmptyCellsType = plotEmptyCellsType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPlotEmptyCellsType() {
        return plotEmptyCellsType;
    }

    public void setPlotEmptyCellsType(String plotEmptyCellsType) {
        this.plotEmptyCellsType = plotEmptyCellsType;
    }

    @SerializedName("PlotRightToLeft")
    @JsonProperty("PlotRightToLeft")
    private Boolean plotRightToLeft;

    public SparklineGroup plotRightToLeft(Boolean plotRightToLeft) {
        this.plotRightToLeft = plotRightToLeft;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPlotRightToLeft() {
        return plotRightToLeft;
    }

    public void setPlotRightToLeft(Boolean plotRightToLeft) {
        this.plotRightToLeft = plotRightToLeft;
    }

    @SerializedName("PresetStyle")
    @JsonProperty("PresetStyle")
    private String presetStyle;

    public SparklineGroup presetStyle(String presetStyle) {
        this.presetStyle = presetStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPresetStyle() {
        return presetStyle;
    }

    public void setPresetStyle(String presetStyle) {
        this.presetStyle = presetStyle;
    }

    @SerializedName("SeriesColor")
    @JsonProperty("SeriesColor")
    private CellsColor seriesColor;

    public SparklineGroup seriesColor(CellsColor seriesColor) {
        this.seriesColor = seriesColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getSeriesColor() {
        return seriesColor;
    }

    public void setSeriesColor(CellsColor seriesColor) {
        this.seriesColor = seriesColor;
    }

    @SerializedName("ShowFirstPoint")
    @JsonProperty("ShowFirstPoint")
    private Boolean showFirstPoint;

    public SparklineGroup showFirstPoint(Boolean showFirstPoint) {
        this.showFirstPoint = showFirstPoint;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowFirstPoint() {
        return showFirstPoint;
    }

    public void setShowFirstPoint(Boolean showFirstPoint) {
        this.showFirstPoint = showFirstPoint;
    }

    @SerializedName("ShowHighPoint")
    @JsonProperty("ShowHighPoint")
    private Boolean showHighPoint;

    public SparklineGroup showHighPoint(Boolean showHighPoint) {
        this.showHighPoint = showHighPoint;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowHighPoint() {
        return showHighPoint;
    }

    public void setShowHighPoint(Boolean showHighPoint) {
        this.showHighPoint = showHighPoint;
    }

    @SerializedName("ShowHorizontalAxis")
    @JsonProperty("ShowHorizontalAxis")
    private Boolean showHorizontalAxis;

    public SparklineGroup showHorizontalAxis(Boolean showHorizontalAxis) {
        this.showHorizontalAxis = showHorizontalAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowHorizontalAxis() {
        return showHorizontalAxis;
    }

    public void setShowHorizontalAxis(Boolean showHorizontalAxis) {
        this.showHorizontalAxis = showHorizontalAxis;
    }

    @SerializedName("ShowLastPoint")
    @JsonProperty("ShowLastPoint")
    private Boolean showLastPoint;

    public SparklineGroup showLastPoint(Boolean showLastPoint) {
        this.showLastPoint = showLastPoint;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowLastPoint() {
        return showLastPoint;
    }

    public void setShowLastPoint(Boolean showLastPoint) {
        this.showLastPoint = showLastPoint;
    }

    @SerializedName("ShowLowPoint")
    @JsonProperty("ShowLowPoint")
    private Boolean showLowPoint;

    public SparklineGroup showLowPoint(Boolean showLowPoint) {
        this.showLowPoint = showLowPoint;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowLowPoint() {
        return showLowPoint;
    }

    public void setShowLowPoint(Boolean showLowPoint) {
        this.showLowPoint = showLowPoint;
    }

    @SerializedName("ShowMarkers")
    @JsonProperty("ShowMarkers")
    private Boolean showMarkers;

    public SparklineGroup showMarkers(Boolean showMarkers) {
        this.showMarkers = showMarkers;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowMarkers() {
        return showMarkers;
    }

    public void setShowMarkers(Boolean showMarkers) {
        this.showMarkers = showMarkers;
    }

    @SerializedName("ShowNegativePoints")
    @JsonProperty("ShowNegativePoints")
    private Boolean showNegativePoints;

    public SparklineGroup showNegativePoints(Boolean showNegativePoints) {
        this.showNegativePoints = showNegativePoints;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowNegativePoints() {
        return showNegativePoints;
    }

    public void setShowNegativePoints(Boolean showNegativePoints) {
        this.showNegativePoints = showNegativePoints;
    }

    @SerializedName("SparklineCollection")
    @JsonProperty("SparklineCollection")
    private List<Sparkline> sparklineCollection;

    public SparklineGroup sparklineCollection(List<Sparkline> sparklineCollection) {
        this.sparklineCollection = sparklineCollection;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Sparkline> getSparklineCollection() {
        return sparklineCollection;
    }

    public void setSparklineCollection(List<Sparkline> sparklineCollection) {
        this.sparklineCollection = sparklineCollection;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public SparklineGroup type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("VerticalAxisMaxValue")
    @JsonProperty("VerticalAxisMaxValue")
    private Double verticalAxisMaxValue;

    public SparklineGroup verticalAxisMaxValue(Double verticalAxisMaxValue) {
        this.verticalAxisMaxValue = verticalAxisMaxValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getVerticalAxisMaxValue() {
        return verticalAxisMaxValue;
    }

    public void setVerticalAxisMaxValue(Double verticalAxisMaxValue) {
        this.verticalAxisMaxValue = verticalAxisMaxValue;
    }

    @SerializedName("VerticalAxisMaxValueType")
    @JsonProperty("VerticalAxisMaxValueType")
    private String verticalAxisMaxValueType;

    public SparklineGroup verticalAxisMaxValueType(String verticalAxisMaxValueType) {
        this.verticalAxisMaxValueType = verticalAxisMaxValueType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getVerticalAxisMaxValueType() {
        return verticalAxisMaxValueType;
    }

    public void setVerticalAxisMaxValueType(String verticalAxisMaxValueType) {
        this.verticalAxisMaxValueType = verticalAxisMaxValueType;
    }

    @SerializedName("VerticalAxisMinValue")
    @JsonProperty("VerticalAxisMinValue")
    private Double verticalAxisMinValue;

    public SparklineGroup verticalAxisMinValue(Double verticalAxisMinValue) {
        this.verticalAxisMinValue = verticalAxisMinValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getVerticalAxisMinValue() {
        return verticalAxisMinValue;
    }

    public void setVerticalAxisMinValue(Double verticalAxisMinValue) {
        this.verticalAxisMinValue = verticalAxisMinValue;
    }

    @SerializedName("VerticalAxisMinValueType")
    @JsonProperty("VerticalAxisMinValueType")
    private String verticalAxisMinValueType;

    public SparklineGroup verticalAxisMinValueType(String verticalAxisMinValueType) {
        this.verticalAxisMinValueType = verticalAxisMinValueType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getVerticalAxisMinValueType() {
        return verticalAxisMinValueType;
    }

    public void setVerticalAxisMinValueType(String verticalAxisMinValueType) {
        this.verticalAxisMinValueType = verticalAxisMinValueType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SparklineGroup other = (SparklineGroup) o;
        return Objects.equals(this.displayHidden, other.displayHidden)
            && Objects.equals(this.firstPointColor, other.firstPointColor)
            && Objects.equals(this.highPointColor, other.highPointColor)
            && Objects.equals(this.horizontalAxisColor, other.horizontalAxisColor)
            && Objects.equals(this.horizontalAxisDateRange, other.horizontalAxisDateRange)
            && Objects.equals(this.lastPointColor, other.lastPointColor)
            && Objects.equals(this.lineWeight, other.lineWeight)
            && Objects.equals(this.lowPointColor, other.lowPointColor)
            && Objects.equals(this.markersColor, other.markersColor)
            && Objects.equals(this.negativePointsColor, other.negativePointsColor)
            && Objects.equals(this.plotEmptyCellsType, other.plotEmptyCellsType)
            && Objects.equals(this.plotRightToLeft, other.plotRightToLeft)
            && Objects.equals(this.presetStyle, other.presetStyle)
            && Objects.equals(this.seriesColor, other.seriesColor)
            && Objects.equals(this.showFirstPoint, other.showFirstPoint)
            && Objects.equals(this.showHighPoint, other.showHighPoint)
            && Objects.equals(this.showHorizontalAxis, other.showHorizontalAxis)
            && Objects.equals(this.showLastPoint, other.showLastPoint)
            && Objects.equals(this.showLowPoint, other.showLowPoint)
            && Objects.equals(this.showMarkers, other.showMarkers)
            && Objects.equals(this.showNegativePoints, other.showNegativePoints)
            && Objects.equals(this.sparklineCollection, other.sparklineCollection)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.verticalAxisMaxValue, other.verticalAxisMaxValue)
            && Objects.equals(this.verticalAxisMaxValueType, other.verticalAxisMaxValueType)
            && Objects.equals(this.verticalAxisMinValue, other.verticalAxisMinValue)
            && Objects.equals(this.verticalAxisMinValueType, other.verticalAxisMinValueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayHidden, firstPointColor, highPointColor, horizontalAxisColor, horizontalAxisDateRange, lastPointColor, lineWeight, lowPointColor, markersColor, negativePointsColor, plotEmptyCellsType, plotRightToLeft, presetStyle, seriesColor, showFirstPoint, showHighPoint, showHorizontalAxis, showLastPoint, showLowPoint, showMarkers, showNegativePoints, sparklineCollection, type, verticalAxisMaxValue, verticalAxisMaxValueType, verticalAxisMinValue, verticalAxisMinValueType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparklineGroup {\n");
        sb.append("    displayHidden: ").append(displayHidden).append("\n");
        sb.append("    firstPointColor: ").append(firstPointColor).append("\n");
        sb.append("    highPointColor: ").append(highPointColor).append("\n");
        sb.append("    horizontalAxisColor: ").append(horizontalAxisColor).append("\n");
        sb.append("    horizontalAxisDateRange: ").append(horizontalAxisDateRange).append("\n");
        sb.append("    lastPointColor: ").append(lastPointColor).append("\n");
        sb.append("    lineWeight: ").append(lineWeight).append("\n");
        sb.append("    lowPointColor: ").append(lowPointColor).append("\n");
        sb.append("    markersColor: ").append(markersColor).append("\n");
        sb.append("    negativePointsColor: ").append(negativePointsColor).append("\n");
        sb.append("    plotEmptyCellsType: ").append(plotEmptyCellsType).append("\n");
        sb.append("    plotRightToLeft: ").append(plotRightToLeft).append("\n");
        sb.append("    presetStyle: ").append(presetStyle).append("\n");
        sb.append("    seriesColor: ").append(seriesColor).append("\n");
        sb.append("    showFirstPoint: ").append(showFirstPoint).append("\n");
        sb.append("    showHighPoint: ").append(showHighPoint).append("\n");
        sb.append("    showHorizontalAxis: ").append(showHorizontalAxis).append("\n");
        sb.append("    showLastPoint: ").append(showLastPoint).append("\n");
        sb.append("    showLowPoint: ").append(showLowPoint).append("\n");
        sb.append("    showMarkers: ").append(showMarkers).append("\n");
        sb.append("    showNegativePoints: ").append(showNegativePoints).append("\n");
        sb.append("    sparklineCollection: ").append(sparklineCollection).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    verticalAxisMaxValue: ").append(verticalAxisMaxValue).append("\n");
        sb.append("    verticalAxisMaxValueType: ").append(verticalAxisMaxValueType).append("\n");
        sb.append("    verticalAxisMinValue: ").append(verticalAxisMinValue).append("\n");
        sb.append("    verticalAxisMinValueType: ").append(verticalAxisMinValueType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

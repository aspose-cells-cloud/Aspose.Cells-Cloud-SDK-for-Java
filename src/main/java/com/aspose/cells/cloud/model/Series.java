/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Series.java">
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

public class Series extends LinkElement {

    @SerializedName("Area")
    @JsonProperty("Area")
    private Area area;

    public Series area(Area area) {
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

    @SerializedName("Bar3DShapeType")
    @JsonProperty("Bar3DShapeType")
    private String bar3DShapeType;

    public Series bar3DShapeType(String bar3DShapeType) {
        this.bar3DShapeType = bar3DShapeType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBar3DShapeType() {
        return bar3DShapeType;
    }

    public void setBar3DShapeType(String bar3DShapeType) {
        this.bar3DShapeType = bar3DShapeType;
    }

    @SerializedName("Border")
    @JsonProperty("Border")
    private Line border;

    public Series border(Line border) {
        this.border = border;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getBorder() {
        return border;
    }

    public void setBorder(Line border) {
        this.border = border;
    }

    @SerializedName("BubbleScale")
    @JsonProperty("BubbleScale")
    private Integer bubbleScale;

    public Series bubbleScale(Integer bubbleScale) {
        this.bubbleScale = bubbleScale;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBubbleScale() {
        return bubbleScale;
    }

    public void setBubbleScale(Integer bubbleScale) {
        this.bubbleScale = bubbleScale;
    }

    @SerializedName("BubbleSizes")
    @JsonProperty("BubbleSizes")
    private String bubbleSizes;

    public Series bubbleSizes(String bubbleSizes) {
        this.bubbleSizes = bubbleSizes;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBubbleSizes() {
        return bubbleSizes;
    }

    public void setBubbleSizes(String bubbleSizes) {
        this.bubbleSizes = bubbleSizes;
    }

    @SerializedName("CountOfDataValues")
    @JsonProperty("CountOfDataValues")
    private Integer countOfDataValues;

    public Series countOfDataValues(Integer countOfDataValues) {
        this.countOfDataValues = countOfDataValues;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCountOfDataValues() {
        return countOfDataValues;
    }

    public void setCountOfDataValues(Integer countOfDataValues) {
        this.countOfDataValues = countOfDataValues;
    }

    @SerializedName("DataLabels")
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    public Series dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    @SerializedName("DisplayName")
    @JsonProperty("DisplayName")
    private String displayName;

    public Series displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @SerializedName("DoughnutHoleSize")
    @JsonProperty("DoughnutHoleSize")
    private Integer doughnutHoleSize;

    public Series doughnutHoleSize(Integer doughnutHoleSize) {
        this.doughnutHoleSize = doughnutHoleSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getDoughnutHoleSize() {
        return doughnutHoleSize;
    }

    public void setDoughnutHoleSize(Integer doughnutHoleSize) {
        this.doughnutHoleSize = doughnutHoleSize;
    }

    @SerializedName("DownBars")
    @JsonProperty("DownBars")
    private DropBars downBars;

    public Series downBars(DropBars downBars) {
        this.downBars = downBars;
        return this;
    }

    @ApiModelProperty(value = "")
    public DropBars getDownBars() {
        return downBars;
    }

    public void setDownBars(DropBars downBars) {
        this.downBars = downBars;
    }

    @SerializedName("DropLines")
    @JsonProperty("DropLines")
    private Line dropLines;

    public Series dropLines(Line dropLines) {
        this.dropLines = dropLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getDropLines() {
        return dropLines;
    }

    public void setDropLines(Line dropLines) {
        this.dropLines = dropLines;
    }

    @SerializedName("Explosion")
    @JsonProperty("Explosion")
    private Integer explosion;

    public Series explosion(Integer explosion) {
        this.explosion = explosion;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getExplosion() {
        return explosion;
    }

    public void setExplosion(Integer explosion) {
        this.explosion = explosion;
    }

    @SerializedName("FirstSliceAngle")
    @JsonProperty("FirstSliceAngle")
    private Integer firstSliceAngle;

    public Series firstSliceAngle(Integer firstSliceAngle) {
        this.firstSliceAngle = firstSliceAngle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstSliceAngle() {
        return firstSliceAngle;
    }

    public void setFirstSliceAngle(Integer firstSliceAngle) {
        this.firstSliceAngle = firstSliceAngle;
    }

    @SerializedName("GapWidth")
    @JsonProperty("GapWidth")
    private Integer gapWidth;

    public Series gapWidth(Integer gapWidth) {
        this.gapWidth = gapWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getGapWidth() {
        return gapWidth;
    }

    public void setGapWidth(Integer gapWidth) {
        this.gapWidth = gapWidth;
    }

    @SerializedName("Has3DEffect")
    @JsonProperty("Has3DEffect")
    private Boolean has3DEffect;

    public Series has3DEffect(Boolean has3DEffect) {
        this.has3DEffect = has3DEffect;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHas3DEffect() {
        return has3DEffect;
    }

    public void setHas3DEffect(Boolean has3DEffect) {
        this.has3DEffect = has3DEffect;
    }

    @SerializedName("HasDropLines")
    @JsonProperty("HasDropLines")
    private Boolean hasDropLines;

    public Series hasDropLines(Boolean hasDropLines) {
        this.hasDropLines = hasDropLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasDropLines() {
        return hasDropLines;
    }

    public void setHasDropLines(Boolean hasDropLines) {
        this.hasDropLines = hasDropLines;
    }

    @SerializedName("HasHiLoLines")
    @JsonProperty("HasHiLoLines")
    private Boolean hasHiLoLines;

    public Series hasHiLoLines(Boolean hasHiLoLines) {
        this.hasHiLoLines = hasHiLoLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasHiLoLines() {
        return hasHiLoLines;
    }

    public void setHasHiLoLines(Boolean hasHiLoLines) {
        this.hasHiLoLines = hasHiLoLines;
    }

    @SerializedName("HasLeaderLines")
    @JsonProperty("HasLeaderLines")
    private Boolean hasLeaderLines;

    public Series hasLeaderLines(Boolean hasLeaderLines) {
        this.hasLeaderLines = hasLeaderLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasLeaderLines() {
        return hasLeaderLines;
    }

    public void setHasLeaderLines(Boolean hasLeaderLines) {
        this.hasLeaderLines = hasLeaderLines;
    }

    @SerializedName("HasRadarAxisLabels")
    @JsonProperty("HasRadarAxisLabels")
    private Boolean hasRadarAxisLabels;

    public Series hasRadarAxisLabels(Boolean hasRadarAxisLabels) {
        this.hasRadarAxisLabels = hasRadarAxisLabels;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasRadarAxisLabels() {
        return hasRadarAxisLabels;
    }

    public void setHasRadarAxisLabels(Boolean hasRadarAxisLabels) {
        this.hasRadarAxisLabels = hasRadarAxisLabels;
    }

    @SerializedName("HasSeriesLines")
    @JsonProperty("HasSeriesLines")
    private Boolean hasSeriesLines;

    public Series hasSeriesLines(Boolean hasSeriesLines) {
        this.hasSeriesLines = hasSeriesLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasSeriesLines() {
        return hasSeriesLines;
    }

    public void setHasSeriesLines(Boolean hasSeriesLines) {
        this.hasSeriesLines = hasSeriesLines;
    }

    @SerializedName("HasUpDownBars")
    @JsonProperty("HasUpDownBars")
    private Boolean hasUpDownBars;

    public Series hasUpDownBars(Boolean hasUpDownBars) {
        this.hasUpDownBars = hasUpDownBars;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasUpDownBars() {
        return hasUpDownBars;
    }

    public void setHasUpDownBars(Boolean hasUpDownBars) {
        this.hasUpDownBars = hasUpDownBars;
    }

    @SerializedName("HiLoLines")
    @JsonProperty("HiLoLines")
    private Line hiLoLines;

    public Series hiLoLines(Line hiLoLines) {
        this.hiLoLines = hiLoLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getHiLoLines() {
        return hiLoLines;
    }

    public void setHiLoLines(Line hiLoLines) {
        this.hiLoLines = hiLoLines;
    }

    @SerializedName("IsAutoSplit")
    @JsonProperty("IsAutoSplit")
    private Boolean isAutoSplit;

    public Series isAutoSplit(Boolean isAutoSplit) {
        this.isAutoSplit = isAutoSplit;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoSplit() {
        return isAutoSplit;
    }

    public void setIsAutoSplit(Boolean isAutoSplit) {
        this.isAutoSplit = isAutoSplit;
    }

    @SerializedName("IsColorVaried")
    @JsonProperty("IsColorVaried")
    private Boolean isColorVaried;

    public Series isColorVaried(Boolean isColorVaried) {
        this.isColorVaried = isColorVaried;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsColorVaried() {
        return isColorVaried;
    }

    public void setIsColorVaried(Boolean isColorVaried) {
        this.isColorVaried = isColorVaried;
    }

    @SerializedName("LeaderLines")
    @JsonProperty("LeaderLines")
    private Line leaderLines;

    public Series leaderLines(Line leaderLines) {
        this.leaderLines = leaderLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getLeaderLines() {
        return leaderLines;
    }

    public void setLeaderLines(Line leaderLines) {
        this.leaderLines = leaderLines;
    }

    @SerializedName("LegendEntry")
    @JsonProperty("LegendEntry")
    private LegendEntry legendEntry;

    public Series legendEntry(LegendEntry legendEntry) {
        this.legendEntry = legendEntry;
        return this;
    }

    @ApiModelProperty(value = "")
    public LegendEntry getLegendEntry() {
        return legendEntry;
    }

    public void setLegendEntry(LegendEntry legendEntry) {
        this.legendEntry = legendEntry;
    }

    @SerializedName("Marker")
    @JsonProperty("Marker")
    private Marker marker;

    public Series marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    @ApiModelProperty(value = "")
    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Series name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("Overlap")
    @JsonProperty("Overlap")
    private Integer overlap;

    public Series overlap(Integer overlap) {
        this.overlap = overlap;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getOverlap() {
        return overlap;
    }

    public void setOverlap(Integer overlap) {
        this.overlap = overlap;
    }

    @SerializedName("PlotOnSecondAxis")
    @JsonProperty("PlotOnSecondAxis")
    private Boolean plotOnSecondAxis;

    public Series plotOnSecondAxis(Boolean plotOnSecondAxis) {
        this.plotOnSecondAxis = plotOnSecondAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPlotOnSecondAxis() {
        return plotOnSecondAxis;
    }

    public void setPlotOnSecondAxis(Boolean plotOnSecondAxis) {
        this.plotOnSecondAxis = plotOnSecondAxis;
    }

    @SerializedName("Points")
    @JsonProperty("Points")
    private LinkElement points;

    public Series points(LinkElement points) {
        this.points = points;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getPoints() {
        return points;
    }

    public void setPoints(LinkElement points) {
        this.points = points;
    }

    @SerializedName("SecondPlotSize")
    @JsonProperty("SecondPlotSize")
    private Integer secondPlotSize;

    public Series secondPlotSize(Integer secondPlotSize) {
        this.secondPlotSize = secondPlotSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getSecondPlotSize() {
        return secondPlotSize;
    }

    public void setSecondPlotSize(Integer secondPlotSize) {
        this.secondPlotSize = secondPlotSize;
    }

    @SerializedName("SeriesLines")
    @JsonProperty("SeriesLines")
    private Line seriesLines;

    public Series seriesLines(Line seriesLines) {
        this.seriesLines = seriesLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Line getSeriesLines() {
        return seriesLines;
    }

    public void setSeriesLines(Line seriesLines) {
        this.seriesLines = seriesLines;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public Series shadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    @SerializedName("ShowNegativeBubbles")
    @JsonProperty("ShowNegativeBubbles")
    private Boolean showNegativeBubbles;

    public Series showNegativeBubbles(Boolean showNegativeBubbles) {
        this.showNegativeBubbles = showNegativeBubbles;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowNegativeBubbles() {
        return showNegativeBubbles;
    }

    public void setShowNegativeBubbles(Boolean showNegativeBubbles) {
        this.showNegativeBubbles = showNegativeBubbles;
    }

    @SerializedName("SizeRepresents")
    @JsonProperty("SizeRepresents")
    private String sizeRepresents;

    public Series sizeRepresents(String sizeRepresents) {
        this.sizeRepresents = sizeRepresents;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSizeRepresents() {
        return sizeRepresents;
    }

    public void setSizeRepresents(String sizeRepresents) {
        this.sizeRepresents = sizeRepresents;
    }

    @SerializedName("Smooth")
    @JsonProperty("Smooth")
    private Boolean smooth;

    public Series smooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSmooth() {
        return smooth;
    }

    public void setSmooth(Boolean smooth) {
        this.smooth = smooth;
    }

    @SerializedName("SplitType")
    @JsonProperty("SplitType")
    private String splitType;

    public Series splitType(String splitType) {
        this.splitType = splitType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSplitType() {
        return splitType;
    }

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    @SerializedName("SplitValue")
    @JsonProperty("SplitValue")
    private Double splitValue;

    public Series splitValue(Double splitValue) {
        this.splitValue = splitValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getSplitValue() {
        return splitValue;
    }

    public void setSplitValue(Double splitValue) {
        this.splitValue = splitValue;
    }

    @SerializedName("TrendLines")
    @JsonProperty("TrendLines")
    private Trendlines trendLines;

    public Series trendLines(Trendlines trendLines) {
        this.trendLines = trendLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Trendlines getTrendLines() {
        return trendLines;
    }

    public void setTrendLines(Trendlines trendLines) {
        this.trendLines = trendLines;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public Series type(String type) {
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

    @SerializedName("UpBars")
    @JsonProperty("UpBars")
    private DropBars upBars;

    public Series upBars(DropBars upBars) {
        this.upBars = upBars;
        return this;
    }

    @ApiModelProperty(value = "")
    public DropBars getUpBars() {
        return upBars;
    }

    public void setUpBars(DropBars upBars) {
        this.upBars = upBars;
    }

    @SerializedName("Values")
    @JsonProperty("Values")
    private String values;

    public Series values(String values) {
        this.values = values;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @SerializedName("XErrorBar")
    @JsonProperty("XErrorBar")
    private ErrorBar xErrorBar;

    public Series xErrorBar(ErrorBar xErrorBar) {
        this.xErrorBar = xErrorBar;
        return this;
    }

    @ApiModelProperty(value = "")
    public ErrorBar getXErrorBar() {
        return xErrorBar;
    }

    public void setXErrorBar(ErrorBar xErrorBar) {
        this.xErrorBar = xErrorBar;
    }

    @SerializedName("XValues")
    @JsonProperty("XValues")
    private String xValues;

    public Series xValues(String xValues) {
        this.xValues = xValues;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getXValues() {
        return xValues;
    }

    public void setXValues(String xValues) {
        this.xValues = xValues;
    }

    @SerializedName("YErrorBar")
    @JsonProperty("YErrorBar")
    private ErrorBar yErrorBar;

    public Series yErrorBar(ErrorBar yErrorBar) {
        this.yErrorBar = yErrorBar;
        return this;
    }

    @ApiModelProperty(value = "")
    public ErrorBar getYErrorBar() {
        return yErrorBar;
    }

    public void setYErrorBar(ErrorBar yErrorBar) {
        this.yErrorBar = yErrorBar;
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
        Series other = (Series) o;
        return Objects.equals(this.area, other.area)
            && Objects.equals(this.bar3DShapeType, other.bar3DShapeType)
            && Objects.equals(this.border, other.border)
            && Objects.equals(this.bubbleScale, other.bubbleScale)
            && Objects.equals(this.bubbleSizes, other.bubbleSizes)
            && Objects.equals(this.countOfDataValues, other.countOfDataValues)
            && Objects.equals(this.dataLabels, other.dataLabels)
            && Objects.equals(this.displayName, other.displayName)
            && Objects.equals(this.doughnutHoleSize, other.doughnutHoleSize)
            && Objects.equals(this.downBars, other.downBars)
            && Objects.equals(this.dropLines, other.dropLines)
            && Objects.equals(this.explosion, other.explosion)
            && Objects.equals(this.firstSliceAngle, other.firstSliceAngle)
            && Objects.equals(this.gapWidth, other.gapWidth)
            && Objects.equals(this.has3DEffect, other.has3DEffect)
            && Objects.equals(this.hasDropLines, other.hasDropLines)
            && Objects.equals(this.hasHiLoLines, other.hasHiLoLines)
            && Objects.equals(this.hasLeaderLines, other.hasLeaderLines)
            && Objects.equals(this.hasRadarAxisLabels, other.hasRadarAxisLabels)
            && Objects.equals(this.hasSeriesLines, other.hasSeriesLines)
            && Objects.equals(this.hasUpDownBars, other.hasUpDownBars)
            && Objects.equals(this.hiLoLines, other.hiLoLines)
            && Objects.equals(this.isAutoSplit, other.isAutoSplit)
            && Objects.equals(this.isColorVaried, other.isColorVaried)
            && Objects.equals(this.leaderLines, other.leaderLines)
            && Objects.equals(this.legendEntry, other.legendEntry)
            && Objects.equals(this.marker, other.marker)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.overlap, other.overlap)
            && Objects.equals(this.plotOnSecondAxis, other.plotOnSecondAxis)
            && Objects.equals(this.points, other.points)
            && Objects.equals(this.secondPlotSize, other.secondPlotSize)
            && Objects.equals(this.seriesLines, other.seriesLines)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.showNegativeBubbles, other.showNegativeBubbles)
            && Objects.equals(this.sizeRepresents, other.sizeRepresents)
            && Objects.equals(this.smooth, other.smooth)
            && Objects.equals(this.splitType, other.splitType)
            && Objects.equals(this.splitValue, other.splitValue)
            && Objects.equals(this.trendLines, other.trendLines)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.upBars, other.upBars)
            && Objects.equals(this.values, other.values)
            && Objects.equals(this.xErrorBar, other.xErrorBar)
            && Objects.equals(this.xValues, other.xValues)
            && Objects.equals(this.yErrorBar, other.yErrorBar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, bar3DShapeType, border, bubbleScale, bubbleSizes, countOfDataValues, dataLabels, displayName, doughnutHoleSize, downBars, dropLines, explosion, firstSliceAngle, gapWidth, has3DEffect, hasDropLines, hasHiLoLines, hasLeaderLines, hasRadarAxisLabels, hasSeriesLines, hasUpDownBars, hiLoLines, isAutoSplit, isColorVaried, leaderLines, legendEntry, marker, name, overlap, plotOnSecondAxis, points, secondPlotSize, seriesLines, shadow, showNegativeBubbles, sizeRepresents, smooth, splitType, splitValue, trendLines, type, upBars, values, xErrorBar, xValues, yErrorBar, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Series {\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    bar3DShapeType: ").append(bar3DShapeType).append("\n");
        sb.append("    border: ").append(border).append("\n");
        sb.append("    bubbleScale: ").append(bubbleScale).append("\n");
        sb.append("    bubbleSizes: ").append(bubbleSizes).append("\n");
        sb.append("    countOfDataValues: ").append(countOfDataValues).append("\n");
        sb.append("    dataLabels: ").append(dataLabels).append("\n");
        sb.append("    displayName: ").append(displayName).append("\n");
        sb.append("    doughnutHoleSize: ").append(doughnutHoleSize).append("\n");
        sb.append("    downBars: ").append(downBars).append("\n");
        sb.append("    dropLines: ").append(dropLines).append("\n");
        sb.append("    explosion: ").append(explosion).append("\n");
        sb.append("    firstSliceAngle: ").append(firstSliceAngle).append("\n");
        sb.append("    gapWidth: ").append(gapWidth).append("\n");
        sb.append("    has3DEffect: ").append(has3DEffect).append("\n");
        sb.append("    hasDropLines: ").append(hasDropLines).append("\n");
        sb.append("    hasHiLoLines: ").append(hasHiLoLines).append("\n");
        sb.append("    hasLeaderLines: ").append(hasLeaderLines).append("\n");
        sb.append("    hasRadarAxisLabels: ").append(hasRadarAxisLabels).append("\n");
        sb.append("    hasSeriesLines: ").append(hasSeriesLines).append("\n");
        sb.append("    hasUpDownBars: ").append(hasUpDownBars).append("\n");
        sb.append("    hiLoLines: ").append(hiLoLines).append("\n");
        sb.append("    isAutoSplit: ").append(isAutoSplit).append("\n");
        sb.append("    isColorVaried: ").append(isColorVaried).append("\n");
        sb.append("    leaderLines: ").append(leaderLines).append("\n");
        sb.append("    legendEntry: ").append(legendEntry).append("\n");
        sb.append("    marker: ").append(marker).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    overlap: ").append(overlap).append("\n");
        sb.append("    plotOnSecondAxis: ").append(plotOnSecondAxis).append("\n");
        sb.append("    points: ").append(points).append("\n");
        sb.append("    secondPlotSize: ").append(secondPlotSize).append("\n");
        sb.append("    seriesLines: ").append(seriesLines).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    showNegativeBubbles: ").append(showNegativeBubbles).append("\n");
        sb.append("    sizeRepresents: ").append(sizeRepresents).append("\n");
        sb.append("    smooth: ").append(smooth).append("\n");
        sb.append("    splitType: ").append(splitType).append("\n");
        sb.append("    splitValue: ").append(splitValue).append("\n");
        sb.append("    trendLines: ").append(trendLines).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    upBars: ").append(upBars).append("\n");
        sb.append("    values: ").append(values).append("\n");
        sb.append("    xErrorBar: ").append(xErrorBar).append("\n");
        sb.append("    xValues: ").append(xValues).append("\n");
        sb.append("    yErrorBar: ").append(yErrorBar).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

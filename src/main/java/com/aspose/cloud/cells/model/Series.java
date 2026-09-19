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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Series  extends  LinkElement {
        @SerializedName("Area")
        private Area area ;

        public  Series  area(Area  area) {
            this.area =  area;
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
        private String bar3DShapeType ;

        public  Series  bar3DShapeType(String  bar3DShapeType) {
            this.bar3DShapeType =  bar3DShapeType;
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
        private Line border ;

        public  Series  border(Line  border) {
            this.border =  border;
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
        private Integer bubbleScale ;

        public  Series  bubbleScale(Integer  bubbleScale) {
            this.bubbleScale =  bubbleScale;
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
        private String bubbleSizes ;

        public  Series  bubbleSizes(String  bubbleSizes) {
            this.bubbleSizes =  bubbleSizes;
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
        private Integer countOfDataValues ;

        public  Series  countOfDataValues(Integer  countOfDataValues) {
            this.countOfDataValues =  countOfDataValues;
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
        private DataLabels dataLabels ;

        public  Series  dataLabels(DataLabels  dataLabels) {
            this.dataLabels =  dataLabels;
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
        private String displayName ;

        public  Series  displayName(String  displayName) {
            this.displayName =  displayName;
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
        private Integer doughnutHoleSize ;

        public  Series  doughnutHoleSize(Integer  doughnutHoleSize) {
            this.doughnutHoleSize =  doughnutHoleSize;
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
        private DropBars downBars ;

        public  Series  downBars(DropBars  downBars) {
            this.downBars =  downBars;
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
        private Line dropLines ;

        public  Series  dropLines(Line  dropLines) {
            this.dropLines =  dropLines;
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
        private Integer explosion ;

        public  Series  explosion(Integer  explosion) {
            this.explosion =  explosion;
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
        private Integer firstSliceAngle ;

        public  Series  firstSliceAngle(Integer  firstSliceAngle) {
            this.firstSliceAngle =  firstSliceAngle;
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
        private Integer gapWidth ;

        public  Series  gapWidth(Integer  gapWidth) {
            this.gapWidth =  gapWidth;
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
        private Boolean has3DEffect ;

        public  Series  has3DEffect(Boolean  has3DEffect) {
            this.has3DEffect =  has3DEffect;
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
        private Boolean hasDropLines ;

        public  Series  hasDropLines(Boolean  hasDropLines) {
            this.hasDropLines =  hasDropLines;
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
        private Boolean hasHiLoLines ;

        public  Series  hasHiLoLines(Boolean  hasHiLoLines) {
            this.hasHiLoLines =  hasHiLoLines;
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
        private Boolean hasLeaderLines ;

        public  Series  hasLeaderLines(Boolean  hasLeaderLines) {
            this.hasLeaderLines =  hasLeaderLines;
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
        private Boolean hasRadarAxisLabels ;

        public  Series  hasRadarAxisLabels(Boolean  hasRadarAxisLabels) {
            this.hasRadarAxisLabels =  hasRadarAxisLabels;
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
        private Boolean hasSeriesLines ;

        public  Series  hasSeriesLines(Boolean  hasSeriesLines) {
            this.hasSeriesLines =  hasSeriesLines;
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
        private Boolean hasUpDownBars ;

        public  Series  hasUpDownBars(Boolean  hasUpDownBars) {
            this.hasUpDownBars =  hasUpDownBars;
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
        private Line hiLoLines ;

        public  Series  hiLoLines(Line  hiLoLines) {
            this.hiLoLines =  hiLoLines;
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
        private Boolean isAutoSplit ;

        public  Series  isAutoSplit(Boolean  isAutoSplit) {
            this.isAutoSplit =  isAutoSplit;
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
        private Boolean isColorVaried ;

        public  Series  isColorVaried(Boolean  isColorVaried) {
            this.isColorVaried =  isColorVaried;
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
        private Line leaderLines ;

        public  Series  leaderLines(Line  leaderLines) {
            this.leaderLines =  leaderLines;
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
        private LegendEntry legendEntry ;

        public  Series  legendEntry(LegendEntry  legendEntry) {
            this.legendEntry =  legendEntry;
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
        private Marker marker ;

        public  Series  marker(Marker  marker) {
            this.marker =  marker;
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
        private String name ;

        public  Series  name(String  name) {
            this.name =  name;
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
        private Integer overlap ;

        public  Series  overlap(Integer  overlap) {
            this.overlap =  overlap;
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
        private Boolean plotOnSecondAxis ;

        public  Series  plotOnSecondAxis(Boolean  plotOnSecondAxis) {
            this.plotOnSecondAxis =  plotOnSecondAxis;
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
        private LinkElement points ;

        public  Series  points(LinkElement  points) {
            this.points =  points;
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
        private Integer secondPlotSize ;

        public  Series  secondPlotSize(Integer  secondPlotSize) {
            this.secondPlotSize =  secondPlotSize;
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
        private Line seriesLines ;

        public  Series  seriesLines(Line  seriesLines) {
            this.seriesLines =  seriesLines;
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
        private Boolean shadow ;

        public  Series  shadow(Boolean  shadow) {
            this.shadow =  shadow;
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
        private Boolean showNegativeBubbles ;

        public  Series  showNegativeBubbles(Boolean  showNegativeBubbles) {
            this.showNegativeBubbles =  showNegativeBubbles;
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
        private String sizeRepresents ;

        public  Series  sizeRepresents(String  sizeRepresents) {
            this.sizeRepresents =  sizeRepresents;
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
        private Boolean smooth ;

        public  Series  smooth(Boolean  smooth) {
            this.smooth =  smooth;
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
        private String splitType ;

        public  Series  splitType(String  splitType) {
            this.splitType =  splitType;
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
        private Double splitValue ;

        public  Series  splitValue(Double  splitValue) {
            this.splitValue =  splitValue;
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
        private Trendlines trendLines ;

        public  Series  trendLines(Trendlines  trendLines) {
            this.trendLines =  trendLines;
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
        private String type ;

        public  Series  type(String  type) {
            this.type =  type;
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
        private DropBars upBars ;

        public  Series  upBars(DropBars  upBars) {
            this.upBars =  upBars;
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
        private String values ;

        public  Series  values(String  values) {
            this.values =  values;
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
        private ErrorBar xErrorBar ;

        public  Series  xErrorBar(ErrorBar  xErrorBar) {
            this.xErrorBar =  xErrorBar;
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
        private String xValues ;

        public  Series  xValues(String  xValues) {
            this.xValues =  xValues;
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
        private ErrorBar yErrorBar ;

        public  Series  yErrorBar(ErrorBar  yErrorBar) {
            this.yErrorBar =  yErrorBar;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Series series = (Series) o;
            return
                Objects.equals(this.area, series.area) &&
                Objects.equals(this.bar3DShapeType, series.bar3DShapeType) &&
                Objects.equals(this.border, series.border) &&
                Objects.equals(this.bubbleScale, series.bubbleScale) &&
                Objects.equals(this.bubbleSizes, series.bubbleSizes) &&
                Objects.equals(this.countOfDataValues, series.countOfDataValues) &&
                Objects.equals(this.dataLabels, series.dataLabels) &&
                Objects.equals(this.displayName, series.displayName) &&
                Objects.equals(this.doughnutHoleSize, series.doughnutHoleSize) &&
                Objects.equals(this.downBars, series.downBars) &&
                Objects.equals(this.dropLines, series.dropLines) &&
                Objects.equals(this.explosion, series.explosion) &&
                Objects.equals(this.firstSliceAngle, series.firstSliceAngle) &&
                Objects.equals(this.gapWidth, series.gapWidth) &&
                Objects.equals(this.has3DEffect, series.has3DEffect) &&
                Objects.equals(this.hasDropLines, series.hasDropLines) &&
                Objects.equals(this.hasHiLoLines, series.hasHiLoLines) &&
                Objects.equals(this.hasLeaderLines, series.hasLeaderLines) &&
                Objects.equals(this.hasRadarAxisLabels, series.hasRadarAxisLabels) &&
                Objects.equals(this.hasSeriesLines, series.hasSeriesLines) &&
                Objects.equals(this.hasUpDownBars, series.hasUpDownBars) &&
                Objects.equals(this.hiLoLines, series.hiLoLines) &&
                Objects.equals(this.isAutoSplit, series.isAutoSplit) &&
                Objects.equals(this.isColorVaried, series.isColorVaried) &&
                Objects.equals(this.leaderLines, series.leaderLines) &&
                Objects.equals(this.legendEntry, series.legendEntry) &&
                Objects.equals(this.marker, series.marker) &&
                Objects.equals(this.name, series.name) &&
                Objects.equals(this.overlap, series.overlap) &&
                Objects.equals(this.plotOnSecondAxis, series.plotOnSecondAxis) &&
                Objects.equals(this.points, series.points) &&
                Objects.equals(this.secondPlotSize, series.secondPlotSize) &&
                Objects.equals(this.seriesLines, series.seriesLines) &&
                Objects.equals(this.shadow, series.shadow) &&
                Objects.equals(this.showNegativeBubbles, series.showNegativeBubbles) &&
                Objects.equals(this.sizeRepresents, series.sizeRepresents) &&
                Objects.equals(this.smooth, series.smooth) &&
                Objects.equals(this.splitType, series.splitType) &&
                Objects.equals(this.splitValue, series.splitValue) &&
                Objects.equals(this.trendLines, series.trendLines) &&
                Objects.equals(this.type, series.type) &&
                Objects.equals(this.upBars, series.upBars) &&
                Objects.equals(this.values, series.values) &&
                Objects.equals(this.xErrorBar, series.xErrorBar) &&
                Objects.equals(this.xValues, series.xValues) &&
                Objects.equals(this.yErrorBar, series.yErrorBar) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(area, bar3DShapeType, border, bubbleScale, bubbleSizes, countOfDataValues, dataLabels, displayName, doughnutHoleSize, downBars, dropLines, explosion, firstSliceAngle, gapWidth, has3DEffect, hasDropLines, hasHiLoLines, hasLeaderLines, hasRadarAxisLabels, hasSeriesLines, hasUpDownBars, hiLoLines, isAutoSplit, isColorVaried, leaderLines, legendEntry, marker, name, overlap, plotOnSecondAxis, points, secondPlotSize, seriesLines, shadow, showNegativeBubbles, sizeRepresents, smooth, splitType, splitValue, trendLines, type, upBars, values, xErrorBar, xValues, yErrorBar, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Series {\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    bar3DShapeType: ").append(toIndentedString(getBar3DShapeType())).append("\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    bubbleScale: ").append(toIndentedString(getBubbleScale())).append("\n");
            sb.append("    bubbleSizes: ").append(toIndentedString(getBubbleSizes())).append("\n");
            sb.append("    countOfDataValues: ").append(toIndentedString(getCountOfDataValues())).append("\n");
            sb.append("    dataLabels: ").append(toIndentedString(getDataLabels())).append("\n");
            sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
            sb.append("    doughnutHoleSize: ").append(toIndentedString(getDoughnutHoleSize())).append("\n");
            sb.append("    downBars: ").append(toIndentedString(getDownBars())).append("\n");
            sb.append("    dropLines: ").append(toIndentedString(getDropLines())).append("\n");
            sb.append("    explosion: ").append(toIndentedString(getExplosion())).append("\n");
            sb.append("    firstSliceAngle: ").append(toIndentedString(getFirstSliceAngle())).append("\n");
            sb.append("    gapWidth: ").append(toIndentedString(getGapWidth())).append("\n");
            sb.append("    has3DEffect: ").append(toIndentedString(getHas3DEffect())).append("\n");
            sb.append("    hasDropLines: ").append(toIndentedString(getHasDropLines())).append("\n");
            sb.append("    hasHiLoLines: ").append(toIndentedString(getHasHiLoLines())).append("\n");
            sb.append("    hasLeaderLines: ").append(toIndentedString(getHasLeaderLines())).append("\n");
            sb.append("    hasRadarAxisLabels: ").append(toIndentedString(getHasRadarAxisLabels())).append("\n");
            sb.append("    hasSeriesLines: ").append(toIndentedString(getHasSeriesLines())).append("\n");
            sb.append("    hasUpDownBars: ").append(toIndentedString(getHasUpDownBars())).append("\n");
            sb.append("    hiLoLines: ").append(toIndentedString(getHiLoLines())).append("\n");
            sb.append("    isAutoSplit: ").append(toIndentedString(getIsAutoSplit())).append("\n");
            sb.append("    isColorVaried: ").append(toIndentedString(getIsColorVaried())).append("\n");
            sb.append("    leaderLines: ").append(toIndentedString(getLeaderLines())).append("\n");
            sb.append("    legendEntry: ").append(toIndentedString(getLegendEntry())).append("\n");
            sb.append("    marker: ").append(toIndentedString(getMarker())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    overlap: ").append(toIndentedString(getOverlap())).append("\n");
            sb.append("    plotOnSecondAxis: ").append(toIndentedString(getPlotOnSecondAxis())).append("\n");
            sb.append("    points: ").append(toIndentedString(getPoints())).append("\n");
            sb.append("    secondPlotSize: ").append(toIndentedString(getSecondPlotSize())).append("\n");
            sb.append("    seriesLines: ").append(toIndentedString(getSeriesLines())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
            sb.append("    showNegativeBubbles: ").append(toIndentedString(getShowNegativeBubbles())).append("\n");
            sb.append("    sizeRepresents: ").append(toIndentedString(getSizeRepresents())).append("\n");
            sb.append("    smooth: ").append(toIndentedString(getSmooth())).append("\n");
            sb.append("    splitType: ").append(toIndentedString(getSplitType())).append("\n");
            sb.append("    splitValue: ").append(toIndentedString(getSplitValue())).append("\n");
            sb.append("    trendLines: ").append(toIndentedString(getTrendLines())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    upBars: ").append(toIndentedString(getUpBars())).append("\n");
            sb.append("    values: ").append(toIndentedString(getValues())).append("\n");
            sb.append("    xErrorBar: ").append(toIndentedString(getXErrorBar())).append("\n");
            sb.append("    xValues: ").append(toIndentedString(getXValues())).append("\n");
            sb.append("    yErrorBar: ").append(toIndentedString(getYErrorBar())).append("\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}


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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class SparklineGroup {
        @SerializedName("DisplayHidden")
        private Boolean displayHidden ;

        public  SparklineGroup  displayHidden(Boolean  displayHidden) {
            this.displayHidden =  displayHidden;
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
        private CellsColor firstPointColor ;

        public  SparklineGroup  firstPointColor(CellsColor  firstPointColor) {
            this.firstPointColor =  firstPointColor;
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
        private CellsColor highPointColor ;

        public  SparklineGroup  highPointColor(CellsColor  highPointColor) {
            this.highPointColor =  highPointColor;
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
        private CellsColor horizontalAxisColor ;

        public  SparklineGroup  horizontalAxisColor(CellsColor  horizontalAxisColor) {
            this.horizontalAxisColor =  horizontalAxisColor;
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
        private String horizontalAxisDateRange ;

        public  SparklineGroup  horizontalAxisDateRange(String  horizontalAxisDateRange) {
            this.horizontalAxisDateRange =  horizontalAxisDateRange;
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
        private CellsColor lastPointColor ;

        public  SparklineGroup  lastPointColor(CellsColor  lastPointColor) {
            this.lastPointColor =  lastPointColor;
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
        private Double lineWeight ;

        public  SparklineGroup  lineWeight(Double  lineWeight) {
            this.lineWeight =  lineWeight;
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
        private CellsColor lowPointColor ;

        public  SparklineGroup  lowPointColor(CellsColor  lowPointColor) {
            this.lowPointColor =  lowPointColor;
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
        private CellsColor markersColor ;

        public  SparklineGroup  markersColor(CellsColor  markersColor) {
            this.markersColor =  markersColor;
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
        private CellsColor negativePointsColor ;

        public  SparklineGroup  negativePointsColor(CellsColor  negativePointsColor) {
            this.negativePointsColor =  negativePointsColor;
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
        private String plotEmptyCellsType ;

        public  SparklineGroup  plotEmptyCellsType(String  plotEmptyCellsType) {
            this.plotEmptyCellsType =  plotEmptyCellsType;
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
        private Boolean plotRightToLeft ;

        public  SparklineGroup  plotRightToLeft(Boolean  plotRightToLeft) {
            this.plotRightToLeft =  plotRightToLeft;
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
        private String presetStyle ;

        public  SparklineGroup  presetStyle(String  presetStyle) {
            this.presetStyle =  presetStyle;
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
        private CellsColor seriesColor ;

        public  SparklineGroup  seriesColor(CellsColor  seriesColor) {
            this.seriesColor =  seriesColor;
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
        private Boolean showFirstPoint ;

        public  SparklineGroup  showFirstPoint(Boolean  showFirstPoint) {
            this.showFirstPoint =  showFirstPoint;
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
        private Boolean showHighPoint ;

        public  SparklineGroup  showHighPoint(Boolean  showHighPoint) {
            this.showHighPoint =  showHighPoint;
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
        private Boolean showHorizontalAxis ;

        public  SparklineGroup  showHorizontalAxis(Boolean  showHorizontalAxis) {
            this.showHorizontalAxis =  showHorizontalAxis;
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
        private Boolean showLastPoint ;

        public  SparklineGroup  showLastPoint(Boolean  showLastPoint) {
            this.showLastPoint =  showLastPoint;
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
        private Boolean showLowPoint ;

        public  SparklineGroup  showLowPoint(Boolean  showLowPoint) {
            this.showLowPoint =  showLowPoint;
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
        private Boolean showMarkers ;

        public  SparklineGroup  showMarkers(Boolean  showMarkers) {
            this.showMarkers =  showMarkers;
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
        private Boolean showNegativePoints ;

        public  SparklineGroup  showNegativePoints(Boolean  showNegativePoints) {
            this.showNegativePoints =  showNegativePoints;
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
        private List<Sparkline> sparklineCollection ;

        public  SparklineGroup  sparklineCollection(List<Sparkline>  sparklineCollection) {
            this.sparklineCollection =  sparklineCollection;
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
        private String type ;

        public  SparklineGroup  type(String  type) {
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

        @SerializedName("VerticalAxisMaxValue")
        private Double verticalAxisMaxValue ;

        public  SparklineGroup  verticalAxisMaxValue(Double  verticalAxisMaxValue) {
            this.verticalAxisMaxValue =  verticalAxisMaxValue;
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
        private String verticalAxisMaxValueType ;

        public  SparklineGroup  verticalAxisMaxValueType(String  verticalAxisMaxValueType) {
            this.verticalAxisMaxValueType =  verticalAxisMaxValueType;
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
        private Double verticalAxisMinValue ;

        public  SparklineGroup  verticalAxisMinValue(Double  verticalAxisMinValue) {
            this.verticalAxisMinValue =  verticalAxisMinValue;
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
        private String verticalAxisMinValueType ;

        public  SparklineGroup  verticalAxisMinValueType(String  verticalAxisMinValueType) {
            this.verticalAxisMinValueType =  verticalAxisMinValueType;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SparklineGroup sparklineGroup = (SparklineGroup) o;
            return
                Objects.equals(this.displayHidden, sparklineGroup.displayHidden) &&
                Objects.equals(this.firstPointColor, sparklineGroup.firstPointColor) &&
                Objects.equals(this.highPointColor, sparklineGroup.highPointColor) &&
                Objects.equals(this.horizontalAxisColor, sparklineGroup.horizontalAxisColor) &&
                Objects.equals(this.horizontalAxisDateRange, sparklineGroup.horizontalAxisDateRange) &&
                Objects.equals(this.lastPointColor, sparklineGroup.lastPointColor) &&
                Objects.equals(this.lineWeight, sparklineGroup.lineWeight) &&
                Objects.equals(this.lowPointColor, sparklineGroup.lowPointColor) &&
                Objects.equals(this.markersColor, sparklineGroup.markersColor) &&
                Objects.equals(this.negativePointsColor, sparklineGroup.negativePointsColor) &&
                Objects.equals(this.plotEmptyCellsType, sparklineGroup.plotEmptyCellsType) &&
                Objects.equals(this.plotRightToLeft, sparklineGroup.plotRightToLeft) &&
                Objects.equals(this.presetStyle, sparklineGroup.presetStyle) &&
                Objects.equals(this.seriesColor, sparklineGroup.seriesColor) &&
                Objects.equals(this.showFirstPoint, sparklineGroup.showFirstPoint) &&
                Objects.equals(this.showHighPoint, sparklineGroup.showHighPoint) &&
                Objects.equals(this.showHorizontalAxis, sparklineGroup.showHorizontalAxis) &&
                Objects.equals(this.showLastPoint, sparklineGroup.showLastPoint) &&
                Objects.equals(this.showLowPoint, sparklineGroup.showLowPoint) &&
                Objects.equals(this.showMarkers, sparklineGroup.showMarkers) &&
                Objects.equals(this.showNegativePoints, sparklineGroup.showNegativePoints) &&
                Objects.equals(this.sparklineCollection, sparklineGroup.sparklineCollection) &&
                Objects.equals(this.type, sparklineGroup.type) &&
                Objects.equals(this.verticalAxisMaxValue, sparklineGroup.verticalAxisMaxValue) &&
                Objects.equals(this.verticalAxisMaxValueType, sparklineGroup.verticalAxisMaxValueType) &&
                Objects.equals(this.verticalAxisMinValue, sparklineGroup.verticalAxisMinValue) &&
                Objects.equals(this.verticalAxisMinValueType, sparklineGroup.verticalAxisMinValueType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(displayHidden, firstPointColor, highPointColor, horizontalAxisColor, horizontalAxisDateRange, lastPointColor, lineWeight, lowPointColor, markersColor, negativePointsColor, plotEmptyCellsType, plotRightToLeft, presetStyle, seriesColor, showFirstPoint, showHighPoint, showHorizontalAxis, showLastPoint, showLowPoint, showMarkers, showNegativePoints, sparklineCollection, type, verticalAxisMaxValue, verticalAxisMaxValueType, verticalAxisMinValue, verticalAxisMinValueType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SparklineGroup {\n");
            sb.append("    displayHidden: ").append(toIndentedString(getDisplayHidden())).append("\n");
            sb.append("    firstPointColor: ").append(toIndentedString(getFirstPointColor())).append("\n");
            sb.append("    highPointColor: ").append(toIndentedString(getHighPointColor())).append("\n");
            sb.append("    horizontalAxisColor: ").append(toIndentedString(getHorizontalAxisColor())).append("\n");
            sb.append("    horizontalAxisDateRange: ").append(toIndentedString(getHorizontalAxisDateRange())).append("\n");
            sb.append("    lastPointColor: ").append(toIndentedString(getLastPointColor())).append("\n");
            sb.append("    lineWeight: ").append(toIndentedString(getLineWeight())).append("\n");
            sb.append("    lowPointColor: ").append(toIndentedString(getLowPointColor())).append("\n");
            sb.append("    markersColor: ").append(toIndentedString(getMarkersColor())).append("\n");
            sb.append("    negativePointsColor: ").append(toIndentedString(getNegativePointsColor())).append("\n");
            sb.append("    plotEmptyCellsType: ").append(toIndentedString(getPlotEmptyCellsType())).append("\n");
            sb.append("    plotRightToLeft: ").append(toIndentedString(getPlotRightToLeft())).append("\n");
            sb.append("    presetStyle: ").append(toIndentedString(getPresetStyle())).append("\n");
            sb.append("    seriesColor: ").append(toIndentedString(getSeriesColor())).append("\n");
            sb.append("    showFirstPoint: ").append(toIndentedString(getShowFirstPoint())).append("\n");
            sb.append("    showHighPoint: ").append(toIndentedString(getShowHighPoint())).append("\n");
            sb.append("    showHorizontalAxis: ").append(toIndentedString(getShowHorizontalAxis())).append("\n");
            sb.append("    showLastPoint: ").append(toIndentedString(getShowLastPoint())).append("\n");
            sb.append("    showLowPoint: ").append(toIndentedString(getShowLowPoint())).append("\n");
            sb.append("    showMarkers: ").append(toIndentedString(getShowMarkers())).append("\n");
            sb.append("    showNegativePoints: ").append(toIndentedString(getShowNegativePoints())).append("\n");
            sb.append("    sparklineCollection: ").append(toIndentedString(getSparklineCollection())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    verticalAxisMaxValue: ").append(toIndentedString(getVerticalAxisMaxValue())).append("\n");
            sb.append("    verticalAxisMaxValueType: ").append(toIndentedString(getVerticalAxisMaxValueType())).append("\n");
            sb.append("    verticalAxisMinValue: ").append(toIndentedString(getVerticalAxisMinValue())).append("\n");
            sb.append("    verticalAxisMinValueType: ").append(toIndentedString(getVerticalAxisMinValueType())).append("\n");
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


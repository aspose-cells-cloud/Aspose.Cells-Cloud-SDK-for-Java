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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Axis  extends  LinkElement {
        @SerializedName("Area")
        private Area area ;

        public  Axis  area(Area  area) {
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

        @SerializedName("AxisBetweenCategories")
        private Boolean axisBetweenCategories ;

        public  Axis  axisBetweenCategories(Boolean  axisBetweenCategories) {
            this.axisBetweenCategories =  axisBetweenCategories;
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
        private Line axisLine ;

        public  Axis  axisLine(Line  axisLine) {
            this.axisLine =  axisLine;
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
        private String baseUnitScale ;

        public  Axis  baseUnitScale(String  baseUnitScale) {
            this.baseUnitScale =  baseUnitScale;
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
        private String categoryType ;

        public  Axis  categoryType(String  categoryType) {
            this.categoryType =  categoryType;
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
        private Double crossAt ;

        public  Axis  crossAt(Double  crossAt) {
            this.crossAt =  crossAt;
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
        private String crossType ;

        public  Axis  crossType(String  crossType) {
            this.crossType =  crossType;
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
        private String displayUnit ;

        public  Axis  displayUnit(String  displayUnit) {
            this.displayUnit =  displayUnit;
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
        private DisplayUnitLabel displayUnitLabel ;

        public  Axis  displayUnitLabel(DisplayUnitLabel  displayUnitLabel) {
            this.displayUnitLabel =  displayUnitLabel;
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
        private Boolean hasMultiLevelLabels ;

        public  Axis  hasMultiLevelLabels(Boolean  hasMultiLevelLabels) {
            this.hasMultiLevelLabels =  hasMultiLevelLabels;
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
        private Boolean isAutomaticMajorUnit ;

        public  Axis  isAutomaticMajorUnit(Boolean  isAutomaticMajorUnit) {
            this.isAutomaticMajorUnit =  isAutomaticMajorUnit;
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
        private Boolean isAutomaticMaxValue ;

        public  Axis  isAutomaticMaxValue(Boolean  isAutomaticMaxValue) {
            this.isAutomaticMaxValue =  isAutomaticMaxValue;
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
        private Boolean isAutomaticMinorUnit ;

        public  Axis  isAutomaticMinorUnit(Boolean  isAutomaticMinorUnit) {
            this.isAutomaticMinorUnit =  isAutomaticMinorUnit;
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
        private Boolean isAutomaticMinValue ;

        public  Axis  isAutomaticMinValue(Boolean  isAutomaticMinValue) {
            this.isAutomaticMinValue =  isAutomaticMinValue;
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
        private Boolean isDisplayUnitLabelShown ;

        public  Axis  isDisplayUnitLabelShown(Boolean  isDisplayUnitLabelShown) {
            this.isDisplayUnitLabelShown =  isDisplayUnitLabelShown;
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
        private Boolean isLogarithmic ;

        public  Axis  isLogarithmic(Boolean  isLogarithmic) {
            this.isLogarithmic =  isLogarithmic;
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
        private Boolean isPlotOrderReversed ;

        public  Axis  isPlotOrderReversed(Boolean  isPlotOrderReversed) {
            this.isPlotOrderReversed =  isPlotOrderReversed;
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
        private Boolean isVisible ;

        public  Axis  isVisible(Boolean  isVisible) {
            this.isVisible =  isVisible;
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
        private Double logBase ;

        public  Axis  logBase(Double  logBase) {
            this.logBase =  logBase;
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
        private Line majorGridLines ;

        public  Axis  majorGridLines(Line  majorGridLines) {
            this.majorGridLines =  majorGridLines;
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
        private String majorTickMark ;

        public  Axis  majorTickMark(String  majorTickMark) {
            this.majorTickMark =  majorTickMark;
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
        private Double majorUnit ;

        public  Axis  majorUnit(Double  majorUnit) {
            this.majorUnit =  majorUnit;
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
        private String majorUnitScale ;

        public  Axis  majorUnitScale(String  majorUnitScale) {
            this.majorUnitScale =  majorUnitScale;
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
        private Double maxValue ;

        public  Axis  maxValue(Double  maxValue) {
            this.maxValue =  maxValue;
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
        private Line minorGridLines ;

        public  Axis  minorGridLines(Line  minorGridLines) {
            this.minorGridLines =  minorGridLines;
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
        private String minorTickMark ;

        public  Axis  minorTickMark(String  minorTickMark) {
            this.minorTickMark =  minorTickMark;
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
        private Double minorUnit ;

        public  Axis  minorUnit(Double  minorUnit) {
            this.minorUnit =  minorUnit;
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
        private String minorUnitScale ;

        public  Axis  minorUnitScale(String  minorUnitScale) {
            this.minorUnitScale =  minorUnitScale;
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
        private Double minValue ;

        public  Axis  minValue(Double  minValue) {
            this.minValue =  minValue;
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
        private String tickLabelPosition ;

        public  Axis  tickLabelPosition(String  tickLabelPosition) {
            this.tickLabelPosition =  tickLabelPosition;
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
        private TickLabels tickLabels ;

        public  Axis  tickLabels(TickLabels  tickLabels) {
            this.tickLabels =  tickLabels;
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
        private Integer tickLabelSpacing ;

        public  Axis  tickLabelSpacing(Integer  tickLabelSpacing) {
            this.tickLabelSpacing =  tickLabelSpacing;
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
        private Integer tickMarkSpacing ;

        public  Axis  tickMarkSpacing(Integer  tickMarkSpacing) {
            this.tickMarkSpacing =  tickMarkSpacing;
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
        private Title title ;

        public  Axis  title(Title  title) {
            this.title =  title;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Axis axis = (Axis) o;
            return
                Objects.equals(this.area, axis.area) &&
                Objects.equals(this.axisBetweenCategories, axis.axisBetweenCategories) &&
                Objects.equals(this.axisLine, axis.axisLine) &&
                Objects.equals(this.baseUnitScale, axis.baseUnitScale) &&
                Objects.equals(this.categoryType, axis.categoryType) &&
                Objects.equals(this.crossAt, axis.crossAt) &&
                Objects.equals(this.crossType, axis.crossType) &&
                Objects.equals(this.displayUnit, axis.displayUnit) &&
                Objects.equals(this.displayUnitLabel, axis.displayUnitLabel) &&
                Objects.equals(this.hasMultiLevelLabels, axis.hasMultiLevelLabels) &&
                Objects.equals(this.isAutomaticMajorUnit, axis.isAutomaticMajorUnit) &&
                Objects.equals(this.isAutomaticMaxValue, axis.isAutomaticMaxValue) &&
                Objects.equals(this.isAutomaticMinorUnit, axis.isAutomaticMinorUnit) &&
                Objects.equals(this.isAutomaticMinValue, axis.isAutomaticMinValue) &&
                Objects.equals(this.isDisplayUnitLabelShown, axis.isDisplayUnitLabelShown) &&
                Objects.equals(this.isLogarithmic, axis.isLogarithmic) &&
                Objects.equals(this.isPlotOrderReversed, axis.isPlotOrderReversed) &&
                Objects.equals(this.isVisible, axis.isVisible) &&
                Objects.equals(this.logBase, axis.logBase) &&
                Objects.equals(this.majorGridLines, axis.majorGridLines) &&
                Objects.equals(this.majorTickMark, axis.majorTickMark) &&
                Objects.equals(this.majorUnit, axis.majorUnit) &&
                Objects.equals(this.majorUnitScale, axis.majorUnitScale) &&
                Objects.equals(this.maxValue, axis.maxValue) &&
                Objects.equals(this.minorGridLines, axis.minorGridLines) &&
                Objects.equals(this.minorTickMark, axis.minorTickMark) &&
                Objects.equals(this.minorUnit, axis.minorUnit) &&
                Objects.equals(this.minorUnitScale, axis.minorUnitScale) &&
                Objects.equals(this.minValue, axis.minValue) &&
                Objects.equals(this.tickLabelPosition, axis.tickLabelPosition) &&
                Objects.equals(this.tickLabels, axis.tickLabels) &&
                Objects.equals(this.tickLabelSpacing, axis.tickLabelSpacing) &&
                Objects.equals(this.tickMarkSpacing, axis.tickMarkSpacing) &&
                Objects.equals(this.title, axis.title) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(area, axisBetweenCategories, axisLine, baseUnitScale, categoryType, crossAt, crossType, displayUnit, displayUnitLabel, hasMultiLevelLabels, isAutomaticMajorUnit, isAutomaticMaxValue, isAutomaticMinorUnit, isAutomaticMinValue, isDisplayUnitLabelShown, isLogarithmic, isPlotOrderReversed, isVisible, logBase, majorGridLines, majorTickMark, majorUnit, majorUnitScale, maxValue, minorGridLines, minorTickMark, minorUnit, minorUnitScale, minValue, tickLabelPosition, tickLabels, tickLabelSpacing, tickMarkSpacing, title, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Axis {\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    axisBetweenCategories: ").append(toIndentedString(getAxisBetweenCategories())).append("\n");
            sb.append("    axisLine: ").append(toIndentedString(getAxisLine())).append("\n");
            sb.append("    baseUnitScale: ").append(toIndentedString(getBaseUnitScale())).append("\n");
            sb.append("    categoryType: ").append(toIndentedString(getCategoryType())).append("\n");
            sb.append("    crossAt: ").append(toIndentedString(getCrossAt())).append("\n");
            sb.append("    crossType: ").append(toIndentedString(getCrossType())).append("\n");
            sb.append("    displayUnit: ").append(toIndentedString(getDisplayUnit())).append("\n");
            sb.append("    displayUnitLabel: ").append(toIndentedString(getDisplayUnitLabel())).append("\n");
            sb.append("    hasMultiLevelLabels: ").append(toIndentedString(getHasMultiLevelLabels())).append("\n");
            sb.append("    isAutomaticMajorUnit: ").append(toIndentedString(getIsAutomaticMajorUnit())).append("\n");
            sb.append("    isAutomaticMaxValue: ").append(toIndentedString(getIsAutomaticMaxValue())).append("\n");
            sb.append("    isAutomaticMinorUnit: ").append(toIndentedString(getIsAutomaticMinorUnit())).append("\n");
            sb.append("    isAutomaticMinValue: ").append(toIndentedString(getIsAutomaticMinValue())).append("\n");
            sb.append("    isDisplayUnitLabelShown: ").append(toIndentedString(getIsDisplayUnitLabelShown())).append("\n");
            sb.append("    isLogarithmic: ").append(toIndentedString(getIsLogarithmic())).append("\n");
            sb.append("    isPlotOrderReversed: ").append(toIndentedString(getIsPlotOrderReversed())).append("\n");
            sb.append("    isVisible: ").append(toIndentedString(getIsVisible())).append("\n");
            sb.append("    logBase: ").append(toIndentedString(getLogBase())).append("\n");
            sb.append("    majorGridLines: ").append(toIndentedString(getMajorGridLines())).append("\n");
            sb.append("    majorTickMark: ").append(toIndentedString(getMajorTickMark())).append("\n");
            sb.append("    majorUnit: ").append(toIndentedString(getMajorUnit())).append("\n");
            sb.append("    majorUnitScale: ").append(toIndentedString(getMajorUnitScale())).append("\n");
            sb.append("    maxValue: ").append(toIndentedString(getMaxValue())).append("\n");
            sb.append("    minorGridLines: ").append(toIndentedString(getMinorGridLines())).append("\n");
            sb.append("    minorTickMark: ").append(toIndentedString(getMinorTickMark())).append("\n");
            sb.append("    minorUnit: ").append(toIndentedString(getMinorUnit())).append("\n");
            sb.append("    minorUnitScale: ").append(toIndentedString(getMinorUnitScale())).append("\n");
            sb.append("    minValue: ").append(toIndentedString(getMinValue())).append("\n");
            sb.append("    tickLabelPosition: ").append(toIndentedString(getTickLabelPosition())).append("\n");
            sb.append("    tickLabels: ").append(toIndentedString(getTickLabels())).append("\n");
            sb.append("    tickLabelSpacing: ").append(toIndentedString(getTickLabelSpacing())).append("\n");
            sb.append("    tickMarkSpacing: ").append(toIndentedString(getTickMarkSpacing())).append("\n");
            sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
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


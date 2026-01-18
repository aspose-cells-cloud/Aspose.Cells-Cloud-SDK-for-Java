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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class ChartOperateParameter  extends  OperateParameter {
        @SerializedName("ChartIndex")
        private Integer chartIndex ;

        public  ChartOperateParameter  chartIndex(Integer  chartIndex) {
            this.chartIndex =  chartIndex;
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
        private String chartType ;

        public  ChartOperateParameter  chartType(String  chartType) {
            this.chartType =  chartType;
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
        private Integer upperLeftRow ;

        public  ChartOperateParameter  upperLeftRow(Integer  upperLeftRow) {
            this.upperLeftRow =  upperLeftRow;
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
        private Integer upperLeftColumn ;

        public  ChartOperateParameter  upperLeftColumn(Integer  upperLeftColumn) {
            this.upperLeftColumn =  upperLeftColumn;
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
        private Integer lowerRightRow ;

        public  ChartOperateParameter  lowerRightRow(Integer  lowerRightRow) {
            this.lowerRightRow =  lowerRightRow;
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
        private Integer lowerRightColumn ;

        public  ChartOperateParameter  lowerRightColumn(Integer  lowerRightColumn) {
            this.lowerRightColumn =  lowerRightColumn;
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
        private String area ;

        public  ChartOperateParameter  area(String  area) {
            this.area =  area;
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
        private Boolean isVertical ;

        public  ChartOperateParameter  isVertical(Boolean  isVertical) {
            this.isVertical =  isVertical;
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
        private String categoryData ;

        public  ChartOperateParameter  categoryData(String  categoryData) {
            this.categoryData =  categoryData;
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
        private Boolean isAutoGetSerialName ;

        public  ChartOperateParameter  isAutoGetSerialName(Boolean  isAutoGetSerialName) {
            this.isAutoGetSerialName =  isAutoGetSerialName;
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
        private String title ;

        public  ChartOperateParameter  title(String  title) {
            this.title =  title;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ChartOperateParameter chartOperateParameter = (ChartOperateParameter) o;
            return
                Objects.equals(this.chartIndex, chartOperateParameter.chartIndex) &&
                Objects.equals(this.chartType, chartOperateParameter.chartType) &&
                Objects.equals(this.upperLeftRow, chartOperateParameter.upperLeftRow) &&
                Objects.equals(this.upperLeftColumn, chartOperateParameter.upperLeftColumn) &&
                Objects.equals(this.lowerRightRow, chartOperateParameter.lowerRightRow) &&
                Objects.equals(this.lowerRightColumn, chartOperateParameter.lowerRightColumn) &&
                Objects.equals(this.area, chartOperateParameter.area) &&
                Objects.equals(this.isVertical, chartOperateParameter.isVertical) &&
                Objects.equals(this.categoryData, chartOperateParameter.categoryData) &&
                Objects.equals(this.isAutoGetSerialName, chartOperateParameter.isAutoGetSerialName) &&
                Objects.equals(this.title, chartOperateParameter.title) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(chartIndex, chartType, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName, title, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartOperateParameter {\n");
            sb.append("    chartIndex: ").append(toIndentedString(getChartIndex())).append("\n");
            sb.append("    chartType: ").append(toIndentedString(getChartType())).append("\n");
            sb.append("    upperLeftRow: ").append(toIndentedString(getUpperLeftRow())).append("\n");
            sb.append("    upperLeftColumn: ").append(toIndentedString(getUpperLeftColumn())).append("\n");
            sb.append("    lowerRightRow: ").append(toIndentedString(getLowerRightRow())).append("\n");
            sb.append("    lowerRightColumn: ").append(toIndentedString(getLowerRightColumn())).append("\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    isVertical: ").append(toIndentedString(getIsVertical())).append("\n");
            sb.append("    categoryData: ").append(toIndentedString(getCategoryData())).append("\n");
            sb.append("    isAutoGetSerialName: ").append(toIndentedString(getIsAutoGetSerialName())).append("\n");
            sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
            sb.append("    operateType: ").append(toIndentedString(getOperateType())).append("\n");
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


/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChartPoint.java">
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


public class ChartPoint  extends  LinkElement {
        @SerializedName("Area")
        private Area area ;

        public  ChartPoint  area(Area  area) {
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

        @SerializedName("Border")
        private Line border ;

        public  ChartPoint  border(Line  border) {
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

        @SerializedName("DataLabels")
        private DataLabels dataLabels ;

        public  ChartPoint  dataLabels(DataLabels  dataLabels) {
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

        @SerializedName("Explosion")
        private Integer explosion ;

        public  ChartPoint  explosion(Integer  explosion) {
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

        @SerializedName("Marker")
        private Marker marker ;

        public  ChartPoint  marker(Marker  marker) {
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

        @SerializedName("Shadow")
        private Boolean shadow ;

        public  ChartPoint  shadow(Boolean  shadow) {
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

        @SerializedName("XValue")
        private Object xValue ;

        public  ChartPoint  xValue(Object  xValue) {
            this.xValue =  xValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Object getXValue() {
            return xValue;
        }

        public void setXValue(Object xValue) {
            this.xValue = xValue;
        }

        @SerializedName("YValue")
        private Object yValue ;

        public  ChartPoint  yValue(Object  yValue) {
            this.yValue =  yValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Object getYValue() {
            return yValue;
        }

        public void setYValue(Object yValue) {
            this.yValue = yValue;
        }

        @SerializedName("IsInSecondaryPlot")
        private Boolean isInSecondaryPlot ;

        public  ChartPoint  isInSecondaryPlot(Boolean  isInSecondaryPlot) {
            this.isInSecondaryPlot =  isInSecondaryPlot;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsInSecondaryPlot() {
            return isInSecondaryPlot;
        }

        public void setIsInSecondaryPlot(Boolean isInSecondaryPlot) {
            this.isInSecondaryPlot = isInSecondaryPlot;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ChartPoint chartPoint = (ChartPoint) o;
            return
                Objects.equals(this.area, chartPoint.area) &&
                Objects.equals(this.border, chartPoint.border) &&
                Objects.equals(this.dataLabels, chartPoint.dataLabels) &&
                Objects.equals(this.explosion, chartPoint.explosion) &&
                Objects.equals(this.marker, chartPoint.marker) &&
                Objects.equals(this.shadow, chartPoint.shadow) &&
                Objects.equals(this.xValue, chartPoint.xValue) &&
                Objects.equals(this.yValue, chartPoint.yValue) &&
                Objects.equals(this.isInSecondaryPlot, chartPoint.isInSecondaryPlot) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(area, border, dataLabels, explosion, marker, shadow, xValue, yValue, isInSecondaryPlot, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartPoint {\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    dataLabels: ").append(toIndentedString(getDataLabels())).append("\n");
            sb.append("    explosion: ").append(toIndentedString(getExplosion())).append("\n");
            sb.append("    marker: ").append(toIndentedString(getMarker())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
            sb.append("    xValue: ").append(toIndentedString(getXValue())).append("\n");
            sb.append("    yValue: ").append(toIndentedString(getYValue())).append("\n");
            sb.append("    isInSecondaryPlot: ").append(toIndentedString(getIsInSecondaryPlot())).append("\n");
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


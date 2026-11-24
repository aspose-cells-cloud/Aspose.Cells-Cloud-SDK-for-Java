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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ChartPoint extends LinkElement {

    @SerializedName("Area")
    @JsonProperty("Area")
    private Area area;

    public ChartPoint area(Area area) {
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

    @SerializedName("Border")
    @JsonProperty("Border")
    private Line border;

    public ChartPoint border(Line border) {
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

    @SerializedName("DataLabels")
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    public ChartPoint dataLabels(DataLabels dataLabels) {
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

    @SerializedName("Explosion")
    @JsonProperty("Explosion")
    private Integer explosion;

    public ChartPoint explosion(Integer explosion) {
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

    @SerializedName("Marker")
    @JsonProperty("Marker")
    private Marker marker;

    public ChartPoint marker(Marker marker) {
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

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public ChartPoint shadow(Boolean shadow) {
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

    @SerializedName("XValue")
    @JsonProperty("XValue")
    private Object xValue;

    public ChartPoint xValue(Object xValue) {
        this.xValue = xValue;
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
    @JsonProperty("YValue")
    private Object yValue;

    public ChartPoint yValue(Object yValue) {
        this.yValue = yValue;
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
    @JsonProperty("IsInSecondaryPlot")
    private Boolean isInSecondaryPlot;

    public ChartPoint isInSecondaryPlot(Boolean isInSecondaryPlot) {
        this.isInSecondaryPlot = isInSecondaryPlot;
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
        ChartPoint other = (ChartPoint) o;
        return Objects.equals(this.area, other.area)
            && Objects.equals(this.border, other.border)
            && Objects.equals(this.dataLabels, other.dataLabels)
            && Objects.equals(this.explosion, other.explosion)
            && Objects.equals(this.marker, other.marker)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.xValue, other.xValue)
            && Objects.equals(this.yValue, other.yValue)
            && Objects.equals(this.isInSecondaryPlot, other.isInSecondaryPlot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, border, dataLabels, explosion, marker, shadow, xValue, yValue, isInSecondaryPlot, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartPoint {\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    border: ").append(border).append("\n");
        sb.append("    dataLabels: ").append(dataLabels).append("\n");
        sb.append("    explosion: ").append(explosion).append("\n");
        sb.append("    marker: ").append(marker).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    xValue: ").append(xValue).append("\n");
        sb.append("    yValue: ").append(yValue).append("\n");
        sb.append("    isInSecondaryPlot: ").append(isInSecondaryPlot).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Marker.java">
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

public class Marker {

    @SerializedName("Border")
    @JsonProperty("Border")
    private Line border;

    public Marker border(Line border) {
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

    @SerializedName("Area")
    @JsonProperty("Area")
    private Area area;

    public Marker area(Area area) {
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

    @SerializedName("MarkerSize")
    @JsonProperty("MarkerSize")
    private Integer markerSize;

    public Marker markerSize(Integer markerSize) {
        this.markerSize = markerSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMarkerSize() {
        return markerSize;
    }

    public void setMarkerSize(Integer markerSize) {
        this.markerSize = markerSize;
    }

    @SerializedName("MarkerStyle")
    @JsonProperty("MarkerStyle")
    private String markerStyle;

    public Marker markerStyle(String markerStyle) {
        this.markerStyle = markerStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMarkerStyle() {
        return markerStyle;
    }

    public void setMarkerStyle(String markerStyle) {
        this.markerStyle = markerStyle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Marker other = (Marker) o;
        return Objects.equals(this.border, other.border)
            && Objects.equals(this.area, other.area)
            && Objects.equals(this.markerSize, other.markerSize)
            && Objects.equals(this.markerStyle, other.markerStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(border, area, markerSize, markerStyle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Marker {\n");
        sb.append("    border: ").append(border).append("\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    markerSize: ").append(markerSize).append("\n");
        sb.append("    markerStyle: ").append(markerStyle).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

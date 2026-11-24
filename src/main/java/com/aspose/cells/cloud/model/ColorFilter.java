/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ColorFilter.java">
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

public class ColorFilter {

    @SerializedName("FilterByFillColor")
    @JsonProperty("FilterByFillColor")
    private Boolean filterByFillColor;

    public ColorFilter filterByFillColor(Boolean filterByFillColor) {
        this.filterByFillColor = filterByFillColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getFilterByFillColor() {
        return filterByFillColor;
    }

    public void setFilterByFillColor(Boolean filterByFillColor) {
        this.filterByFillColor = filterByFillColor;
    }

    @SerializedName("Pattern")
    @JsonProperty("Pattern")
    private String pattern;

    public ColorFilter pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @SerializedName("Color")
    @JsonProperty("Color")
    private CellsColor color;

    public ColorFilter color(CellsColor color) {
        this.color = color;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getColor() {
        return color;
    }

    public void setColor(CellsColor color) {
        this.color = color;
    }

    @SerializedName("ForegroundColorColor")
    @JsonProperty("ForegroundColorColor")
    private CellsColor foregroundColorColor;

    public ColorFilter foregroundColorColor(CellsColor foregroundColorColor) {
        this.foregroundColorColor = foregroundColorColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getForegroundColorColor() {
        return foregroundColorColor;
    }

    public void setForegroundColorColor(CellsColor foregroundColorColor) {
        this.foregroundColorColor = foregroundColorColor;
    }

    @SerializedName("BackgroundColor")
    @JsonProperty("BackgroundColor")
    private CellsColor backgroundColor;

    public ColorFilter backgroundColor(CellsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(CellsColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColorFilter other = (ColorFilter) o;
        return Objects.equals(this.filterByFillColor, other.filterByFillColor)
            && Objects.equals(this.pattern, other.pattern)
            && Objects.equals(this.color, other.color)
            && Objects.equals(this.foregroundColorColor, other.foregroundColorColor)
            && Objects.equals(this.backgroundColor, other.backgroundColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterByFillColor, pattern, color, foregroundColorColor, backgroundColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColorFilter {\n");
        sb.append("    filterByFillColor: ").append(filterByFillColor).append("\n");
        sb.append("    pattern: ").append(pattern).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    foregroundColorColor: ").append(foregroundColorColor).append("\n");
        sb.append("    backgroundColor: ").append(backgroundColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

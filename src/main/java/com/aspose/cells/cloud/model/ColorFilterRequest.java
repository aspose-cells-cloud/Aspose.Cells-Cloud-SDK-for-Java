/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ColorFilterRequest.java">
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

public class ColorFilterRequest {

    @SerializedName("Pattern")
    @JsonProperty("Pattern")
    private String pattern;

    public ColorFilterRequest pattern(String pattern) {
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

    @SerializedName("ForegroundColor")
    @JsonProperty("ForegroundColor")
    private CellsColor foregroundColor;

    public ColorFilterRequest foregroundColor(CellsColor foregroundColor) {
        this.foregroundColor = foregroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(CellsColor foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    @SerializedName("BackgroundColor")
    @JsonProperty("BackgroundColor")
    private CellsColor backgroundColor;

    public ColorFilterRequest backgroundColor(CellsColor backgroundColor) {
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
        ColorFilterRequest other = (ColorFilterRequest) o;
        return Objects.equals(this.pattern, other.pattern)
            && Objects.equals(this.foregroundColor, other.foregroundColor)
            && Objects.equals(this.backgroundColor, other.backgroundColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, foregroundColor, backgroundColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColorFilterRequest {\n");
        sb.append("    pattern: ").append(pattern).append("\n");
        sb.append("    foregroundColor: ").append(foregroundColor).append("\n");
        sb.append("    backgroundColor: ").append(backgroundColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

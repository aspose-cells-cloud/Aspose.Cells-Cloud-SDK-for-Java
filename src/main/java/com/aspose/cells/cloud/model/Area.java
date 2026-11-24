/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Area.java">
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

public class Area {

    @SerializedName("BackgroundColor")
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    public Area backgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @SerializedName("FillFormat")
    @JsonProperty("FillFormat")
    private FillFormat fillFormat;

    public Area fillFormat(FillFormat fillFormat) {
        this.fillFormat = fillFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public FillFormat getFillFormat() {
        return fillFormat;
    }

    public void setFillFormat(FillFormat fillFormat) {
        this.fillFormat = fillFormat;
    }

    @SerializedName("ForegroundColor")
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    public Area foregroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    @SerializedName("Format")
    @JsonProperty("Format")
    private String format;

    public Area format(String format) {
        this.format = format;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @SerializedName("InvertIfNegative")
    @JsonProperty("InvertIfNegative")
    private Boolean invertIfNegative;

    public Area invertIfNegative(Boolean invertIfNegative) {
        this.invertIfNegative = invertIfNegative;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getInvertIfNegative() {
        return invertIfNegative;
    }

    public void setInvertIfNegative(Boolean invertIfNegative) {
        this.invertIfNegative = invertIfNegative;
    }

    @SerializedName("Transparency")
    @JsonProperty("Transparency")
    private Double transparency;

    public Area transparency(Double transparency) {
        this.transparency = transparency;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getTransparency() {
        return transparency;
    }

    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Area other = (Area) o;
        return Objects.equals(this.backgroundColor, other.backgroundColor)
            && Objects.equals(this.fillFormat, other.fillFormat)
            && Objects.equals(this.foregroundColor, other.foregroundColor)
            && Objects.equals(this.format, other.format)
            && Objects.equals(this.invertIfNegative, other.invertIfNegative)
            && Objects.equals(this.transparency, other.transparency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backgroundColor, fillFormat, foregroundColor, format, invertIfNegative, transparency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Area {\n");
        sb.append("    backgroundColor: ").append(backgroundColor).append("\n");
        sb.append("    fillFormat: ").append(fillFormat).append("\n");
        sb.append("    foregroundColor: ").append(foregroundColor).append("\n");
        sb.append("    format: ").append(format).append("\n");
        sb.append("    invertIfNegative: ").append(invertIfNegative).append("\n");
        sb.append("    transparency: ").append(transparency).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

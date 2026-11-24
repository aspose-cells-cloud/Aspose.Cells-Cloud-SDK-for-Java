/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Walls.java">
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

public class Walls extends Floor {

    @SerializedName("CenterX")
    @JsonProperty("CenterX")
    private Integer centerX;

    public Walls centerX(Integer centerX) {
        this.centerX = centerX;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCenterX() {
        return centerX;
    }

    public void setCenterX(Integer centerX) {
        this.centerX = centerX;
    }

    @SerializedName("CenterY")
    @JsonProperty("CenterY")
    private Integer centerY;

    public Walls centerY(Integer centerY) {
        this.centerY = centerY;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCenterY() {
        return centerY;
    }

    public void setCenterY(Integer centerY) {
        this.centerY = centerY;
    }

    @SerializedName("Depth")
    @JsonProperty("Depth")
    private Integer depth;

    public Walls depth(Integer depth) {
        this.depth = depth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    @SerializedName("Height")
    @JsonProperty("Height")
    private Integer height;

    public Walls height(Integer height) {
        this.height = height;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @SerializedName("Width")
    @JsonProperty("Width")
    private Integer width;

    public Walls width(Integer width) {
        this.width = width;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @SerializedName("BackgroundColor")
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    public Walls backgroundColor(Color backgroundColor) {
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

    public Walls fillFormat(FillFormat fillFormat) {
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

    public Walls foregroundColor(Color foregroundColor) {
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

    public Walls format(String format) {
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

    public Walls invertIfNegative(Boolean invertIfNegative) {
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

    public Walls transparency(Double transparency) {
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
        if (!super.equals(o)) {
            return false;
        }
        Walls other = (Walls) o;
        return Objects.equals(this.centerX, other.centerX)
            && Objects.equals(this.centerY, other.centerY)
            && Objects.equals(this.depth, other.depth)
            && Objects.equals(this.height, other.height)
            && Objects.equals(this.width, other.width)
            && Objects.equals(this.backgroundColor, other.backgroundColor)
            && Objects.equals(this.fillFormat, other.fillFormat)
            && Objects.equals(this.foregroundColor, other.foregroundColor)
            && Objects.equals(this.format, other.format)
            && Objects.equals(this.invertIfNegative, other.invertIfNegative)
            && Objects.equals(this.transparency, other.transparency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centerX, centerY, depth, height, width, backgroundColor, fillFormat, foregroundColor, format, invertIfNegative, transparency, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Walls {\n");
        sb.append("    centerX: ").append(centerX).append("\n");
        sb.append("    centerY: ").append(centerY).append("\n");
        sb.append("    depth: ").append(depth).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("    width: ").append(width).append("\n");
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

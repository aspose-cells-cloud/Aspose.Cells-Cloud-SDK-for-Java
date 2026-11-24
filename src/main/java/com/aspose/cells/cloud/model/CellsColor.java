/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsColor.java">
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

public class CellsColor {

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public CellsColor color(Color color) {
        this.color = color;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @SerializedName("ColorIndex")
    @JsonProperty("ColorIndex")
    private Integer colorIndex;

    public CellsColor colorIndex(Integer colorIndex) {
        this.colorIndex = colorIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(Integer colorIndex) {
        this.colorIndex = colorIndex;
    }

    @SerializedName("IsShapeColor")
    @JsonProperty("IsShapeColor")
    private Boolean isShapeColor;

    public CellsColor isShapeColor(Boolean isShapeColor) {
        this.isShapeColor = isShapeColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsShapeColor() {
        return isShapeColor;
    }

    public void setIsShapeColor(Boolean isShapeColor) {
        this.isShapeColor = isShapeColor;
    }

    @SerializedName("tint")
    @JsonProperty("tint")
    private Double tint;

    public CellsColor tint(Double tint) {
        this.tint = tint;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getTint() {
        return tint;
    }

    public void setTint(Double tint) {
        this.tint = tint;
    }

    @SerializedName("Argb")
    @JsonProperty("Argb")
    private Integer argb;

    public CellsColor argb(Integer argb) {
        this.argb = argb;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getArgb() {
        return argb;
    }

    public void setArgb(Integer argb) {
        this.argb = argb;
    }

    @SerializedName("ThemeColor")
    @JsonProperty("ThemeColor")
    private ThemeColor themeColor;

    public CellsColor themeColor(ThemeColor themeColor) {
        this.themeColor = themeColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public ThemeColor getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(ThemeColor themeColor) {
        this.themeColor = themeColor;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public CellsColor type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("Transparency")
    @JsonProperty("Transparency")
    private Double transparency;

    public CellsColor transparency(Double transparency) {
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
        CellsColor other = (CellsColor) o;
        return Objects.equals(this.color, other.color)
            && Objects.equals(this.colorIndex, other.colorIndex)
            && Objects.equals(this.isShapeColor, other.isShapeColor)
            && Objects.equals(this.tint, other.tint)
            && Objects.equals(this.argb, other.argb)
            && Objects.equals(this.themeColor, other.themeColor)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.transparency, other.transparency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, colorIndex, isShapeColor, tint, argb, themeColor, type, transparency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CellsColor {\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    colorIndex: ").append(colorIndex).append("\n");
        sb.append("    isShapeColor: ").append(isShapeColor).append("\n");
        sb.append("    tint: ").append(tint).append("\n");
        sb.append("    argb: ").append(argb).append("\n");
        sb.append("    themeColor: ").append(themeColor).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    transparency: ").append(transparency).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

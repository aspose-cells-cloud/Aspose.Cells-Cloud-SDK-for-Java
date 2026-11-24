/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Border.java">
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

public class Border {

    @SerializedName("LineStyle")
    @JsonProperty("LineStyle")
    private String lineStyle;

    public Border lineStyle(String lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(String lineStyle) {
        this.lineStyle = lineStyle;
    }

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public Border color(Color color) {
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

    @SerializedName("BorderType")
    @JsonProperty("BorderType")
    private String borderType;

    public Border borderType(String borderType) {
        this.borderType = borderType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBorderType() {
        return borderType;
    }

    public void setBorderType(String borderType) {
        this.borderType = borderType;
    }

    @SerializedName("ThemeColor")
    @JsonProperty("ThemeColor")
    private ThemeColor themeColor;

    public Border themeColor(ThemeColor themeColor) {
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

    @SerializedName("ArgbColor")
    @JsonProperty("ArgbColor")
    private Integer argbColor;

    public Border argbColor(Integer argbColor) {
        this.argbColor = argbColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getArgbColor() {
        return argbColor;
    }

    public void setArgbColor(Integer argbColor) {
        this.argbColor = argbColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Border other = (Border) o;
        return Objects.equals(this.lineStyle, other.lineStyle)
            && Objects.equals(this.color, other.color)
            && Objects.equals(this.borderType, other.borderType)
            && Objects.equals(this.themeColor, other.themeColor)
            && Objects.equals(this.argbColor, other.argbColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineStyle, color, borderType, themeColor, argbColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Border {\n");
        sb.append("    lineStyle: ").append(lineStyle).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    borderType: ").append(borderType).append("\n");
        sb.append("    themeColor: ").append(themeColor).append("\n");
        sb.append("    argbColor: ").append(argbColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

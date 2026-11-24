/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChartFrame.java">
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

public class ChartFrame {

    @SerializedName("Area")
    @JsonProperty("Area")
    private Area area;

    public ChartFrame area(Area area) {
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

    @SerializedName("AutoScaleFont")
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    public ChartFrame autoScaleFont(Boolean autoScaleFont) {
        this.autoScaleFont = autoScaleFont;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAutoScaleFont() {
        return autoScaleFont;
    }

    public void setAutoScaleFont(Boolean autoScaleFont) {
        this.autoScaleFont = autoScaleFont;
    }

    @SerializedName("BackgroundMode")
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    public ChartFrame backgroundMode(String backgroundMode) {
        this.backgroundMode = backgroundMode;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBackgroundMode() {
        return backgroundMode;
    }

    public void setBackgroundMode(String backgroundMode) {
        this.backgroundMode = backgroundMode;
    }

    @SerializedName("Border")
    @JsonProperty("Border")
    private Line border;

    public ChartFrame border(Line border) {
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

    @SerializedName("Font")
    @JsonProperty("Font")
    private Font font;

    public ChartFrame font(Font font) {
        this.font = font;
        return this;
    }

    @ApiModelProperty(value = "")
    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    @SerializedName("IsAutomaticSize")
    @JsonProperty("IsAutomaticSize")
    private Boolean isAutomaticSize;

    public ChartFrame isAutomaticSize(Boolean isAutomaticSize) {
        this.isAutomaticSize = isAutomaticSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutomaticSize() {
        return isAutomaticSize;
    }

    public void setIsAutomaticSize(Boolean isAutomaticSize) {
        this.isAutomaticSize = isAutomaticSize;
    }

    @SerializedName("IsInnerMode")
    @JsonProperty("IsInnerMode")
    private Boolean isInnerMode;

    public ChartFrame isInnerMode(Boolean isInnerMode) {
        this.isInnerMode = isInnerMode;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsInnerMode() {
        return isInnerMode;
    }

    public void setIsInnerMode(Boolean isInnerMode) {
        this.isInnerMode = isInnerMode;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public ChartFrame shadow(Boolean shadow) {
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

    @SerializedName("Width")
    @JsonProperty("Width")
    private Integer width;

    public ChartFrame width(Integer width) {
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

    @SerializedName("Height")
    @JsonProperty("Height")
    private Integer height;

    public ChartFrame height(Integer height) {
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

    @SerializedName("X")
    @JsonProperty("X")
    private Integer x;

    public ChartFrame x(Integer x) {
        this.x = x;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @SerializedName("Y")
    @JsonProperty("Y")
    private Integer y;

    public ChartFrame y(Integer y) {
        this.y = y;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChartFrame other = (ChartFrame) o;
        return Objects.equals(this.area, other.area)
            && Objects.equals(this.autoScaleFont, other.autoScaleFont)
            && Objects.equals(this.backgroundMode, other.backgroundMode)
            && Objects.equals(this.border, other.border)
            && Objects.equals(this.font, other.font)
            && Objects.equals(this.isAutomaticSize, other.isAutomaticSize)
            && Objects.equals(this.isInnerMode, other.isInnerMode)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.width, other.width)
            && Objects.equals(this.height, other.height)
            && Objects.equals(this.x, other.x)
            && Objects.equals(this.y, other.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, autoScaleFont, backgroundMode, border, font, isAutomaticSize, isInnerMode, shadow, width, height, x, y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartFrame {\n");
        sb.append("    area: ").append(area).append("\n");
        sb.append("    autoScaleFont: ").append(autoScaleFont).append("\n");
        sb.append("    backgroundMode: ").append(backgroundMode).append("\n");
        sb.append("    border: ").append(border).append("\n");
        sb.append("    font: ").append(font).append("\n");
        sb.append("    isAutomaticSize: ").append(isAutomaticSize).append("\n");
        sb.append("    isInnerMode: ").append(isInnerMode).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    width: ").append(width).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("    x: ").append(x).append("\n");
        sb.append("    y: ").append(y).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

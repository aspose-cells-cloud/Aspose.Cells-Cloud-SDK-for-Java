/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Font.java">
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

public class Font {

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public Font color(Color color) {
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

    @SerializedName("DoubleSize")
    @JsonProperty("DoubleSize")
    private Double doubleSize;

    public Font doubleSize(Double doubleSize) {
        this.doubleSize = doubleSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getDoubleSize() {
        return doubleSize;
    }

    public void setDoubleSize(Double doubleSize) {
        this.doubleSize = doubleSize;
    }

    @SerializedName("IsBold")
    @JsonProperty("IsBold")
    private Boolean isBold;

    public Font isBold(Boolean isBold) {
        this.isBold = isBold;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsBold() {
        return isBold;
    }

    public void setIsBold(Boolean isBold) {
        this.isBold = isBold;
    }

    @SerializedName("IsItalic")
    @JsonProperty("IsItalic")
    private Boolean isItalic;

    public Font isItalic(Boolean isItalic) {
        this.isItalic = isItalic;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsItalic() {
        return isItalic;
    }

    public void setIsItalic(Boolean isItalic) {
        this.isItalic = isItalic;
    }

    @SerializedName("IsStrikeout")
    @JsonProperty("IsStrikeout")
    private Boolean isStrikeout;

    public Font isStrikeout(Boolean isStrikeout) {
        this.isStrikeout = isStrikeout;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsStrikeout() {
        return isStrikeout;
    }

    public void setIsStrikeout(Boolean isStrikeout) {
        this.isStrikeout = isStrikeout;
    }

    @SerializedName("IsSubscript")
    @JsonProperty("IsSubscript")
    private Boolean isSubscript;

    public Font isSubscript(Boolean isSubscript) {
        this.isSubscript = isSubscript;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsSubscript() {
        return isSubscript;
    }

    public void setIsSubscript(Boolean isSubscript) {
        this.isSubscript = isSubscript;
    }

    @SerializedName("IsSuperscript")
    @JsonProperty("IsSuperscript")
    private Boolean isSuperscript;

    public Font isSuperscript(Boolean isSuperscript) {
        this.isSuperscript = isSuperscript;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsSuperscript() {
        return isSuperscript;
    }

    public void setIsSuperscript(Boolean isSuperscript) {
        this.isSuperscript = isSuperscript;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Font name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("Size")
    @JsonProperty("Size")
    private Integer size;

    public Font size(Integer size) {
        this.size = size;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @SerializedName("Underline")
    @JsonProperty("Underline")
    private String underline;

    public Font underline(String underline) {
        this.underline = underline;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getUnderline() {
        return underline;
    }

    public void setUnderline(String underline) {
        this.underline = underline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Font other = (Font) o;
        return Objects.equals(this.color, other.color)
            && Objects.equals(this.doubleSize, other.doubleSize)
            && Objects.equals(this.isBold, other.isBold)
            && Objects.equals(this.isItalic, other.isItalic)
            && Objects.equals(this.isStrikeout, other.isStrikeout)
            && Objects.equals(this.isSubscript, other.isSubscript)
            && Objects.equals(this.isSuperscript, other.isSuperscript)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.size, other.size)
            && Objects.equals(this.underline, other.underline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, doubleSize, isBold, isItalic, isStrikeout, isSubscript, isSuperscript, name, size, underline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Font {\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    doubleSize: ").append(doubleSize).append("\n");
        sb.append("    isBold: ").append(isBold).append("\n");
        sb.append("    isItalic: ").append(isItalic).append("\n");
        sb.append("    isStrikeout: ").append(isStrikeout).append("\n");
        sb.append("    isSubscript: ").append(isSubscript).append("\n");
        sb.append("    isSuperscript: ").append(isSuperscript).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    size: ").append(size).append("\n");
        sb.append("    underline: ").append(underline).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

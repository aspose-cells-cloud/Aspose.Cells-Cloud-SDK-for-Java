/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Row.java">
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

public class Row extends LinkElement {

    @SerializedName("GroupLevel")
    @JsonProperty("GroupLevel")
    private Integer groupLevel;

    public Row groupLevel(Integer groupLevel) {
        this.groupLevel = groupLevel;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(Integer groupLevel) {
        this.groupLevel = groupLevel;
    }

    @SerializedName("Height")
    @JsonProperty("Height")
    private Double height;

    public Row height(Double height) {
        this.height = height;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @SerializedName("Index")
    @JsonProperty("Index")
    private Integer index;

    public Row index(Integer index) {
        this.index = index;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @SerializedName("IsBlank")
    @JsonProperty("IsBlank")
    private Boolean isBlank;

    public Row isBlank(Boolean isBlank) {
        this.isBlank = isBlank;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsBlank() {
        return isBlank;
    }

    public void setIsBlank(Boolean isBlank) {
        this.isBlank = isBlank;
    }

    @SerializedName("IsHeightMatched")
    @JsonProperty("IsHeightMatched")
    private Boolean isHeightMatched;

    public Row isHeightMatched(Boolean isHeightMatched) {
        this.isHeightMatched = isHeightMatched;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHeightMatched() {
        return isHeightMatched;
    }

    public void setIsHeightMatched(Boolean isHeightMatched) {
        this.isHeightMatched = isHeightMatched;
    }

    @SerializedName("IsHidden")
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    public Row isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    @SerializedName("Style")
    @JsonProperty("Style")
    private LinkElement style;

    public Row style(LinkElement style) {
        this.style = style;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getStyle() {
        return style;
    }

    public void setStyle(LinkElement style) {
        this.style = style;
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
        Row other = (Row) o;
        return Objects.equals(this.groupLevel, other.groupLevel)
            && Objects.equals(this.height, other.height)
            && Objects.equals(this.index, other.index)
            && Objects.equals(this.isBlank, other.isBlank)
            && Objects.equals(this.isHeightMatched, other.isHeightMatched)
            && Objects.equals(this.isHidden, other.isHidden)
            && Objects.equals(this.style, other.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupLevel, height, index, isBlank, isHeightMatched, isHidden, style, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Row {\n");
        sb.append("    groupLevel: ").append(groupLevel).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    isBlank: ").append(isBlank).append("\n");
        sb.append("    isHeightMatched: ").append(isHeightMatched).append("\n");
        sb.append("    isHidden: ").append(isHidden).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Column.java">
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

public class Column extends LinkElement {

    @SerializedName("GroupLevel")
    @JsonProperty("GroupLevel")
    private Integer groupLevel;

    public Column groupLevel(Integer groupLevel) {
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

    @SerializedName("Index")
    @JsonProperty("Index")
    private Integer index;

    public Column index(Integer index) {
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

    @SerializedName("IsHidden")
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    public Column isHidden(Boolean isHidden) {
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

    @SerializedName("Width")
    @JsonProperty("Width")
    private Double width;

    public Column width(Double width) {
        this.width = width;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @SerializedName("Style")
    @JsonProperty("Style")
    private LinkElement style;

    public Column style(LinkElement style) {
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
        Column other = (Column) o;
        return Objects.equals(this.groupLevel, other.groupLevel)
            && Objects.equals(this.index, other.index)
            && Objects.equals(this.isHidden, other.isHidden)
            && Objects.equals(this.width, other.width)
            && Objects.equals(this.style, other.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupLevel, index, isHidden, width, style, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Column {\n");
        sb.append("    groupLevel: ").append(groupLevel).append("\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    isHidden: ").append(isHidden).append("\n");
        sb.append("    width: ").append(width).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

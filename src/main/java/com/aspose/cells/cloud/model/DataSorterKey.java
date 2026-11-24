/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataSorterKey.java">
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

public class DataSorterKey {

    @SerializedName("Order")
    @JsonProperty("Order")
    private String order;

    public DataSorterKey order(String order) {
        this.order = order;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @SerializedName("Index")
    @JsonProperty("Index")
    private Integer index;

    public DataSorterKey index(Integer index) {
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

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public DataSorterKey type(String type) {
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

    @SerializedName("IconSetType")
    @JsonProperty("IconSetType")
    private String iconSetType;

    public DataSorterKey iconSetType(String iconSetType) {
        this.iconSetType = iconSetType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIconSetType() {
        return iconSetType;
    }

    public void setIconSetType(String iconSetType) {
        this.iconSetType = iconSetType;
    }

    @SerializedName("IconId")
    @JsonProperty("IconId")
    private Integer iconId;

    public DataSorterKey iconId(Integer iconId) {
        this.iconId = iconId;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public DataSorterKey color(Color color) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataSorterKey other = (DataSorterKey) o;
        return Objects.equals(this.order, other.order)
            && Objects.equals(this.index, other.index)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.iconSetType, other.iconSetType)
            && Objects.equals(this.iconId, other.iconId)
            && Objects.equals(this.color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, index, type, iconSetType, iconId, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSorterKey {\n");
        sb.append("    order: ").append(order).append("\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    iconSetType: ").append(iconSetType).append("\n");
        sb.append("    iconId: ").append(iconId).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

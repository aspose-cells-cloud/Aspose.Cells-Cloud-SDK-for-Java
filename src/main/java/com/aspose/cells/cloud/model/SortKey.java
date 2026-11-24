/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SortKey.java">
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

public class SortKey {

    @SerializedName("Key")
    @JsonProperty("Key")
    private Integer key;

    public SortKey key(Integer key) {
        this.key = key;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    @SerializedName("SortOrder")
    @JsonProperty("SortOrder")
    private String sortOrder;

    public SortKey sortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @SerializedName("CustomList")
    @JsonProperty("CustomList")
    private List<String> customList;

    public SortKey customList(List<String> customList) {
        this.customList = customList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<String> getCustomList() {
        return customList;
    }

    public void setCustomList(List<String> customList) {
        this.customList = customList;
    }

    @SerializedName("Order")
    @JsonProperty("Order")
    private String order;

    public SortKey order(String order) {
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

    public SortKey index(Integer index) {
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

    public SortKey type(String type) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SortKey other = (SortKey) o;
        return Objects.equals(this.key, other.key)
            && Objects.equals(this.sortOrder, other.sortOrder)
            && Objects.equals(this.customList, other.customList)
            && Objects.equals(this.order, other.order)
            && Objects.equals(this.index, other.index)
            && Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, sortOrder, customList, order, index, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SortKey {\n");
        sb.append("    key: ").append(key).append("\n");
        sb.append("    sortOrder: ").append(sortOrder).append("\n");
        sb.append("    customList: ").append(customList).append("\n");
        sb.append("    order: ").append(order).append("\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

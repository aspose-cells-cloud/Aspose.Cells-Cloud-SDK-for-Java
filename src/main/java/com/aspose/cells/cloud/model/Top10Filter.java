/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Top10Filter.java">
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

public class Top10Filter {

    @SerializedName("FieldIndex")
    @JsonProperty("FieldIndex")
    private Integer fieldIndex;

    public Top10Filter fieldIndex(Integer fieldIndex) {
        this.fieldIndex = fieldIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFieldIndex() {
        return fieldIndex;
    }

    public void setFieldIndex(Integer fieldIndex) {
        this.fieldIndex = fieldIndex;
    }

    @SerializedName("Criteria")
    @JsonProperty("Criteria")
    private String criteria;

    public Top10Filter criteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    @SerializedName("IsPercent")
    @JsonProperty("IsPercent")
    private Boolean isPercent;

    public Top10Filter isPercent(Boolean isPercent) {
        this.isPercent = isPercent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsPercent() {
        return isPercent;
    }

    public void setIsPercent(Boolean isPercent) {
        this.isPercent = isPercent;
    }

    @SerializedName("IsTop")
    @JsonProperty("IsTop")
    private Boolean isTop;

    public Top10Filter isTop(Boolean isTop) {
        this.isTop = isTop;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    @SerializedName("Items")
    @JsonProperty("Items")
    private Integer items;

    public Top10Filter items(Integer items) {
        this.items = items;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Top10Filter other = (Top10Filter) o;
        return Objects.equals(this.fieldIndex, other.fieldIndex)
            && Objects.equals(this.criteria, other.criteria)
            && Objects.equals(this.isPercent, other.isPercent)
            && Objects.equals(this.isTop, other.isTop)
            && Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldIndex, criteria, isPercent, isTop, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Top10Filter {\n");
        sb.append("    fieldIndex: ").append(fieldIndex).append("\n");
        sb.append("    criteria: ").append(criteria).append("\n");
        sb.append("    isPercent: ").append(isPercent).append("\n");
        sb.append("    isTop: ").append(isTop).append("\n");
        sb.append("    items: ").append(items).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

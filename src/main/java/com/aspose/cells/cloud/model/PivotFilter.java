/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotFilter.java">
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

public class PivotFilter {

    @SerializedName("AutoFilter")
    @JsonProperty("AutoFilter")
    private AutoFilter autoFilter;

    public PivotFilter autoFilter(AutoFilter autoFilter) {
        this.autoFilter = autoFilter;
        return this;
    }

    @ApiModelProperty(value = "")
    public AutoFilter getAutoFilter() {
        return autoFilter;
    }

    public void setAutoFilter(AutoFilter autoFilter) {
        this.autoFilter = autoFilter;
    }

    @SerializedName("EvaluationOrder")
    @JsonProperty("EvaluationOrder")
    private Integer evaluationOrder;

    public PivotFilter evaluationOrder(Integer evaluationOrder) {
        this.evaluationOrder = evaluationOrder;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getEvaluationOrder() {
        return evaluationOrder;
    }

    public void setEvaluationOrder(Integer evaluationOrder) {
        this.evaluationOrder = evaluationOrder;
    }

    @SerializedName("FieldIndex")
    @JsonProperty("FieldIndex")
    private Integer fieldIndex;

    public PivotFilter fieldIndex(Integer fieldIndex) {
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

    @SerializedName("FilterType")
    @JsonProperty("FilterType")
    private String filterType;

    public PivotFilter filterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @SerializedName("ValueFieldIndex")
    @JsonProperty("ValueFieldIndex")
    private Integer valueFieldIndex;

    public PivotFilter valueFieldIndex(Integer valueFieldIndex) {
        this.valueFieldIndex = valueFieldIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getValueFieldIndex() {
        return valueFieldIndex;
    }

    public void setValueFieldIndex(Integer valueFieldIndex) {
        this.valueFieldIndex = valueFieldIndex;
    }

    @SerializedName("MemberPropertyFieldIndex")
    @JsonProperty("MemberPropertyFieldIndex")
    private Integer memberPropertyFieldIndex;

    public PivotFilter memberPropertyFieldIndex(Integer memberPropertyFieldIndex) {
        this.memberPropertyFieldIndex = memberPropertyFieldIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMemberPropertyFieldIndex() {
        return memberPropertyFieldIndex;
    }

    public void setMemberPropertyFieldIndex(Integer memberPropertyFieldIndex) {
        this.memberPropertyFieldIndex = memberPropertyFieldIndex;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public PivotFilter name(String name) {
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

    @SerializedName("Value1")
    @JsonProperty("Value1")
    private String value1;

    public PivotFilter value1(String value1) {
        this.value1 = value1;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    @SerializedName("Value2")
    @JsonProperty("Value2")
    private String value2;

    public PivotFilter value2(String value2) {
        this.value2 = value2;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @SerializedName("Top10Filter")
    @JsonProperty("Top10Filter")
    private Top10Filter top10Filter;

    public PivotFilter top10Filter(Top10Filter top10Filter) {
        this.top10Filter = top10Filter;
        return this;
    }

    @ApiModelProperty(value = "")
    public Top10Filter getTop10Filter() {
        return top10Filter;
    }

    public void setTop10Filter(Top10Filter top10Filter) {
        this.top10Filter = top10Filter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PivotFilter other = (PivotFilter) o;
        return Objects.equals(this.autoFilter, other.autoFilter)
            && Objects.equals(this.evaluationOrder, other.evaluationOrder)
            && Objects.equals(this.fieldIndex, other.fieldIndex)
            && Objects.equals(this.filterType, other.filterType)
            && Objects.equals(this.valueFieldIndex, other.valueFieldIndex)
            && Objects.equals(this.memberPropertyFieldIndex, other.memberPropertyFieldIndex)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.value1, other.value1)
            && Objects.equals(this.value2, other.value2)
            && Objects.equals(this.top10Filter, other.top10Filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoFilter, evaluationOrder, fieldIndex, filterType, valueFieldIndex, memberPropertyFieldIndex, name, value1, value2, top10Filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PivotFilter {\n");
        sb.append("    autoFilter: ").append(autoFilter).append("\n");
        sb.append("    evaluationOrder: ").append(evaluationOrder).append("\n");
        sb.append("    fieldIndex: ").append(fieldIndex).append("\n");
        sb.append("    filterType: ").append(filterType).append("\n");
        sb.append("    valueFieldIndex: ").append(valueFieldIndex).append("\n");
        sb.append("    memberPropertyFieldIndex: ").append(memberPropertyFieldIndex).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    value1: ").append(value1).append("\n");
        sb.append("    value2: ").append(value2).append("\n");
        sb.append("    top10Filter: ").append(top10Filter).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

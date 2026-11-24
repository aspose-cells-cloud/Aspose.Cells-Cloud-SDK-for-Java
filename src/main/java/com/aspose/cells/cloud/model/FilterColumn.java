/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FilterColumn.java">
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

public class FilterColumn {

    @SerializedName("FieldIndex")
    @JsonProperty("FieldIndex")
    private Integer fieldIndex;

    public FilterColumn fieldIndex(Integer fieldIndex) {
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

    public FilterColumn filterType(String filterType) {
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

    @SerializedName("MultipleFilters")
    @JsonProperty("MultipleFilters")
    private MultipleFilters multipleFilters;

    public FilterColumn multipleFilters(MultipleFilters multipleFilters) {
        this.multipleFilters = multipleFilters;
        return this;
    }

    @ApiModelProperty(value = "")
    public MultipleFilters getMultipleFilters() {
        return multipleFilters;
    }

    public void setMultipleFilters(MultipleFilters multipleFilters) {
        this.multipleFilters = multipleFilters;
    }

    @SerializedName("ColorFilter")
    @JsonProperty("ColorFilter")
    private ColorFilter colorFilter;

    public FilterColumn colorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return this;
    }

    @ApiModelProperty(value = "")
    public ColorFilter getColorFilter() {
        return colorFilter;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @SerializedName("CustomFilters")
    @JsonProperty("CustomFilters")
    private List<CustomFilter> customFilters;

    public FilterColumn customFilters(List<CustomFilter> customFilters) {
        this.customFilters = customFilters;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<CustomFilter> getCustomFilters() {
        return customFilters;
    }

    public void setCustomFilters(List<CustomFilter> customFilters) {
        this.customFilters = customFilters;
    }

    @SerializedName("DynamicFilter")
    @JsonProperty("DynamicFilter")
    private DynamicFilter dynamicFilter;

    public FilterColumn dynamicFilter(DynamicFilter dynamicFilter) {
        this.dynamicFilter = dynamicFilter;
        return this;
    }

    @ApiModelProperty(value = "")
    public DynamicFilter getDynamicFilter() {
        return dynamicFilter;
    }

    public void setDynamicFilter(DynamicFilter dynamicFilter) {
        this.dynamicFilter = dynamicFilter;
    }

    @SerializedName("IconFilter")
    @JsonProperty("IconFilter")
    private IconFilter iconFilter;

    public FilterColumn iconFilter(IconFilter iconFilter) {
        this.iconFilter = iconFilter;
        return this;
    }

    @ApiModelProperty(value = "")
    public IconFilter getIconFilter() {
        return iconFilter;
    }

    public void setIconFilter(IconFilter iconFilter) {
        this.iconFilter = iconFilter;
    }

    @SerializedName("Top10Filter")
    @JsonProperty("Top10Filter")
    private Top10Filter top10Filter;

    public FilterColumn top10Filter(Top10Filter top10Filter) {
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

    @SerializedName("Visibledropdown")
    @JsonProperty("Visibledropdown")
    private String visibledropdown;

    public FilterColumn visibledropdown(String visibledropdown) {
        this.visibledropdown = visibledropdown;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getVisibledropdown() {
        return visibledropdown;
    }

    public void setVisibledropdown(String visibledropdown) {
        this.visibledropdown = visibledropdown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterColumn other = (FilterColumn) o;
        return Objects.equals(this.fieldIndex, other.fieldIndex)
            && Objects.equals(this.filterType, other.filterType)
            && Objects.equals(this.multipleFilters, other.multipleFilters)
            && Objects.equals(this.colorFilter, other.colorFilter)
            && Objects.equals(this.customFilters, other.customFilters)
            && Objects.equals(this.dynamicFilter, other.dynamicFilter)
            && Objects.equals(this.iconFilter, other.iconFilter)
            && Objects.equals(this.top10Filter, other.top10Filter)
            && Objects.equals(this.visibledropdown, other.visibledropdown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldIndex, filterType, multipleFilters, colorFilter, customFilters, dynamicFilter, iconFilter, top10Filter, visibledropdown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterColumn {\n");
        sb.append("    fieldIndex: ").append(fieldIndex).append("\n");
        sb.append("    filterType: ").append(filterType).append("\n");
        sb.append("    multipleFilters: ").append(multipleFilters).append("\n");
        sb.append("    colorFilter: ").append(colorFilter).append("\n");
        sb.append("    customFilters: ").append(customFilters).append("\n");
        sb.append("    dynamicFilter: ").append(dynamicFilter).append("\n");
        sb.append("    iconFilter: ").append(iconFilter).append("\n");
        sb.append("    top10Filter: ").append(top10Filter).append("\n");
        sb.append("    visibledropdown: ").append(visibledropdown).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

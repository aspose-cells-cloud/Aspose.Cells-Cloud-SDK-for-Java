/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AutoFilter.java">
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

public class AutoFilter extends LinkElement {

    @SerializedName("FilterColumns")
    @JsonProperty("FilterColumns")
    private List<FilterColumn> filterColumns;

    public AutoFilter filterColumns(List<FilterColumn> filterColumns) {
        this.filterColumns = filterColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<FilterColumn> getFilterColumns() {
        return filterColumns;
    }

    public void setFilterColumns(List<FilterColumn> filterColumns) {
        this.filterColumns = filterColumns;
    }

    @SerializedName("Range")
    @JsonProperty("Range")
    private String range;

    public AutoFilter range(String range) {
        this.range = range;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @SerializedName("Sorter")
    @JsonProperty("Sorter")
    private DataSorter sorter;

    public AutoFilter sorter(DataSorter sorter) {
        this.sorter = sorter;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSorter getSorter() {
        return sorter;
    }

    public void setSorter(DataSorter sorter) {
        this.sorter = sorter;
    }

    @SerializedName("ShowFilterButton")
    @JsonProperty("ShowFilterButton")
    private Boolean showFilterButton;

    public AutoFilter showFilterButton(Boolean showFilterButton) {
        this.showFilterButton = showFilterButton;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowFilterButton() {
        return showFilterButton;
    }

    public void setShowFilterButton(Boolean showFilterButton) {
        this.showFilterButton = showFilterButton;
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
        AutoFilter other = (AutoFilter) o;
        return Objects.equals(this.filterColumns, other.filterColumns)
            && Objects.equals(this.range, other.range)
            && Objects.equals(this.sorter, other.sorter)
            && Objects.equals(this.showFilterButton, other.showFilterButton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterColumns, range, sorter, showFilterButton, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoFilter {\n");
        sb.append("    filterColumns: ").append(filterColumns).append("\n");
        sb.append("    range: ").append(range).append("\n");
        sb.append("    sorter: ").append(sorter).append("\n");
        sb.append("    showFilterButton: ").append(showFilterButton).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

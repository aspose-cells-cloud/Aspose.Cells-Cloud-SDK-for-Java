/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DiscoverPivotTable.java">
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

public class DiscoverPivotTable {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public DiscoverPivotTable name(String name) {
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

    @SerializedName("Title")
    @JsonProperty("Title")
    private String title;

    public DiscoverPivotTable title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("DataRange")
    @JsonProperty("DataRange")
    private String dataRange;

    public DiscoverPivotTable dataRange(String dataRange) {
        this.dataRange = dataRange;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataRange() {
        return dataRange;
    }

    public void setDataRange(String dataRange) {
        this.dataRange = dataRange;
    }

    @SerializedName("PivotFieldRows")
    @JsonProperty("PivotFieldRows")
    private List<Integer> pivotFieldRows;

    public DiscoverPivotTable pivotFieldRows(List<Integer> pivotFieldRows) {
        this.pivotFieldRows = pivotFieldRows;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getPivotFieldRows() {
        return pivotFieldRows;
    }

    public void setPivotFieldRows(List<Integer> pivotFieldRows) {
        this.pivotFieldRows = pivotFieldRows;
    }

    @SerializedName("PivotFieldColumns")
    @JsonProperty("PivotFieldColumns")
    private List<Integer> pivotFieldColumns;

    public DiscoverPivotTable pivotFieldColumns(List<Integer> pivotFieldColumns) {
        this.pivotFieldColumns = pivotFieldColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getPivotFieldColumns() {
        return pivotFieldColumns;
    }

    public void setPivotFieldColumns(List<Integer> pivotFieldColumns) {
        this.pivotFieldColumns = pivotFieldColumns;
    }

    @SerializedName("PivotFieldData")
    @JsonProperty("PivotFieldData")
    private List<Integer> pivotFieldData;

    public DiscoverPivotTable pivotFieldData(List<Integer> pivotFieldData) {
        this.pivotFieldData = pivotFieldData;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getPivotFieldData() {
        return pivotFieldData;
    }

    public void setPivotFieldData(List<Integer> pivotFieldData) {
        this.pivotFieldData = pivotFieldData;
    }

    @SerializedName("Thumbnail")
    @JsonProperty("Thumbnail")
    private String thumbnail;

    public DiscoverPivotTable thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscoverPivotTable other = (DiscoverPivotTable) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.title, other.title)
            && Objects.equals(this.dataRange, other.dataRange)
            && Objects.equals(this.pivotFieldRows, other.pivotFieldRows)
            && Objects.equals(this.pivotFieldColumns, other.pivotFieldColumns)
            && Objects.equals(this.pivotFieldData, other.pivotFieldData)
            && Objects.equals(this.thumbnail, other.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, dataRange, pivotFieldRows, pivotFieldColumns, pivotFieldData, thumbnail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscoverPivotTable {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    title: ").append(title).append("\n");
        sb.append("    dataRange: ").append(dataRange).append("\n");
        sb.append("    pivotFieldRows: ").append(pivotFieldRows).append("\n");
        sb.append("    pivotFieldColumns: ").append(pivotFieldColumns).append("\n");
        sb.append("    pivotFieldData: ").append(pivotFieldData).append("\n");
        sb.append("    thumbnail: ").append(thumbnail).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

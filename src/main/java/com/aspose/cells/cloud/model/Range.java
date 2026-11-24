/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Range.java">
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

public class Range {

    @SerializedName("ColumnCount")
    @JsonProperty("ColumnCount")
    private Integer columnCount;

    public Range columnCount(Integer columnCount) {
        this.columnCount = columnCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    @SerializedName("ColumnWidth")
    @JsonProperty("ColumnWidth")
    private Double columnWidth;

    public Range columnWidth(Double columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(Double columnWidth) {
        this.columnWidth = columnWidth;
    }

    @SerializedName("FirstColumn")
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    public Range firstColumn(Integer firstColumn) {
        this.firstColumn = firstColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstColumn() {
        return firstColumn;
    }

    public void setFirstColumn(Integer firstColumn) {
        this.firstColumn = firstColumn;
    }

    @SerializedName("FirstRow")
    @JsonProperty("FirstRow")
    private Integer firstRow;

    public Range firstRow(Integer firstRow) {
        this.firstRow = firstRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstRow() {
        return firstRow;
    }

    public void setFirstRow(Integer firstRow) {
        this.firstRow = firstRow;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Range name(String name) {
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

    @SerializedName("RefersTo")
    @JsonProperty("RefersTo")
    private String refersTo;

    public Range refersTo(String refersTo) {
        this.refersTo = refersTo;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRefersTo() {
        return refersTo;
    }

    public void setRefersTo(String refersTo) {
        this.refersTo = refersTo;
    }

    @SerializedName("RowCount")
    @JsonProperty("RowCount")
    private Integer rowCount;

    public Range rowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    @SerializedName("RowHeight")
    @JsonProperty("RowHeight")
    private Double rowHeight;

    public Range rowHeight(Double rowHeight) {
        this.rowHeight = rowHeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getRowHeight() {
        return rowHeight;
    }

    public void setRowHeight(Double rowHeight) {
        this.rowHeight = rowHeight;
    }

    @SerializedName("Worksheet")
    @JsonProperty("Worksheet")
    private String worksheet;

    public Range worksheet(String worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(String worksheet) {
        this.worksheet = worksheet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Range other = (Range) o;
        return Objects.equals(this.columnCount, other.columnCount)
            && Objects.equals(this.columnWidth, other.columnWidth)
            && Objects.equals(this.firstColumn, other.firstColumn)
            && Objects.equals(this.firstRow, other.firstRow)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.refersTo, other.refersTo)
            && Objects.equals(this.rowCount, other.rowCount)
            && Objects.equals(this.rowHeight, other.rowHeight)
            && Objects.equals(this.worksheet, other.worksheet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnCount, columnWidth, firstColumn, firstRow, name, refersTo, rowCount, rowHeight, worksheet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Range {\n");
        sb.append("    columnCount: ").append(columnCount).append("\n");
        sb.append("    columnWidth: ").append(columnWidth).append("\n");
        sb.append("    firstColumn: ").append(firstColumn).append("\n");
        sb.append("    firstRow: ").append(firstRow).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    refersTo: ").append(refersTo).append("\n");
        sb.append("    rowCount: ").append(rowCount).append("\n");
        sb.append("    rowHeight: ").append(rowHeight).append("\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

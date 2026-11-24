/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Cells.java">
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

public class Cells extends LinkElement {

    @SerializedName("MaxRow")
    @JsonProperty("MaxRow")
    private Integer maxRow;

    public Cells maxRow(Integer maxRow) {
        this.maxRow = maxRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxRow() {
        return maxRow;
    }

    public void setMaxRow(Integer maxRow) {
        this.maxRow = maxRow;
    }

    @SerializedName("MaxColumn")
    @JsonProperty("MaxColumn")
    private Integer maxColumn;

    public Cells maxColumn(Integer maxColumn) {
        this.maxColumn = maxColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxColumn() {
        return maxColumn;
    }

    public void setMaxColumn(Integer maxColumn) {
        this.maxColumn = maxColumn;
    }

    @SerializedName("CellCount")
    @JsonProperty("CellCount")
    private Integer cellCount;

    public Cells cellCount(Integer cellCount) {
        this.cellCount = cellCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCellCount() {
        return cellCount;
    }

    public void setCellCount(Integer cellCount) {
        this.cellCount = cellCount;
    }

    @SerializedName("Rows")
    @JsonProperty("Rows")
    private LinkElement rows;

    public Cells rows(LinkElement rows) {
        this.rows = rows;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getRows() {
        return rows;
    }

    public void setRows(LinkElement rows) {
        this.rows = rows;
    }

    @SerializedName("Columns")
    @JsonProperty("Columns")
    private LinkElement columns;

    public Cells columns(LinkElement columns) {
        this.columns = columns;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getColumns() {
        return columns;
    }

    public void setColumns(LinkElement columns) {
        this.columns = columns;
    }

    @SerializedName("CellList")
    @JsonProperty("CellList")
    private List<LinkElement> cellList;

    public Cells cellList(List<LinkElement> cellList) {
        this.cellList = cellList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<LinkElement> getCellList() {
        return cellList;
    }

    public void setCellList(List<LinkElement> cellList) {
        this.cellList = cellList;
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
        Cells other = (Cells) o;
        return Objects.equals(this.maxRow, other.maxRow)
            && Objects.equals(this.maxColumn, other.maxColumn)
            && Objects.equals(this.cellCount, other.cellCount)
            && Objects.equals(this.rows, other.rows)
            && Objects.equals(this.columns, other.columns)
            && Objects.equals(this.cellList, other.cellList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxRow, maxColumn, cellCount, rows, columns, cellList, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cells {\n");
        sb.append("    maxRow: ").append(maxRow).append("\n");
        sb.append("    maxColumn: ").append(maxColumn).append("\n");
        sb.append("    cellCount: ").append(cellCount).append("\n");
        sb.append("    rows: ").append(rows).append("\n");
        sb.append("    columns: ").append(columns).append("\n");
        sb.append("    cellList: ").append(cellList).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

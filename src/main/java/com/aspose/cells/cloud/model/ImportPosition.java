/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportPosition.java">
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

public class ImportPosition {

    @SerializedName("SheetName")
    @JsonProperty("SheetName")
    private String sheetName;

    public ImportPosition sheetName(String sheetName) {
        this.sheetName = sheetName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    @SerializedName("RowIndex")
    @JsonProperty("RowIndex")
    private Integer rowIndex;

    public ImportPosition rowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    @SerializedName("ColumnIndex")
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    public ImportPosition columnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportPosition other = (ImportPosition) o;
        return Objects.equals(this.sheetName, other.sheetName)
            && Objects.equals(this.rowIndex, other.rowIndex)
            && Objects.equals(this.columnIndex, other.columnIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sheetName, rowIndex, columnIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPosition {\n");
        sb.append("    sheetName: ").append(sheetName).append("\n");
        sb.append("    rowIndex: ").append(rowIndex).append("\n");
        sb.append("    columnIndex: ").append(columnIndex).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Rows.java">
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

public class Rows extends LinkElement {

    @SerializedName("MaxRow")
    @JsonProperty("MaxRow")
    private Integer maxRow;

    public Rows maxRow(Integer maxRow) {
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

    @SerializedName("RowsCount")
    @JsonProperty("RowsCount")
    private Integer rowsCount;

    public Rows rowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
    }

    @SerializedName("RowsList")
    @JsonProperty("RowsList")
    private List<LinkElement> rowsList;

    public Rows rowsList(List<LinkElement> rowsList) {
        this.rowsList = rowsList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<LinkElement> getRowsList() {
        return rowsList;
    }

    public void setRowsList(List<LinkElement> rowsList) {
        this.rowsList = rowsList;
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
        Rows other = (Rows) o;
        return Objects.equals(this.maxRow, other.maxRow)
            && Objects.equals(this.rowsCount, other.rowsCount)
            && Objects.equals(this.rowsList, other.rowsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxRow, rowsCount, rowsList, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rows {\n");
        sb.append("    maxRow: ").append(maxRow).append("\n");
        sb.append("    rowsCount: ").append(rowsCount).append("\n");
        sb.append("    rowsList: ").append(rowsList).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

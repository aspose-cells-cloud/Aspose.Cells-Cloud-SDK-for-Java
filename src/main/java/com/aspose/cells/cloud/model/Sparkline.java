/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Sparkline.java">
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

public class Sparkline {

    @SerializedName("Column")
    @JsonProperty("Column")
    private Integer column;

    public Sparkline column(Integer column) {
        this.column = column;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @SerializedName("DataRange")
    @JsonProperty("DataRange")
    private String dataRange;

    public Sparkline dataRange(String dataRange) {
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

    @SerializedName("Row")
    @JsonProperty("Row")
    private Integer row;

    public Sparkline row(Integer row) {
        this.row = row;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sparkline other = (Sparkline) o;
        return Objects.equals(this.column, other.column)
            && Objects.equals(this.dataRange, other.dataRange)
            && Objects.equals(this.row, other.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, dataRange, row);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sparkline {\n");
        sb.append("    column: ").append(column).append("\n");
        sb.append("    dataRange: ").append(dataRange).append("\n");
        sb.append("    row: ").append(row).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

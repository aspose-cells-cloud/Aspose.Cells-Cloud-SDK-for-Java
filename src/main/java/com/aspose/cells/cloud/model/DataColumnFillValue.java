/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataColumnFillValue.java">
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

public class DataColumnFillValue {

    @SerializedName("ColumnIndex")
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    public DataColumnFillValue columnIndex(Integer columnIndex) {
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

    @SerializedName("DataFillValue")
    @JsonProperty("DataFillValue")
    private DataFillValue dataFillValue;

    public DataColumnFillValue dataFillValue(DataFillValue dataFillValue) {
        this.dataFillValue = dataFillValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataFillValue getDataFillValue() {
        return dataFillValue;
    }

    public void setDataFillValue(DataFillValue dataFillValue) {
        this.dataFillValue = dataFillValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataColumnFillValue other = (DataColumnFillValue) o;
        return Objects.equals(this.columnIndex, other.columnIndex)
            && Objects.equals(this.dataFillValue, other.dataFillValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnIndex, dataFillValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataColumnFillValue {\n");
        sb.append("    columnIndex: ").append(columnIndex).append("\n");
        sb.append("    dataFillValue: ").append(dataFillValue).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

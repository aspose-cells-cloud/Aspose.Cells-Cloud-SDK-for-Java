/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataFill.java">
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

public class DataFill {

    @SerializedName("Ranges")
    @JsonProperty("Ranges")
    private List<Range> ranges;

    public DataFill ranges(List<Range> ranges) {
        this.ranges = ranges;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Range> getRanges() {
        return ranges;
    }

    public void setRanges(List<Range> ranges) {
        this.ranges = ranges;
    }

    @SerializedName("DataFillDefaultValue")
    @JsonProperty("DataFillDefaultValue")
    private DataFillValue dataFillDefaultValue;

    public DataFill dataFillDefaultValue(DataFillValue dataFillDefaultValue) {
        this.dataFillDefaultValue = dataFillDefaultValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataFillValue getDataFillDefaultValue() {
        return dataFillDefaultValue;
    }

    public void setDataFillDefaultValue(DataFillValue dataFillDefaultValue) {
        this.dataFillDefaultValue = dataFillDefaultValue;
    }

    @SerializedName("DataColumnFillValueList")
    @JsonProperty("DataColumnFillValueList")
    private List<DataColumnFillValue> dataColumnFillValueList;

    public DataFill dataColumnFillValueList(List<DataColumnFillValue> dataColumnFillValueList) {
        this.dataColumnFillValueList = dataColumnFillValueList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<DataColumnFillValue> getDataColumnFillValueList() {
        return dataColumnFillValueList;
    }

    public void setDataColumnFillValueList(List<DataColumnFillValue> dataColumnFillValueList) {
        this.dataColumnFillValueList = dataColumnFillValueList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataFill other = (DataFill) o;
        return Objects.equals(this.ranges, other.ranges)
            && Objects.equals(this.dataFillDefaultValue, other.dataFillDefaultValue)
            && Objects.equals(this.dataColumnFillValueList, other.dataColumnFillValueList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ranges, dataFillDefaultValue, dataColumnFillValueList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFill {\n");
        sb.append("    ranges: ").append(ranges).append("\n");
        sb.append("    dataFillDefaultValue: ").append(dataFillDefaultValue).append("\n");
        sb.append("    dataColumnFillValueList: ").append(dataColumnFillValueList).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

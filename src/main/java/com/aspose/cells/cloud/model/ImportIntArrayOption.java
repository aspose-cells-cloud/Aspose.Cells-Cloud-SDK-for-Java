/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportIntArrayOption.java">
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

public class ImportIntArrayOption extends ImportOption {

    @SerializedName("FirstRow")
    @JsonProperty("FirstRow")
    private Integer firstRow;

    public ImportIntArrayOption firstRow(Integer firstRow) {
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

    @SerializedName("FirstColumn")
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    public ImportIntArrayOption firstColumn(Integer firstColumn) {
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

    @SerializedName("IsVertical")
    @JsonProperty("IsVertical")
    private Boolean isVertical;

    public ImportIntArrayOption isVertical(Boolean isVertical) {
        this.isVertical = isVertical;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(Boolean isVertical) {
        this.isVertical = isVertical;
    }

    @SerializedName("Data")
    @JsonProperty("Data")
    private List<Integer> data;

    public ImportIntArrayOption data(List<Integer> data) {
        this.data = data;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
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
        ImportIntArrayOption other = (ImportIntArrayOption) o;
        return Objects.equals(this.firstRow, other.firstRow)
            && Objects.equals(this.firstColumn, other.firstColumn)
            && Objects.equals(this.isVertical, other.isVertical)
            && Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstRow, firstColumn, isVertical, data, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportIntArrayOption {\n");
        sb.append("    firstRow: ").append(firstRow).append("\n");
        sb.append("    firstColumn: ").append(firstColumn).append("\n");
        sb.append("    isVertical: ").append(isVertical).append("\n");
        sb.append("    data: ").append(data).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

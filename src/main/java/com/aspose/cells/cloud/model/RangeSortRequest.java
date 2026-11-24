/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RangeSortRequest.java">
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

public class RangeSortRequest {

    @SerializedName("DataSorter")
    @JsonProperty("DataSorter")
    private DataSorter dataSorter;

    public RangeSortRequest dataSorter(DataSorter dataSorter) {
        this.dataSorter = dataSorter;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSorter getDataSorter() {
        return dataSorter;
    }

    public void setDataSorter(DataSorter dataSorter) {
        this.dataSorter = dataSorter;
    }

    @SerializedName("CellArea")
    @JsonProperty("CellArea")
    private Range cellArea;

    public RangeSortRequest cellArea(Range cellArea) {
        this.cellArea = cellArea;
        return this;
    }

    @ApiModelProperty(value = "")
    public Range getCellArea() {
        return cellArea;
    }

    public void setCellArea(Range cellArea) {
        this.cellArea = cellArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RangeSortRequest other = (RangeSortRequest) o;
        return Objects.equals(this.dataSorter, other.dataSorter)
            && Objects.equals(this.cellArea, other.cellArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSorter, cellArea);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RangeSortRequest {\n");
        sb.append("    dataSorter: ").append(dataSorter).append("\n");
        sb.append("    cellArea: ").append(cellArea).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

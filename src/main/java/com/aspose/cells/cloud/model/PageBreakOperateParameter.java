/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PageBreakOperateParameter.java">
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

public class PageBreakOperateParameter extends OperateParameter {

    @SerializedName("PageBreakType")
    @JsonProperty("PageBreakType")
    private String pageBreakType;

    public PageBreakOperateParameter pageBreakType(String pageBreakType) {
        this.pageBreakType = pageBreakType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPageBreakType() {
        return pageBreakType;
    }

    public void setPageBreakType(String pageBreakType) {
        this.pageBreakType = pageBreakType;
    }

    @SerializedName("Index")
    @JsonProperty("Index")
    private Integer index;

    public PageBreakOperateParameter index(Integer index) {
        this.index = index;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @SerializedName("Row")
    @JsonProperty("Row")
    private Integer row;

    public PageBreakOperateParameter row(Integer row) {
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

    @SerializedName("Column")
    @JsonProperty("Column")
    private Integer column;

    public PageBreakOperateParameter column(Integer column) {
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

    @SerializedName("StartIndex")
    @JsonProperty("StartIndex")
    private Integer startIndex;

    public PageBreakOperateParameter startIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @SerializedName("EndIndex")
    @JsonProperty("EndIndex")
    private Integer endIndex;

    public PageBreakOperateParameter endIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
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
        PageBreakOperateParameter other = (PageBreakOperateParameter) o;
        return Objects.equals(this.pageBreakType, other.pageBreakType)
            && Objects.equals(this.index, other.index)
            && Objects.equals(this.row, other.row)
            && Objects.equals(this.column, other.column)
            && Objects.equals(this.startIndex, other.startIndex)
            && Objects.equals(this.endIndex, other.endIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageBreakType, index, row, column, startIndex, endIndex, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageBreakOperateParameter {\n");
        sb.append("    pageBreakType: ").append(pageBreakType).append("\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    row: ").append(row).append("\n");
        sb.append("    column: ").append(column).append("\n");
        sb.append("    startIndex: ").append(startIndex).append("\n");
        sb.append("    endIndex: ").append(endIndex).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

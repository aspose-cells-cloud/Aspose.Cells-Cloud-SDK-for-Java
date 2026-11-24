/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotTableOperateParameter.java">
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

public class PivotTableOperateParameter extends OperateParameter {

    @SerializedName("SourceData")
    @JsonProperty("SourceData")
    private String sourceData;

    public PivotTableOperateParameter sourceData(String sourceData) {
        this.sourceData = sourceData;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceData() {
        return sourceData;
    }

    public void setSourceData(String sourceData) {
        this.sourceData = sourceData;
    }

    @SerializedName("DestCellName")
    @JsonProperty("DestCellName")
    private String destCellName;

    public PivotTableOperateParameter destCellName(String destCellName) {
        this.destCellName = destCellName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDestCellName() {
        return destCellName;
    }

    public void setDestCellName(String destCellName) {
        this.destCellName = destCellName;
    }

    @SerializedName("TableName")
    @JsonProperty("TableName")
    private String tableName;

    public PivotTableOperateParameter tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @SerializedName("UseSameSource")
    @JsonProperty("UseSameSource")
    private Boolean useSameSource;

    public PivotTableOperateParameter useSameSource(Boolean useSameSource) {
        this.useSameSource = useSameSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getUseSameSource() {
        return useSameSource;
    }

    public void setUseSameSource(Boolean useSameSource) {
        this.useSameSource = useSameSource;
    }

    @SerializedName("PivotTableIndex")
    @JsonProperty("PivotTableIndex")
    private Integer pivotTableIndex;

    public PivotTableOperateParameter pivotTableIndex(Integer pivotTableIndex) {
        this.pivotTableIndex = pivotTableIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPivotTableIndex() {
        return pivotTableIndex;
    }

    public void setPivotTableIndex(Integer pivotTableIndex) {
        this.pivotTableIndex = pivotTableIndex;
    }

    @SerializedName("PivotFieldRows")
    @JsonProperty("PivotFieldRows")
    private List<Integer> pivotFieldRows;

    public PivotTableOperateParameter pivotFieldRows(List<Integer> pivotFieldRows) {
        this.pivotFieldRows = pivotFieldRows;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getPivotFieldRows() {
        return pivotFieldRows;
    }

    public void setPivotFieldRows(List<Integer> pivotFieldRows) {
        this.pivotFieldRows = pivotFieldRows;
    }

    @SerializedName("PivotFieldColumns")
    @JsonProperty("PivotFieldColumns")
    private List<Integer> pivotFieldColumns;

    public PivotTableOperateParameter pivotFieldColumns(List<Integer> pivotFieldColumns) {
        this.pivotFieldColumns = pivotFieldColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getPivotFieldColumns() {
        return pivotFieldColumns;
    }

    public void setPivotFieldColumns(List<Integer> pivotFieldColumns) {
        this.pivotFieldColumns = pivotFieldColumns;
    }

    @SerializedName("PivotFieldData")
    @JsonProperty("PivotFieldData")
    private List<Integer> pivotFieldData;

    public PivotTableOperateParameter pivotFieldData(List<Integer> pivotFieldData) {
        this.pivotFieldData = pivotFieldData;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getPivotFieldData() {
        return pivotFieldData;
    }

    public void setPivotFieldData(List<Integer> pivotFieldData) {
        this.pivotFieldData = pivotFieldData;
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
        PivotTableOperateParameter other = (PivotTableOperateParameter) o;
        return Objects.equals(this.sourceData, other.sourceData)
            && Objects.equals(this.destCellName, other.destCellName)
            && Objects.equals(this.tableName, other.tableName)
            && Objects.equals(this.useSameSource, other.useSameSource)
            && Objects.equals(this.pivotTableIndex, other.pivotTableIndex)
            && Objects.equals(this.pivotFieldRows, other.pivotFieldRows)
            && Objects.equals(this.pivotFieldColumns, other.pivotFieldColumns)
            && Objects.equals(this.pivotFieldData, other.pivotFieldData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceData, destCellName, tableName, useSameSource, pivotTableIndex, pivotFieldRows, pivotFieldColumns, pivotFieldData, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PivotTableOperateParameter {\n");
        sb.append("    sourceData: ").append(sourceData).append("\n");
        sb.append("    destCellName: ").append(destCellName).append("\n");
        sb.append("    tableName: ").append(tableName).append("\n");
        sb.append("    useSameSource: ").append(useSameSource).append("\n");
        sb.append("    pivotTableIndex: ").append(pivotTableIndex).append("\n");
        sb.append("    pivotFieldRows: ").append(pivotFieldRows).append("\n");
        sb.append("    pivotFieldColumns: ").append(pivotFieldColumns).append("\n");
        sb.append("    pivotFieldData: ").append(pivotFieldData).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

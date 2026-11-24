/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorksheetDataStatistics.java">
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

public class WorksheetDataStatistics {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public WorksheetDataStatistics name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("ChartsCount")
    @JsonProperty("ChartsCount")
    private Integer chartsCount;

    public WorksheetDataStatistics chartsCount(Integer chartsCount) {
        this.chartsCount = chartsCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getChartsCount() {
        return chartsCount;
    }

    public void setChartsCount(Integer chartsCount) {
        this.chartsCount = chartsCount;
    }

    @SerializedName("TablesCount")
    @JsonProperty("TablesCount")
    private Integer tablesCount;

    public WorksheetDataStatistics tablesCount(Integer tablesCount) {
        this.tablesCount = tablesCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getTablesCount() {
        return tablesCount;
    }

    public void setTablesCount(Integer tablesCount) {
        this.tablesCount = tablesCount;
    }

    @SerializedName("PivotTablesCount")
    @JsonProperty("PivotTablesCount")
    private Integer pivotTablesCount;

    public WorksheetDataStatistics pivotTablesCount(Integer pivotTablesCount) {
        this.pivotTablesCount = pivotTablesCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPivotTablesCount() {
        return pivotTablesCount;
    }

    public void setPivotTablesCount(Integer pivotTablesCount) {
        this.pivotTablesCount = pivotTablesCount;
    }

    @SerializedName("ShapesCount")
    @JsonProperty("ShapesCount")
    private Integer shapesCount;

    public WorksheetDataStatistics shapesCount(Integer shapesCount) {
        this.shapesCount = shapesCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getShapesCount() {
        return shapesCount;
    }

    public void setShapesCount(Integer shapesCount) {
        this.shapesCount = shapesCount;
    }

    @SerializedName("HyperlinksCount")
    @JsonProperty("HyperlinksCount")
    private Integer hyperlinksCount;

    public WorksheetDataStatistics hyperlinksCount(Integer hyperlinksCount) {
        this.hyperlinksCount = hyperlinksCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getHyperlinksCount() {
        return hyperlinksCount;
    }

    public void setHyperlinksCount(Integer hyperlinksCount) {
        this.hyperlinksCount = hyperlinksCount;
    }

    @SerializedName("QueryTablesCount")
    @JsonProperty("QueryTablesCount")
    private Integer queryTablesCount;

    public WorksheetDataStatistics queryTablesCount(Integer queryTablesCount) {
        this.queryTablesCount = queryTablesCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getQueryTablesCount() {
        return queryTablesCount;
    }

    public void setQueryTablesCount(Integer queryTablesCount) {
        this.queryTablesCount = queryTablesCount;
    }

    @SerializedName("CellsCount")
    @JsonProperty("CellsCount")
    private Integer cellsCount;

    public WorksheetDataStatistics cellsCount(Integer cellsCount) {
        this.cellsCount = cellsCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCellsCount() {
        return cellsCount;
    }

    public void setCellsCount(Integer cellsCount) {
        this.cellsCount = cellsCount;
    }

    @SerializedName("CellsCountInTable")
    @JsonProperty("CellsCountInTable")
    private Integer cellsCountInTable;

    public WorksheetDataStatistics cellsCountInTable(Integer cellsCountInTable) {
        this.cellsCountInTable = cellsCountInTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCellsCountInTable() {
        return cellsCountInTable;
    }

    public void setCellsCountInTable(Integer cellsCountInTable) {
        this.cellsCountInTable = cellsCountInTable;
    }

    @SerializedName("CellsCountIsFormula")
    @JsonProperty("CellsCountIsFormula")
    private Integer cellsCountIsFormula;

    public WorksheetDataStatistics cellsCountIsFormula(Integer cellsCountIsFormula) {
        this.cellsCountIsFormula = cellsCountIsFormula;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCellsCountIsFormula() {
        return cellsCountIsFormula;
    }

    public void setCellsCountIsFormula(Integer cellsCountIsFormula) {
        this.cellsCountIsFormula = cellsCountIsFormula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorksheetDataStatistics other = (WorksheetDataStatistics) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.chartsCount, other.chartsCount)
            && Objects.equals(this.tablesCount, other.tablesCount)
            && Objects.equals(this.pivotTablesCount, other.pivotTablesCount)
            && Objects.equals(this.shapesCount, other.shapesCount)
            && Objects.equals(this.hyperlinksCount, other.hyperlinksCount)
            && Objects.equals(this.queryTablesCount, other.queryTablesCount)
            && Objects.equals(this.cellsCount, other.cellsCount)
            && Objects.equals(this.cellsCountInTable, other.cellsCountInTable)
            && Objects.equals(this.cellsCountIsFormula, other.cellsCountIsFormula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chartsCount, tablesCount, pivotTablesCount, shapesCount, hyperlinksCount, queryTablesCount, cellsCount, cellsCountInTable, cellsCountIsFormula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorksheetDataStatistics {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    chartsCount: ").append(chartsCount).append("\n");
        sb.append("    tablesCount: ").append(tablesCount).append("\n");
        sb.append("    pivotTablesCount: ").append(pivotTablesCount).append("\n");
        sb.append("    shapesCount: ").append(shapesCount).append("\n");
        sb.append("    hyperlinksCount: ").append(hyperlinksCount).append("\n");
        sb.append("    queryTablesCount: ").append(queryTablesCount).append("\n");
        sb.append("    cellsCount: ").append(cellsCount).append("\n");
        sb.append("    cellsCountInTable: ").append(cellsCountInTable).append("\n");
        sb.append("    cellsCountIsFormula: ").append(cellsCountIsFormula).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

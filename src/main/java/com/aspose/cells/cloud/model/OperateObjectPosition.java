/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OperateObjectPosition.java">
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

public class OperateObjectPosition {

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public OperateObjectPosition dataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @SerializedName("Workbook")
    @JsonProperty("Workbook")
    private FileSource workbook;

    public OperateObjectPosition workbook(FileSource workbook) {
        this.workbook = workbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getWorkbook() {
        return workbook;
    }

    public void setWorkbook(FileSource workbook) {
        this.workbook = workbook;
    }

    @SerializedName("SheetName")
    @JsonProperty("SheetName")
    private String sheetName;

    public OperateObjectPosition sheetName(String sheetName) {
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

    @SerializedName("ChartIndex")
    @JsonProperty("ChartIndex")
    private Integer chartIndex;

    public OperateObjectPosition chartIndex(Integer chartIndex) {
        this.chartIndex = chartIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getChartIndex() {
        return chartIndex;
    }

    public void setChartIndex(Integer chartIndex) {
        this.chartIndex = chartIndex;
    }

    @SerializedName("ShapeIndex")
    @JsonProperty("ShapeIndex")
    private Integer shapeIndex;

    public OperateObjectPosition shapeIndex(Integer shapeIndex) {
        this.shapeIndex = shapeIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getShapeIndex() {
        return shapeIndex;
    }

    public void setShapeIndex(Integer shapeIndex) {
        this.shapeIndex = shapeIndex;
    }

    @SerializedName("CellName")
    @JsonProperty("CellName")
    private String cellName;

    public OperateObjectPosition cellName(String cellName) {
        this.cellName = cellName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    @SerializedName("ListObjectIndex")
    @JsonProperty("ListObjectIndex")
    private Integer listObjectIndex;

    public OperateObjectPosition listObjectIndex(Integer listObjectIndex) {
        this.listObjectIndex = listObjectIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getListObjectIndex() {
        return listObjectIndex;
    }

    public void setListObjectIndex(Integer listObjectIndex) {
        this.listObjectIndex = listObjectIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperateObjectPosition other = (OperateObjectPosition) o;
        return Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.workbook, other.workbook)
            && Objects.equals(this.sheetName, other.sheetName)
            && Objects.equals(this.chartIndex, other.chartIndex)
            && Objects.equals(this.shapeIndex, other.shapeIndex)
            && Objects.equals(this.cellName, other.cellName)
            && Objects.equals(this.listObjectIndex, other.listObjectIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource, workbook, sheetName, chartIndex, shapeIndex, cellName, listObjectIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateObjectPosition {\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    workbook: ").append(workbook).append("\n");
        sb.append("    sheetName: ").append(sheetName).append("\n");
        sb.append("    chartIndex: ").append(chartIndex).append("\n");
        sb.append("    shapeIndex: ").append(shapeIndex).append("\n");
        sb.append("    cellName: ").append(cellName).append("\n");
        sb.append("    listObjectIndex: ").append(listObjectIndex).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

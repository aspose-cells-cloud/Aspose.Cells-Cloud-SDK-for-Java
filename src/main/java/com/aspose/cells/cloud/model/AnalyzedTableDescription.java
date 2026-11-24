/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzedTableDescription.java">
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

public class AnalyzedTableDescription {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public AnalyzedTableDescription name(String name) {
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

    @SerializedName("SheetName")
    @JsonProperty("SheetName")
    private String sheetName;

    public AnalyzedTableDescription sheetName(String sheetName) {
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

    @SerializedName("Columns")
    @JsonProperty("Columns")
    private List<AnalyzedColumnDescription> columns;

    public AnalyzedTableDescription columns(List<AnalyzedColumnDescription> columns) {
        this.columns = columns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<AnalyzedColumnDescription> getColumns() {
        return columns;
    }

    public void setColumns(List<AnalyzedColumnDescription> columns) {
        this.columns = columns;
    }

    @SerializedName("DateColumns")
    @JsonProperty("DateColumns")
    private List<Integer> dateColumns;

    public AnalyzedTableDescription dateColumns(List<Integer> dateColumns) {
        this.dateColumns = dateColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getDateColumns() {
        return dateColumns;
    }

    public void setDateColumns(List<Integer> dateColumns) {
        this.dateColumns = dateColumns;
    }

    @SerializedName("NumberColumns")
    @JsonProperty("NumberColumns")
    private List<Integer> numberColumns;

    public AnalyzedTableDescription numberColumns(List<Integer> numberColumns) {
        this.numberColumns = numberColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getNumberColumns() {
        return numberColumns;
    }

    public void setNumberColumns(List<Integer> numberColumns) {
        this.numberColumns = numberColumns;
    }

    @SerializedName("TextColumns")
    @JsonProperty("TextColumns")
    private List<Integer> textColumns;

    public AnalyzedTableDescription textColumns(List<Integer> textColumns) {
        this.textColumns = textColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getTextColumns() {
        return textColumns;
    }

    public void setTextColumns(List<Integer> textColumns) {
        this.textColumns = textColumns;
    }

    @SerializedName("ExceptionColumns")
    @JsonProperty("ExceptionColumns")
    private List<Integer> exceptionColumns;

    public AnalyzedTableDescription exceptionColumns(List<Integer> exceptionColumns) {
        this.exceptionColumns = exceptionColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getExceptionColumns() {
        return exceptionColumns;
    }

    public void setExceptionColumns(List<Integer> exceptionColumns) {
        this.exceptionColumns = exceptionColumns;
    }

    @SerializedName("HasTableHeaderRow")
    @JsonProperty("HasTableHeaderRow")
    private Boolean hasTableHeaderRow;

    public AnalyzedTableDescription hasTableHeaderRow(Boolean hasTableHeaderRow) {
        this.hasTableHeaderRow = hasTableHeaderRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasTableHeaderRow() {
        return hasTableHeaderRow;
    }

    public void setHasTableHeaderRow(Boolean hasTableHeaderRow) {
        this.hasTableHeaderRow = hasTableHeaderRow;
    }

    @SerializedName("HasTableTotalRow")
    @JsonProperty("HasTableTotalRow")
    private Boolean hasTableTotalRow;

    public AnalyzedTableDescription hasTableTotalRow(Boolean hasTableTotalRow) {
        this.hasTableTotalRow = hasTableTotalRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasTableTotalRow() {
        return hasTableTotalRow;
    }

    public void setHasTableTotalRow(Boolean hasTableTotalRow) {
        this.hasTableTotalRow = hasTableTotalRow;
    }

    @SerializedName("StartDataColumnIndex")
    @JsonProperty("StartDataColumnIndex")
    private Integer startDataColumnIndex;

    public AnalyzedTableDescription startDataColumnIndex(Integer startDataColumnIndex) {
        this.startDataColumnIndex = startDataColumnIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStartDataColumnIndex() {
        return startDataColumnIndex;
    }

    public void setStartDataColumnIndex(Integer startDataColumnIndex) {
        this.startDataColumnIndex = startDataColumnIndex;
    }

    @SerializedName("EndDataColumnIndex")
    @JsonProperty("EndDataColumnIndex")
    private Integer endDataColumnIndex;

    public AnalyzedTableDescription endDataColumnIndex(Integer endDataColumnIndex) {
        this.endDataColumnIndex = endDataColumnIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getEndDataColumnIndex() {
        return endDataColumnIndex;
    }

    public void setEndDataColumnIndex(Integer endDataColumnIndex) {
        this.endDataColumnIndex = endDataColumnIndex;
    }

    @SerializedName("StartDataRowIndex")
    @JsonProperty("StartDataRowIndex")
    private Integer startDataRowIndex;

    public AnalyzedTableDescription startDataRowIndex(Integer startDataRowIndex) {
        this.startDataRowIndex = startDataRowIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStartDataRowIndex() {
        return startDataRowIndex;
    }

    public void setStartDataRowIndex(Integer startDataRowIndex) {
        this.startDataRowIndex = startDataRowIndex;
    }

    @SerializedName("EndDataRowIndex")
    @JsonProperty("EndDataRowIndex")
    private Integer endDataRowIndex;

    public AnalyzedTableDescription endDataRowIndex(Integer endDataRowIndex) {
        this.endDataRowIndex = endDataRowIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getEndDataRowIndex() {
        return endDataRowIndex;
    }

    public void setEndDataRowIndex(Integer endDataRowIndex) {
        this.endDataRowIndex = endDataRowIndex;
    }

    @SerializedName("Thumbnail")
    @JsonProperty("Thumbnail")
    private String thumbnail;

    public AnalyzedTableDescription thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @SerializedName("DiscoverCharts")
    @JsonProperty("DiscoverCharts")
    private List<DiscoverChart> discoverCharts;

    public AnalyzedTableDescription discoverCharts(List<DiscoverChart> discoverCharts) {
        this.discoverCharts = discoverCharts;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<DiscoverChart> getDiscoverCharts() {
        return discoverCharts;
    }

    public void setDiscoverCharts(List<DiscoverChart> discoverCharts) {
        this.discoverCharts = discoverCharts;
    }

    @SerializedName("DiscoverPivotTables")
    @JsonProperty("DiscoverPivotTables")
    private List<DiscoverPivotTable> discoverPivotTables;

    public AnalyzedTableDescription discoverPivotTables(List<DiscoverPivotTable> discoverPivotTables) {
        this.discoverPivotTables = discoverPivotTables;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<DiscoverPivotTable> getDiscoverPivotTables() {
        return discoverPivotTables;
    }

    public void setDiscoverPivotTables(List<DiscoverPivotTable> discoverPivotTables) {
        this.discoverPivotTables = discoverPivotTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyzedTableDescription other = (AnalyzedTableDescription) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.sheetName, other.sheetName)
            && Objects.equals(this.columns, other.columns)
            && Objects.equals(this.dateColumns, other.dateColumns)
            && Objects.equals(this.numberColumns, other.numberColumns)
            && Objects.equals(this.textColumns, other.textColumns)
            && Objects.equals(this.exceptionColumns, other.exceptionColumns)
            && Objects.equals(this.hasTableHeaderRow, other.hasTableHeaderRow)
            && Objects.equals(this.hasTableTotalRow, other.hasTableTotalRow)
            && Objects.equals(this.startDataColumnIndex, other.startDataColumnIndex)
            && Objects.equals(this.endDataColumnIndex, other.endDataColumnIndex)
            && Objects.equals(this.startDataRowIndex, other.startDataRowIndex)
            && Objects.equals(this.endDataRowIndex, other.endDataRowIndex)
            && Objects.equals(this.thumbnail, other.thumbnail)
            && Objects.equals(this.discoverCharts, other.discoverCharts)
            && Objects.equals(this.discoverPivotTables, other.discoverPivotTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sheetName, columns, dateColumns, numberColumns, textColumns, exceptionColumns, hasTableHeaderRow, hasTableTotalRow, startDataColumnIndex, endDataColumnIndex, startDataRowIndex, endDataRowIndex, thumbnail, discoverCharts, discoverPivotTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzedTableDescription {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    sheetName: ").append(sheetName).append("\n");
        sb.append("    columns: ").append(columns).append("\n");
        sb.append("    dateColumns: ").append(dateColumns).append("\n");
        sb.append("    numberColumns: ").append(numberColumns).append("\n");
        sb.append("    textColumns: ").append(textColumns).append("\n");
        sb.append("    exceptionColumns: ").append(exceptionColumns).append("\n");
        sb.append("    hasTableHeaderRow: ").append(hasTableHeaderRow).append("\n");
        sb.append("    hasTableTotalRow: ").append(hasTableTotalRow).append("\n");
        sb.append("    startDataColumnIndex: ").append(startDataColumnIndex).append("\n");
        sb.append("    endDataColumnIndex: ").append(endDataColumnIndex).append("\n");
        sb.append("    startDataRowIndex: ").append(startDataRowIndex).append("\n");
        sb.append("    endDataRowIndex: ").append(endDataRowIndex).append("\n");
        sb.append("    thumbnail: ").append(thumbnail).append("\n");
        sb.append("    discoverCharts: ").append(discoverCharts).append("\n");
        sb.append("    discoverPivotTables: ").append(discoverPivotTables).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

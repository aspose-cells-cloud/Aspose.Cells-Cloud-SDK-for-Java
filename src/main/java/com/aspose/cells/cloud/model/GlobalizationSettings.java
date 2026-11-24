/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GlobalizationSettings.java">
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

public class GlobalizationSettings {

    @SerializedName("ChartSettings")
    @JsonProperty("ChartSettings")
    private ChartGlobalizationSettings chartSettings;

    public GlobalizationSettings chartSettings(ChartGlobalizationSettings chartSettings) {
        this.chartSettings = chartSettings;
        return this;
    }

    @ApiModelProperty(value = "")
    public ChartGlobalizationSettings getChartSettings() {
        return chartSettings;
    }

    public void setChartSettings(ChartGlobalizationSettings chartSettings) {
        this.chartSettings = chartSettings;
    }

    @SerializedName("PivotSettings")
    @JsonProperty("PivotSettings")
    private PivotGlobalizationSettings pivotSettings;

    public GlobalizationSettings pivotSettings(PivotGlobalizationSettings pivotSettings) {
        this.pivotSettings = pivotSettings;
        return this;
    }

    @ApiModelProperty(value = "")
    public PivotGlobalizationSettings getPivotSettings() {
        return pivotSettings;
    }

    public void setPivotSettings(PivotGlobalizationSettings pivotSettings) {
        this.pivotSettings = pivotSettings;
    }

    @SerializedName("ListSeparator")
    @JsonProperty("ListSeparator")
    private String listSeparator;

    public GlobalizationSettings listSeparator(String listSeparator) {
        this.listSeparator = listSeparator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getListSeparator() {
        return listSeparator;
    }

    public void setListSeparator(String listSeparator) {
        this.listSeparator = listSeparator;
    }

    @SerializedName("RowSeparatorOfFormulaArray")
    @JsonProperty("RowSeparatorOfFormulaArray")
    private String rowSeparatorOfFormulaArray;

    public GlobalizationSettings rowSeparatorOfFormulaArray(String rowSeparatorOfFormulaArray) {
        this.rowSeparatorOfFormulaArray = rowSeparatorOfFormulaArray;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRowSeparatorOfFormulaArray() {
        return rowSeparatorOfFormulaArray;
    }

    public void setRowSeparatorOfFormulaArray(String rowSeparatorOfFormulaArray) {
        this.rowSeparatorOfFormulaArray = rowSeparatorOfFormulaArray;
    }

    @SerializedName("ColumnSeparatorOfFormulaArray")
    @JsonProperty("ColumnSeparatorOfFormulaArray")
    private String columnSeparatorOfFormulaArray;

    public GlobalizationSettings columnSeparatorOfFormulaArray(String columnSeparatorOfFormulaArray) {
        this.columnSeparatorOfFormulaArray = columnSeparatorOfFormulaArray;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getColumnSeparatorOfFormulaArray() {
        return columnSeparatorOfFormulaArray;
    }

    public void setColumnSeparatorOfFormulaArray(String columnSeparatorOfFormulaArray) {
        this.columnSeparatorOfFormulaArray = columnSeparatorOfFormulaArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalizationSettings other = (GlobalizationSettings) o;
        return Objects.equals(this.chartSettings, other.chartSettings)
            && Objects.equals(this.pivotSettings, other.pivotSettings)
            && Objects.equals(this.listSeparator, other.listSeparator)
            && Objects.equals(this.rowSeparatorOfFormulaArray, other.rowSeparatorOfFormulaArray)
            && Objects.equals(this.columnSeparatorOfFormulaArray, other.columnSeparatorOfFormulaArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartSettings, pivotSettings, listSeparator, rowSeparatorOfFormulaArray, columnSeparatorOfFormulaArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalizationSettings {\n");
        sb.append("    chartSettings: ").append(chartSettings).append("\n");
        sb.append("    pivotSettings: ").append(pivotSettings).append("\n");
        sb.append("    listSeparator: ").append(listSeparator).append("\n");
        sb.append("    rowSeparatorOfFormulaArray: ").append(rowSeparatorOfFormulaArray).append("\n");
        sb.append("    columnSeparatorOfFormulaArray: ").append(columnSeparatorOfFormulaArray).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

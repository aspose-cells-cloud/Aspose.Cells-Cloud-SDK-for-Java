package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** GlobalizationSettings — Represents the globalization settings. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GlobalizationSettings {
    /** Gets or sets the globalization settings for Chart. */
    @JsonProperty("ChartSettings")
    private ChartGlobalizationSettings chartSettings;

    /** Gets or sets the globalization settings for pivot table. */
    @JsonProperty("PivotSettings")
    private PivotGlobalizationSettings pivotSettings;

    /** Gets the separator for list, parameters of function, ...etc. */
    @JsonProperty("ListSeparator")
    private String listSeparator;

    /** Gets the separator for rows in array data in formula. */
    @JsonProperty("RowSeparatorOfFormulaArray")
    private String rowSeparatorOfFormulaArray;

    /** Gets the separator for the items in array's row data in formula. */
    @JsonProperty("ColumnSeparatorOfFormulaArray")
    private String columnSeparatorOfFormulaArray;

    public ChartGlobalizationSettings getChartSettings() { return chartSettings; }
    public GlobalizationSettings setChartSettings(ChartGlobalizationSettings chartSettings) { this.chartSettings = chartSettings; return this; }

    public PivotGlobalizationSettings getPivotSettings() { return pivotSettings; }
    public GlobalizationSettings setPivotSettings(PivotGlobalizationSettings pivotSettings) { this.pivotSettings = pivotSettings; return this; }

    public String getListSeparator() { return listSeparator; }
    public GlobalizationSettings setListSeparator(String listSeparator) { this.listSeparator = listSeparator; return this; }

    public String getRowSeparatorOfFormulaArray() { return rowSeparatorOfFormulaArray; }
    public GlobalizationSettings setRowSeparatorOfFormulaArray(String rowSeparatorOfFormulaArray) { this.rowSeparatorOfFormulaArray = rowSeparatorOfFormulaArray; return this; }

    public String getColumnSeparatorOfFormulaArray() { return columnSeparatorOfFormulaArray; }
    public GlobalizationSettings setColumnSeparatorOfFormulaArray(String columnSeparatorOfFormulaArray) { this.columnSeparatorOfFormulaArray = columnSeparatorOfFormulaArray; return this; }

}

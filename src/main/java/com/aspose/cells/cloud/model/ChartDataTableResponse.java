package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartDataTableResponse — Represents the ChartDataTable Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartDataTableResponse extends CellsCloudResponse {
    /** This property allows access to a ChartDataTable object for storing and manipulating data related to a chart. */
    @JsonProperty("ChartDataTable")
    private ChartDataTable chartDataTable;

    public ChartDataTable getChartDataTable() { return chartDataTable; }
    public ChartDataTableResponse setChartDataTable(ChartDataTable chartDataTable) { this.chartDataTable = chartDataTable; return this; }


    /** Covariant override: keeps fluent chains returning ChartDataTableResponse. */
    @Override public ChartDataTableResponse setCode(Integer code) { return (ChartDataTableResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ChartDataTableResponse. */
    @Override public ChartDataTableResponse setStatus(String status) { return (ChartDataTableResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartDataTableResponse — Represents the ChartDataTable Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartDataTableResponse extends CellsCloudResponse {
    /** This property allows access to a ChartDataTable object for storing and manipulating data related to a chart. */
    @JsonProperty("ChartDataTable")
    private ChartDataTable chartDataTable;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ChartDataTable getChartDataTable() { return chartDataTable; }
    public ChartDataTableResponse setChartDataTable(ChartDataTable chartDataTable) { this.chartDataTable = chartDataTable; return this; }

    public Integer getCode() { return code; }
    public ChartDataTableResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ChartDataTableResponse setStatus(String status) { this.status = status; return this; }

}

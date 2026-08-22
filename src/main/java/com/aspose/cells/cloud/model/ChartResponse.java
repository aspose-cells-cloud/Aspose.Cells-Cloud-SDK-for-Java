package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartResponse — Represents the Chart Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartResponse extends CellsCloudResponse {
    /** A property named "Chart" of type Chart is defined with a getter and setter in the class. */
    @JsonProperty("Chart")
    private Chart chart;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Chart getChart() { return chart; }
    public ChartResponse setChart(Chart chart) { this.chart = chart; return this; }

    public Integer getCode() { return code; }
    public ChartResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ChartResponse setStatus(String status) { this.status = status; return this; }

}

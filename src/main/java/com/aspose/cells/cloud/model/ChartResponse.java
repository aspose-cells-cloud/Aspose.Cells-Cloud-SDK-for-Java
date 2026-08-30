package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartResponse — Represents the Chart Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartResponse extends CellsCloudResponse {
    /** A property named "Chart" of type Chart is defined with a getter and setter in the class. */
    @JsonProperty("Chart")
    private Chart chart;

    public Chart getChart() { return chart; }
    public ChartResponse setChart(Chart chart) { this.chart = chart; return this; }


    /** Covariant override: keeps fluent chains returning ChartResponse. */
    @Override public ChartResponse setCode(Integer code) { return (ChartResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ChartResponse. */
    @Override public ChartResponse setStatus(String status) { return (ChartResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartPointResponse — Represents the ChartPoint Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartPointResponse extends CellsCloudResponse {
    /** A public property "ChartPoint" that can store and retrieve instances of the "ChartPoint" data type. */
    @JsonProperty("ChartPoint")
    private ChartPoint chartPoint;

    public ChartPoint getChartPoint() { return chartPoint; }
    public ChartPointResponse setChartPoint(ChartPoint chartPoint) { this.chartPoint = chartPoint; return this; }


    /** Covariant override: keeps fluent chains returning ChartPointResponse. */
    @Override public ChartPointResponse setCode(Integer code) { return (ChartPointResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ChartPointResponse. */
    @Override public ChartPointResponse setStatus(String status) { return (ChartPointResponse) super.setStatus(status); }

}

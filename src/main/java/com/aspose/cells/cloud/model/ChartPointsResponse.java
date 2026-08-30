package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartPointsResponse — Represents the ChartPoints Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartPointsResponse extends CellsCloudResponse {
    /** This class has a property named `ChartPoints` of type `ChartPoints` that can be accessed and modified. */
    @JsonProperty("ChartPoints")
    private ChartPoints chartPoints;

    public ChartPoints getChartPoints() { return chartPoints; }
    public ChartPointsResponse setChartPoints(ChartPoints chartPoints) { this.chartPoints = chartPoints; return this; }


    /** Covariant override: keeps fluent chains returning ChartPointsResponse. */
    @Override public ChartPointsResponse setCode(Integer code) { return (ChartPointsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ChartPointsResponse. */
    @Override public ChartPointsResponse setStatus(String status) { return (ChartPointsResponse) super.setStatus(status); }

}

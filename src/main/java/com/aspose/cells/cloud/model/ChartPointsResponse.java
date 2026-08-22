package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartPointsResponse — Represents the ChartPoints Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartPointsResponse extends CellsCloudResponse {
    /** This class has a property named `ChartPoints` of type `ChartPoints` that can be accessed and modified. */
    @JsonProperty("ChartPoints")
    private ChartPoints chartPoints;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ChartPoints getChartPoints() { return chartPoints; }
    public ChartPointsResponse setChartPoints(ChartPoints chartPoints) { this.chartPoints = chartPoints; return this; }

    public Integer getCode() { return code; }
    public ChartPointsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ChartPointsResponse setStatus(String status) { this.status = status; return this; }

}

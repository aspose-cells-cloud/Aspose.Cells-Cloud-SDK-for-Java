package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartPointResponse — Represents the ChartPoint Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartPointResponse extends CellsCloudResponse {
    /** A public property "ChartPoint" that can store and retrieve instances of the "ChartPoint" data type. */
    @JsonProperty("ChartPoint")
    private ChartPoint chartPoint;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ChartPoint getChartPoint() { return chartPoint; }
    public ChartPointResponse setChartPoint(ChartPoint chartPoint) { this.chartPoint = chartPoint; return this; }

    public Integer getCode() { return code; }
    public ChartPointResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ChartPointResponse setStatus(String status) { this.status = status; return this; }

}

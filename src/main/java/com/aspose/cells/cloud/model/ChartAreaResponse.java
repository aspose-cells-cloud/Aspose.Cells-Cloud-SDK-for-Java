package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartAreaResponse — Represents the ChartArea Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartAreaResponse extends CellsCloudResponse {
    /** This class has a property named "ChartArea" of type ChartArea with a getter and setter. */
    @JsonProperty("ChartArea")
    private ChartArea chartArea;

    public ChartArea getChartArea() { return chartArea; }
    public ChartAreaResponse setChartArea(ChartArea chartArea) { this.chartArea = chartArea; return this; }


    /** Covariant override: keeps fluent chains returning ChartAreaResponse. */
    @Override public ChartAreaResponse setCode(Integer code) { return (ChartAreaResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ChartAreaResponse. */
    @Override public ChartAreaResponse setStatus(String status) { return (ChartAreaResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PlotAreaResponse — Represents the PlotArea Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlotAreaResponse extends CellsCloudResponse {
    /** A property that allows getting and setting the PlotArea for the class. */
    @JsonProperty("PlotArea")
    private PlotArea plotArea;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public PlotArea getPlotArea() { return plotArea; }
    public PlotAreaResponse setPlotArea(PlotArea plotArea) { this.plotArea = plotArea; return this; }

    public Integer getCode() { return code; }
    public PlotAreaResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PlotAreaResponse setStatus(String status) { this.status = status; return this; }

}

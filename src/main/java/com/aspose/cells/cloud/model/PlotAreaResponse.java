package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PlotAreaResponse — Represents the PlotArea Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlotAreaResponse extends CellsCloudResponse {
    /** A property that allows getting and setting the PlotArea for the class. */
    @JsonProperty("PlotArea")
    private PlotArea plotArea;

    public PlotArea getPlotArea() { return plotArea; }
    public PlotAreaResponse setPlotArea(PlotArea plotArea) { this.plotArea = plotArea; return this; }


    /** Covariant override: keeps fluent chains returning PlotAreaResponse. */
    @Override public PlotAreaResponse setCode(Integer code) { return (PlotAreaResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PlotAreaResponse. */
    @Override public PlotAreaResponse setStatus(String status) { return (PlotAreaResponse) super.setStatus(status); }

}

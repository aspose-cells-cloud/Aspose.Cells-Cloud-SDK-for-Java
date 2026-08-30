package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartsResponse — Represents the Charts Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartsResponse extends CellsCloudResponse {
    /** Property Summary: Includes an XML element named "charts" that contains a property of type Charts.Charts. */
    @JsonProperty("Charts")
    private Charts charts;

    public Charts getCharts() { return charts; }
    public ChartsResponse setCharts(Charts charts) { this.charts = charts; return this; }


    /** Covariant override: keeps fluent chains returning ChartsResponse. */
    @Override public ChartsResponse setCode(Integer code) { return (ChartsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ChartsResponse. */
    @Override public ChartsResponse setStatus(String status) { return (ChartsResponse) super.setStatus(status); }

}

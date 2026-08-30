package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LegendResponse — Represents the Legend Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendResponse extends CellsCloudResponse {
    /** This class has a public property called "Legend" of type "Legend" which has both a getter and a setter. */
    @JsonProperty("Legend")
    private Legend legend;

    public Legend getLegend() { return legend; }
    public LegendResponse setLegend(Legend legend) { this.legend = legend; return this; }


    /** Covariant override: keeps fluent chains returning LegendResponse. */
    @Override public LegendResponse setCode(Integer code) { return (LegendResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning LegendResponse. */
    @Override public LegendResponse setStatus(String status) { return (LegendResponse) super.setStatus(status); }

}

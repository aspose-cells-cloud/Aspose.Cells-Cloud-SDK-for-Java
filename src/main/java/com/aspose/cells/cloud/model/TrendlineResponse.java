package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TrendlineResponse — Represents the Trendline Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendlineResponse extends CellsCloudResponse {
    /** The class has a public property called "Trendline" of type "Trendline" that can be accessed and modified. */
    @JsonProperty("Trendline")
    private Trendline trendline;

    public Trendline getTrendline() { return trendline; }
    public TrendlineResponse setTrendline(Trendline trendline) { this.trendline = trendline; return this; }


    /** Covariant override: keeps fluent chains returning TrendlineResponse. */
    @Override public TrendlineResponse setCode(Integer code) { return (TrendlineResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TrendlineResponse. */
    @Override public TrendlineResponse setStatus(String status) { return (TrendlineResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TrendlinesResponse — Represents the Trendlines Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendlinesResponse extends CellsCloudResponse {
    /** This property allows access to the Trendlines feature and set new values for it. */
    @JsonProperty("Trendlines")
    private Trendlines trendlines;

    public Trendlines getTrendlines() { return trendlines; }
    public TrendlinesResponse setTrendlines(Trendlines trendlines) { this.trendlines = trendlines; return this; }


    /** Covariant override: keeps fluent chains returning TrendlinesResponse. */
    @Override public TrendlinesResponse setCode(Integer code) { return (TrendlinesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TrendlinesResponse. */
    @Override public TrendlinesResponse setStatus(String status) { return (TrendlinesResponse) super.setStatus(status); }

}

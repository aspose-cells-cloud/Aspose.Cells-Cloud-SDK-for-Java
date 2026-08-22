package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TrendlinesResponse — Represents the Trendlines Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendlinesResponse extends CellsCloudResponse {
    /** This property allows access to the Trendlines feature and set new values for it. */
    @JsonProperty("Trendlines")
    private Trendlines trendlines;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Trendlines getTrendlines() { return trendlines; }
    public TrendlinesResponse setTrendlines(Trendlines trendlines) { this.trendlines = trendlines; return this; }

    public Integer getCode() { return code; }
    public TrendlinesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TrendlinesResponse setStatus(String status) { this.status = status; return this; }

}

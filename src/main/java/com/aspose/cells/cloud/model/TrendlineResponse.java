package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TrendlineResponse — Represents the Trendline Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendlineResponse extends CellsCloudResponse {
    /** The class has a public property called "Trendline" of type "Trendline" that can be accessed and modified. */
    @JsonProperty("Trendline")
    private Trendline trendline;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Trendline getTrendline() { return trendline; }
    public TrendlineResponse setTrendline(Trendline trendline) { this.trendline = trendline; return this; }

    public Integer getCode() { return code; }
    public TrendlineResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TrendlineResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LegendResponse — Represents the Legend Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendResponse extends CellsCloudResponse {
    /** This class has a public property called "Legend" of type "Legend" which has both a getter and a setter. */
    @JsonProperty("Legend")
    private Legend legend;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Legend getLegend() { return legend; }
    public LegendResponse setLegend(Legend legend) { this.legend = legend; return this; }

    public Integer getCode() { return code; }
    public LegendResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public LegendResponse setStatus(String status) { this.status = status; return this; }

}

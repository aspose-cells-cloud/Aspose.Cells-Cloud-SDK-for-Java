package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartsResponse — Represents the Charts Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartsResponse extends CellsCloudResponse {
    /** Property Summary: Includes an XML element named "charts" that contains a property of type Charts.Charts. */
    @JsonProperty("Charts")
    private Charts charts;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Charts getCharts() { return charts; }
    public ChartsResponse setCharts(Charts charts) { this.charts = charts; return this; }

    public Integer getCode() { return code; }
    public ChartsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ChartsResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LegendEntriesResponse — Represents the LegendEntries Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendEntriesResponse extends CellsCloudResponse {
    /** Property Summary: The class includes a property for managing legend entries. */
    @JsonProperty("LegendEntries")
    private LegendEntries legendEntries;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public LegendEntries getLegendEntries() { return legendEntries; }
    public LegendEntriesResponse setLegendEntries(LegendEntries legendEntries) { this.legendEntries = legendEntries; return this; }

    public Integer getCode() { return code; }
    public LegendEntriesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public LegendEntriesResponse setStatus(String status) { this.status = status; return this; }

}

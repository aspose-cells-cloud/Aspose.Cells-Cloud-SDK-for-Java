package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LegendEntriesResponse — Represents the LegendEntries Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendEntriesResponse extends CellsCloudResponse {
    /** Property Summary: The class includes a property for managing legend entries. */
    @JsonProperty("LegendEntries")
    private LegendEntries legendEntries;

    public LegendEntries getLegendEntries() { return legendEntries; }
    public LegendEntriesResponse setLegendEntries(LegendEntries legendEntries) { this.legendEntries = legendEntries; return this; }


    /** Covariant override: keeps fluent chains returning LegendEntriesResponse. */
    @Override public LegendEntriesResponse setCode(Integer code) { return (LegendEntriesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning LegendEntriesResponse. */
    @Override public LegendEntriesResponse setStatus(String status) { return (LegendEntriesResponse) super.setStatus(status); }

}

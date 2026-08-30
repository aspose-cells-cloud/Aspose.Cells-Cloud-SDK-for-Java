package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LegendEntryResponse — Represents the LegendEntry Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendEntryResponse extends CellsCloudResponse {
    /** A public property called LegendEntry of type LegendEntry with both getter and setter methods. */
    @JsonProperty("LegendEntry")
    private LegendEntry legendEntry;

    public LegendEntry getLegendEntry() { return legendEntry; }
    public LegendEntryResponse setLegendEntry(LegendEntry legendEntry) { this.legendEntry = legendEntry; return this; }


    /** Covariant override: keeps fluent chains returning LegendEntryResponse. */
    @Override public LegendEntryResponse setCode(Integer code) { return (LegendEntryResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning LegendEntryResponse. */
    @Override public LegendEntryResponse setStatus(String status) { return (LegendEntryResponse) super.setStatus(status); }

}

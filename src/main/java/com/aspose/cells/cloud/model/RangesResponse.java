package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangesResponse — Represents the Ranges Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangesResponse extends CellsCloudResponse {
    /** This class has a property named "Ranges" of type "Ranges" that can be accessed and modified. */
    @JsonProperty("Ranges")
    private Ranges ranges;

    public Ranges getRanges() { return ranges; }
    public RangesResponse setRanges(Ranges ranges) { this.ranges = ranges; return this; }


    /** Covariant override: keeps fluent chains returning RangesResponse. */
    @Override public RangesResponse setCode(Integer code) { return (RangesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RangesResponse. */
    @Override public RangesResponse setStatus(String status) { return (RangesResponse) super.setStatus(status); }

}

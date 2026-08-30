package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeResponse — Represents the Range Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeResponse extends CellsCloudResponse {
    /** This class has a property named "Range" of type Range with both getter and setter methods. */
    @JsonProperty("Range")
    private Range range;

    public Range getRange() { return range; }
    public RangeResponse setRange(Range range) { this.range = range; return this; }


    /** Covariant override: keeps fluent chains returning RangeResponse. */
    @Override public RangeResponse setCode(Integer code) { return (RangeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RangeResponse. */
    @Override public RangeResponse setStatus(String status) { return (RangeResponse) super.setStatus(status); }

}

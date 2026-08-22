package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeResponse — Represents the Range Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeResponse extends CellsCloudResponse {
    /** This class has a property named "Range" of type Range with both getter and setter methods. */
    @JsonProperty("Range")
    private Range range;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Range getRange() { return range; }
    public RangeResponse setRange(Range range) { this.range = range; return this; }

    public Integer getCode() { return code; }
    public RangeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public RangeResponse setStatus(String status) { this.status = status; return this; }

}

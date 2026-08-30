package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AxisResponse — Represents the Axis Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxisResponse extends CellsCloudResponse {
    /** A property named "Axis" of type "Axis" with both getter and setter methods is present in the class. */
    @JsonProperty("Axis")
    private Axis axis;

    public Axis getAxis() { return axis; }
    public AxisResponse setAxis(Axis axis) { this.axis = axis; return this; }


    /** Covariant override: keeps fluent chains returning AxisResponse. */
    @Override public AxisResponse setCode(Integer code) { return (AxisResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning AxisResponse. */
    @Override public AxisResponse setStatus(String status) { return (AxisResponse) super.setStatus(status); }

}

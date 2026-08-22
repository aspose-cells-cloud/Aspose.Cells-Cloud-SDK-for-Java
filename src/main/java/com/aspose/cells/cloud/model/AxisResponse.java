package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AxisResponse — Represents the Axis Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxisResponse extends CellsCloudResponse {
    /** A property named "Axis" of type "Axis" with both getter and setter methods is present in the class. */
    @JsonProperty("Axis")
    private Axis axis;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Axis getAxis() { return axis; }
    public AxisResponse setAxis(Axis axis) { this.axis = axis; return this; }

    public Integer getCode() { return code; }
    public AxisResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public AxisResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SpinnerResponse — Represents the Spinner Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpinnerResponse extends CellsCloudResponse {
    /** A property named Shape of type Spinner, with both get and set accessors. */
    @JsonProperty("Shape")
    private Spinner shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Spinner getShape() { return shape; }
    public SpinnerResponse setShape(Spinner shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public SpinnerResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SpinnerResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SpinnerResponse — Represents the Spinner Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpinnerResponse extends CellsCloudResponse {
    /** A property named Shape of type Spinner, with both get and set accessors. */
    @JsonProperty("Shape")
    private Spinner shape;

    public Spinner getShape() { return shape; }
    public SpinnerResponse setShape(Spinner shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning SpinnerResponse. */
    @Override public SpinnerResponse setCode(Integer code) { return (SpinnerResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SpinnerResponse. */
    @Override public SpinnerResponse setStatus(String status) { return (SpinnerResponse) super.setStatus(status); }

}

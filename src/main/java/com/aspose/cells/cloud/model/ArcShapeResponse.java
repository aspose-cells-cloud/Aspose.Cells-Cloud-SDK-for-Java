package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ArcShapeResponse — Represents the ArcShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArcShapeResponse extends CellsCloudResponse {
    /** A public property Shape of type ArcShape that can be accessed and modified. */
    @JsonProperty("Shape")
    private ArcShape shape;

    public ArcShape getShape() { return shape; }
    public ArcShapeResponse setShape(ArcShape shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ArcShapeResponse. */
    @Override public ArcShapeResponse setCode(Integer code) { return (ArcShapeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ArcShapeResponse. */
    @Override public ArcShapeResponse setStatus(String status) { return (ArcShapeResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShapeResponse — Represents the Shape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapeResponse extends CellsCloudResponse {
    /** A public property Shape of type ArcShape that can be accessed and modified. */
    @JsonProperty("Shape")
    private Shape shape;

    public Shape getShape() { return shape; }
    public ShapeResponse setShape(Shape shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ShapeResponse. */
    @Override public ShapeResponse setCode(Integer code) { return (ShapeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ShapeResponse. */
    @Override public ShapeResponse setStatus(String status) { return (ShapeResponse) super.setStatus(status); }

}

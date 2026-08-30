package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RectangleShapeResponse — Represents the RectangleShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RectangleShapeResponse extends CellsCloudResponse {
    /** A public property named "Shape" that is of type RectangleShape and can be both accessed and modified. */
    @JsonProperty("Shape")
    private RectangleShape shape;

    public RectangleShape getShape() { return shape; }
    public RectangleShapeResponse setShape(RectangleShape shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning RectangleShapeResponse. */
    @Override public RectangleShapeResponse setCode(Integer code) { return (RectangleShapeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RectangleShapeResponse. */
    @Override public RectangleShapeResponse setStatus(String status) { return (RectangleShapeResponse) super.setStatus(status); }

}

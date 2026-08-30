package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineShapeResponse — Represents the LineShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineShapeResponse extends CellsCloudResponse {
    /** The class has a public property called Shape of type LineShape that can be both accessed and modified. */
    @JsonProperty("Shape")
    private LineShape shape;

    public LineShape getShape() { return shape; }
    public LineShapeResponse setShape(LineShape shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning LineShapeResponse. */
    @Override public LineShapeResponse setCode(Integer code) { return (LineShapeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning LineShapeResponse. */
    @Override public LineShapeResponse setStatus(String status) { return (LineShapeResponse) super.setStatus(status); }

}

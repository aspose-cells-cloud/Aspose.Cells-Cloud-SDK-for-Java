package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ScrollBarResponse — Represents the ScrollBar Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollBarResponse extends CellsCloudResponse {
    /** The class has a public property named `Shape` of type `ScrollBar` that can be both read and written. */
    @JsonProperty("Shape")
    private ScrollBar shape;

    public ScrollBar getShape() { return shape; }
    public ScrollBarResponse setShape(ScrollBar shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ScrollBarResponse. */
    @Override public ScrollBarResponse setCode(Integer code) { return (ScrollBarResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ScrollBarResponse. */
    @Override public ScrollBarResponse setStatus(String status) { return (ScrollBarResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CheckBoxResponse — Represents the CheckBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckBoxResponse extends CellsCloudResponse {
    /** A public property named Shape of type CheckBox is defined with both get and set accessors. */
    @JsonProperty("Shape")
    private CheckBox shape;

    public CheckBox getShape() { return shape; }
    public CheckBoxResponse setShape(CheckBox shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning CheckBoxResponse. */
    @Override public CheckBoxResponse setCode(Integer code) { return (CheckBoxResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CheckBoxResponse. */
    @Override public CheckBoxResponse setStatus(String status) { return (CheckBoxResponse) super.setStatus(status); }

}

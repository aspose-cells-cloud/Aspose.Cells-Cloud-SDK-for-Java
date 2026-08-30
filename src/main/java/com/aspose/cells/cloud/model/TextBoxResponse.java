package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextBoxResponse — Represents the TextBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextBoxResponse extends CellsCloudResponse {
    /** A public property named "Shape" of type TextBox is defined with both get and set accessors. */
    @JsonProperty("Shape")
    private TextBox shape;

    public TextBox getShape() { return shape; }
    public TextBoxResponse setShape(TextBox shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning TextBoxResponse. */
    @Override public TextBoxResponse setCode(Integer code) { return (TextBoxResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TextBoxResponse. */
    @Override public TextBoxResponse setStatus(String status) { return (TextBoxResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ComboBoxResponse — Represents the ComboBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComboBoxResponse extends CellsCloudResponse {
    /** A public property of type ComboBox named Shape with get and set accessors. */
    @JsonProperty("Shape")
    private ComboBox shape;

    public ComboBox getShape() { return shape; }
    public ComboBoxResponse setShape(ComboBox shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ComboBoxResponse. */
    @Override public ComboBoxResponse setCode(Integer code) { return (ComboBoxResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ComboBoxResponse. */
    @Override public ComboBoxResponse setStatus(String status) { return (ComboBoxResponse) super.setStatus(status); }

}

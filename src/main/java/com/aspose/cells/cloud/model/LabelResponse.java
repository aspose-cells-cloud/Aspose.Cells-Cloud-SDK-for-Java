package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LabelResponse — Represents the Label Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelResponse extends CellsCloudResponse {
    /** The property "Shape" is of type Label and has both a getter and a setter. */
    @JsonProperty("Shape")
    private Label shape;

    public Label getShape() { return shape; }
    public LabelResponse setShape(Label shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning LabelResponse. */
    @Override public LabelResponse setCode(Integer code) { return (LabelResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning LabelResponse. */
    @Override public LabelResponse setStatus(String status) { return (LabelResponse) super.setStatus(status); }

}

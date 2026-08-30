package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ButtonResponse — Represents the Button Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ButtonResponse extends CellsCloudResponse {
    /** The class has a property named "Shape" of type Button that can be both read and written. */
    @JsonProperty("Shape")
    private Button shape;

    public Button getShape() { return shape; }
    public ButtonResponse setShape(Button shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ButtonResponse. */
    @Override public ButtonResponse setCode(Integer code) { return (ButtonResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ButtonResponse. */
    @Override public ButtonResponse setStatus(String status) { return (ButtonResponse) super.setStatus(status); }

}

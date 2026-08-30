package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RadioButtonResponse — Represents the RadioButton Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RadioButtonResponse extends CellsCloudResponse {
    /** This class has a public property named "Shape" of type RadioButton with both getter and setter. */
    @JsonProperty("Shape")
    private RadioButton shape;

    public RadioButton getShape() { return shape; }
    public RadioButtonResponse setShape(RadioButton shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning RadioButtonResponse. */
    @Override public RadioButtonResponse setCode(Integer code) { return (RadioButtonResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RadioButtonResponse. */
    @Override public RadioButtonResponse setStatus(String status) { return (RadioButtonResponse) super.setStatus(status); }

}

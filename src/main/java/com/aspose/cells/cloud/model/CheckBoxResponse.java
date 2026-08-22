package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CheckBoxResponse — Represents the CheckBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckBoxResponse extends CellsCloudResponse {
    /** A public property named Shape of type CheckBox is defined with both get and set accessors. */
    @JsonProperty("Shape")
    private CheckBox shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public CheckBox getShape() { return shape; }
    public CheckBoxResponse setShape(CheckBox shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public CheckBoxResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CheckBoxResponse setStatus(String status) { this.status = status; return this; }

}

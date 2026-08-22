package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextBoxResponse — Represents the TextBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextBoxResponse extends CellsCloudResponse {
    /** A public property named "Shape" of type TextBox is defined with both get and set accessors. */
    @JsonProperty("Shape")
    private TextBox shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public TextBox getShape() { return shape; }
    public TextBoxResponse setShape(TextBox shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public TextBoxResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TextBoxResponse setStatus(String status) { this.status = status; return this; }

}

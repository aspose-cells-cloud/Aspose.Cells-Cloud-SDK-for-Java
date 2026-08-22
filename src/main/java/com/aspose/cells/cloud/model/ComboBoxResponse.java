package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ComboBoxResponse — Represents the ComboBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComboBoxResponse extends CellsCloudResponse {
    /** A public property of type ComboBox named Shape with get and set accessors. */
    @JsonProperty("Shape")
    private ComboBox shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ComboBox getShape() { return shape; }
    public ComboBoxResponse setShape(ComboBox shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public ComboBoxResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ComboBoxResponse setStatus(String status) { this.status = status; return this; }

}

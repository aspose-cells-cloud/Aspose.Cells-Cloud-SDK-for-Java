package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RadioButtonResponse — Represents the RadioButton Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RadioButtonResponse extends CellsCloudResponse {
    /** This class has a public property named "Shape" of type RadioButton with both getter and setter. */
    @JsonProperty("Shape")
    private RadioButton shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public RadioButton getShape() { return shape; }
    public RadioButtonResponse setShape(RadioButton shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public RadioButtonResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public RadioButtonResponse setStatus(String status) { this.status = status; return this; }

}

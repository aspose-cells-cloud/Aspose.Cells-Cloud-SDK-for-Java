package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ButtonResponse — Represents the Button Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ButtonResponse extends CellsCloudResponse {
    /** The class has a property named "Shape" of type Button that can be both read and written. */
    @JsonProperty("Shape")
    private Button shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Button getShape() { return shape; }
    public ButtonResponse setShape(Button shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public ButtonResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ButtonResponse setStatus(String status) { this.status = status; return this; }

}

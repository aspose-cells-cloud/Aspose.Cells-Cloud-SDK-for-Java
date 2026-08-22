package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LabelResponse — Represents the Label Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelResponse extends CellsCloudResponse {
    /** The property "Shape" is of type Label and has both a getter and a setter. */
    @JsonProperty("Shape")
    private Label shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Label getShape() { return shape; }
    public LabelResponse setShape(Label shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public LabelResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public LabelResponse setStatus(String status) { this.status = status; return this; }

}

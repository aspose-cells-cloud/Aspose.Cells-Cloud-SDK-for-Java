package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RectangleShapeResponse — Represents the RectangleShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RectangleShapeResponse extends CellsCloudResponse {
    /** A public property named "Shape" that is of type RectangleShape and can be both accessed and modified. */
    @JsonProperty("Shape")
    private RectangleShape shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public RectangleShape getShape() { return shape; }
    public RectangleShapeResponse setShape(RectangleShape shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public RectangleShapeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public RectangleShapeResponse setStatus(String status) { this.status = status; return this; }

}

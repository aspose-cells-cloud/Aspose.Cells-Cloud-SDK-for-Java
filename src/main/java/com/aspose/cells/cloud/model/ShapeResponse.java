package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShapeResponse — Represents the Shape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapeResponse extends CellsCloudResponse {
    /** A public property Shape of type ArcShape that can be accessed and modified. */
    @JsonProperty("Shape")
    private Shape shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Shape getShape() { return shape; }
    public ShapeResponse setShape(Shape shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public ShapeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ShapeResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ArcShapeResponse — Represents the ArcShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArcShapeResponse extends CellsCloudResponse {
    /** A public property Shape of type ArcShape that can be accessed and modified. */
    @JsonProperty("Shape")
    private ArcShape shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ArcShape getShape() { return shape; }
    public ArcShapeResponse setShape(ArcShape shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public ArcShapeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ArcShapeResponse setStatus(String status) { this.status = status; return this; }

}

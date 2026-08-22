package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineShapeResponse — Represents the LineShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineShapeResponse extends CellsCloudResponse {
    /** The class has a public property called Shape of type LineShape that can be both accessed and modified. */
    @JsonProperty("Shape")
    private LineShape shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public LineShape getShape() { return shape; }
    public LineShapeResponse setShape(LineShape shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public LineShapeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public LineShapeResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDrawingResponse — Represents the CellsDrawing Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDrawingResponse extends CellsCloudResponse {
    /** This class has a public property named Shape of type CellsDrawing. */
    @JsonProperty("Shape")
    private CellsDrawing shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public CellsDrawing getShape() { return shape; }
    public CellsDrawingResponse setShape(CellsDrawing shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public CellsDrawingResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellsDrawingResponse setStatus(String status) { this.status = status; return this; }

}

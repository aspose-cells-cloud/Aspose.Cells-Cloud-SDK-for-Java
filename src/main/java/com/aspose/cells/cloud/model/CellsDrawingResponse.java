package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDrawingResponse — Represents the CellsDrawing Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDrawingResponse extends CellsCloudResponse {
    /** This class has a public property named Shape of type CellsDrawing. */
    @JsonProperty("Shape")
    private CellsDrawing shape;

    public CellsDrawing getShape() { return shape; }
    public CellsDrawingResponse setShape(CellsDrawing shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning CellsDrawingResponse. */
    @Override public CellsDrawingResponse setCode(Integer code) { return (CellsDrawingResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellsDrawingResponse. */
    @Override public CellsDrawingResponse setStatus(String status) { return (CellsDrawingResponse) super.setStatus(status); }

}

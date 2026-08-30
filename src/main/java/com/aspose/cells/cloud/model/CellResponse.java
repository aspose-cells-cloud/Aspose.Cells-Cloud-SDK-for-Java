package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellResponse — Represents the Cell Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellResponse extends CellsCloudResponse {
    /** A property named "Cell" of type "Cell" that has both a getter and a setter. */
    @JsonProperty("Cell")
    private Cell cell;

    public Cell getCell() { return cell; }
    public CellResponse setCell(Cell cell) { this.cell = cell; return this; }


    /** Covariant override: keeps fluent chains returning CellResponse. */
    @Override public CellResponse setCode(Integer code) { return (CellResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellResponse. */
    @Override public CellResponse setStatus(String status) { return (CellResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellResponse — Represents the Cell Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellResponse extends CellsCloudResponse {
    /** A property named "Cell" of type "Cell" that has both a getter and a setter. */
    @JsonProperty("Cell")
    private Cell cell;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Cell getCell() { return cell; }
    public CellResponse setCell(Cell cell) { this.cell = cell; return this; }

    public Integer getCode() { return code; }
    public CellResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellResponse setStatus(String status) { this.status = status; return this; }

}

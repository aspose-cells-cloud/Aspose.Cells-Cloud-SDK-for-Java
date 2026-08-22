package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergedCellsResponse — Represents the MergedCells Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergedCellsResponse extends CellsCloudResponse {
    /** Property Summary: Contains information about merged cells within a spreadsheet. */
    @JsonProperty("MergedCells")
    private MergedCells mergedCells;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public MergedCells getMergedCells() { return mergedCells; }
    public MergedCellsResponse setMergedCells(MergedCells mergedCells) { this.mergedCells = mergedCells; return this; }

    public Integer getCode() { return code; }
    public MergedCellsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public MergedCellsResponse setStatus(String status) { this.status = status; return this; }

}

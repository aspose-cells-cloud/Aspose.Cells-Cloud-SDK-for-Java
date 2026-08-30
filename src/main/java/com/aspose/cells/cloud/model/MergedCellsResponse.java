package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergedCellsResponse — Represents the MergedCells Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergedCellsResponse extends CellsCloudResponse {
    /** Property Summary: Contains information about merged cells within a spreadsheet. */
    @JsonProperty("MergedCells")
    private MergedCells mergedCells;

    public MergedCells getMergedCells() { return mergedCells; }
    public MergedCellsResponse setMergedCells(MergedCells mergedCells) { this.mergedCells = mergedCells; return this; }


    /** Covariant override: keeps fluent chains returning MergedCellsResponse. */
    @Override public MergedCellsResponse setCode(Integer code) { return (MergedCellsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning MergedCellsResponse. */
    @Override public MergedCellsResponse setStatus(String status) { return (MergedCellsResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergedCellResponse — Represents the MergedCell Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergedCellResponse extends CellsCloudResponse {
    /** A property named "MergedCell" of type "MergedCell" which allows getting and setting its value. */
    @JsonProperty("MergedCell")
    private MergedCell mergedCell;

    public MergedCell getMergedCell() { return mergedCell; }
    public MergedCellResponse setMergedCell(MergedCell mergedCell) { this.mergedCell = mergedCell; return this; }


    /** Covariant override: keeps fluent chains returning MergedCellResponse. */
    @Override public MergedCellResponse setCode(Integer code) { return (MergedCellResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning MergedCellResponse. */
    @Override public MergedCellResponse setStatus(String status) { return (MergedCellResponse) super.setStatus(status); }

}

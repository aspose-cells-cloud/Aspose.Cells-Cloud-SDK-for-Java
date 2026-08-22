package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergedCellResponse — Represents the MergedCell Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergedCellResponse extends CellsCloudResponse {
    /** A property named "MergedCell" of type "MergedCell" which allows getting and setting its value. */
    @JsonProperty("MergedCell")
    private MergedCell mergedCell;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public MergedCell getMergedCell() { return mergedCell; }
    public MergedCellResponse setMergedCell(MergedCell mergedCell) { this.mergedCell = mergedCell; return this; }

    public Integer getCode() { return code; }
    public MergedCellResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public MergedCellResponse setStatus(String status) { this.status = status; return this; }

}

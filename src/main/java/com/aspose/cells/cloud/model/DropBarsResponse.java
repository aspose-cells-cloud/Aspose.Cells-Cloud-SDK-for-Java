package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DropBarsResponse — Represents the DropBars Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropBarsResponse extends CellsCloudResponse {
    /** The class has a property named `DropBars` of type `DropBars` with both getter and setter methods. */
    @JsonProperty("DropBars")
    private DropBars dropBars;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public DropBars getDropBars() { return dropBars; }
    public DropBarsResponse setDropBars(DropBars dropBars) { this.dropBars = dropBars; return this; }

    public Integer getCode() { return code; }
    public DropBarsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public DropBarsResponse setStatus(String status) { this.status = status; return this; }

}

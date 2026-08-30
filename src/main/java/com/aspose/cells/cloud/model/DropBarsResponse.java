package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DropBarsResponse — Represents the DropBars Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropBarsResponse extends CellsCloudResponse {
    /** The class has a property named `DropBars` of type `DropBars` with both getter and setter methods. */
    @JsonProperty("DropBars")
    private DropBars dropBars;

    public DropBars getDropBars() { return dropBars; }
    public DropBarsResponse setDropBars(DropBars dropBars) { this.dropBars = dropBars; return this; }


    /** Covariant override: keeps fluent chains returning DropBarsResponse. */
    @Override public DropBarsResponse setCode(Integer code) { return (DropBarsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning DropBarsResponse. */
    @Override public DropBarsResponse setStatus(String status) { return (DropBarsResponse) super.setStatus(status); }

}

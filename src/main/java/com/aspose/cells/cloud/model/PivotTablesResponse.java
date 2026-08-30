package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotTablesResponse — Represents the PivotTables Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTablesResponse extends CellsCloudResponse {
    /** This class has a property named PivotTables of type PivotTables that can be both accessed and modified. */
    @JsonProperty("PivotTables")
    private PivotTables pivotTables;

    public PivotTables getPivotTables() { return pivotTables; }
    public PivotTablesResponse setPivotTables(PivotTables pivotTables) { this.pivotTables = pivotTables; return this; }


    /** Covariant override: keeps fluent chains returning PivotTablesResponse. */
    @Override public PivotTablesResponse setCode(Integer code) { return (PivotTablesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PivotTablesResponse. */
    @Override public PivotTablesResponse setStatus(String status) { return (PivotTablesResponse) super.setStatus(status); }

}

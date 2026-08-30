package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotTableResponse — Represents the PivotTable Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTableResponse extends CellsCloudResponse {
    /** PivotTable property of type PivotTable that can be both read and written. */
    @JsonProperty("PivotTable")
    private PivotTable pivotTable;

    public PivotTable getPivotTable() { return pivotTable; }
    public PivotTableResponse setPivotTable(PivotTable pivotTable) { this.pivotTable = pivotTable; return this; }


    /** Covariant override: keeps fluent chains returning PivotTableResponse. */
    @Override public PivotTableResponse setCode(Integer code) { return (PivotTableResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PivotTableResponse. */
    @Override public PivotTableResponse setStatus(String status) { return (PivotTableResponse) super.setStatus(status); }

}

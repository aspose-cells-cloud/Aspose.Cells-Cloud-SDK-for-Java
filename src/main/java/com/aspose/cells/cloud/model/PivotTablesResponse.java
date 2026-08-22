package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotTablesResponse — Represents the PivotTables Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTablesResponse extends CellsCloudResponse {
    /** This class has a property named PivotTables of type PivotTables that can be both accessed and modified. */
    @JsonProperty("PivotTables")
    private PivotTables pivotTables;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public PivotTables getPivotTables() { return pivotTables; }
    public PivotTablesResponse setPivotTables(PivotTables pivotTables) { this.pivotTables = pivotTables; return this; }

    public Integer getCode() { return code; }
    public PivotTablesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PivotTablesResponse setStatus(String status) { this.status = status; return this; }

}

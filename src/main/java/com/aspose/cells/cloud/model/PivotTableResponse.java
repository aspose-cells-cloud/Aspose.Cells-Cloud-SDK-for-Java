package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotTableResponse — Represents the PivotTable Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTableResponse extends CellsCloudResponse {
    /** PivotTable property of type PivotTable that can be both read and written. */
    @JsonProperty("PivotTable")
    private PivotTable pivotTable;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public PivotTable getPivotTable() { return pivotTable; }
    public PivotTableResponse setPivotTable(PivotTable pivotTable) { this.pivotTable = pivotTable; return this; }

    public Integer getCode() { return code; }
    public PivotTableResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PivotTableResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotFieldResponse — Represents the PivotField Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotFieldResponse extends CellsCloudResponse {
    /** This class has a property named "PivotField" of type PivotField which can be accessed and modified. */
    @JsonProperty("PivotField")
    private PivotField pivotField;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public PivotField getPivotField() { return pivotField; }
    public PivotFieldResponse setPivotField(PivotField pivotField) { this.pivotField = pivotField; return this; }

    public Integer getCode() { return code; }
    public PivotFieldResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PivotFieldResponse setStatus(String status) { this.status = status; return this; }

}

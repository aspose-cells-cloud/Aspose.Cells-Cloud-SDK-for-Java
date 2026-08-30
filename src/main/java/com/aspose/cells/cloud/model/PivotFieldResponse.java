package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotFieldResponse — Represents the PivotField Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotFieldResponse extends CellsCloudResponse {
    /** This class has a property named "PivotField" of type PivotField which can be accessed and modified. */
    @JsonProperty("PivotField")
    private PivotField pivotField;

    public PivotField getPivotField() { return pivotField; }
    public PivotFieldResponse setPivotField(PivotField pivotField) { this.pivotField = pivotField; return this; }


    /** Covariant override: keeps fluent chains returning PivotFieldResponse. */
    @Override public PivotFieldResponse setCode(Integer code) { return (PivotFieldResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PivotFieldResponse. */
    @Override public PivotFieldResponse setStatus(String status) { return (PivotFieldResponse) super.setStatus(status); }

}

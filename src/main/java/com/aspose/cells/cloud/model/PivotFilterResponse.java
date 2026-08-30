package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotFilterResponse — Represents the PivotFilter Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotFilterResponse extends CellsCloudResponse {
    /** Property Summary: Contains a pivot filter for data manipulation. */
    @JsonProperty("PivotFilter")
    private PivotFilter pivotFilter;

    public PivotFilter getPivotFilter() { return pivotFilter; }
    public PivotFilterResponse setPivotFilter(PivotFilter pivotFilter) { this.pivotFilter = pivotFilter; return this; }


    /** Covariant override: keeps fluent chains returning PivotFilterResponse. */
    @Override public PivotFilterResponse setCode(Integer code) { return (PivotFilterResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PivotFilterResponse. */
    @Override public PivotFilterResponse setStatus(String status) { return (PivotFilterResponse) super.setStatus(status); }

}

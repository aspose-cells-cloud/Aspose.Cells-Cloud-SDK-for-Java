package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotFiltersResponse — Represents the PivotFilters Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotFiltersResponse extends CellsCloudResponse {
    /** Property summary: Contains a list of PivotFilter objects. */
    @JsonProperty("PivotFilters")
    private List<PivotFilter> pivotFilters;

    public List<PivotFilter> getPivotFilters() { return pivotFilters; }
    public PivotFiltersResponse setPivotFilters(List<PivotFilter> pivotFilters) { this.pivotFilters = pivotFilters; return this; }


    /** Covariant override: keeps fluent chains returning PivotFiltersResponse. */
    @Override public PivotFiltersResponse setCode(Integer code) { return (PivotFiltersResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PivotFiltersResponse. */
    @Override public PivotFiltersResponse setStatus(String status) { return (PivotFiltersResponse) super.setStatus(status); }

}

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

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<PivotFilter> getPivotFilters() { return pivotFilters; }
    public PivotFiltersResponse setPivotFilters(List<PivotFilter> pivotFilters) { this.pivotFilters = pivotFilters; return this; }

    public Integer getCode() { return code; }
    public PivotFiltersResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PivotFiltersResponse setStatus(String status) { this.status = status; return this; }

}

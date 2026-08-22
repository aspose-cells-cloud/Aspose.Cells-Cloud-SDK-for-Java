package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotFilterResponse — Represents the PivotFilter Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotFilterResponse extends CellsCloudResponse {
    /** Property Summary: Contains a pivot filter for data manipulation. */
    @JsonProperty("PivotFilter")
    private PivotFilter pivotFilter;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public PivotFilter getPivotFilter() { return pivotFilter; }
    public PivotFilterResponse setPivotFilter(PivotFilter pivotFilter) { this.pivotFilter = pivotFilter; return this; }

    public Integer getCode() { return code; }
    public PivotFilterResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PivotFilterResponse setStatus(String status) { this.status = status; return this; }

}

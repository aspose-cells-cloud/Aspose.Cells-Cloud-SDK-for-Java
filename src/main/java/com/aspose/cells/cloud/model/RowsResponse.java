package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RowsResponse — Represents the Rows Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RowsResponse extends CellsCloudResponse {
    /** A property named "Rows" of type "Rows" which has both getter and setter methods. */
    @JsonProperty("Rows")
    private Rows rows;

    public Rows getRows() { return rows; }
    public RowsResponse setRows(Rows rows) { this.rows = rows; return this; }


    /** Covariant override: keeps fluent chains returning RowsResponse. */
    @Override public RowsResponse setCode(Integer code) { return (RowsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RowsResponse. */
    @Override public RowsResponse setStatus(String status) { return (RowsResponse) super.setStatus(status); }

}

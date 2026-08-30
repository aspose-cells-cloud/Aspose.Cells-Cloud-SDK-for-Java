package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColumnsResponse — Represents the Columns Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColumnsResponse extends CellsCloudResponse {
    /** This property allows access to the columns within the class. */
    @JsonProperty("Columns")
    private Columns columns;

    public Columns getColumns() { return columns; }
    public ColumnsResponse setColumns(Columns columns) { this.columns = columns; return this; }


    /** Covariant override: keeps fluent chains returning ColumnsResponse. */
    @Override public ColumnsResponse setCode(Integer code) { return (ColumnsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ColumnsResponse. */
    @Override public ColumnsResponse setStatus(String status) { return (ColumnsResponse) super.setStatus(status); }

}

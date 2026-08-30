package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RowResponse — Represents the Row Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RowResponse extends CellsCloudResponse {
    /** This class has a public property named "Row" of type "Row" with both get and set accessors. */
    @JsonProperty("Row")
    private Row row;

    public Row getRow() { return row; }
    public RowResponse setRow(Row row) { this.row = row; return this; }


    /** Covariant override: keeps fluent chains returning RowResponse. */
    @Override public RowResponse setCode(Integer code) { return (RowResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RowResponse. */
    @Override public RowResponse setStatus(String status) { return (RowResponse) super.setStatus(status); }

}

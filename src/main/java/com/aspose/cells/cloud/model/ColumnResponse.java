package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColumnResponse — Represents the Column Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColumnResponse extends CellsCloudResponse {
    /** This class has a public property called "Column" of type "Column" with both getter and setter methods. */
    @JsonProperty("Column")
    private Column column;

    public Column getColumn() { return column; }
    public ColumnResponse setColumn(Column column) { this.column = column; return this; }


    /** Covariant override: keeps fluent chains returning ColumnResponse. */
    @Override public ColumnResponse setCode(Integer code) { return (ColumnResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ColumnResponse. */
    @Override public ColumnResponse setStatus(String status) { return (ColumnResponse) super.setStatus(status); }

}

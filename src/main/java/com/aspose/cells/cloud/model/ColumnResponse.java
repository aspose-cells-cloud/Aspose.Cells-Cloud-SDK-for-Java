package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColumnResponse — Represents the Column Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColumnResponse extends CellsCloudResponse {
    /** This class has a public property called "Column" of type "Column" with both getter and setter methods. */
    @JsonProperty("Column")
    private Column column;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Column getColumn() { return column; }
    public ColumnResponse setColumn(Column column) { this.column = column; return this; }

    public Integer getCode() { return code; }
    public ColumnResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ColumnResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RowResponse — Represents the Row Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RowResponse extends CellsCloudResponse {
    /** This class has a public property named "Row" of type "Row" with both get and set accessors. */
    @JsonProperty("Row")
    private Row row;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Row getRow() { return row; }
    public RowResponse setRow(Row row) { this.row = row; return this; }

    public Integer getCode() { return code; }
    public RowResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public RowResponse setStatus(String status) { this.status = status; return this; }

}

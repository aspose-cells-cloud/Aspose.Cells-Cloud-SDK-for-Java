package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RowsResponse — Represents the Rows Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RowsResponse extends CellsCloudResponse {
    /** A property named "Rows" of type "Rows" which has both getter and setter methods. */
    @JsonProperty("Rows")
    private Rows rows;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Rows getRows() { return rows; }
    public RowsResponse setRows(Rows rows) { this.rows = rows; return this; }

    public Integer getCode() { return code; }
    public RowsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public RowsResponse setStatus(String status) { this.status = status; return this; }

}

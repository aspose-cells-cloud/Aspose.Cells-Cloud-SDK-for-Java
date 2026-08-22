package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColumnsResponse — Represents the Columns Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColumnsResponse extends CellsCloudResponse {
    /** This property allows access to the columns within the class. */
    @JsonProperty("Columns")
    private Columns columns;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Columns getColumns() { return columns; }
    public ColumnsResponse setColumns(Columns columns) { this.columns = columns; return this; }

    public Integer getCode() { return code; }
    public ColumnsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ColumnsResponse setStatus(String status) { this.status = status; return this; }

}

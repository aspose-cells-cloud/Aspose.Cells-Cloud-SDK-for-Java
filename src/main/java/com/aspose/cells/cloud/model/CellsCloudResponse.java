package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsCloudResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsCloudResponse {
    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Integer getCode() { return code; }
    public CellsCloudResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellsCloudResponse setStatus(String status) { this.status = status; return this; }

}

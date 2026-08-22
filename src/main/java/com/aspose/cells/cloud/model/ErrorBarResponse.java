package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ErrorBarResponse — Represents the ErrorBar Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorBarResponse extends CellsCloudResponse {
    /** The class has a public property named ErrorBar of type ErrorBar with a getter and setter. */
    @JsonProperty("ErrorBar")
    private ErrorBar errorBar;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ErrorBar getErrorBar() { return errorBar; }
    public ErrorBarResponse setErrorBar(ErrorBar errorBar) { this.errorBar = errorBar; return this; }

    public Integer getCode() { return code; }
    public ErrorBarResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ErrorBarResponse setStatus(String status) { this.status = status; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ErrorBarResponse — Represents the ErrorBar Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorBarResponse extends CellsCloudResponse {
    /** The class has a public property named ErrorBar of type ErrorBar with a getter and setter. */
    @JsonProperty("ErrorBar")
    private ErrorBar errorBar;

    public ErrorBar getErrorBar() { return errorBar; }
    public ErrorBarResponse setErrorBar(ErrorBar errorBar) { this.errorBar = errorBar; return this; }


    /** Covariant override: keeps fluent chains returning ErrorBarResponse. */
    @Override public ErrorBarResponse setCode(Integer code) { return (ErrorBarResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ErrorBarResponse. */
    @Override public ErrorBarResponse setStatus(String status) { return (ErrorBarResponse) super.setStatus(status); }

}

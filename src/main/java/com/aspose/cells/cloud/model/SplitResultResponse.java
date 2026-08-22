package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SplitResultResponse — Represents the SplitResult Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SplitResultResponse extends CellsCloudResponse {
    /** Gets or sets the splitting result. */
    @JsonProperty("Result")
    private SplitResult result;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public SplitResult getResult() { return result; }
    public SplitResultResponse setResult(SplitResult result) { this.result = result; return this; }

    public Integer getCode() { return code; }
    public SplitResultResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SplitResultResponse setStatus(String status) { this.status = status; return this; }

}

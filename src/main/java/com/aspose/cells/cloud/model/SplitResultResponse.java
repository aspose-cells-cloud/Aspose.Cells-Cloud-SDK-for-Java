package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SplitResultResponse — Represents the SplitResult Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SplitResultResponse extends CellsCloudResponse {
    /** Gets or sets the splitting result. */
    @JsonProperty("Result")
    private SplitResult result;

    public SplitResult getResult() { return result; }
    public SplitResultResponse setResult(SplitResult result) { this.result = result; return this; }


    /** Covariant override: keeps fluent chains returning SplitResultResponse. */
    @Override public SplitResultResponse setCode(Integer code) { return (SplitResultResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SplitResultResponse. */
    @Override public SplitResultResponse setStatus(String status) { return (SplitResultResponse) super.setStatus(status); }

}

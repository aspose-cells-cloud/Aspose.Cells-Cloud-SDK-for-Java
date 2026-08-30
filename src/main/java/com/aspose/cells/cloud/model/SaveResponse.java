package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SaveResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveResponse extends CellsCloudResponse {
    /** Gets or sets SaveResult. */
    @JsonProperty("SaveResult")
    private SaveResult saveResult;

    public SaveResult getSaveResult() { return saveResult; }
    public SaveResponse setSaveResult(SaveResult saveResult) { this.saveResult = saveResult; return this; }


    /** Covariant override: keeps fluent chains returning SaveResponse. */
    @Override public SaveResponse setCode(Integer code) { return (SaveResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SaveResponse. */
    @Override public SaveResponse setStatus(String status) { return (SaveResponse) super.setStatus(status); }

}

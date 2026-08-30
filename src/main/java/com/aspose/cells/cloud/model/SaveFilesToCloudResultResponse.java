package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SaveFilesToCloudResultResponse — Represents the SaveFilesToCloudResult Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveFilesToCloudResultResponse extends CellsCloudResponse {
    /** Property: SaveFilesToCloudResult that allows getting and setting an object of type SaveFilesToCloudResult. */
    @JsonProperty("SaveFilesToCloudResult")
    private SaveFilesToCloudResult saveFilesToCloudResult;

    public SaveFilesToCloudResult getSaveFilesToCloudResult() { return saveFilesToCloudResult; }
    public SaveFilesToCloudResultResponse setSaveFilesToCloudResult(SaveFilesToCloudResult saveFilesToCloudResult) { this.saveFilesToCloudResult = saveFilesToCloudResult; return this; }


    /** Covariant override: keeps fluent chains returning SaveFilesToCloudResultResponse. */
    @Override public SaveFilesToCloudResultResponse setCode(Integer code) { return (SaveFilesToCloudResultResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SaveFilesToCloudResultResponse. */
    @Override public SaveFilesToCloudResultResponse setStatus(String status) { return (SaveFilesToCloudResultResponse) super.setStatus(status); }

}

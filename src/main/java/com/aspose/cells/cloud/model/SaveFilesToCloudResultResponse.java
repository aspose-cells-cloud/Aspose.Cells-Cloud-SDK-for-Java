package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SaveFilesToCloudResultResponse — Represents the SaveFilesToCloudResult Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveFilesToCloudResultResponse extends CellsCloudResponse {
    /** Property: SaveFilesToCloudResult that allows getting and setting an object of type SaveFilesToCloudResult. */
    @JsonProperty("SaveFilesToCloudResult")
    private SaveFilesToCloudResult saveFilesToCloudResult;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public SaveFilesToCloudResult getSaveFilesToCloudResult() { return saveFilesToCloudResult; }
    public SaveFilesToCloudResultResponse setSaveFilesToCloudResult(SaveFilesToCloudResult saveFilesToCloudResult) { this.saveFilesToCloudResult = saveFilesToCloudResult; return this; }

    public Integer getCode() { return code; }
    public SaveFilesToCloudResultResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SaveFilesToCloudResultResponse setStatus(String status) { this.status = status; return this; }

}

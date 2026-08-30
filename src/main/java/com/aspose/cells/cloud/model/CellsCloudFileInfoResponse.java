package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsCloudFileInfoResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsCloudFileInfoResponse extends CellsCloudResponse {
    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private CellsCloudFileInfo fileInfo;

    public CellsCloudFileInfo getFileInfo() { return fileInfo; }
    public CellsCloudFileInfoResponse setFileInfo(CellsCloudFileInfo fileInfo) { this.fileInfo = fileInfo; return this; }


    /** Covariant override: keeps fluent chains returning CellsCloudFileInfoResponse. */
    @Override public CellsCloudFileInfoResponse setCode(Integer code) { return (CellsCloudFileInfoResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellsCloudFileInfoResponse. */
    @Override public CellsCloudFileInfoResponse setStatus(String status) { return (CellsCloudFileInfoResponse) super.setStatus(status); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsCloudPublicKeyResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsCloudPublicKeyResponse extends CellsCloudResponse {
    /** Gets or sets CellsCloudPublicKey. */
    @JsonProperty("CellsCloudPublicKey")
    private CellsCloudPublicKey cellsCloudPublicKey;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public CellsCloudPublicKey getCellsCloudPublicKey() { return cellsCloudPublicKey; }
    public CellsCloudPublicKeyResponse setCellsCloudPublicKey(CellsCloudPublicKey cellsCloudPublicKey) { this.cellsCloudPublicKey = cellsCloudPublicKey; return this; }

    public Integer getCode() { return code; }
    public CellsCloudPublicKeyResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellsCloudPublicKeyResponse setStatus(String status) { this.status = status; return this; }

}

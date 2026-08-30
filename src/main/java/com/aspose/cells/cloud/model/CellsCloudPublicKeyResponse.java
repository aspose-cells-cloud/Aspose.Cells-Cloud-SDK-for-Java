package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsCloudPublicKeyResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsCloudPublicKeyResponse extends CellsCloudResponse {
    /** Gets or sets CellsCloudPublicKey. */
    @JsonProperty("CellsCloudPublicKey")
    private CellsCloudPublicKey cellsCloudPublicKey;

    public CellsCloudPublicKey getCellsCloudPublicKey() { return cellsCloudPublicKey; }
    public CellsCloudPublicKeyResponse setCellsCloudPublicKey(CellsCloudPublicKey cellsCloudPublicKey) { this.cellsCloudPublicKey = cellsCloudPublicKey; return this; }


    /** Covariant override: keeps fluent chains returning CellsCloudPublicKeyResponse. */
    @Override public CellsCloudPublicKeyResponse setCode(Integer code) { return (CellsCloudPublicKeyResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellsCloudPublicKeyResponse. */
    @Override public CellsCloudPublicKeyResponse setStatus(String status) { return (CellsCloudPublicKeyResponse) super.setStatus(status); }

}

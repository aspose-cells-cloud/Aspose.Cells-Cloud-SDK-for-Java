package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDocumentPropertyResponse — Represents the CellsDocumentProperty Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDocumentPropertyResponse extends CellsCloudResponse {
    /** A property named DocumentProperty of type CellsDocumentProperty is defined with get and set accessors. */
    @JsonProperty("DocumentProperty")
    private CellsDocumentProperty documentProperty;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public CellsDocumentProperty getDocumentProperty() { return documentProperty; }
    public CellsDocumentPropertyResponse setDocumentProperty(CellsDocumentProperty documentProperty) { this.documentProperty = documentProperty; return this; }

    public Integer getCode() { return code; }
    public CellsDocumentPropertyResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellsDocumentPropertyResponse setStatus(String status) { this.status = status; return this; }

}

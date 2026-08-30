package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDocumentPropertyResponse — Represents the CellsDocumentProperty Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDocumentPropertyResponse extends CellsCloudResponse {
    /** A property named DocumentProperty of type CellsDocumentProperty is defined with get and set accessors. */
    @JsonProperty("DocumentProperty")
    private CellsDocumentProperty documentProperty;

    public CellsDocumentProperty getDocumentProperty() { return documentProperty; }
    public CellsDocumentPropertyResponse setDocumentProperty(CellsDocumentProperty documentProperty) { this.documentProperty = documentProperty; return this; }


    /** Covariant override: keeps fluent chains returning CellsDocumentPropertyResponse. */
    @Override public CellsDocumentPropertyResponse setCode(Integer code) { return (CellsDocumentPropertyResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellsDocumentPropertyResponse. */
    @Override public CellsDocumentPropertyResponse setStatus(String status) { return (CellsDocumentPropertyResponse) super.setStatus(status); }

}

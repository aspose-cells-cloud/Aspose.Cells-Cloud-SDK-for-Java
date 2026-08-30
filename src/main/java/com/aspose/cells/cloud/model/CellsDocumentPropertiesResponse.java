package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDocumentPropertiesResponse — Represents the CellsDocumentProperties Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDocumentPropertiesResponse extends CellsCloudResponse {
    /** The class has a property that represents the document properties of cells. */
    @JsonProperty("DocumentProperties")
    private CellsDocumentProperties documentProperties;

    public CellsDocumentProperties getDocumentProperties() { return documentProperties; }
    public CellsDocumentPropertiesResponse setDocumentProperties(CellsDocumentProperties documentProperties) { this.documentProperties = documentProperties; return this; }


    /** Covariant override: keeps fluent chains returning CellsDocumentPropertiesResponse. */
    @Override public CellsDocumentPropertiesResponse setCode(Integer code) { return (CellsDocumentPropertiesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellsDocumentPropertiesResponse. */
    @Override public CellsDocumentPropertiesResponse setStatus(String status) { return (CellsDocumentPropertiesResponse) super.setStatus(status); }

}

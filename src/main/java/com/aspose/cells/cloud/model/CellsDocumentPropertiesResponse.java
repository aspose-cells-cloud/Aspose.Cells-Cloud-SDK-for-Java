package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDocumentPropertiesResponse — Represents the CellsDocumentProperties Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDocumentPropertiesResponse extends CellsCloudResponse {
    /** The class has a property that represents the document properties of cells. */
    @JsonProperty("DocumentProperties")
    private CellsDocumentProperties documentProperties;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public CellsDocumentProperties getDocumentProperties() { return documentProperties; }
    public CellsDocumentPropertiesResponse setDocumentProperties(CellsDocumentProperties documentProperties) { this.documentProperties = documentProperties; return this; }

    public Integer getCode() { return code; }
    public CellsDocumentPropertiesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellsDocumentPropertiesResponse setStatus(String status) { this.status = status; return this; }

}

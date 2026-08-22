package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CellsDocumentProperties — Excel properties */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDocumentProperties {
    /** Document property list. */
    @JsonProperty("DocumentPropertyList")
    private List<CellsDocumentProperty> documentPropertyList;

    public List<CellsDocumentProperty> getDocumentPropertyList() { return documentPropertyList; }
    public CellsDocumentProperties setDocumentPropertyList(List<CellsDocumentProperty> documentPropertyList) { this.documentPropertyList = documentPropertyList; return this; }

}

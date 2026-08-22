package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsDocumentProperty — Cells document property. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsDocumentProperty {
    /** Returns the name of the property. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets the value of the property. */
    @JsonProperty("Value")
    private String value;

    /** Indicates whether this property is linked to content */
    @JsonProperty("IsLinkedToContent")
    private String isLinkedToContent;

    /** The linked content source. */
    @JsonProperty("Source")
    private String source;

    /** Gets the data type of the property. */
    @JsonProperty("Type")
    private String type;

    /** Returns true if this property does not have a name in the OLE2 storage and a unique name was generated only for the public API. */
    @JsonProperty("IsGeneratedName")
    private String isGeneratedName;

    public String getName() { return name; }
    public CellsDocumentProperty setName(String name) { this.name = name; return this; }

    public String getValue() { return value; }
    public CellsDocumentProperty setValue(String value) { this.value = value; return this; }

    public String getIsLinkedToContent() { return isLinkedToContent; }
    public CellsDocumentProperty setIsLinkedToContent(String isLinkedToContent) { this.isLinkedToContent = isLinkedToContent; return this; }

    public String getSource() { return source; }
    public CellsDocumentProperty setSource(String source) { this.source = source; return this; }

    public String getType() { return type; }
    public CellsDocumentProperty setType(String type) { this.type = type; return this; }

    public String getIsGeneratedName() { return isGeneratedName; }
    public CellsDocumentProperty setIsGeneratedName(String isGeneratedName) { this.isGeneratedName = isGeneratedName; return this; }

}

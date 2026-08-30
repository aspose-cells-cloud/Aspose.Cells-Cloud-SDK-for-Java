package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Worksheets — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Worksheets extends LinkElement {
    /** A property named "WorksheetList" that contains a list of elements with the XML element name "worksheet". */
    @JsonProperty("WorksheetList")
    private List<LinkElement> worksheetList;

    public List<LinkElement> getWorksheetList() { return worksheetList; }
    public Worksheets setWorksheetList(List<LinkElement> worksheetList) { this.worksheetList = worksheetList; return this; }


    /** Covariant override: keeps fluent chains returning Worksheets. */
    @Override public Worksheets setLink(Link link) { return (Worksheets) super.setLink(link); }

}

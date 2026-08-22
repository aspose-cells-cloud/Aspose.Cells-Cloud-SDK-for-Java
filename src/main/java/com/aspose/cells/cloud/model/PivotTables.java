package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotTables — Represents the collection of all the PivotTable objects on the specified worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTables extends LinkElement {
    /** Xml property "PivotTableList" of the class contains a list of "LinkElement" objects with the element name "PivotTable". */
    @JsonProperty("PivotTableList")
    private List<LinkElement> pivotTableList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getPivotTableList() { return pivotTableList; }
    public PivotTables setPivotTableList(List<LinkElement> pivotTableList) { this.pivotTableList = pivotTableList; return this; }

    public Link getLink() { return link; }
    public PivotTables setLink(Link link) { this.link = link; return this; }

}

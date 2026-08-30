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

    public List<LinkElement> getPivotTableList() { return pivotTableList; }
    public PivotTables setPivotTableList(List<LinkElement> pivotTableList) { this.pivotTableList = pivotTableList; return this; }


    /** Covariant override: keeps fluent chains returning PivotTables. */
    @Override public PivotTables setLink(Link link) { return (PivotTables) super.setLink(link); }

}

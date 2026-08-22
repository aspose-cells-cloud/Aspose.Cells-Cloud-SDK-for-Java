package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Names — Represents a collection of all the  objects in the spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Names extends LinkElement {
    /** This class property is tagged as an XML element named "count" and stores an integer value. */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets NameList. */
    @JsonProperty("NameList")
    private List<LinkElement> nameList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getCount() { return count; }
    public Names setCount(Integer count) { this.count = count; return this; }

    public List<LinkElement> getNameList() { return nameList; }
    public Names setNameList(List<LinkElement> nameList) { this.nameList = nameList; return this; }

    public Link getLink() { return link; }
    public Names setLink(Link link) { this.link = link; return this; }

}

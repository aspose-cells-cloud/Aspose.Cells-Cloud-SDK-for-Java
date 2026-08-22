package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ListObjects — Represents a collection of  objects in the worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObjects extends LinkElement {
    /** A property named ListObjectList that is a list of LinkElement objects. */
    @JsonProperty("ListObjectList")
    private List<LinkElement> listObjectList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getListObjectList() { return listObjectList; }
    public ListObjects setListObjectList(List<LinkElement> listObjectList) { this.listObjectList = listObjectList; return this; }

    public Link getLink() { return link; }
    public ListObjects setLink(Link link) { this.link = link; return this; }

}

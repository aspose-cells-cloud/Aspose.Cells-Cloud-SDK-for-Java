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

    public List<LinkElement> getListObjectList() { return listObjectList; }
    public ListObjects setListObjectList(List<LinkElement> listObjectList) { this.listObjectList = listObjectList; return this; }


    /** Covariant override: keeps fluent chains returning ListObjects. */
    @Override public ListObjects setLink(Link link) { return (ListObjects) super.setLink(link); }

}

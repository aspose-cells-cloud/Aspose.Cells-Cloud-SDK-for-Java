package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Hyperlinks — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hyperlinks extends LinkElement {
    /** Property Summary: An integer property named Count with an XML element name "count." */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets HyperlinkList. */
    @JsonProperty("HyperlinkList")
    private List<LinkElement> hyperlinkList;

    public Integer getCount() { return count; }
    public Hyperlinks setCount(Integer count) { this.count = count; return this; }

    public List<LinkElement> getHyperlinkList() { return hyperlinkList; }
    public Hyperlinks setHyperlinkList(List<LinkElement> hyperlinkList) { this.hyperlinkList = hyperlinkList; return this; }


    /** Covariant override: keeps fluent chains returning Hyperlinks. */
    @Override public Hyperlinks setLink(Link link) { return (Hyperlinks) super.setLink(link); }

}

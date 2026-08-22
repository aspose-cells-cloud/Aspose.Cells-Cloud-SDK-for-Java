package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VerticalPageBreaks — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerticalPageBreaks extends LinkElement {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public VerticalPageBreaks setLink(Link link) { this.link = link; return this; }

}

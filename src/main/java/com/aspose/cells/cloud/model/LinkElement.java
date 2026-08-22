package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LinkElement — Class summary: The features include automatic emergency braking, lane keeping assist, adaptive cruise control, blind spot monitoring, and rear cross-traffic alert. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkElement {
    /** The class has a property named "link" of type Link, which has a public get and set accessors. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public LinkElement setLink(Link link) { this.link = link; return this; }

}

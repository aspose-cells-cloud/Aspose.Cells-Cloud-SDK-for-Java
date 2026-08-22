package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Styles — Represents data style collection. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Styles extends LinkElement {
    /** This property contains a list of elements with the tag "style". */
    @JsonProperty("StyleList")
    private List<Style> styleList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<Style> getStyleList() { return styleList; }
    public Styles setStyleList(List<Style> styleList) { this.styleList = styleList; return this; }

    public Link getLink() { return link; }
    public Styles setLink(Link link) { this.link = link; return this; }

}

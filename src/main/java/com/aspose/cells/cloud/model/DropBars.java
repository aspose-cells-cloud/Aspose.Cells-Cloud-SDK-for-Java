package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DropBars — Represents the up/down bars in a chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DropBars extends LinkElement {
    /** Gets the . */
    @JsonProperty("Area")
    private Area area;

    /** Gets the border . */
    @JsonProperty("Border")
    private Line border;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Area getArea() { return area; }
    public DropBars setArea(Area area) { this.area = area; return this; }

    public Line getBorder() { return border; }
    public DropBars setBorder(Line border) { this.border = border; return this; }

    public Link getLink() { return link; }
    public DropBars setLink(Link link) { this.link = link; return this; }

}

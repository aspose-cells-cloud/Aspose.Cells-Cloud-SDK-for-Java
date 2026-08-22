package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Shapes — Represents all the shape in a worksheet/chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shapes extends LinkElement {
    /** A public property named "ShapeList" of type List LinkElement for storing a collection of link elements. */
    @JsonProperty("ShapeList")
    private List<LinkElement> shapeList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getShapeList() { return shapeList; }
    public Shapes setShapeList(List<LinkElement> shapeList) { this.shapeList = shapeList; return this; }

    public Link getLink() { return link; }
    public Shapes setLink(Link link) { this.link = link; return this; }

}

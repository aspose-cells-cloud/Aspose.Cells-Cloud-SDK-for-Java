package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Pictures — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pictures extends LinkElement {
    /** Property Summary: Contains a list of elements with the XML element name "picture." */
    @JsonProperty("PictureList")
    private List<LinkElement> pictureList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getPictureList() { return pictureList; }
    public Pictures setPictureList(List<LinkElement> pictureList) { this.pictureList = pictureList; return this; }

    public Link getLink() { return link; }
    public Pictures setLink(Link link) { this.link = link; return this; }

}

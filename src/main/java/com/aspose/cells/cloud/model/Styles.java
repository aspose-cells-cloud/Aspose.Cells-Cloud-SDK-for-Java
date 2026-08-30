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

    public List<Style> getStyleList() { return styleList; }
    public Styles setStyleList(List<Style> styleList) { this.styleList = styleList; return this; }


    /** Covariant override: keeps fluent chains returning Styles. */
    @Override public Styles setLink(Link link) { return (Styles) super.setLink(link); }

}

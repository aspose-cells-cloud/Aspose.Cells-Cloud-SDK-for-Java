package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** TextItems — Represents text item collection. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextItems extends LinkElement {
    /** Represents text item collection */
    @JsonProperty("TextItemList")
    private List<TextItem> textItemList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<TextItem> getTextItemList() { return textItemList; }
    public TextItems setTextItemList(List<TextItem> textItemList) { this.textItemList = textItemList; return this; }

    public Link getLink() { return link; }
    public TextItems setLink(Link link) { this.link = link; return this; }

}

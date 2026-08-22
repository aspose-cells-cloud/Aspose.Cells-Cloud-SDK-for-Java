package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** OleObjects — Represents embedded OLE objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OleObjects extends LinkElement {
    /** Property Summary: Contains a list of elements identified as "oleobject" within XML data. */
    @JsonProperty("OleObjectList")
    private List<LinkElement> oleObjectList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getOleObjectList() { return oleObjectList; }
    public OleObjects setOleObjectList(List<LinkElement> oleObjectList) { this.oleObjectList = oleObjectList; return this; }

    public Link getLink() { return link; }
    public OleObjects setLink(Link link) { this.link = link; return this; }

}

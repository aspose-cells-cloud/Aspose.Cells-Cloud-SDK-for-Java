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

    public List<LinkElement> getOleObjectList() { return oleObjectList; }
    public OleObjects setOleObjectList(List<LinkElement> oleObjectList) { this.oleObjectList = oleObjectList; return this; }


    /** Covariant override: keeps fluent chains returning OleObjects. */
    @Override public OleObjects setLink(Link link) { return (OleObjects) super.setLink(link); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name — Represents a defined name for a range of cells. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Name extends LinkElement {
    /** Gets and sets the comment of the name. Only applies for Excel 2007. */
    @JsonProperty("Comment")
    private String comment;

    /** Property Summary: WorksheetIndex is an optional integer property marked with the XmlElement attribute "worksheetindex". */
    @JsonProperty("WorksheetIndex")
    private Integer worksheetIndex;

    /** Indicates whether this name is referred by other formulas. */
    @JsonProperty("IsReferred")
    private Boolean isReferred;

    /** Indicates whether the name is visible. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** Gets or sets a R1C1 reference of the . */
    @JsonProperty("R1C1RefersTo")
    private String r1C1RefersTo;

    /** Returns or sets the formula that the name is defined to refer to, beginning with an equal sign. */
    @JsonProperty("RefersTo")
    private String refersTo;

    /** Gets the name text of the object. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getComment() { return comment; }
    public Name setComment(String comment) { this.comment = comment; return this; }

    public Integer getWorksheetIndex() { return worksheetIndex; }
    public Name setWorksheetIndex(Integer worksheetIndex) { this.worksheetIndex = worksheetIndex; return this; }

    public Boolean getIsReferred() { return isReferred; }
    public Name setIsReferred(Boolean isReferred) { this.isReferred = isReferred; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public Name setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public String getR1C1RefersTo() { return r1C1RefersTo; }
    public Name setR1C1RefersTo(String r1C1RefersTo) { this.r1C1RefersTo = r1C1RefersTo; return this; }

    public String getRefersTo() { return refersTo; }
    public Name setRefersTo(String refersTo) { this.refersTo = refersTo; return this; }

    public String getText() { return text; }
    public Name setText(String text) { this.text = text; return this; }

    public Link getLink() { return link; }
    public Name setLink(Link link) { this.link = link; return this; }

}

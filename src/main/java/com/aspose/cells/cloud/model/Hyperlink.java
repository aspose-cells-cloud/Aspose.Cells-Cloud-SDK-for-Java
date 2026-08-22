package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hyperlink — Encapsulates the object that represents a hyperlink. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Hyperlink extends LinkElement {
    /** Represents the address of a hyperlink. */
    @JsonProperty("Address")
    private String address;

    /** Gets the range of hyperlink. */
    @JsonProperty("Area")
    private CellArea area;

    /** Returns or sets the ScreenTip text for the specified hyperlink. */
    @JsonProperty("ScreenTip")
    private String screenTip;

    /** Represents the text to be displayed for the specified hyperlink. The default value is the address of the hyperlink. */
    @JsonProperty("TextToDisplay")
    private String textToDisplay;

    /** Gets the link type. */
    @JsonProperty("LinkType")
    private String linkType;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getAddress() { return address; }
    public Hyperlink setAddress(String address) { this.address = address; return this; }

    public CellArea getArea() { return area; }
    public Hyperlink setArea(CellArea area) { this.area = area; return this; }

    public String getScreenTip() { return screenTip; }
    public Hyperlink setScreenTip(String screenTip) { this.screenTip = screenTip; return this; }

    public String getTextToDisplay() { return textToDisplay; }
    public Hyperlink setTextToDisplay(String textToDisplay) { this.textToDisplay = textToDisplay; return this; }

    public String getLinkType() { return linkType; }
    public Hyperlink setLinkType(String linkType) { this.linkType = linkType; return this; }

    public Link getLink() { return link; }
    public Hyperlink setLink(Link link) { this.link = link; return this; }

}

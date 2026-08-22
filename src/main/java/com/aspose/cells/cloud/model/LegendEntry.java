package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LegendEntry — Represents a legend entry in a chart legend. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendEntry extends LinkElement {
    /** True if the text in the object changes font size when the object size changes. The default value is True. */
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    /** Gets and sets the display mode of the background */
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    /** Gets a  object of the specified ChartFrame object. */
    @JsonProperty("Font")
    private Font font;

    /** Gets and sets whether the legend entry is deleted. */
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public LegendEntry setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public LegendEntry setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Font getFont() { return font; }
    public LegendEntry setFont(Font font) { this.font = font; return this; }

    public Boolean getIsDeleted() { return isDeleted; }
    public LegendEntry setIsDeleted(Boolean isDeleted) { this.isDeleted = isDeleted; return this; }

    public Link getLink() { return link; }
    public LegendEntry setLink(Link link) { this.link = link; return this; }

}

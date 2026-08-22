package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TickLabels — Represents the tick-mark labels associated with tick marks on a chart axis. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TickLabels extends LinkElement {
    /** True if the text in the object changes font size when the object size changes. The default value is True. */
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    /** Gets and sets the display mode of the background */
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    /** Returns a  object that represents the font of the specified TickLabels object. */
    @JsonProperty("Font")
    private Font font;

    /** Represents the format number for the TickLabels object. */
    @JsonProperty("Number")
    private Integer number;

    /** Represents the format string for the TickLabels object. */
    @JsonProperty("NumberFormat")
    private String numberFormat;

    /** True if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells). */
    @JsonProperty("NumberFormatLinked")
    private Boolean numberFormatLinked;

    /** Gets and sets the distance of labels from the axis. */
    @JsonProperty("Offset")
    private Integer offset;

    /** Represents text rotation angle in clockwise. */
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    /** Represents text reading order. */
    @JsonProperty("TextDirection")
    private String textDirection;

    /** Represents text reading order. */
    @JsonProperty("ReadingOrder")
    private String readingOrder;

    /** Gets and sets the direction of text. */
    @JsonProperty("DirectionType")
    private String directionType;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public TickLabels setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public TickLabels setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Font getFont() { return font; }
    public TickLabels setFont(Font font) { this.font = font; return this; }

    public Integer getNumber() { return number; }
    public TickLabels setNumber(Integer number) { this.number = number; return this; }

    public String getNumberFormat() { return numberFormat; }
    public TickLabels setNumberFormat(String numberFormat) { this.numberFormat = numberFormat; return this; }

    public Boolean getNumberFormatLinked() { return numberFormatLinked; }
    public TickLabels setNumberFormatLinked(Boolean numberFormatLinked) { this.numberFormatLinked = numberFormatLinked; return this; }

    public Integer getOffset() { return offset; }
    public TickLabels setOffset(Integer offset) { this.offset = offset; return this; }

    public Integer getRotationAngle() { return rotationAngle; }
    public TickLabels setRotationAngle(Integer rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getTextDirection() { return textDirection; }
    public TickLabels setTextDirection(String textDirection) { this.textDirection = textDirection; return this; }

    public String getReadingOrder() { return readingOrder; }
    public TickLabels setReadingOrder(String readingOrder) { this.readingOrder = readingOrder; return this; }

    public String getDirectionType() { return directionType; }
    public TickLabels setDirectionType(String directionType) { this.directionType = directionType; return this; }

    public Link getLink() { return link; }
    public TickLabels setLink(Link link) { this.link = link; return this; }

}

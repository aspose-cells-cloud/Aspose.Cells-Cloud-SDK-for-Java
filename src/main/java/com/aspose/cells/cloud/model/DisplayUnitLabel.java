package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DisplayUnitLabel — Represents the display unit label. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisplayUnitLabel extends ChartFrame {
    /** A public property named "LinkedSource" with a string data type can be set and accessed. */
    @JsonProperty("LinkedSource")
    private String linkedSource;

    /** Gets or sets RotationAngle. */
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    /** Gets or sets the text of display unit label. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets TextHorizontalAlignment. */
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    /** Gets or sets TextVerticalAlignment. */
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    public String getLinkedSource() { return linkedSource; }
    public DisplayUnitLabel setLinkedSource(String linkedSource) { this.linkedSource = linkedSource; return this; }

    public Integer getRotationAngle() { return rotationAngle; }
    public DisplayUnitLabel setRotationAngle(Integer rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getText() { return text; }
    public DisplayUnitLabel setText(String text) { this.text = text; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public DisplayUnitLabel setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public DisplayUnitLabel setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }


    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setArea(Area area) { return (DisplayUnitLabel) super.setArea(area); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setAutoScaleFont(Boolean autoScaleFont) { return (DisplayUnitLabel) super.setAutoScaleFont(autoScaleFont); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setBackgroundMode(String backgroundMode) { return (DisplayUnitLabel) super.setBackgroundMode(backgroundMode); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setBorder(Line border) { return (DisplayUnitLabel) super.setBorder(border); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setFont(Font font) { return (DisplayUnitLabel) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setIsAutomaticSize(Boolean isAutomaticSize) { return (DisplayUnitLabel) super.setIsAutomaticSize(isAutomaticSize); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setIsInnerMode(Boolean isInnerMode) { return (DisplayUnitLabel) super.setIsInnerMode(isInnerMode); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setShadow(Boolean shadow) { return (DisplayUnitLabel) super.setShadow(shadow); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setWidth(Integer width) { return (DisplayUnitLabel) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setHeight(Integer height) { return (DisplayUnitLabel) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setX(Integer x) { return (DisplayUnitLabel) super.setX(x); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabel. */
    @Override public DisplayUnitLabel setY(Integer y) { return (DisplayUnitLabel) super.setY(y); }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Title — Encapsulates the object that represents the title of chart or axis. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Title extends ChartFrame {
    /** Represents whether the title is visible. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** A property named LinkedSource with both set and get accessors is defined. */
    @JsonProperty("LinkedSource")
    private String linkedSource;

    /** Gets or sets RotationAngle. */
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    /** Gets or sets the text of display unit label. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets TextDirection. */
    @JsonProperty("TextDirection")
    private String textDirection;

    /** Gets or sets TextHorizontalAlignment. */
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    /** Gets or sets TextVerticalAlignment. */
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    public Boolean getIsVisible() { return isVisible; }
    public Title setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public String getLinkedSource() { return linkedSource; }
    public Title setLinkedSource(String linkedSource) { this.linkedSource = linkedSource; return this; }

    public Integer getRotationAngle() { return rotationAngle; }
    public Title setRotationAngle(Integer rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getText() { return text; }
    public Title setText(String text) { this.text = text; return this; }

    public String getTextDirection() { return textDirection; }
    public Title setTextDirection(String textDirection) { this.textDirection = textDirection; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public Title setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public Title setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }


    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setArea(Area area) { return (Title) super.setArea(area); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setAutoScaleFont(Boolean autoScaleFont) { return (Title) super.setAutoScaleFont(autoScaleFont); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setBackgroundMode(String backgroundMode) { return (Title) super.setBackgroundMode(backgroundMode); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setBorder(Line border) { return (Title) super.setBorder(border); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setFont(Font font) { return (Title) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setIsAutomaticSize(Boolean isAutomaticSize) { return (Title) super.setIsAutomaticSize(isAutomaticSize); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setIsInnerMode(Boolean isInnerMode) { return (Title) super.setIsInnerMode(isInnerMode); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setShadow(Boolean shadow) { return (Title) super.setShadow(shadow); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setWidth(Integer width) { return (Title) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setHeight(Integer height) { return (Title) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setX(Integer x) { return (Title) super.setX(x); }
    /** Covariant override: keeps fluent chains returning Title. */
    @Override public Title setY(Integer y) { return (Title) super.setY(y); }

}

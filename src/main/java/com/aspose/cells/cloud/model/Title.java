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

    /** Gets or sets Area. */
    @JsonProperty("Area")
    private Area area;

    /** Gets or sets AutoScaleFont. */
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    /** Gets or sets BackgroundMode. */
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    /** Gets or sets Border. */
    @JsonProperty("Border")
    private Line border;

    /** Gets or sets Font. */
    @JsonProperty("Font")
    private Font font;

    /** Gets or sets IsAutomaticSize. */
    @JsonProperty("IsAutomaticSize")
    private Boolean isAutomaticSize;

    /** Gets or sets IsInnerMode. */
    @JsonProperty("IsInnerMode")
    private Boolean isInnerMode;

    /** Gets or sets Shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets Width. */
    @JsonProperty("Width")
    private Integer width;

    /** Gets or sets Height. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets or sets X. */
    @JsonProperty("X")
    private Integer x;

    /** Gets or sets Y. */
    @JsonProperty("Y")
    private Integer y;

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

    public Area getArea() { return area; }
    public Title setArea(Area area) { this.area = area; return this; }

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public Title setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public Title setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public Title setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public Title setFont(Font font) { this.font = font; return this; }

    public Boolean getIsAutomaticSize() { return isAutomaticSize; }
    public Title setIsAutomaticSize(Boolean isAutomaticSize) { this.isAutomaticSize = isAutomaticSize; return this; }

    public Boolean getIsInnerMode() { return isInnerMode; }
    public Title setIsInnerMode(Boolean isInnerMode) { this.isInnerMode = isInnerMode; return this; }

    public Boolean getShadow() { return shadow; }
    public Title setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Integer getWidth() { return width; }
    public Title setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public Title setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public Title setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public Title setY(Integer y) { this.y = y; return this; }

}

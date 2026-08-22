package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartArea — Encapsulates the object that represents the chart area in the worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartArea extends ChartFrame {
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

    public Area getArea() { return area; }
    public ChartArea setArea(Area area) { this.area = area; return this; }

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public ChartArea setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public ChartArea setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public ChartArea setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public ChartArea setFont(Font font) { this.font = font; return this; }

    public Boolean getIsAutomaticSize() { return isAutomaticSize; }
    public ChartArea setIsAutomaticSize(Boolean isAutomaticSize) { this.isAutomaticSize = isAutomaticSize; return this; }

    public Boolean getIsInnerMode() { return isInnerMode; }
    public ChartArea setIsInnerMode(Boolean isInnerMode) { this.isInnerMode = isInnerMode; return this; }

    public Boolean getShadow() { return shadow; }
    public ChartArea setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Integer getWidth() { return width; }
    public ChartArea setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public ChartArea setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public ChartArea setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public ChartArea setY(Integer y) { this.y = y; return this; }

}

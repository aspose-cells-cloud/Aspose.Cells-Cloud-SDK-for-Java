package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PlotArea — Encapsulates the object that represents the plot area in a chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlotArea extends ChartFrame {
    /** Gets or sets the height of plot area in units of 1/4000 of the chart area. */
    @JsonProperty("InnerHeight")
    private Integer innerHeight;

    /** Gets or sets the width  of plot area in units of 1/4000 of the chart area. */
    @JsonProperty("InnerWidth")
    private Integer innerWidth;

    /** Gets or gets the x coordinate of the upper top corner of plot area in units of 1/4000 of the chart area. */
    @JsonProperty("InnerX")
    private Integer innerX;

    /** Gets or gets the x coordinate of the upper top corner of plot area in units of 1/4000 of the chart area. */
    @JsonProperty("InnerY")
    private Integer innerY;

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

    public Integer getInnerHeight() { return innerHeight; }
    public PlotArea setInnerHeight(Integer innerHeight) { this.innerHeight = innerHeight; return this; }

    public Integer getInnerWidth() { return innerWidth; }
    public PlotArea setInnerWidth(Integer innerWidth) { this.innerWidth = innerWidth; return this; }

    public Integer getInnerX() { return innerX; }
    public PlotArea setInnerX(Integer innerX) { this.innerX = innerX; return this; }

    public Integer getInnerY() { return innerY; }
    public PlotArea setInnerY(Integer innerY) { this.innerY = innerY; return this; }

    public Area getArea() { return area; }
    public PlotArea setArea(Area area) { this.area = area; return this; }

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public PlotArea setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public PlotArea setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public PlotArea setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public PlotArea setFont(Font font) { this.font = font; return this; }

    public Boolean getIsAutomaticSize() { return isAutomaticSize; }
    public PlotArea setIsAutomaticSize(Boolean isAutomaticSize) { this.isAutomaticSize = isAutomaticSize; return this; }

    public Boolean getIsInnerMode() { return isInnerMode; }
    public PlotArea setIsInnerMode(Boolean isInnerMode) { this.isInnerMode = isInnerMode; return this; }

    public Boolean getShadow() { return shadow; }
    public PlotArea setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Integer getWidth() { return width; }
    public PlotArea setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public PlotArea setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public PlotArea setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public PlotArea setY(Integer y) { this.y = y; return this; }

}

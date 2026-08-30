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

    public Integer getInnerHeight() { return innerHeight; }
    public PlotArea setInnerHeight(Integer innerHeight) { this.innerHeight = innerHeight; return this; }

    public Integer getInnerWidth() { return innerWidth; }
    public PlotArea setInnerWidth(Integer innerWidth) { this.innerWidth = innerWidth; return this; }

    public Integer getInnerX() { return innerX; }
    public PlotArea setInnerX(Integer innerX) { this.innerX = innerX; return this; }

    public Integer getInnerY() { return innerY; }
    public PlotArea setInnerY(Integer innerY) { this.innerY = innerY; return this; }


    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setArea(Area area) { return (PlotArea) super.setArea(area); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setAutoScaleFont(Boolean autoScaleFont) { return (PlotArea) super.setAutoScaleFont(autoScaleFont); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setBackgroundMode(String backgroundMode) { return (PlotArea) super.setBackgroundMode(backgroundMode); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setBorder(Line border) { return (PlotArea) super.setBorder(border); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setFont(Font font) { return (PlotArea) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setIsAutomaticSize(Boolean isAutomaticSize) { return (PlotArea) super.setIsAutomaticSize(isAutomaticSize); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setIsInnerMode(Boolean isInnerMode) { return (PlotArea) super.setIsInnerMode(isInnerMode); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setShadow(Boolean shadow) { return (PlotArea) super.setShadow(shadow); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setWidth(Integer width) { return (PlotArea) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setHeight(Integer height) { return (PlotArea) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setX(Integer x) { return (PlotArea) super.setX(x); }
    /** Covariant override: keeps fluent chains returning PlotArea. */
    @Override public PlotArea setY(Integer y) { return (PlotArea) super.setY(y); }

}

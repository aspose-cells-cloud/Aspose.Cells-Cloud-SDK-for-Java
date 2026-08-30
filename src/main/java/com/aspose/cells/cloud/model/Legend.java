package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Legend — Encapsulates the object that represents the chart legend. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Legend extends ChartFrame {
    /** Gets or sets the legend position type. */
    @JsonProperty("Position")
    private String position;

    /** Gets a collection of all the LegendEntry objects in the specified chart legend. Setting the legend entries of the surface chart is not supported. So it will return null if the chart type is surface chart type. */
    @JsonProperty("LegendEntries")
    private LinkElement legendEntries;

    public String getPosition() { return position; }
    public Legend setPosition(String position) { this.position = position; return this; }

    public LinkElement getLegendEntries() { return legendEntries; }
    public Legend setLegendEntries(LinkElement legendEntries) { this.legendEntries = legendEntries; return this; }


    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setArea(Area area) { return (Legend) super.setArea(area); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setAutoScaleFont(Boolean autoScaleFont) { return (Legend) super.setAutoScaleFont(autoScaleFont); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setBackgroundMode(String backgroundMode) { return (Legend) super.setBackgroundMode(backgroundMode); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setBorder(Line border) { return (Legend) super.setBorder(border); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setFont(Font font) { return (Legend) super.setFont(font); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setIsAutomaticSize(Boolean isAutomaticSize) { return (Legend) super.setIsAutomaticSize(isAutomaticSize); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setIsInnerMode(Boolean isInnerMode) { return (Legend) super.setIsInnerMode(isInnerMode); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setShadow(Boolean shadow) { return (Legend) super.setShadow(shadow); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setWidth(Integer width) { return (Legend) super.setWidth(width); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setHeight(Integer height) { return (Legend) super.setHeight(height); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setX(Integer x) { return (Legend) super.setX(x); }
    /** Covariant override: keeps fluent chains returning Legend. */
    @Override public Legend setY(Integer y) { return (Legend) super.setY(y); }

}

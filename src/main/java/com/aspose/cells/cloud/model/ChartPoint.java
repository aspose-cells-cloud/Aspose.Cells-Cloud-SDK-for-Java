package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartPoint — Represents a single point in a series in a chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartPoint extends LinkElement {
    /** Gets the area. */
    @JsonProperty("Area")
    private Area area;

    /** Gets the border. */
    @JsonProperty("Border")
    private Line border;

    /** Returns a DataLabels object that represents the data label associated with the point. */
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    /** The distance of an open pie slice from the center of the pie chart is expressed as a percentage of the pie diameter. */
    @JsonProperty("Explosion")
    private Integer explosion;

    /** Gets the marker. */
    @JsonProperty("Marker")
    private Marker marker;

    /** True if the chartpoint has a shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets the X value of the chart point. */
    @JsonProperty("XValue")
    private Object xValue;

    /** Gets or sets the Y value of the chart point. */
    @JsonProperty("YValue")
    private Object yValue;

    /** Gets or sets a value indicates whether this data points is in the second pie or bar on a pie of pie or bar of pie chart. */
    @JsonProperty("IsInSecondaryPlot")
    private Boolean isInSecondaryPlot;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Area getArea() { return area; }
    public ChartPoint setArea(Area area) { this.area = area; return this; }

    public Line getBorder() { return border; }
    public ChartPoint setBorder(Line border) { this.border = border; return this; }

    public DataLabels getDataLabels() { return dataLabels; }
    public ChartPoint setDataLabels(DataLabels dataLabels) { this.dataLabels = dataLabels; return this; }

    public Integer getExplosion() { return explosion; }
    public ChartPoint setExplosion(Integer explosion) { this.explosion = explosion; return this; }

    public Marker getMarker() { return marker; }
    public ChartPoint setMarker(Marker marker) { this.marker = marker; return this; }

    public Boolean getShadow() { return shadow; }
    public ChartPoint setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Object getXValue() { return xValue; }
    public ChartPoint setXValue(Object xValue) { this.xValue = xValue; return this; }

    public Object getYValue() { return yValue; }
    public ChartPoint setYValue(Object yValue) { this.yValue = yValue; return this; }

    public Boolean getIsInSecondaryPlot() { return isInSecondaryPlot; }
    public ChartPoint setIsInSecondaryPlot(Boolean isInSecondaryPlot) { this.isInSecondaryPlot = isInSecondaryPlot; return this; }

    public Link getLink() { return link; }
    public ChartPoint setLink(Link link) { this.link = link; return this; }

}

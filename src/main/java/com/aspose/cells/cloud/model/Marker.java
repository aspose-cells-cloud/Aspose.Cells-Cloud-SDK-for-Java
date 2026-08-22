package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Marker — Represents the marker in a line chart, scatter chart, or radar chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Marker {
    /** Gets the border. */
    @JsonProperty("Border")
    private Line border;

    /** Gets the area. */
    @JsonProperty("Area")
    private Area area;

    /** Represents the marker size in unit of points. Applies to line chart, scatter chart, or radar chart. */
    @JsonProperty("MarkerSize")
    private Integer markerSize;

    /** Represents the marker style. Applies to line chart, scatter chart, or radar chart. */
    @JsonProperty("MarkerStyle")
    private String markerStyle;

    public Line getBorder() { return border; }
    public Marker setBorder(Line border) { this.border = border; return this; }

    public Area getArea() { return area; }
    public Marker setArea(Area area) { this.area = area; return this; }

    public Integer getMarkerSize() { return markerSize; }
    public Marker setMarkerSize(Integer markerSize) { this.markerSize = markerSize; return this; }

    public String getMarkerStyle() { return markerStyle; }
    public Marker setMarkerStyle(String markerStyle) { this.markerStyle = markerStyle; return this; }

}

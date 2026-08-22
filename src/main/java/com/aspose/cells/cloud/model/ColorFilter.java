package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColorFilter — Color filter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColorFilter {
    /** Whether filter by the cell's fill color. */
    @JsonProperty("FilterByFillColor")
    private Boolean filterByFillColor;

    /** A property "Pattern" of type string with a getter and setter is defined. */
    @JsonProperty("Pattern")
    private String pattern;

    /** Gets or sets Color. */
    @JsonProperty("Color")
    private CellsColor color;

    /** Gets or sets ForegroundColorColor. */
    @JsonProperty("ForegroundColorColor")
    private CellsColor foregroundColorColor;

    /** Gets or sets BackgroundColor. */
    @JsonProperty("BackgroundColor")
    private CellsColor backgroundColor;

    public Boolean getFilterByFillColor() { return filterByFillColor; }
    public ColorFilter setFilterByFillColor(Boolean filterByFillColor) { this.filterByFillColor = filterByFillColor; return this; }

    public String getPattern() { return pattern; }
    public ColorFilter setPattern(String pattern) { this.pattern = pattern; return this; }

    public CellsColor getColor() { return color; }
    public ColorFilter setColor(CellsColor color) { this.color = color; return this; }

    public CellsColor getForegroundColorColor() { return foregroundColorColor; }
    public ColorFilter setForegroundColorColor(CellsColor foregroundColorColor) { this.foregroundColorColor = foregroundColorColor; return this; }

    public CellsColor getBackgroundColor() { return backgroundColor; }
    public ColorFilter setBackgroundColor(CellsColor backgroundColor) { this.backgroundColor = backgroundColor; return this; }

}

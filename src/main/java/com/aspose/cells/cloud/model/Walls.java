package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Walls — Encapsulates the object that represents the walls of a 3-D chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Walls extends Floor {
    /** Gets the x coordinate of the left-bottom corner of Wall center in units of 1/4000 of chart's width after calls Chart.Calculate() method. */
    @JsonProperty("CenterX")
    private Integer centerX;

    /** Gets the y coordinate of the left-bottom corner of Wall center in units of 1/4000 of chart's height after calls Chart.Calculate() method. */
    @JsonProperty("CenterY")
    private Integer centerY;

    /** Gets the depth front to back in units of 1/4000 of chart's width after calls Chart.Calculate() method. */
    @JsonProperty("Depth")
    private Integer depth;

    /** Gets the height of top to bottom in units of 1/4000 of chart's height after calls Chart.Calculate() method. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets the width of left to right in units of 1/4000 of chart's width after calls Chart.Calculate() method. */
    @JsonProperty("Width")
    private Integer width;

    /** Gets or sets Border. */
    @JsonProperty("Border")
    private Line border;

    /** Gets or sets BackgroundColor. */
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    /** Gets or sets FillFormat. */
    @JsonProperty("FillFormat")
    private FillFormat fillFormat;

    /** Gets or sets ForegroundColor. */
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    /** Gets or sets Format. */
    @JsonProperty("Format")
    private String format;

    /** Gets or sets InvertIfNegative. */
    @JsonProperty("InvertIfNegative")
    private Boolean invertIfNegative;

    /** Gets or sets Transparency. */
    @JsonProperty("Transparency")
    private Double transparency;

    public Integer getCenterX() { return centerX; }
    public Walls setCenterX(Integer centerX) { this.centerX = centerX; return this; }

    public Integer getCenterY() { return centerY; }
    public Walls setCenterY(Integer centerY) { this.centerY = centerY; return this; }

    public Integer getDepth() { return depth; }
    public Walls setDepth(Integer depth) { this.depth = depth; return this; }

    public Integer getHeight() { return height; }
    public Walls setHeight(Integer height) { this.height = height; return this; }

    public Integer getWidth() { return width; }
    public Walls setWidth(Integer width) { this.width = width; return this; }

    public Line getBorder() { return border; }
    public Walls setBorder(Line border) { this.border = border; return this; }

    public Color getBackgroundColor() { return backgroundColor; }
    public Walls setBackgroundColor(Color backgroundColor) { this.backgroundColor = backgroundColor; return this; }

    public FillFormat getFillFormat() { return fillFormat; }
    public Walls setFillFormat(FillFormat fillFormat) { this.fillFormat = fillFormat; return this; }

    public Color getForegroundColor() { return foregroundColor; }
    public Walls setForegroundColor(Color foregroundColor) { this.foregroundColor = foregroundColor; return this; }

    public String getFormat() { return format; }
    public Walls setFormat(String format) { this.format = format; return this; }

    public Boolean getInvertIfNegative() { return invertIfNegative; }
    public Walls setInvertIfNegative(Boolean invertIfNegative) { this.invertIfNegative = invertIfNegative; return this; }

    public Double getTransparency() { return transparency; }
    public Walls setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

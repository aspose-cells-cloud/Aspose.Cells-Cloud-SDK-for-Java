package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Floor — Encapsulates the object that represents the floor of a 3-D chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Floor extends Area {
    /** Gets or sets the border . */
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

    public Line getBorder() { return border; }
    public Floor setBorder(Line border) { this.border = border; return this; }

    public Color getBackgroundColor() { return backgroundColor; }
    public Floor setBackgroundColor(Color backgroundColor) { this.backgroundColor = backgroundColor; return this; }

    public FillFormat getFillFormat() { return fillFormat; }
    public Floor setFillFormat(FillFormat fillFormat) { this.fillFormat = fillFormat; return this; }

    public Color getForegroundColor() { return foregroundColor; }
    public Floor setForegroundColor(Color foregroundColor) { this.foregroundColor = foregroundColor; return this; }

    public String getFormat() { return format; }
    public Floor setFormat(String format) { this.format = format; return this; }

    public Boolean getInvertIfNegative() { return invertIfNegative; }
    public Floor setInvertIfNegative(Boolean invertIfNegative) { this.invertIfNegative = invertIfNegative; return this; }

    public Double getTransparency() { return transparency; }
    public Floor setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

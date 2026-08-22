package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Area — Encapsulates the object that represents an area format. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Area {
    /** Gets or sets the background  of the . */
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    /** Represents a  object that contains fill formatting properties for the specified chart or shape. */
    @JsonProperty("FillFormat")
    private FillFormat fillFormat;

    /** Gets or sets the foreground . */
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    /** This class has a property named "Format" of type string with both getter and setter methods. */
    @JsonProperty("Format")
    private String format;

    /** If the property is true and the value of chart point is a negative number, the foreground color and background color will be exchanged. */
    @JsonProperty("InvertIfNegative")
    private Boolean invertIfNegative;

    /** Returns or sets the degree of transparency of the area as a value from 0.0 (opaque) through 1.0 (clear). */
    @JsonProperty("Transparency")
    private Double transparency;

    public Color getBackgroundColor() { return backgroundColor; }
    public Area setBackgroundColor(Color backgroundColor) { this.backgroundColor = backgroundColor; return this; }

    public FillFormat getFillFormat() { return fillFormat; }
    public Area setFillFormat(FillFormat fillFormat) { this.fillFormat = fillFormat; return this; }

    public Color getForegroundColor() { return foregroundColor; }
    public Area setForegroundColor(Color foregroundColor) { this.foregroundColor = foregroundColor; return this; }

    public String getFormat() { return format; }
    public Area setFormat(String format) { this.format = format; return this; }

    public Boolean getInvertIfNegative() { return invertIfNegative; }
    public Area setInvertIfNegative(Boolean invertIfNegative) { this.invertIfNegative = invertIfNegative; return this; }

    public Double getTransparency() { return transparency; }
    public Area setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsColor — Represents all types of color. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsColor {
    /** Gets and sets the RGB color. */
    @JsonProperty("Color")
    private Color color;

    /** Gets and sets the color index in the color palette. Only applies of indexed color. */
    @JsonProperty("ColorIndex")
    private Integer colorIndex;

    /** Gets and set the color which should apply to cell or shape. */
    @JsonProperty("IsShapeColor")
    private Boolean isShapeColor;

    /** Set the tint of the shape color */
    @JsonProperty("tint")
    private Double tint;

    /** Gets and sets the color from a 32-bit ARGB value. */
    @JsonProperty("Argb")
    private Integer argb;

    /** Gets the theme color. Only applies for theme color type. */
    @JsonProperty("ThemeColor")
    private ThemeColor themeColor;

    /** The color type. */
    @JsonProperty("Type")
    private String type;

    /** Gets and sets transparency as a value from 0.0 (opaque) through 1.0 (clear). */
    @JsonProperty("Transparency")
    private Double transparency;

    public Color getColor() { return color; }
    public CellsColor setColor(Color color) { this.color = color; return this; }

    public Integer getColorIndex() { return colorIndex; }
    public CellsColor setColorIndex(Integer colorIndex) { this.colorIndex = colorIndex; return this; }

    public Boolean getIsShapeColor() { return isShapeColor; }
    public CellsColor setIsShapeColor(Boolean isShapeColor) { this.isShapeColor = isShapeColor; return this; }

    public Double getTint() { return tint; }
    public CellsColor setTint(Double tint) { this.tint = tint; return this; }

    public Integer getArgb() { return argb; }
    public CellsColor setArgb(Integer argb) { this.argb = argb; return this; }

    public ThemeColor getThemeColor() { return themeColor; }
    public CellsColor setThemeColor(ThemeColor themeColor) { this.themeColor = themeColor; return this; }

    public String getType() { return type; }
    public CellsColor setType(String type) { this.type = type; return this; }

    public Double getTransparency() { return transparency; }
    public CellsColor setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

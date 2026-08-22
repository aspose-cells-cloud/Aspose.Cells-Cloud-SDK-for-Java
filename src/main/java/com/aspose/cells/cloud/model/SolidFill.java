package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SolidFill — Encapsulates the object that represents solid fill format */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SolidFill {
    /** Gets or sets the . */
    @JsonProperty("Color")
    private Color color;

    /** Gets and sets the  object. */
    @JsonProperty("CellsColor")
    private CellsColor cellsColor;

    /** Returns or sets the degree of transparency of the area as a value from 0.0 (opaque) through 1.0 (clear). */
    @JsonProperty("Transparency")
    private Double transparency;

    public Color getColor() { return color; }
    public SolidFill setColor(Color color) { this.color = color; return this; }

    public CellsColor getCellsColor() { return cellsColor; }
    public SolidFill setCellsColor(CellsColor cellsColor) { this.cellsColor = cellsColor; return this; }

    public Double getTransparency() { return transparency; }
    public SolidFill setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

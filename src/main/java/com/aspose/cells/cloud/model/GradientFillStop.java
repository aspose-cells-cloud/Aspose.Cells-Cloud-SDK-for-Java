package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** GradientFillStop — Class summary: Understanding the various features and tools available in Adobe Illustrator to create dynamic and professional vector graphics, including shapes, text, brushes, gradients, and layers. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GradientFillStop {
    /** Color property of type DTO.Color that has a getter and a setter. */
    @JsonProperty("Color")
    private Color color;

    /** Gets or sets Position. */
    @JsonProperty("Position")
    private Double position;

    /** Gets or sets Transparency. */
    @JsonProperty("Transparency")
    private Double transparency;

    public Color getColor() { return color; }
    public GradientFillStop setColor(Color color) { this.color = color; return this; }

    public Double getPosition() { return position; }
    public GradientFillStop setPosition(Double position) { this.position = position; return this; }

    public Double getTransparency() { return transparency; }
    public GradientFillStop setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

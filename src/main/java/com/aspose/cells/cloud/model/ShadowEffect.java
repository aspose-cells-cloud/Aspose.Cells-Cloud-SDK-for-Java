package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShadowEffect — This class specifies the shadow effect of the chart element or shape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShadowEffect {
    /** Gets and sets the lighting angle. Range from 0 to 359.9 degrees. */
    @JsonProperty("Angle")
    private Double angle;

    /** Gets and sets the blur of the shadow. Range from 0 to 100 points. */
    @JsonProperty("Blur")
    private Double blur;

    /** Gets and sets the color of the shadow. */
    @JsonProperty("Color")
    private CellsColor color;

    /** Gets and sets the distance of the shadow. Range from 0 to 200 points. */
    @JsonProperty("Distance")
    private Double distance;

    /** Gets and sets the preset shadow type of the shadow. */
    @JsonProperty("PresetType")
    private String presetType;

    /** Gets and sets the size of the shadow. Range from 0 to 2.0. Meaningless in inner shadow. */
    @JsonProperty("Size")
    private Double size;

    /** Gets and sets the degree of transparency of the shadow. Range from 0.0 (opaque) to 1.0 (clear). */
    @JsonProperty("Transparency")
    private Double transparency;

    public Double getAngle() { return angle; }
    public ShadowEffect setAngle(Double angle) { this.angle = angle; return this; }

    public Double getBlur() { return blur; }
    public ShadowEffect setBlur(Double blur) { this.blur = blur; return this; }

    public CellsColor getColor() { return color; }
    public ShadowEffect setColor(CellsColor color) { this.color = color; return this; }

    public Double getDistance() { return distance; }
    public ShadowEffect setDistance(Double distance) { this.distance = distance; return this; }

    public String getPresetType() { return presetType; }
    public ShadowEffect setPresetType(String presetType) { this.presetType = presetType; return this; }

    public Double getSize() { return size; }
    public ShadowEffect setSize(Double size) { this.size = size; return this; }

    public Double getTransparency() { return transparency; }
    public ShadowEffect setTransparency(Double transparency) { this.transparency = transparency; return this; }

}

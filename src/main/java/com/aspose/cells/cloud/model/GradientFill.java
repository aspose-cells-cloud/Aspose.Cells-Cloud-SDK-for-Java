package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** GradientFill — Represents the gradient fill. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GradientFill {
    /** Gets the gradient fill type. */
    @JsonProperty("FillType")
    private String fillType;

    /** Gets the gradient direction type. */
    @JsonProperty("DirectionType")
    private String directionType;

    /** The angle of linear fill. */
    @JsonProperty("Angle")
    private Double angle;

    /** Represents the gradient stop collection. */
    @JsonProperty("GradientStops")
    private List<GradientFillStop> gradientStops;

    public String getFillType() { return fillType; }
    public GradientFill setFillType(String fillType) { this.fillType = fillType; return this; }

    public String getDirectionType() { return directionType; }
    public GradientFill setDirectionType(String directionType) { this.directionType = directionType; return this; }

    public Double getAngle() { return angle; }
    public GradientFill setAngle(Double angle) { this.angle = angle; return this; }

    public List<GradientFillStop> getGradientStops() { return gradientStops; }
    public GradientFill setGradientStops(List<GradientFillStop> gradientStops) { this.gradientStops = gradientStops; return this; }

}

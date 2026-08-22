package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Line — Encapsulates the object that represents the line format. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Line {
    /** Specifies the length of the arrowhead for the begin of a line. */
    @JsonProperty("BeginArrowLength")
    private String beginArrowLength;

    /** Specifies the width of the arrowhead for the begin of a line. */
    @JsonProperty("BeginArrowWidth")
    private String beginArrowWidth;

    /** Specifies an arrowhead for the begin of a line. */
    @JsonProperty("BeginType")
    private String beginType;

    /** Specifies the ending caps. */
    @JsonProperty("CapType")
    private String capType;

    /** Represents the  of the line. */
    @JsonProperty("Color")
    private Color color;

    /** Specifies the compound line type */
    @JsonProperty("CompoundType")
    private String compoundType;

    /** Specifies the dash line type */
    @JsonProperty("DashType")
    private String dashType;

    /** Specifies the length of the arrowhead for the end of a line. */
    @JsonProperty("EndArrowLength")
    private String endArrowLength;

    /** Specifies the width of the arrowhead for the end of a line. */
    @JsonProperty("EndArrowWidth")
    private String endArrowWidth;

    /** Specifies an arrowhead for the end of a line. */
    @JsonProperty("EndType")
    private String endType;

    /** Represents gradient fill. */
    @JsonProperty("GradientFill")
    private GradientFill gradientFill;

    /** Indicates whether this line style is auto assigned. */
    @JsonProperty("IsAuto")
    private Boolean isAuto;

    /** Indicates whether the color of line is automatic assigned. */
    @JsonProperty("IsAutomaticColor")
    private Boolean isAutomaticColor;

    /** Represents whether the line is visible. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** Specifies the joining caps. */
    @JsonProperty("JoinType")
    private String joinType;

    /** Represents the style of the line. */
    @JsonProperty("Style")
    private String style;

    /** Returns or sets the degree of transparency of the line as a value from 0.0 (opaque) through 1.0 (clear). */
    @JsonProperty("Transparency")
    private Double transparency;

    /** Gets or sets the  of the line. */
    @JsonProperty("Weight")
    private String weight;

    /** Gets or sets the weight of the line in unit of points. */
    @JsonProperty("WeightPt")
    private Double weightPt;

    public String getBeginArrowLength() { return beginArrowLength; }
    public Line setBeginArrowLength(String beginArrowLength) { this.beginArrowLength = beginArrowLength; return this; }

    public String getBeginArrowWidth() { return beginArrowWidth; }
    public Line setBeginArrowWidth(String beginArrowWidth) { this.beginArrowWidth = beginArrowWidth; return this; }

    public String getBeginType() { return beginType; }
    public Line setBeginType(String beginType) { this.beginType = beginType; return this; }

    public String getCapType() { return capType; }
    public Line setCapType(String capType) { this.capType = capType; return this; }

    public Color getColor() { return color; }
    public Line setColor(Color color) { this.color = color; return this; }

    public String getCompoundType() { return compoundType; }
    public Line setCompoundType(String compoundType) { this.compoundType = compoundType; return this; }

    public String getDashType() { return dashType; }
    public Line setDashType(String dashType) { this.dashType = dashType; return this; }

    public String getEndArrowLength() { return endArrowLength; }
    public Line setEndArrowLength(String endArrowLength) { this.endArrowLength = endArrowLength; return this; }

    public String getEndArrowWidth() { return endArrowWidth; }
    public Line setEndArrowWidth(String endArrowWidth) { this.endArrowWidth = endArrowWidth; return this; }

    public String getEndType() { return endType; }
    public Line setEndType(String endType) { this.endType = endType; return this; }

    public GradientFill getGradientFill() { return gradientFill; }
    public Line setGradientFill(GradientFill gradientFill) { this.gradientFill = gradientFill; return this; }

    public Boolean getIsAuto() { return isAuto; }
    public Line setIsAuto(Boolean isAuto) { this.isAuto = isAuto; return this; }

    public Boolean getIsAutomaticColor() { return isAutomaticColor; }
    public Line setIsAutomaticColor(Boolean isAutomaticColor) { this.isAutomaticColor = isAutomaticColor; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public Line setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public String getJoinType() { return joinType; }
    public Line setJoinType(String joinType) { this.joinType = joinType; return this; }

    public String getStyle() { return style; }
    public Line setStyle(String style) { this.style = style; return this; }

    public Double getTransparency() { return transparency; }
    public Line setTransparency(Double transparency) { this.transparency = transparency; return this; }

    public String getWeight() { return weight; }
    public Line setWeight(String weight) { this.weight = weight; return this; }

    public Double getWeightPt() { return weightPt; }
    public Line setWeightPt(Double weightPt) { this.weightPt = weightPt; return this; }

}

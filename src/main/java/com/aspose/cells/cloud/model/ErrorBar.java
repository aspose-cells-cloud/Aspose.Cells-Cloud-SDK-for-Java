package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ErrorBar — Represents error bar of data series. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorBar extends Line {
    /** A property named "Link" of type "Link" that can be accessed and modified. */
    @JsonProperty("Link")
    private Link link;

    /** Represents amount of error bar. The amount must be greater than or equal to zero. */
    @JsonProperty("Amount")
    private Double amount;

    /** Represents error bar display type. */
    @JsonProperty("DisplayType")
    private String displayType;

    /** Represents negative error amount when error bar type is Custom. */
    @JsonProperty("MinusValue")
    private String minusValue;

    /** Represents positive error amount when error bar type is Custom. */
    @JsonProperty("PlusValue")
    private String plusValue;

    /** Indicates if formatting error bars with a T-top. */
    @JsonProperty("ShowMarkerTTop")
    private Boolean showMarkerTTop;

    /** Represents error bar amount type. */
    @JsonProperty("Type")
    private String type;

    /** Gets or sets BeginArrowLength. */
    @JsonProperty("BeginArrowLength")
    private String beginArrowLength;

    /** Gets or sets BeginArrowWidth. */
    @JsonProperty("BeginArrowWidth")
    private String beginArrowWidth;

    /** Gets or sets BeginType. */
    @JsonProperty("BeginType")
    private String beginType;

    /** Gets or sets CapType. */
    @JsonProperty("CapType")
    private String capType;

    /** Gets or sets Color. */
    @JsonProperty("Color")
    private Color color;

    /** Gets or sets CompoundType. */
    @JsonProperty("CompoundType")
    private String compoundType;

    /** Gets or sets DashType. */
    @JsonProperty("DashType")
    private String dashType;

    /** Gets or sets EndArrowLength. */
    @JsonProperty("EndArrowLength")
    private String endArrowLength;

    /** Gets or sets EndArrowWidth. */
    @JsonProperty("EndArrowWidth")
    private String endArrowWidth;

    /** Gets or sets EndType. */
    @JsonProperty("EndType")
    private String endType;

    /** Gets or sets GradientFill. */
    @JsonProperty("GradientFill")
    private GradientFill gradientFill;

    /** Gets or sets IsAuto. */
    @JsonProperty("IsAuto")
    private Boolean isAuto;

    /** Gets or sets IsAutomaticColor. */
    @JsonProperty("IsAutomaticColor")
    private Boolean isAutomaticColor;

    /** Gets or sets IsVisible. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** Gets or sets JoinType. */
    @JsonProperty("JoinType")
    private String joinType;

    /** Gets or sets Style. */
    @JsonProperty("Style")
    private String style;

    /** Gets or sets Transparency. */
    @JsonProperty("Transparency")
    private Double transparency;

    /** Gets or sets Weight. */
    @JsonProperty("Weight")
    private String weight;

    /** Gets or sets WeightPt. */
    @JsonProperty("WeightPt")
    private Double weightPt;

    public Link getLink() { return link; }
    public ErrorBar setLink(Link link) { this.link = link; return this; }

    public Double getAmount() { return amount; }
    public ErrorBar setAmount(Double amount) { this.amount = amount; return this; }

    public String getDisplayType() { return displayType; }
    public ErrorBar setDisplayType(String displayType) { this.displayType = displayType; return this; }

    public String getMinusValue() { return minusValue; }
    public ErrorBar setMinusValue(String minusValue) { this.minusValue = minusValue; return this; }

    public String getPlusValue() { return plusValue; }
    public ErrorBar setPlusValue(String plusValue) { this.plusValue = plusValue; return this; }

    public Boolean getShowMarkerTTop() { return showMarkerTTop; }
    public ErrorBar setShowMarkerTTop(Boolean showMarkerTTop) { this.showMarkerTTop = showMarkerTTop; return this; }

    public String getType() { return type; }
    public ErrorBar setType(String type) { this.type = type; return this; }

    public String getBeginArrowLength() { return beginArrowLength; }
    public ErrorBar setBeginArrowLength(String beginArrowLength) { this.beginArrowLength = beginArrowLength; return this; }

    public String getBeginArrowWidth() { return beginArrowWidth; }
    public ErrorBar setBeginArrowWidth(String beginArrowWidth) { this.beginArrowWidth = beginArrowWidth; return this; }

    public String getBeginType() { return beginType; }
    public ErrorBar setBeginType(String beginType) { this.beginType = beginType; return this; }

    public String getCapType() { return capType; }
    public ErrorBar setCapType(String capType) { this.capType = capType; return this; }

    public Color getColor() { return color; }
    public ErrorBar setColor(Color color) { this.color = color; return this; }

    public String getCompoundType() { return compoundType; }
    public ErrorBar setCompoundType(String compoundType) { this.compoundType = compoundType; return this; }

    public String getDashType() { return dashType; }
    public ErrorBar setDashType(String dashType) { this.dashType = dashType; return this; }

    public String getEndArrowLength() { return endArrowLength; }
    public ErrorBar setEndArrowLength(String endArrowLength) { this.endArrowLength = endArrowLength; return this; }

    public String getEndArrowWidth() { return endArrowWidth; }
    public ErrorBar setEndArrowWidth(String endArrowWidth) { this.endArrowWidth = endArrowWidth; return this; }

    public String getEndType() { return endType; }
    public ErrorBar setEndType(String endType) { this.endType = endType; return this; }

    public GradientFill getGradientFill() { return gradientFill; }
    public ErrorBar setGradientFill(GradientFill gradientFill) { this.gradientFill = gradientFill; return this; }

    public Boolean getIsAuto() { return isAuto; }
    public ErrorBar setIsAuto(Boolean isAuto) { this.isAuto = isAuto; return this; }

    public Boolean getIsAutomaticColor() { return isAutomaticColor; }
    public ErrorBar setIsAutomaticColor(Boolean isAutomaticColor) { this.isAutomaticColor = isAutomaticColor; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public ErrorBar setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public String getJoinType() { return joinType; }
    public ErrorBar setJoinType(String joinType) { this.joinType = joinType; return this; }

    public String getStyle() { return style; }
    public ErrorBar setStyle(String style) { this.style = style; return this; }

    public Double getTransparency() { return transparency; }
    public ErrorBar setTransparency(Double transparency) { this.transparency = transparency; return this; }

    public String getWeight() { return weight; }
    public ErrorBar setWeight(String weight) { this.weight = weight; return this; }

    public Double getWeightPt() { return weightPt; }
    public ErrorBar setWeightPt(Double weightPt) { this.weightPt = weightPt; return this; }

}

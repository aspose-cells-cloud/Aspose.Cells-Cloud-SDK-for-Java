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


    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setBeginArrowLength(String beginArrowLength) { return (ErrorBar) super.setBeginArrowLength(beginArrowLength); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setBeginArrowWidth(String beginArrowWidth) { return (ErrorBar) super.setBeginArrowWidth(beginArrowWidth); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setBeginType(String beginType) { return (ErrorBar) super.setBeginType(beginType); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setCapType(String capType) { return (ErrorBar) super.setCapType(capType); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setColor(Color color) { return (ErrorBar) super.setColor(color); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setCompoundType(String compoundType) { return (ErrorBar) super.setCompoundType(compoundType); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setDashType(String dashType) { return (ErrorBar) super.setDashType(dashType); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setEndArrowLength(String endArrowLength) { return (ErrorBar) super.setEndArrowLength(endArrowLength); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setEndArrowWidth(String endArrowWidth) { return (ErrorBar) super.setEndArrowWidth(endArrowWidth); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setEndType(String endType) { return (ErrorBar) super.setEndType(endType); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setGradientFill(GradientFill gradientFill) { return (ErrorBar) super.setGradientFill(gradientFill); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setIsAuto(Boolean isAuto) { return (ErrorBar) super.setIsAuto(isAuto); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setIsAutomaticColor(Boolean isAutomaticColor) { return (ErrorBar) super.setIsAutomaticColor(isAutomaticColor); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setIsVisible(Boolean isVisible) { return (ErrorBar) super.setIsVisible(isVisible); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setJoinType(String joinType) { return (ErrorBar) super.setJoinType(joinType); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setStyle(String style) { return (ErrorBar) super.setStyle(style); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setTransparency(Double transparency) { return (ErrorBar) super.setTransparency(transparency); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setWeight(String weight) { return (ErrorBar) super.setWeight(weight); }
    /** Covariant override: keeps fluent chains returning ErrorBar. */
    @Override public ErrorBar setWeightPt(Double weightPt) { return (ErrorBar) super.setWeightPt(weightPt); }

}

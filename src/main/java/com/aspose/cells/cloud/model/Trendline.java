package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trendline — Represents a trendline in a chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Trendline extends Line {
    /** The class has a property named "link" of type "Link" that can be accessed and modified. */
    @JsonProperty("link")
    private Link link;

    /** Returns or sets the number of periods (or units on a scatter chart) that the trendline extends backward. The number of periods must be greater than or equal to zero. If the chart type is column ,the number of periods must be between 0 and 0.5 */
    @JsonProperty("Backward")
    private Double backward;

    /** Represents the DataLabels object for the specified series. */
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    /** Represents if the equation for the trendline is displayed on the chart (in the same data label as the R-squared value). Setting this property to True automatically turns on data labels. */
    @JsonProperty("DisplayEquation")
    private Boolean displayEquation;

    /** Represents if the R-squared value of the trendline is displayed on the chart (in the same data label as the equation). Setting this property to True automatically turns on data labels. */
    @JsonProperty("DisplayRSquared")
    private Boolean displayRSquared;

    /** Returns or sets the number of periods (or units on a scatter chart) that the trendline extends forward. The number of periods must be greater than or equal to zero. */
    @JsonProperty("Forward")
    private Double forward;

    /** Returns or sets the point where the trendline crosses the value axis. */
    @JsonProperty("Intercept")
    private Double intercept;

    /** Returns if Microsoft Excel automatically determines the name of the trendline. */
    @JsonProperty("IsNameAuto")
    private Boolean isNameAuto;

    /** Gets the legend entry according to this trendline */
    @JsonProperty("LegendEntry")
    private LegendEntry legendEntry;

    /** Returns the name of the trendline. */
    @JsonProperty("Name")
    private String name;

    /** Returns or sets the trendline order (an integer greater than 1) when the trendline type is Polynomial. The order must be between 2 and 6. */
    @JsonProperty("Order")
    private Integer order;

    /** Returns or sets the period for the moving-average trendline. */
    @JsonProperty("Period")
    private Integer period;

    /** Returns the trendline type. */
    @JsonProperty("Type")
    private String type;

    public Link getLink() { return link; }
    public Trendline setLink(Link link) { this.link = link; return this; }

    public Double getBackward() { return backward; }
    public Trendline setBackward(Double backward) { this.backward = backward; return this; }

    public DataLabels getDataLabels() { return dataLabels; }
    public Trendline setDataLabels(DataLabels dataLabels) { this.dataLabels = dataLabels; return this; }

    public Boolean getDisplayEquation() { return displayEquation; }
    public Trendline setDisplayEquation(Boolean displayEquation) { this.displayEquation = displayEquation; return this; }

    public Boolean getDisplayRSquared() { return displayRSquared; }
    public Trendline setDisplayRSquared(Boolean displayRSquared) { this.displayRSquared = displayRSquared; return this; }

    public Double getForward() { return forward; }
    public Trendline setForward(Double forward) { this.forward = forward; return this; }

    public Double getIntercept() { return intercept; }
    public Trendline setIntercept(Double intercept) { this.intercept = intercept; return this; }

    public Boolean getIsNameAuto() { return isNameAuto; }
    public Trendline setIsNameAuto(Boolean isNameAuto) { this.isNameAuto = isNameAuto; return this; }

    public LegendEntry getLegendEntry() { return legendEntry; }
    public Trendline setLegendEntry(LegendEntry legendEntry) { this.legendEntry = legendEntry; return this; }

    public String getName() { return name; }
    public Trendline setName(String name) { this.name = name; return this; }

    public Integer getOrder() { return order; }
    public Trendline setOrder(Integer order) { this.order = order; return this; }

    public Integer getPeriod() { return period; }
    public Trendline setPeriod(Integer period) { this.period = period; return this; }

    public String getType() { return type; }
    public Trendline setType(String type) { this.type = type; return this; }


    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setBeginArrowLength(String beginArrowLength) { return (Trendline) super.setBeginArrowLength(beginArrowLength); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setBeginArrowWidth(String beginArrowWidth) { return (Trendline) super.setBeginArrowWidth(beginArrowWidth); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setBeginType(String beginType) { return (Trendline) super.setBeginType(beginType); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setCapType(String capType) { return (Trendline) super.setCapType(capType); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setColor(Color color) { return (Trendline) super.setColor(color); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setCompoundType(String compoundType) { return (Trendline) super.setCompoundType(compoundType); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setDashType(String dashType) { return (Trendline) super.setDashType(dashType); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setEndArrowLength(String endArrowLength) { return (Trendline) super.setEndArrowLength(endArrowLength); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setEndArrowWidth(String endArrowWidth) { return (Trendline) super.setEndArrowWidth(endArrowWidth); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setEndType(String endType) { return (Trendline) super.setEndType(endType); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setGradientFill(GradientFill gradientFill) { return (Trendline) super.setGradientFill(gradientFill); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setIsAuto(Boolean isAuto) { return (Trendline) super.setIsAuto(isAuto); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setIsAutomaticColor(Boolean isAutomaticColor) { return (Trendline) super.setIsAutomaticColor(isAutomaticColor); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setIsVisible(Boolean isVisible) { return (Trendline) super.setIsVisible(isVisible); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setJoinType(String joinType) { return (Trendline) super.setJoinType(joinType); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setStyle(String style) { return (Trendline) super.setStyle(style); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setTransparency(Double transparency) { return (Trendline) super.setTransparency(transparency); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setWeight(String weight) { return (Trendline) super.setWeight(weight); }
    /** Covariant override: keeps fluent chains returning Trendline. */
    @Override public Trendline setWeightPt(Double weightPt) { return (Trendline) super.setWeightPt(weightPt); }

}

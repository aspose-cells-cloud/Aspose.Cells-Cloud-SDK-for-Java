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

    public String getBeginArrowLength() { return beginArrowLength; }
    public Trendline setBeginArrowLength(String beginArrowLength) { this.beginArrowLength = beginArrowLength; return this; }

    public String getBeginArrowWidth() { return beginArrowWidth; }
    public Trendline setBeginArrowWidth(String beginArrowWidth) { this.beginArrowWidth = beginArrowWidth; return this; }

    public String getBeginType() { return beginType; }
    public Trendline setBeginType(String beginType) { this.beginType = beginType; return this; }

    public String getCapType() { return capType; }
    public Trendline setCapType(String capType) { this.capType = capType; return this; }

    public Color getColor() { return color; }
    public Trendline setColor(Color color) { this.color = color; return this; }

    public String getCompoundType() { return compoundType; }
    public Trendline setCompoundType(String compoundType) { this.compoundType = compoundType; return this; }

    public String getDashType() { return dashType; }
    public Trendline setDashType(String dashType) { this.dashType = dashType; return this; }

    public String getEndArrowLength() { return endArrowLength; }
    public Trendline setEndArrowLength(String endArrowLength) { this.endArrowLength = endArrowLength; return this; }

    public String getEndArrowWidth() { return endArrowWidth; }
    public Trendline setEndArrowWidth(String endArrowWidth) { this.endArrowWidth = endArrowWidth; return this; }

    public String getEndType() { return endType; }
    public Trendline setEndType(String endType) { this.endType = endType; return this; }

    public GradientFill getGradientFill() { return gradientFill; }
    public Trendline setGradientFill(GradientFill gradientFill) { this.gradientFill = gradientFill; return this; }

    public Boolean getIsAuto() { return isAuto; }
    public Trendline setIsAuto(Boolean isAuto) { this.isAuto = isAuto; return this; }

    public Boolean getIsAutomaticColor() { return isAutomaticColor; }
    public Trendline setIsAutomaticColor(Boolean isAutomaticColor) { this.isAutomaticColor = isAutomaticColor; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public Trendline setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public String getJoinType() { return joinType; }
    public Trendline setJoinType(String joinType) { this.joinType = joinType; return this; }

    public String getStyle() { return style; }
    public Trendline setStyle(String style) { this.style = style; return this; }

    public Double getTransparency() { return transparency; }
    public Trendline setTransparency(Double transparency) { this.transparency = transparency; return this; }

    public String getWeight() { return weight; }
    public Trendline setWeight(String weight) { this.weight = weight; return this; }

    public Double getWeightPt() { return weightPt; }
    public Trendline setWeightPt(Double weightPt) { this.weightPt = weightPt; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Axis — Encapsulates the object that represents an axis of chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Axis extends LinkElement {
    /** Gets the . */
    @JsonProperty("Area")
    private Area area;

    /** Represents if the value axis crosses the category axis between categories. */
    @JsonProperty("AxisBetweenCategories")
    private Boolean axisBetweenCategories;

    /** Gets the appearance of an Axis. */
    @JsonProperty("AxisLine")
    private Line axisLine;

    /** Represents the base unit scale for the category axis. */
    @JsonProperty("BaseUnitScale")
    private String baseUnitScale;

    /** Represents the category axis type. */
    @JsonProperty("CategoryType")
    private String categoryType;

    /** Represents the point on the value axis where the category axis crosses it. */
    @JsonProperty("CrossAt")
    private Double crossAt;

    /** Represents the  on the specified axis where the other axis crosses. */
    @JsonProperty("CrossType")
    private String crossType;

    /** Represents the unit label for the specified axis. */
    @JsonProperty("DisplayUnit")
    private String displayUnit;

    /** Represents a unit label on an axis in the specified chart. Unit labels are useful for charting large values— for example, in the millions or billions. */
    @JsonProperty("DisplayUnitLabel")
    private DisplayUnitLabel displayUnitLabel;

    /** Indicates whether the labels shall be shown as multi level. */
    @JsonProperty("HasMultiLevelLabels")
    private Boolean hasMultiLevelLabels;

    /** Indicates whether the major unit of the axis is automatically assigned. */
    @JsonProperty("IsAutomaticMajorUnit")
    private Boolean isAutomaticMajorUnit;

    /** Indicates whether the max value is automatically assigned. */
    @JsonProperty("IsAutomaticMaxValue")
    private Boolean isAutomaticMaxValue;

    /** Indicates whether the minor unit of the axis is automatically assigned. */
    @JsonProperty("IsAutomaticMinorUnit")
    private Boolean isAutomaticMinorUnit;

    /** Indicates whether the min value is automatically assigned. */
    @JsonProperty("IsAutomaticMinValue")
    private Boolean isAutomaticMinValue;

    /** Represents if the display unit label is shown on the specified axis. */
    @JsonProperty("IsDisplayUnitLabelShown")
    private Boolean isDisplayUnitLabelShown;

    /** Represents if the value axis scale type is logarithmic or not. */
    @JsonProperty("IsLogarithmic")
    private Boolean isLogarithmic;

    /** Represents if Microsoft Excel plots data points from last to first. */
    @JsonProperty("IsPlotOrderReversed")
    private Boolean isPlotOrderReversed;

    /** Represents if the axis is visible. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** Represents the logarithmic base. Default value is 10.Only applies for Excel2007. */
    @JsonProperty("LogBase")
    private Double logBase;

    /** Represents major gridlines on a chart axis. */
    @JsonProperty("MajorGridLines")
    private Line majorGridLines;

    /** Represents the type of major tick mark for the specified axis. */
    @JsonProperty("MajorTickMark")
    private String majorTickMark;

    /** Represents the major units for the axis. */
    @JsonProperty("MajorUnit")
    private Double majorUnit;

    /** Represents the major unit scale for the category axis. */
    @JsonProperty("MajorUnitScale")
    private String majorUnitScale;

    /** Represents the maximum value on the value axis. */
    @JsonProperty("MaxValue")
    private Double maxValue;

    /** Represents minor gridlines on a chart axis. */
    @JsonProperty("MinorGridLines")
    private Line minorGridLines;

    /** Represents the type of minor tick mark for the specified axis. */
    @JsonProperty("MinorTickMark")
    private String minorTickMark;

    /** Represents the minor units for the axis. */
    @JsonProperty("MinorUnit")
    private Double minorUnit;

    /** Represents the major unit scale for the category axis. */
    @JsonProperty("MinorUnitScale")
    private String minorUnitScale;

    /** Represents the minimum value on the value axis. */
    @JsonProperty("MinValue")
    private Double minValue;

    /** Represents the position of tick-mark labels on the specified axis. */
    @JsonProperty("TickLabelPosition")
    private String tickLabelPosition;

    /** Returns a  object that represents the tick-mark labels for the specified axis. */
    @JsonProperty("TickLabels")
    private TickLabels tickLabels;

    /** Represents the number of categories or series between tick-mark labels. Applies only to category and series axes. */
    @JsonProperty("TickLabelSpacing")
    private Integer tickLabelSpacing;

    /** Returns or sets the number of categories or series between tick marks. Applies only to category and series axes. */
    @JsonProperty("TickMarkSpacing")
    private Integer tickMarkSpacing;

    /** Gets the axis' title. */
    @JsonProperty("Title")
    private Title title;

    public Area getArea() { return area; }
    public Axis setArea(Area area) { this.area = area; return this; }

    public Boolean getAxisBetweenCategories() { return axisBetweenCategories; }
    public Axis setAxisBetweenCategories(Boolean axisBetweenCategories) { this.axisBetweenCategories = axisBetweenCategories; return this; }

    public Line getAxisLine() { return axisLine; }
    public Axis setAxisLine(Line axisLine) { this.axisLine = axisLine; return this; }

    public String getBaseUnitScale() { return baseUnitScale; }
    public Axis setBaseUnitScale(String baseUnitScale) { this.baseUnitScale = baseUnitScale; return this; }

    public String getCategoryType() { return categoryType; }
    public Axis setCategoryType(String categoryType) { this.categoryType = categoryType; return this; }

    public Double getCrossAt() { return crossAt; }
    public Axis setCrossAt(Double crossAt) { this.crossAt = crossAt; return this; }

    public String getCrossType() { return crossType; }
    public Axis setCrossType(String crossType) { this.crossType = crossType; return this; }

    public String getDisplayUnit() { return displayUnit; }
    public Axis setDisplayUnit(String displayUnit) { this.displayUnit = displayUnit; return this; }

    public DisplayUnitLabel getDisplayUnitLabel() { return displayUnitLabel; }
    public Axis setDisplayUnitLabel(DisplayUnitLabel displayUnitLabel) { this.displayUnitLabel = displayUnitLabel; return this; }

    public Boolean getHasMultiLevelLabels() { return hasMultiLevelLabels; }
    public Axis setHasMultiLevelLabels(Boolean hasMultiLevelLabels) { this.hasMultiLevelLabels = hasMultiLevelLabels; return this; }

    public Boolean getIsAutomaticMajorUnit() { return isAutomaticMajorUnit; }
    public Axis setIsAutomaticMajorUnit(Boolean isAutomaticMajorUnit) { this.isAutomaticMajorUnit = isAutomaticMajorUnit; return this; }

    public Boolean getIsAutomaticMaxValue() { return isAutomaticMaxValue; }
    public Axis setIsAutomaticMaxValue(Boolean isAutomaticMaxValue) { this.isAutomaticMaxValue = isAutomaticMaxValue; return this; }

    public Boolean getIsAutomaticMinorUnit() { return isAutomaticMinorUnit; }
    public Axis setIsAutomaticMinorUnit(Boolean isAutomaticMinorUnit) { this.isAutomaticMinorUnit = isAutomaticMinorUnit; return this; }

    public Boolean getIsAutomaticMinValue() { return isAutomaticMinValue; }
    public Axis setIsAutomaticMinValue(Boolean isAutomaticMinValue) { this.isAutomaticMinValue = isAutomaticMinValue; return this; }

    public Boolean getIsDisplayUnitLabelShown() { return isDisplayUnitLabelShown; }
    public Axis setIsDisplayUnitLabelShown(Boolean isDisplayUnitLabelShown) { this.isDisplayUnitLabelShown = isDisplayUnitLabelShown; return this; }

    public Boolean getIsLogarithmic() { return isLogarithmic; }
    public Axis setIsLogarithmic(Boolean isLogarithmic) { this.isLogarithmic = isLogarithmic; return this; }

    public Boolean getIsPlotOrderReversed() { return isPlotOrderReversed; }
    public Axis setIsPlotOrderReversed(Boolean isPlotOrderReversed) { this.isPlotOrderReversed = isPlotOrderReversed; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public Axis setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public Double getLogBase() { return logBase; }
    public Axis setLogBase(Double logBase) { this.logBase = logBase; return this; }

    public Line getMajorGridLines() { return majorGridLines; }
    public Axis setMajorGridLines(Line majorGridLines) { this.majorGridLines = majorGridLines; return this; }

    public String getMajorTickMark() { return majorTickMark; }
    public Axis setMajorTickMark(String majorTickMark) { this.majorTickMark = majorTickMark; return this; }

    public Double getMajorUnit() { return majorUnit; }
    public Axis setMajorUnit(Double majorUnit) { this.majorUnit = majorUnit; return this; }

    public String getMajorUnitScale() { return majorUnitScale; }
    public Axis setMajorUnitScale(String majorUnitScale) { this.majorUnitScale = majorUnitScale; return this; }

    public Double getMaxValue() { return maxValue; }
    public Axis setMaxValue(Double maxValue) { this.maxValue = maxValue; return this; }

    public Line getMinorGridLines() { return minorGridLines; }
    public Axis setMinorGridLines(Line minorGridLines) { this.minorGridLines = minorGridLines; return this; }

    public String getMinorTickMark() { return minorTickMark; }
    public Axis setMinorTickMark(String minorTickMark) { this.minorTickMark = minorTickMark; return this; }

    public Double getMinorUnit() { return minorUnit; }
    public Axis setMinorUnit(Double minorUnit) { this.minorUnit = minorUnit; return this; }

    public String getMinorUnitScale() { return minorUnitScale; }
    public Axis setMinorUnitScale(String minorUnitScale) { this.minorUnitScale = minorUnitScale; return this; }

    public Double getMinValue() { return minValue; }
    public Axis setMinValue(Double minValue) { this.minValue = minValue; return this; }

    public String getTickLabelPosition() { return tickLabelPosition; }
    public Axis setTickLabelPosition(String tickLabelPosition) { this.tickLabelPosition = tickLabelPosition; return this; }

    public TickLabels getTickLabels() { return tickLabels; }
    public Axis setTickLabels(TickLabels tickLabels) { this.tickLabels = tickLabels; return this; }

    public Integer getTickLabelSpacing() { return tickLabelSpacing; }
    public Axis setTickLabelSpacing(Integer tickLabelSpacing) { this.tickLabelSpacing = tickLabelSpacing; return this; }

    public Integer getTickMarkSpacing() { return tickMarkSpacing; }
    public Axis setTickMarkSpacing(Integer tickMarkSpacing) { this.tickMarkSpacing = tickMarkSpacing; return this; }

    public Title getTitle() { return title; }
    public Axis setTitle(Title title) { this.title = title; return this; }


    /** Covariant override: keeps fluent chains returning Axis. */
    @Override public Axis setLink(Link link) { return (Axis) super.setLink(link); }

}

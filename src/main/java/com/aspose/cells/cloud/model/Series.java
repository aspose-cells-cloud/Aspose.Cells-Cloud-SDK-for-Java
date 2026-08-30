package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Series — Encapsulates the object that represents a single data series in a chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Series extends LinkElement {
    /** Represents the background area of Series object. */
    @JsonProperty("Area")
    private Area area;

    /** Gets or sets the 3D shape type used with the 3-D bar or column chart. */
    @JsonProperty("Bar3DShapeType")
    private String bar3DShapeType;

    /** Represents border of Series object. */
    @JsonProperty("Border")
    private Line border;

    /** Gets or sets the scale factor for bubbles in the specified chart group. It can be an integer value from 0 (zero) to 300, corresponding to a percentage of the default size. Applies only to bubble charts. */
    @JsonProperty("BubbleScale")
    private Integer bubbleScale;

    /** Gets or sets the bubble sizes values of the chart series. */
    @JsonProperty("BubbleSizes")
    private String bubbleSizes;

    /** Gets the number of the data values. */
    @JsonProperty("CountOfDataValues")
    private Integer countOfDataValues;

    /** Represents the DataLabels object for the specified ASeries. */
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    /** Gets the series's name that displays on the chart graph. */
    @JsonProperty("DisplayName")
    private String displayName;

    /** Returns or sets the size of the hole in a doughnut chart group. The hole size is expressed as a percentage of the chart size, between 10 and 90 percent. */
    @JsonProperty("DoughnutHoleSize")
    private Integer doughnutHoleSize;

    /** Returns a  object that represents the down bars on a line chart. Applies only to line charts. */
    @JsonProperty("DownBars")
    private DropBars downBars;

    /** Returns a  object that represents the drop lines for a series on the line chart or area chart. Applies only to line chart or area charts. */
    @JsonProperty("DropLines")
    private Line dropLines;

    /** The distance of an open pie slice from the center of the pie chart is expressed as a percentage of the pie diameter. */
    @JsonProperty("Explosion")
    private Integer explosion;

    /** Gets or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts, 0 to 360. */
    @JsonProperty("FirstSliceAngle")
    private Integer firstSliceAngle;

    /** Returns or sets the space between bar or column clusters, as a percentage of the bar or column width. The value of this property must be between 0 and 500. */
    @JsonProperty("GapWidth")
    private Integer gapWidth;

    /** True if the series has a three-dimensional appearance. Applies only to bubble charts. */
    @JsonProperty("Has3DEffect")
    private Boolean has3DEffect;

    /** True if the chart has drop lines. Applies only to line chart or area charts. */
    @JsonProperty("HasDropLines")
    private Boolean hasDropLines;

    /** True if the line chart has high-low lines. Applies only to line charts. */
    @JsonProperty("HasHiLoLines")
    private Boolean hasHiLoLines;

    /** True if the series has leader lines. */
    @JsonProperty("HasLeaderLines")
    private Boolean hasLeaderLines;

    /** True if a radar chart has category axis labels. Applies only to radar charts. */
    @JsonProperty("HasRadarAxisLabels")
    private Boolean hasRadarAxisLabels;

    /** True if a stacked column chart or bar chart has series lines or if a Pie of Pie chart or Bar of Pie chart has connector lines between the two sections. Applies only to stacked column charts, bar charts, Pie of Pie charts, or Bar of Pie charts. */
    @JsonProperty("HasSeriesLines")
    private Boolean hasSeriesLines;

    /** True if a line chart has up and down bars. Applies only to line charts. */
    @JsonProperty("HasUpDownBars")
    private Boolean hasUpDownBars;

    /** Returns a HiLoLines object that represents the high-low lines for a series on a line chart. Applies only to line charts. */
    @JsonProperty("HiLoLines")
    private Line hiLoLines;

    /** Indicates whether the threshold value is automatic. */
    @JsonProperty("IsAutoSplit")
    private Boolean isAutoSplit;

    /** Represents if the color of points is varied. The chart must contain only one series. */
    @JsonProperty("IsColorVaried")
    private Boolean isColorVaried;

    /** Represents leader lines on a chart. Leader lines connect data labels to data points. This object isn’t a collection; there’s no object that represents a single leader line. */
    @JsonProperty("LeaderLines")
    private Line leaderLines;

    /** Gets the legend entry according to this series. */
    @JsonProperty("LegendEntry")
    private LegendEntry legendEntry;

    /** Gets the marker. */
    @JsonProperty("Marker")
    private Marker marker;

    /** Gets or sets the name of the data series. */
    @JsonProperty("Name")
    private String name;

    /** Specifies how bars and columns are positioned. Can be a value between – 100 and 100. Applies only to 2-D bar and 2-D column charts. */
    @JsonProperty("Overlap")
    private Integer overlap;

    /** Indicates if this series is plotted on second value axis. */
    @JsonProperty("PlotOnSecondAxis")
    private Boolean plotOnSecondAxis;

    /** Gets the collection of points in a series in a chart. */
    @JsonProperty("Points")
    private LinkElement points;

    /** Returns or sets the size of the secondary section of either a pie of pie chart or a bar of pie chart, as a percentage of the size of the primary pie. Can be a value from 5 to 200. */
    @JsonProperty("SecondPlotSize")
    private Integer secondPlotSize;

    /** Returns a SeriesLines object that represents the series lines for a stacked bar chart or a stacked column chart. Applies only to stacked bar and stacked column charts. */
    @JsonProperty("SeriesLines")
    private Line seriesLines;

    /** True if the series has a shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** True if negative bubbles are shown for the chart group. Valid only for bubble charts. */
    @JsonProperty("ShowNegativeBubbles")
    private Boolean showNegativeBubbles;

    /** Gets or sets what the bubble size represents on a bubble chart. */
    @JsonProperty("SizeRepresents")
    private String sizeRepresents;

    /** Represents curve smoothing. True if curve smoothing is turned on for the line chart or scatter chart. Applies only to line and scatter connected by lines charts. */
    @JsonProperty("Smooth")
    private Boolean smooth;

    /** Returns or sets a value that how to determine which data points are in the second pie or bar on a pie of pie or bar of pie chart. */
    @JsonProperty("SplitType")
    private String splitType;

    /** Returns or sets a value that shall be used to determine which data points are in the second pie or bar on a pie of pie or bar of pie chart. */
    @JsonProperty("SplitValue")
    private Double splitValue;

    /** Returns an object that represents a collection of all the trendlines for the series. */
    @JsonProperty("TrendLines")
    private Trendlines trendLines;

    /** Gets or sets a data series' type. */
    @JsonProperty("Type")
    private String type;

    /** Returns an DropBars object that represents the up bars on a line chart. Applies only to line charts. */
    @JsonProperty("UpBars")
    private DropBars upBars;

    /** Represents the data of the chart series. */
    @JsonProperty("Values")
    private String values;

    /** Represents X direction error bar of the series. */
    @JsonProperty("XErrorBar")
    private ErrorBar xErrorBar;

    /** Represents the x values of the chart series. */
    @JsonProperty("XValues")
    private String xValues;

    /** Represents Y direction error bar of the series. */
    @JsonProperty("YErrorBar")
    private ErrorBar yErrorBar;

    public Area getArea() { return area; }
    public Series setArea(Area area) { this.area = area; return this; }

    public String getBar3DShapeType() { return bar3DShapeType; }
    public Series setBar3DShapeType(String bar3DShapeType) { this.bar3DShapeType = bar3DShapeType; return this; }

    public Line getBorder() { return border; }
    public Series setBorder(Line border) { this.border = border; return this; }

    public Integer getBubbleScale() { return bubbleScale; }
    public Series setBubbleScale(Integer bubbleScale) { this.bubbleScale = bubbleScale; return this; }

    public String getBubbleSizes() { return bubbleSizes; }
    public Series setBubbleSizes(String bubbleSizes) { this.bubbleSizes = bubbleSizes; return this; }

    public Integer getCountOfDataValues() { return countOfDataValues; }
    public Series setCountOfDataValues(Integer countOfDataValues) { this.countOfDataValues = countOfDataValues; return this; }

    public DataLabels getDataLabels() { return dataLabels; }
    public Series setDataLabels(DataLabels dataLabels) { this.dataLabels = dataLabels; return this; }

    public String getDisplayName() { return displayName; }
    public Series setDisplayName(String displayName) { this.displayName = displayName; return this; }

    public Integer getDoughnutHoleSize() { return doughnutHoleSize; }
    public Series setDoughnutHoleSize(Integer doughnutHoleSize) { this.doughnutHoleSize = doughnutHoleSize; return this; }

    public DropBars getDownBars() { return downBars; }
    public Series setDownBars(DropBars downBars) { this.downBars = downBars; return this; }

    public Line getDropLines() { return dropLines; }
    public Series setDropLines(Line dropLines) { this.dropLines = dropLines; return this; }

    public Integer getExplosion() { return explosion; }
    public Series setExplosion(Integer explosion) { this.explosion = explosion; return this; }

    public Integer getFirstSliceAngle() { return firstSliceAngle; }
    public Series setFirstSliceAngle(Integer firstSliceAngle) { this.firstSliceAngle = firstSliceAngle; return this; }

    public Integer getGapWidth() { return gapWidth; }
    public Series setGapWidth(Integer gapWidth) { this.gapWidth = gapWidth; return this; }

    public Boolean getHas3DEffect() { return has3DEffect; }
    public Series setHas3DEffect(Boolean has3DEffect) { this.has3DEffect = has3DEffect; return this; }

    public Boolean getHasDropLines() { return hasDropLines; }
    public Series setHasDropLines(Boolean hasDropLines) { this.hasDropLines = hasDropLines; return this; }

    public Boolean getHasHiLoLines() { return hasHiLoLines; }
    public Series setHasHiLoLines(Boolean hasHiLoLines) { this.hasHiLoLines = hasHiLoLines; return this; }

    public Boolean getHasLeaderLines() { return hasLeaderLines; }
    public Series setHasLeaderLines(Boolean hasLeaderLines) { this.hasLeaderLines = hasLeaderLines; return this; }

    public Boolean getHasRadarAxisLabels() { return hasRadarAxisLabels; }
    public Series setHasRadarAxisLabels(Boolean hasRadarAxisLabels) { this.hasRadarAxisLabels = hasRadarAxisLabels; return this; }

    public Boolean getHasSeriesLines() { return hasSeriesLines; }
    public Series setHasSeriesLines(Boolean hasSeriesLines) { this.hasSeriesLines = hasSeriesLines; return this; }

    public Boolean getHasUpDownBars() { return hasUpDownBars; }
    public Series setHasUpDownBars(Boolean hasUpDownBars) { this.hasUpDownBars = hasUpDownBars; return this; }

    public Line getHiLoLines() { return hiLoLines; }
    public Series setHiLoLines(Line hiLoLines) { this.hiLoLines = hiLoLines; return this; }

    public Boolean getIsAutoSplit() { return isAutoSplit; }
    public Series setIsAutoSplit(Boolean isAutoSplit) { this.isAutoSplit = isAutoSplit; return this; }

    public Boolean getIsColorVaried() { return isColorVaried; }
    public Series setIsColorVaried(Boolean isColorVaried) { this.isColorVaried = isColorVaried; return this; }

    public Line getLeaderLines() { return leaderLines; }
    public Series setLeaderLines(Line leaderLines) { this.leaderLines = leaderLines; return this; }

    public LegendEntry getLegendEntry() { return legendEntry; }
    public Series setLegendEntry(LegendEntry legendEntry) { this.legendEntry = legendEntry; return this; }

    public Marker getMarker() { return marker; }
    public Series setMarker(Marker marker) { this.marker = marker; return this; }

    public String getName() { return name; }
    public Series setName(String name) { this.name = name; return this; }

    public Integer getOverlap() { return overlap; }
    public Series setOverlap(Integer overlap) { this.overlap = overlap; return this; }

    public Boolean getPlotOnSecondAxis() { return plotOnSecondAxis; }
    public Series setPlotOnSecondAxis(Boolean plotOnSecondAxis) { this.plotOnSecondAxis = plotOnSecondAxis; return this; }

    public LinkElement getPoints() { return points; }
    public Series setPoints(LinkElement points) { this.points = points; return this; }

    public Integer getSecondPlotSize() { return secondPlotSize; }
    public Series setSecondPlotSize(Integer secondPlotSize) { this.secondPlotSize = secondPlotSize; return this; }

    public Line getSeriesLines() { return seriesLines; }
    public Series setSeriesLines(Line seriesLines) { this.seriesLines = seriesLines; return this; }

    public Boolean getShadow() { return shadow; }
    public Series setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Boolean getShowNegativeBubbles() { return showNegativeBubbles; }
    public Series setShowNegativeBubbles(Boolean showNegativeBubbles) { this.showNegativeBubbles = showNegativeBubbles; return this; }

    public String getSizeRepresents() { return sizeRepresents; }
    public Series setSizeRepresents(String sizeRepresents) { this.sizeRepresents = sizeRepresents; return this; }

    public Boolean getSmooth() { return smooth; }
    public Series setSmooth(Boolean smooth) { this.smooth = smooth; return this; }

    public String getSplitType() { return splitType; }
    public Series setSplitType(String splitType) { this.splitType = splitType; return this; }

    public Double getSplitValue() { return splitValue; }
    public Series setSplitValue(Double splitValue) { this.splitValue = splitValue; return this; }

    public Trendlines getTrendLines() { return trendLines; }
    public Series setTrendLines(Trendlines trendLines) { this.trendLines = trendLines; return this; }

    public String getType() { return type; }
    public Series setType(String type) { this.type = type; return this; }

    public DropBars getUpBars() { return upBars; }
    public Series setUpBars(DropBars upBars) { this.upBars = upBars; return this; }

    public String getValues() { return values; }
    public Series setValues(String values) { this.values = values; return this; }

    public ErrorBar getXErrorBar() { return xErrorBar; }
    public Series setXErrorBar(ErrorBar xErrorBar) { this.xErrorBar = xErrorBar; return this; }

    public String getXValues() { return xValues; }
    public Series setXValues(String xValues) { this.xValues = xValues; return this; }

    public ErrorBar getYErrorBar() { return yErrorBar; }
    public Series setYErrorBar(ErrorBar yErrorBar) { this.yErrorBar = yErrorBar; return this; }


    /** Covariant override: keeps fluent chains returning Series. */
    @Override public Series setLink(Link link) { return (Series) super.setLink(link); }

}

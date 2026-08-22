package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SparklineGroup — is organized into sparkline group. A SparklineGroup contains a variable number of sparkline items.             A sparkline group specifies the type, display settings and axis settings for the sparklines. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparklineGroup {
    /** Indicates whether to show data in hidden rows and columns. */
    @JsonProperty("DisplayHidden")
    private Boolean displayHidden;

    /** Gets and sets the color of the first point of data in the sparkline group. */
    @JsonProperty("FirstPointColor")
    private CellsColor firstPointColor;

    /** Gets and sets the color of the highest points of data in the sparkline group. */
    @JsonProperty("HighPointColor")
    private CellsColor highPointColor;

    /** Gets and sets the color of the horizontal axis in the sparkline group. */
    @JsonProperty("HorizontalAxisColor")
    private CellsColor horizontalAxisColor;

    /** Represents the range that contains the date values for the sparkline data. */
    @JsonProperty("HorizontalAxisDateRange")
    private String horizontalAxisDateRange;

    /** Gets and sets the color of the last point of data in the sparkline group. */
    @JsonProperty("LastPointColor")
    private CellsColor lastPointColor;

    /** Gets and sets the line weight in each line sparkline in the sparkline group, in the unit of points. */
    @JsonProperty("LineWeight")
    private Double lineWeight;

    /** Gets and sets the color of the lowest points of data in the sparkline group. */
    @JsonProperty("LowPointColor")
    private CellsColor lowPointColor;

    /** Gets and sets the color of points in each line sparkline in the sparkline group. */
    @JsonProperty("MarkersColor")
    private CellsColor markersColor;

    /** Gets and sets the color of the negative values on the sparkline group. */
    @JsonProperty("NegativePointsColor")
    private CellsColor negativePointsColor;

    /** Indicates how to plot empty cells. */
    @JsonProperty("PlotEmptyCellsType")
    private String plotEmptyCellsType;

    /** Indicates whether the plot data is right to left. */
    @JsonProperty("PlotRightToLeft")
    private Boolean plotRightToLeft;

    /** Gets and sets the preset style type of the sparkline group. */
    @JsonProperty("PresetStyle")
    private String presetStyle;

    /** Gets and sets the color of the sparklines in the sparkline group. */
    @JsonProperty("SeriesColor")
    private CellsColor seriesColor;

    /** Indicates whether to highlight the first point of data in the sparkline group. */
    @JsonProperty("ShowFirstPoint")
    private Boolean showFirstPoint;

    /** Indicates whether to highlight the highest points of data in the sparkline group. */
    @JsonProperty("ShowHighPoint")
    private Boolean showHighPoint;

    /** Indicates whether to show the sparkline horizontal axis. The horizontal axis appears if the sparkline has data that crosses the zero axis. */
    @JsonProperty("ShowHorizontalAxis")
    private Boolean showHorizontalAxis;

    /** Indicates whether to highlight the last point of data in the sparkline group. */
    @JsonProperty("ShowLastPoint")
    private Boolean showLastPoint;

    /** Indicates whether to highlight the lowest points of data in the sparkline group. */
    @JsonProperty("ShowLowPoint")
    private Boolean showLowPoint;

    /** Indicates whether to highlight each point in each line sparkline in the sparkline group. */
    @JsonProperty("ShowMarkers")
    private Boolean showMarkers;

    /** Indicates whether to highlight the negative values on the sparkline group with a different color or marker. */
    @JsonProperty("ShowNegativePoints")
    private Boolean showNegativePoints;

    /** Gets the collection of  object. */
    @JsonProperty("SparklineCollection")
    private List<Sparkline> sparklineCollection;

    /** Indicates the sparkline type of the sparkline group. */
    @JsonProperty("Type")
    private String type;

    /** Gets and sets the custom maximum value for the vertical axis. */
    @JsonProperty("VerticalAxisMaxValue")
    private Double verticalAxisMaxValue;

    /** Represents the vertical axis maximum value type. */
    @JsonProperty("VerticalAxisMaxValueType")
    private String verticalAxisMaxValueType;

    /** Gets and sets the custom minimum value for the vertical axis. */
    @JsonProperty("VerticalAxisMinValue")
    private Double verticalAxisMinValue;

    /** Represents the vertical axis minimum value type. */
    @JsonProperty("VerticalAxisMinValueType")
    private String verticalAxisMinValueType;

    public Boolean getDisplayHidden() { return displayHidden; }
    public SparklineGroup setDisplayHidden(Boolean displayHidden) { this.displayHidden = displayHidden; return this; }

    public CellsColor getFirstPointColor() { return firstPointColor; }
    public SparklineGroup setFirstPointColor(CellsColor firstPointColor) { this.firstPointColor = firstPointColor; return this; }

    public CellsColor getHighPointColor() { return highPointColor; }
    public SparklineGroup setHighPointColor(CellsColor highPointColor) { this.highPointColor = highPointColor; return this; }

    public CellsColor getHorizontalAxisColor() { return horizontalAxisColor; }
    public SparklineGroup setHorizontalAxisColor(CellsColor horizontalAxisColor) { this.horizontalAxisColor = horizontalAxisColor; return this; }

    public String getHorizontalAxisDateRange() { return horizontalAxisDateRange; }
    public SparklineGroup setHorizontalAxisDateRange(String horizontalAxisDateRange) { this.horizontalAxisDateRange = horizontalAxisDateRange; return this; }

    public CellsColor getLastPointColor() { return lastPointColor; }
    public SparklineGroup setLastPointColor(CellsColor lastPointColor) { this.lastPointColor = lastPointColor; return this; }

    public Double getLineWeight() { return lineWeight; }
    public SparklineGroup setLineWeight(Double lineWeight) { this.lineWeight = lineWeight; return this; }

    public CellsColor getLowPointColor() { return lowPointColor; }
    public SparklineGroup setLowPointColor(CellsColor lowPointColor) { this.lowPointColor = lowPointColor; return this; }

    public CellsColor getMarkersColor() { return markersColor; }
    public SparklineGroup setMarkersColor(CellsColor markersColor) { this.markersColor = markersColor; return this; }

    public CellsColor getNegativePointsColor() { return negativePointsColor; }
    public SparklineGroup setNegativePointsColor(CellsColor negativePointsColor) { this.negativePointsColor = negativePointsColor; return this; }

    public String getPlotEmptyCellsType() { return plotEmptyCellsType; }
    public SparklineGroup setPlotEmptyCellsType(String plotEmptyCellsType) { this.plotEmptyCellsType = plotEmptyCellsType; return this; }

    public Boolean getPlotRightToLeft() { return plotRightToLeft; }
    public SparklineGroup setPlotRightToLeft(Boolean plotRightToLeft) { this.plotRightToLeft = plotRightToLeft; return this; }

    public String getPresetStyle() { return presetStyle; }
    public SparklineGroup setPresetStyle(String presetStyle) { this.presetStyle = presetStyle; return this; }

    public CellsColor getSeriesColor() { return seriesColor; }
    public SparklineGroup setSeriesColor(CellsColor seriesColor) { this.seriesColor = seriesColor; return this; }

    public Boolean getShowFirstPoint() { return showFirstPoint; }
    public SparklineGroup setShowFirstPoint(Boolean showFirstPoint) { this.showFirstPoint = showFirstPoint; return this; }

    public Boolean getShowHighPoint() { return showHighPoint; }
    public SparklineGroup setShowHighPoint(Boolean showHighPoint) { this.showHighPoint = showHighPoint; return this; }

    public Boolean getShowHorizontalAxis() { return showHorizontalAxis; }
    public SparklineGroup setShowHorizontalAxis(Boolean showHorizontalAxis) { this.showHorizontalAxis = showHorizontalAxis; return this; }

    public Boolean getShowLastPoint() { return showLastPoint; }
    public SparklineGroup setShowLastPoint(Boolean showLastPoint) { this.showLastPoint = showLastPoint; return this; }

    public Boolean getShowLowPoint() { return showLowPoint; }
    public SparklineGroup setShowLowPoint(Boolean showLowPoint) { this.showLowPoint = showLowPoint; return this; }

    public Boolean getShowMarkers() { return showMarkers; }
    public SparklineGroup setShowMarkers(Boolean showMarkers) { this.showMarkers = showMarkers; return this; }

    public Boolean getShowNegativePoints() { return showNegativePoints; }
    public SparklineGroup setShowNegativePoints(Boolean showNegativePoints) { this.showNegativePoints = showNegativePoints; return this; }

    public List<Sparkline> getSparklineCollection() { return sparklineCollection; }
    public SparklineGroup setSparklineCollection(List<Sparkline> sparklineCollection) { this.sparklineCollection = sparklineCollection; return this; }

    public String getType() { return type; }
    public SparklineGroup setType(String type) { this.type = type; return this; }

    public Double getVerticalAxisMaxValue() { return verticalAxisMaxValue; }
    public SparklineGroup setVerticalAxisMaxValue(Double verticalAxisMaxValue) { this.verticalAxisMaxValue = verticalAxisMaxValue; return this; }

    public String getVerticalAxisMaxValueType() { return verticalAxisMaxValueType; }
    public SparklineGroup setVerticalAxisMaxValueType(String verticalAxisMaxValueType) { this.verticalAxisMaxValueType = verticalAxisMaxValueType; return this; }

    public Double getVerticalAxisMinValue() { return verticalAxisMinValue; }
    public SparklineGroup setVerticalAxisMinValue(Double verticalAxisMinValue) { this.verticalAxisMinValue = verticalAxisMinValue; return this; }

    public String getVerticalAxisMinValueType() { return verticalAxisMinValueType; }
    public SparklineGroup setVerticalAxisMinValueType(String verticalAxisMinValueType) { this.verticalAxisMinValueType = verticalAxisMinValueType; return this; }

}

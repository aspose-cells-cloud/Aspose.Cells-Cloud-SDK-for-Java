package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Chart — Encapsulates the object that represents a single Excel chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Chart extends LinkElement {
    /** True if Microsoft Excel scales a 3-D chart so that it's closer in size to the equivalent 2-D chart. The RightAngleAxes property must be True. */
    @JsonProperty("AutoScaling")
    private Boolean autoScaling;

    /** Returns a  object that represents the back wall of a 3-D chart. */
    @JsonProperty("BackWall")
    private Walls backWall;

    /** Gets the chart's X axis. */
    @JsonProperty("CategoryAxis")
    private Axis categoryAxis;

    /** Gets the chart area in the worksheet. */
    @JsonProperty("ChartArea")
    private ChartArea chartArea;

    /** Represents the chart data table. */
    @JsonProperty("ChartDataTable")
    private ChartDataTable chartDataTable;

    /** Represents the chartShape; */
    @JsonProperty("ChartObject")
    private LinkElement chartObject;

    /** Represents the depth of a 3-D chart as a percentage of the chart width (between 20 and 2000 percent). */
    @JsonProperty("DepthPercent")
    private Integer depthPercent;

    /** Represents the elevation of the 3-D chart view, in degrees. */
    @JsonProperty("Elevation")
    private Integer elevation;

    /** Gets or sets the angle of the first pie-chart or doughnut-chart slice, in degrees (clockwise from vertical). Applies only to pie, 3-D pie, and doughnut charts, 0 to 360. */
    @JsonProperty("FirstSliceAngle")
    private Integer firstSliceAngle;

    /** Returns a  object that represents the walls of a 3-D chart. */
    @JsonProperty("Floor")
    private Floor floor;

    /** Gets or sets the distance between the data series in a 3-D chart, as a percentage of the marker width. The value of this property must be between 0 and 500. */
    @JsonProperty("GapDepth")
    private Integer gapDepth;

    /** Returns or sets the space between bar or column clusters, as a percentage of the bar or column width. The value of this property must be between 0 and 500. */
    @JsonProperty("GapWidth")
    private Integer gapWidth;

    /** Returns or sets the height of a 3-D chart as a percentage of the chart width (between 5 and 500 percent). */
    @JsonProperty("HeightPercent")
    private Integer heightPercent;

    /** Indicates whether hide the pivot chart field buttons only when the chart is PivotChart. */
    @JsonProperty("HidePivotFieldButtons")
    private Boolean hidePivotFieldButtons;

    /** Indicates whether the chart is a 3d chart. */
    @JsonProperty("Is3D")
    private Boolean is3D;

    /** Gets or sets a value indicating whether the chart area is rectangular cornered. Default is true. */
    @JsonProperty("IsRectangularCornered")
    private Boolean isRectangularCornered;

    /** Gets the chart legend. */
    @JsonProperty("Legend")
    private Legend legend;

    /** Represents chart name. */
    @JsonProperty("Name")
    private String name;

    /** Gets a  collection representing the data series in the chart. */
    @JsonProperty("NSeries")
    private SeriesItems nSeries;

    /** Represents the page setup description in this chart. */
    @JsonProperty("PageSetup")
    private LinkElement pageSetup;

    /** Returns or sets the perspective for the 3-D chart view. Must be between 0 and 100. This property is ignored if the RightAngleAxes property is True. */
    @JsonProperty("Perspective")
    private Integer perspective;

    /** The source is the data of the pivotTable. If PivotSource is not empty ,the chart is PivotChart. */
    @JsonProperty("PivotSource")
    private String pivotSource;

    /** Represents the way the chart is attached to the cells below it. */
    @JsonProperty("Placement")
    private String placement;

    /** Gets the chart's plot area which includes axis tick labels. */
    @JsonProperty("PlotArea")
    private PlotArea plotArea;

    /** Gets and sets  how to plot the empty cells. */
    @JsonProperty("PlotEmptyCellsType")
    private String plotEmptyCellsType;

    /** Indicates whether only plot visible cells. */
    @JsonProperty("PlotVisibleCells")
    private Boolean plotVisibleCells;

    /** Gets and sets the printed chart size. */
    @JsonProperty("PrintSize")
    private String printSize;

    /** True if the chart axes are at right angles. Applies only for 3-D charts(except Column3D and 3-D Pie Charts). */
    @JsonProperty("RightAngleAxes")
    private Boolean rightAngleAxes;

    /** Represents the rotation of the 3-D chart view (the rotation of the plot area around the z-axis, in degrees). */
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    /** Gets the chart's second X axis. */
    @JsonProperty("SecondCategoryAxis")
    private LinkElement secondCategoryAxis;

    /** Gets the chart's second Y axis. */
    @JsonProperty("SecondValueAxis")
    private LinkElement secondValueAxis;

    /** Gets the chart's series axis. */
    @JsonProperty("SeriesAxis")
    private LinkElement seriesAxis;

    /** Returns all drawing shapes in this chart. */
    @JsonProperty("Shapes")
    private LinkElement shapes;

    /** Gets or sets a value indicating whether the chart displays a data table. */
    @JsonProperty("ShowDataTable")
    private Boolean showDataTable;

    /** Gets or sets a value indicating whether the chart legend will be displayed. Default is true. */
    @JsonProperty("ShowLegend")
    private Boolean showLegend;

    /** Returns a  object that represents the side wall of a 3-D chart. */
    @JsonProperty("SideWall")
    private LinkElement sideWall;

    /** True if Microsoft Excel resizes the chart to match the size of the chart sheet window. */
    @JsonProperty("SizeWithWindow")
    private Boolean sizeWithWindow;

    /** Gets and sets the builtin style. */
    @JsonProperty("Style")
    private Integer style;

    /** Represents chart title. */
    @JsonProperty("Title")
    private LinkElement title;

    /** Represents chart type. */
    @JsonProperty("Type")
    private String type;

    /** Gets the chart's Y axis. */
    @JsonProperty("ValueAxis")
    private Axis valueAxis;

    /** Returns a  object that represents the walls of a 3-D chart. */
    @JsonProperty("Walls")
    private LinkElement walls;

    /** True if gridlines are drawn two-dimensionally on a 3-D chart. */
    @JsonProperty("WallsAndGridlines2D")
    private Boolean wallsAndGridlines2D;

    public Boolean getAutoScaling() { return autoScaling; }
    public Chart setAutoScaling(Boolean autoScaling) { this.autoScaling = autoScaling; return this; }

    public Walls getBackWall() { return backWall; }
    public Chart setBackWall(Walls backWall) { this.backWall = backWall; return this; }

    public Axis getCategoryAxis() { return categoryAxis; }
    public Chart setCategoryAxis(Axis categoryAxis) { this.categoryAxis = categoryAxis; return this; }

    public ChartArea getChartArea() { return chartArea; }
    public Chart setChartArea(ChartArea chartArea) { this.chartArea = chartArea; return this; }

    public ChartDataTable getChartDataTable() { return chartDataTable; }
    public Chart setChartDataTable(ChartDataTable chartDataTable) { this.chartDataTable = chartDataTable; return this; }

    public LinkElement getChartObject() { return chartObject; }
    public Chart setChartObject(LinkElement chartObject) { this.chartObject = chartObject; return this; }

    public Integer getDepthPercent() { return depthPercent; }
    public Chart setDepthPercent(Integer depthPercent) { this.depthPercent = depthPercent; return this; }

    public Integer getElevation() { return elevation; }
    public Chart setElevation(Integer elevation) { this.elevation = elevation; return this; }

    public Integer getFirstSliceAngle() { return firstSliceAngle; }
    public Chart setFirstSliceAngle(Integer firstSliceAngle) { this.firstSliceAngle = firstSliceAngle; return this; }

    public Floor getFloor() { return floor; }
    public Chart setFloor(Floor floor) { this.floor = floor; return this; }

    public Integer getGapDepth() { return gapDepth; }
    public Chart setGapDepth(Integer gapDepth) { this.gapDepth = gapDepth; return this; }

    public Integer getGapWidth() { return gapWidth; }
    public Chart setGapWidth(Integer gapWidth) { this.gapWidth = gapWidth; return this; }

    public Integer getHeightPercent() { return heightPercent; }
    public Chart setHeightPercent(Integer heightPercent) { this.heightPercent = heightPercent; return this; }

    public Boolean getHidePivotFieldButtons() { return hidePivotFieldButtons; }
    public Chart setHidePivotFieldButtons(Boolean hidePivotFieldButtons) { this.hidePivotFieldButtons = hidePivotFieldButtons; return this; }

    public Boolean getIs3D() { return is3D; }
    public Chart setIs3D(Boolean is3D) { this.is3D = is3D; return this; }

    public Boolean getIsRectangularCornered() { return isRectangularCornered; }
    public Chart setIsRectangularCornered(Boolean isRectangularCornered) { this.isRectangularCornered = isRectangularCornered; return this; }

    public Legend getLegend() { return legend; }
    public Chart setLegend(Legend legend) { this.legend = legend; return this; }

    public String getName() { return name; }
    public Chart setName(String name) { this.name = name; return this; }

    public SeriesItems getNSeries() { return nSeries; }
    public Chart setNSeries(SeriesItems nSeries) { this.nSeries = nSeries; return this; }

    public LinkElement getPageSetup() { return pageSetup; }
    public Chart setPageSetup(LinkElement pageSetup) { this.pageSetup = pageSetup; return this; }

    public Integer getPerspective() { return perspective; }
    public Chart setPerspective(Integer perspective) { this.perspective = perspective; return this; }

    public String getPivotSource() { return pivotSource; }
    public Chart setPivotSource(String pivotSource) { this.pivotSource = pivotSource; return this; }

    public String getPlacement() { return placement; }
    public Chart setPlacement(String placement) { this.placement = placement; return this; }

    public PlotArea getPlotArea() { return plotArea; }
    public Chart setPlotArea(PlotArea plotArea) { this.plotArea = plotArea; return this; }

    public String getPlotEmptyCellsType() { return plotEmptyCellsType; }
    public Chart setPlotEmptyCellsType(String plotEmptyCellsType) { this.plotEmptyCellsType = plotEmptyCellsType; return this; }

    public Boolean getPlotVisibleCells() { return plotVisibleCells; }
    public Chart setPlotVisibleCells(Boolean plotVisibleCells) { this.plotVisibleCells = plotVisibleCells; return this; }

    public String getPrintSize() { return printSize; }
    public Chart setPrintSize(String printSize) { this.printSize = printSize; return this; }

    public Boolean getRightAngleAxes() { return rightAngleAxes; }
    public Chart setRightAngleAxes(Boolean rightAngleAxes) { this.rightAngleAxes = rightAngleAxes; return this; }

    public Integer getRotationAngle() { return rotationAngle; }
    public Chart setRotationAngle(Integer rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public LinkElement getSecondCategoryAxis() { return secondCategoryAxis; }
    public Chart setSecondCategoryAxis(LinkElement secondCategoryAxis) { this.secondCategoryAxis = secondCategoryAxis; return this; }

    public LinkElement getSecondValueAxis() { return secondValueAxis; }
    public Chart setSecondValueAxis(LinkElement secondValueAxis) { this.secondValueAxis = secondValueAxis; return this; }

    public LinkElement getSeriesAxis() { return seriesAxis; }
    public Chart setSeriesAxis(LinkElement seriesAxis) { this.seriesAxis = seriesAxis; return this; }

    public LinkElement getShapes() { return shapes; }
    public Chart setShapes(LinkElement shapes) { this.shapes = shapes; return this; }

    public Boolean getShowDataTable() { return showDataTable; }
    public Chart setShowDataTable(Boolean showDataTable) { this.showDataTable = showDataTable; return this; }

    public Boolean getShowLegend() { return showLegend; }
    public Chart setShowLegend(Boolean showLegend) { this.showLegend = showLegend; return this; }

    public LinkElement getSideWall() { return sideWall; }
    public Chart setSideWall(LinkElement sideWall) { this.sideWall = sideWall; return this; }

    public Boolean getSizeWithWindow() { return sizeWithWindow; }
    public Chart setSizeWithWindow(Boolean sizeWithWindow) { this.sizeWithWindow = sizeWithWindow; return this; }

    public Integer getStyle() { return style; }
    public Chart setStyle(Integer style) { this.style = style; return this; }

    public LinkElement getTitle() { return title; }
    public Chart setTitle(LinkElement title) { this.title = title; return this; }

    public String getType() { return type; }
    public Chart setType(String type) { this.type = type; return this; }

    public Axis getValueAxis() { return valueAxis; }
    public Chart setValueAxis(Axis valueAxis) { this.valueAxis = valueAxis; return this; }

    public LinkElement getWalls() { return walls; }
    public Chart setWalls(LinkElement walls) { this.walls = walls; return this; }

    public Boolean getWallsAndGridlines2D() { return wallsAndGridlines2D; }
    public Chart setWallsAndGridlines2D(Boolean wallsAndGridlines2D) { this.wallsAndGridlines2D = wallsAndGridlines2D; return this; }


    /** Covariant override: keeps fluent chains returning Chart. */
    @Override public Chart setLink(Link link) { return (Chart) super.setLink(link); }

}

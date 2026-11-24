/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Chart.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Chart extends LinkElement {

    @SerializedName("AutoScaling")
    @JsonProperty("AutoScaling")
    private Boolean autoScaling;

    public Chart autoScaling(Boolean autoScaling) {
        this.autoScaling = autoScaling;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAutoScaling() {
        return autoScaling;
    }

    public void setAutoScaling(Boolean autoScaling) {
        this.autoScaling = autoScaling;
    }

    @SerializedName("BackWall")
    @JsonProperty("BackWall")
    private Walls backWall;

    public Chart backWall(Walls backWall) {
        this.backWall = backWall;
        return this;
    }

    @ApiModelProperty(value = "")
    public Walls getBackWall() {
        return backWall;
    }

    public void setBackWall(Walls backWall) {
        this.backWall = backWall;
    }

    @SerializedName("CategoryAxis")
    @JsonProperty("CategoryAxis")
    private Axis categoryAxis;

    public Chart categoryAxis(Axis categoryAxis) {
        this.categoryAxis = categoryAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public Axis getCategoryAxis() {
        return categoryAxis;
    }

    public void setCategoryAxis(Axis categoryAxis) {
        this.categoryAxis = categoryAxis;
    }

    @SerializedName("ChartArea")
    @JsonProperty("ChartArea")
    private ChartArea chartArea;

    public Chart chartArea(ChartArea chartArea) {
        this.chartArea = chartArea;
        return this;
    }

    @ApiModelProperty(value = "")
    public ChartArea getChartArea() {
        return chartArea;
    }

    public void setChartArea(ChartArea chartArea) {
        this.chartArea = chartArea;
    }

    @SerializedName("ChartDataTable")
    @JsonProperty("ChartDataTable")
    private ChartDataTable chartDataTable;

    public Chart chartDataTable(ChartDataTable chartDataTable) {
        this.chartDataTable = chartDataTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public ChartDataTable getChartDataTable() {
        return chartDataTable;
    }

    public void setChartDataTable(ChartDataTable chartDataTable) {
        this.chartDataTable = chartDataTable;
    }

    @SerializedName("ChartObject")
    @JsonProperty("ChartObject")
    private LinkElement chartObject;

    public Chart chartObject(LinkElement chartObject) {
        this.chartObject = chartObject;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getChartObject() {
        return chartObject;
    }

    public void setChartObject(LinkElement chartObject) {
        this.chartObject = chartObject;
    }

    @SerializedName("DepthPercent")
    @JsonProperty("DepthPercent")
    private Integer depthPercent;

    public Chart depthPercent(Integer depthPercent) {
        this.depthPercent = depthPercent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getDepthPercent() {
        return depthPercent;
    }

    public void setDepthPercent(Integer depthPercent) {
        this.depthPercent = depthPercent;
    }

    @SerializedName("Elevation")
    @JsonProperty("Elevation")
    private Integer elevation;

    public Chart elevation(Integer elevation) {
        this.elevation = elevation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }

    @SerializedName("FirstSliceAngle")
    @JsonProperty("FirstSliceAngle")
    private Integer firstSliceAngle;

    public Chart firstSliceAngle(Integer firstSliceAngle) {
        this.firstSliceAngle = firstSliceAngle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstSliceAngle() {
        return firstSliceAngle;
    }

    public void setFirstSliceAngle(Integer firstSliceAngle) {
        this.firstSliceAngle = firstSliceAngle;
    }

    @SerializedName("Floor")
    @JsonProperty("Floor")
    private Floor floor;

    public Chart floor(Floor floor) {
        this.floor = floor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    @SerializedName("GapDepth")
    @JsonProperty("GapDepth")
    private Integer gapDepth;

    public Chart gapDepth(Integer gapDepth) {
        this.gapDepth = gapDepth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getGapDepth() {
        return gapDepth;
    }

    public void setGapDepth(Integer gapDepth) {
        this.gapDepth = gapDepth;
    }

    @SerializedName("GapWidth")
    @JsonProperty("GapWidth")
    private Integer gapWidth;

    public Chart gapWidth(Integer gapWidth) {
        this.gapWidth = gapWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getGapWidth() {
        return gapWidth;
    }

    public void setGapWidth(Integer gapWidth) {
        this.gapWidth = gapWidth;
    }

    @SerializedName("HeightPercent")
    @JsonProperty("HeightPercent")
    private Integer heightPercent;

    public Chart heightPercent(Integer heightPercent) {
        this.heightPercent = heightPercent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getHeightPercent() {
        return heightPercent;
    }

    public void setHeightPercent(Integer heightPercent) {
        this.heightPercent = heightPercent;
    }

    @SerializedName("HidePivotFieldButtons")
    @JsonProperty("HidePivotFieldButtons")
    private Boolean hidePivotFieldButtons;

    public Chart hidePivotFieldButtons(Boolean hidePivotFieldButtons) {
        this.hidePivotFieldButtons = hidePivotFieldButtons;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHidePivotFieldButtons() {
        return hidePivotFieldButtons;
    }

    public void setHidePivotFieldButtons(Boolean hidePivotFieldButtons) {
        this.hidePivotFieldButtons = hidePivotFieldButtons;
    }

    @SerializedName("Is3D")
    @JsonProperty("Is3D")
    private Boolean is3D;

    public Chart is3D(Boolean is3D) {
        this.is3D = is3D;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIs3D() {
        return is3D;
    }

    public void setIs3D(Boolean is3D) {
        this.is3D = is3D;
    }

    @SerializedName("IsRectangularCornered")
    @JsonProperty("IsRectangularCornered")
    private Boolean isRectangularCornered;

    public Chart isRectangularCornered(Boolean isRectangularCornered) {
        this.isRectangularCornered = isRectangularCornered;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsRectangularCornered() {
        return isRectangularCornered;
    }

    public void setIsRectangularCornered(Boolean isRectangularCornered) {
        this.isRectangularCornered = isRectangularCornered;
    }

    @SerializedName("Legend")
    @JsonProperty("Legend")
    private Legend legend;

    public Chart legend(Legend legend) {
        this.legend = legend;
        return this;
    }

    @ApiModelProperty(value = "")
    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Chart name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("NSeries")
    @JsonProperty("NSeries")
    private SeriesItems nSeries;

    public Chart nSeries(SeriesItems nSeries) {
        this.nSeries = nSeries;
        return this;
    }

    @ApiModelProperty(value = "")
    public SeriesItems getNSeries() {
        return nSeries;
    }

    public void setNSeries(SeriesItems nSeries) {
        this.nSeries = nSeries;
    }

    @SerializedName("PageSetup")
    @JsonProperty("PageSetup")
    private LinkElement pageSetup;

    public Chart pageSetup(LinkElement pageSetup) {
        this.pageSetup = pageSetup;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getPageSetup() {
        return pageSetup;
    }

    public void setPageSetup(LinkElement pageSetup) {
        this.pageSetup = pageSetup;
    }

    @SerializedName("Perspective")
    @JsonProperty("Perspective")
    private Integer perspective;

    public Chart perspective(Integer perspective) {
        this.perspective = perspective;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPerspective() {
        return perspective;
    }

    public void setPerspective(Integer perspective) {
        this.perspective = perspective;
    }

    @SerializedName("PivotSource")
    @JsonProperty("PivotSource")
    private String pivotSource;

    public Chart pivotSource(String pivotSource) {
        this.pivotSource = pivotSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPivotSource() {
        return pivotSource;
    }

    public void setPivotSource(String pivotSource) {
        this.pivotSource = pivotSource;
    }

    @SerializedName("Placement")
    @JsonProperty("Placement")
    private String placement;

    public Chart placement(String placement) {
        this.placement = placement;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    @SerializedName("PlotArea")
    @JsonProperty("PlotArea")
    private PlotArea plotArea;

    public Chart plotArea(PlotArea plotArea) {
        this.plotArea = plotArea;
        return this;
    }

    @ApiModelProperty(value = "")
    public PlotArea getPlotArea() {
        return plotArea;
    }

    public void setPlotArea(PlotArea plotArea) {
        this.plotArea = plotArea;
    }

    @SerializedName("PlotEmptyCellsType")
    @JsonProperty("PlotEmptyCellsType")
    private String plotEmptyCellsType;

    public Chart plotEmptyCellsType(String plotEmptyCellsType) {
        this.plotEmptyCellsType = plotEmptyCellsType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPlotEmptyCellsType() {
        return plotEmptyCellsType;
    }

    public void setPlotEmptyCellsType(String plotEmptyCellsType) {
        this.plotEmptyCellsType = plotEmptyCellsType;
    }

    @SerializedName("PlotVisibleCells")
    @JsonProperty("PlotVisibleCells")
    private Boolean plotVisibleCells;

    public Chart plotVisibleCells(Boolean plotVisibleCells) {
        this.plotVisibleCells = plotVisibleCells;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPlotVisibleCells() {
        return plotVisibleCells;
    }

    public void setPlotVisibleCells(Boolean plotVisibleCells) {
        this.plotVisibleCells = plotVisibleCells;
    }

    @SerializedName("PrintSize")
    @JsonProperty("PrintSize")
    private String printSize;

    public Chart printSize(String printSize) {
        this.printSize = printSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPrintSize() {
        return printSize;
    }

    public void setPrintSize(String printSize) {
        this.printSize = printSize;
    }

    @SerializedName("RightAngleAxes")
    @JsonProperty("RightAngleAxes")
    private Boolean rightAngleAxes;

    public Chart rightAngleAxes(Boolean rightAngleAxes) {
        this.rightAngleAxes = rightAngleAxes;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getRightAngleAxes() {
        return rightAngleAxes;
    }

    public void setRightAngleAxes(Boolean rightAngleAxes) {
        this.rightAngleAxes = rightAngleAxes;
    }

    @SerializedName("RotationAngle")
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    public Chart rotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    @SerializedName("SecondCategoryAxis")
    @JsonProperty("SecondCategoryAxis")
    private LinkElement secondCategoryAxis;

    public Chart secondCategoryAxis(LinkElement secondCategoryAxis) {
        this.secondCategoryAxis = secondCategoryAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getSecondCategoryAxis() {
        return secondCategoryAxis;
    }

    public void setSecondCategoryAxis(LinkElement secondCategoryAxis) {
        this.secondCategoryAxis = secondCategoryAxis;
    }

    @SerializedName("SecondValueAxis")
    @JsonProperty("SecondValueAxis")
    private LinkElement secondValueAxis;

    public Chart secondValueAxis(LinkElement secondValueAxis) {
        this.secondValueAxis = secondValueAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getSecondValueAxis() {
        return secondValueAxis;
    }

    public void setSecondValueAxis(LinkElement secondValueAxis) {
        this.secondValueAxis = secondValueAxis;
    }

    @SerializedName("SeriesAxis")
    @JsonProperty("SeriesAxis")
    private LinkElement seriesAxis;

    public Chart seriesAxis(LinkElement seriesAxis) {
        this.seriesAxis = seriesAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getSeriesAxis() {
        return seriesAxis;
    }

    public void setSeriesAxis(LinkElement seriesAxis) {
        this.seriesAxis = seriesAxis;
    }

    @SerializedName("Shapes")
    @JsonProperty("Shapes")
    private LinkElement shapes;

    public Chart shapes(LinkElement shapes) {
        this.shapes = shapes;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getShapes() {
        return shapes;
    }

    public void setShapes(LinkElement shapes) {
        this.shapes = shapes;
    }

    @SerializedName("ShowDataTable")
    @JsonProperty("ShowDataTable")
    private Boolean showDataTable;

    public Chart showDataTable(Boolean showDataTable) {
        this.showDataTable = showDataTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowDataTable() {
        return showDataTable;
    }

    public void setShowDataTable(Boolean showDataTable) {
        this.showDataTable = showDataTable;
    }

    @SerializedName("ShowLegend")
    @JsonProperty("ShowLegend")
    private Boolean showLegend;

    public Chart showLegend(Boolean showLegend) {
        this.showLegend = showLegend;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowLegend() {
        return showLegend;
    }

    public void setShowLegend(Boolean showLegend) {
        this.showLegend = showLegend;
    }

    @SerializedName("SideWall")
    @JsonProperty("SideWall")
    private LinkElement sideWall;

    public Chart sideWall(LinkElement sideWall) {
        this.sideWall = sideWall;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getSideWall() {
        return sideWall;
    }

    public void setSideWall(LinkElement sideWall) {
        this.sideWall = sideWall;
    }

    @SerializedName("SizeWithWindow")
    @JsonProperty("SizeWithWindow")
    private Boolean sizeWithWindow;

    public Chart sizeWithWindow(Boolean sizeWithWindow) {
        this.sizeWithWindow = sizeWithWindow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSizeWithWindow() {
        return sizeWithWindow;
    }

    public void setSizeWithWindow(Boolean sizeWithWindow) {
        this.sizeWithWindow = sizeWithWindow;
    }

    @SerializedName("Style")
    @JsonProperty("Style")
    private Integer style;

    public Chart style(Integer style) {
        this.style = style;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    @SerializedName("Title")
    @JsonProperty("Title")
    private LinkElement title;

    public Chart title(LinkElement title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getTitle() {
        return title;
    }

    public void setTitle(LinkElement title) {
        this.title = title;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public Chart type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("ValueAxis")
    @JsonProperty("ValueAxis")
    private Axis valueAxis;

    public Chart valueAxis(Axis valueAxis) {
        this.valueAxis = valueAxis;
        return this;
    }

    @ApiModelProperty(value = "")
    public Axis getValueAxis() {
        return valueAxis;
    }

    public void setValueAxis(Axis valueAxis) {
        this.valueAxis = valueAxis;
    }

    @SerializedName("Walls")
    @JsonProperty("Walls")
    private LinkElement walls;

    public Chart walls(LinkElement walls) {
        this.walls = walls;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getWalls() {
        return walls;
    }

    public void setWalls(LinkElement walls) {
        this.walls = walls;
    }

    @SerializedName("WallsAndGridlines2D")
    @JsonProperty("WallsAndGridlines2D")
    private Boolean wallsAndGridlines2D;

    public Chart wallsAndGridlines2D(Boolean wallsAndGridlines2D) {
        this.wallsAndGridlines2D = wallsAndGridlines2D;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getWallsAndGridlines2D() {
        return wallsAndGridlines2D;
    }

    public void setWallsAndGridlines2D(Boolean wallsAndGridlines2D) {
        this.wallsAndGridlines2D = wallsAndGridlines2D;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Chart other = (Chart) o;
        return Objects.equals(this.autoScaling, other.autoScaling)
            && Objects.equals(this.backWall, other.backWall)
            && Objects.equals(this.categoryAxis, other.categoryAxis)
            && Objects.equals(this.chartArea, other.chartArea)
            && Objects.equals(this.chartDataTable, other.chartDataTable)
            && Objects.equals(this.chartObject, other.chartObject)
            && Objects.equals(this.depthPercent, other.depthPercent)
            && Objects.equals(this.elevation, other.elevation)
            && Objects.equals(this.firstSliceAngle, other.firstSliceAngle)
            && Objects.equals(this.floor, other.floor)
            && Objects.equals(this.gapDepth, other.gapDepth)
            && Objects.equals(this.gapWidth, other.gapWidth)
            && Objects.equals(this.heightPercent, other.heightPercent)
            && Objects.equals(this.hidePivotFieldButtons, other.hidePivotFieldButtons)
            && Objects.equals(this.is3D, other.is3D)
            && Objects.equals(this.isRectangularCornered, other.isRectangularCornered)
            && Objects.equals(this.legend, other.legend)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.nSeries, other.nSeries)
            && Objects.equals(this.pageSetup, other.pageSetup)
            && Objects.equals(this.perspective, other.perspective)
            && Objects.equals(this.pivotSource, other.pivotSource)
            && Objects.equals(this.placement, other.placement)
            && Objects.equals(this.plotArea, other.plotArea)
            && Objects.equals(this.plotEmptyCellsType, other.plotEmptyCellsType)
            && Objects.equals(this.plotVisibleCells, other.plotVisibleCells)
            && Objects.equals(this.printSize, other.printSize)
            && Objects.equals(this.rightAngleAxes, other.rightAngleAxes)
            && Objects.equals(this.rotationAngle, other.rotationAngle)
            && Objects.equals(this.secondCategoryAxis, other.secondCategoryAxis)
            && Objects.equals(this.secondValueAxis, other.secondValueAxis)
            && Objects.equals(this.seriesAxis, other.seriesAxis)
            && Objects.equals(this.shapes, other.shapes)
            && Objects.equals(this.showDataTable, other.showDataTable)
            && Objects.equals(this.showLegend, other.showLegend)
            && Objects.equals(this.sideWall, other.sideWall)
            && Objects.equals(this.sizeWithWindow, other.sizeWithWindow)
            && Objects.equals(this.style, other.style)
            && Objects.equals(this.title, other.title)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.valueAxis, other.valueAxis)
            && Objects.equals(this.walls, other.walls)
            && Objects.equals(this.wallsAndGridlines2D, other.wallsAndGridlines2D);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoScaling, backWall, categoryAxis, chartArea, chartDataTable, chartObject, depthPercent, elevation, firstSliceAngle, floor, gapDepth, gapWidth, heightPercent, hidePivotFieldButtons, is3D, isRectangularCornered, legend, name, nSeries, pageSetup, perspective, pivotSource, placement, plotArea, plotEmptyCellsType, plotVisibleCells, printSize, rightAngleAxes, rotationAngle, secondCategoryAxis, secondValueAxis, seriesAxis, shapes, showDataTable, showLegend, sideWall, sizeWithWindow, style, title, type, valueAxis, walls, wallsAndGridlines2D, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Chart {\n");
        sb.append("    autoScaling: ").append(autoScaling).append("\n");
        sb.append("    backWall: ").append(backWall).append("\n");
        sb.append("    categoryAxis: ").append(categoryAxis).append("\n");
        sb.append("    chartArea: ").append(chartArea).append("\n");
        sb.append("    chartDataTable: ").append(chartDataTable).append("\n");
        sb.append("    chartObject: ").append(chartObject).append("\n");
        sb.append("    depthPercent: ").append(depthPercent).append("\n");
        sb.append("    elevation: ").append(elevation).append("\n");
        sb.append("    firstSliceAngle: ").append(firstSliceAngle).append("\n");
        sb.append("    floor: ").append(floor).append("\n");
        sb.append("    gapDepth: ").append(gapDepth).append("\n");
        sb.append("    gapWidth: ").append(gapWidth).append("\n");
        sb.append("    heightPercent: ").append(heightPercent).append("\n");
        sb.append("    hidePivotFieldButtons: ").append(hidePivotFieldButtons).append("\n");
        sb.append("    is3D: ").append(is3D).append("\n");
        sb.append("    isRectangularCornered: ").append(isRectangularCornered).append("\n");
        sb.append("    legend: ").append(legend).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    nSeries: ").append(nSeries).append("\n");
        sb.append("    pageSetup: ").append(pageSetup).append("\n");
        sb.append("    perspective: ").append(perspective).append("\n");
        sb.append("    pivotSource: ").append(pivotSource).append("\n");
        sb.append("    placement: ").append(placement).append("\n");
        sb.append("    plotArea: ").append(plotArea).append("\n");
        sb.append("    plotEmptyCellsType: ").append(plotEmptyCellsType).append("\n");
        sb.append("    plotVisibleCells: ").append(plotVisibleCells).append("\n");
        sb.append("    printSize: ").append(printSize).append("\n");
        sb.append("    rightAngleAxes: ").append(rightAngleAxes).append("\n");
        sb.append("    rotationAngle: ").append(rotationAngle).append("\n");
        sb.append("    secondCategoryAxis: ").append(secondCategoryAxis).append("\n");
        sb.append("    secondValueAxis: ").append(secondValueAxis).append("\n");
        sb.append("    seriesAxis: ").append(seriesAxis).append("\n");
        sb.append("    shapes: ").append(shapes).append("\n");
        sb.append("    showDataTable: ").append(showDataTable).append("\n");
        sb.append("    showLegend: ").append(showLegend).append("\n");
        sb.append("    sideWall: ").append(sideWall).append("\n");
        sb.append("    sizeWithWindow: ").append(sizeWithWindow).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("    title: ").append(title).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    valueAxis: ").append(valueAxis).append("\n");
        sb.append("    walls: ").append(walls).append("\n");
        sb.append("    wallsAndGridlines2D: ").append(wallsAndGridlines2D).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

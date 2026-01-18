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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Chart  extends  LinkElement {
        @SerializedName("AutoScaling")
        private Boolean autoScaling ;

        public  Chart  autoScaling(Boolean  autoScaling) {
            this.autoScaling =  autoScaling;
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
        private Walls backWall ;

        public  Chart  backWall(Walls  backWall) {
            this.backWall =  backWall;
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
        private Axis categoryAxis ;

        public  Chart  categoryAxis(Axis  categoryAxis) {
            this.categoryAxis =  categoryAxis;
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
        private ChartArea chartArea ;

        public  Chart  chartArea(ChartArea  chartArea) {
            this.chartArea =  chartArea;
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
        private ChartDataTable chartDataTable ;

        public  Chart  chartDataTable(ChartDataTable  chartDataTable) {
            this.chartDataTable =  chartDataTable;
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
        private LinkElement chartObject ;

        public  Chart  chartObject(LinkElement  chartObject) {
            this.chartObject =  chartObject;
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
        private Integer depthPercent ;

        public  Chart  depthPercent(Integer  depthPercent) {
            this.depthPercent =  depthPercent;
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
        private Integer elevation ;

        public  Chart  elevation(Integer  elevation) {
            this.elevation =  elevation;
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
        private Integer firstSliceAngle ;

        public  Chart  firstSliceAngle(Integer  firstSliceAngle) {
            this.firstSliceAngle =  firstSliceAngle;
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
        private Floor floor ;

        public  Chart  floor(Floor  floor) {
            this.floor =  floor;
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
        private Integer gapDepth ;

        public  Chart  gapDepth(Integer  gapDepth) {
            this.gapDepth =  gapDepth;
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
        private Integer gapWidth ;

        public  Chart  gapWidth(Integer  gapWidth) {
            this.gapWidth =  gapWidth;
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
        private Integer heightPercent ;

        public  Chart  heightPercent(Integer  heightPercent) {
            this.heightPercent =  heightPercent;
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
        private Boolean hidePivotFieldButtons ;

        public  Chart  hidePivotFieldButtons(Boolean  hidePivotFieldButtons) {
            this.hidePivotFieldButtons =  hidePivotFieldButtons;
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
        private Boolean is3D ;

        public  Chart  is3D(Boolean  is3D) {
            this.is3D =  is3D;
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
        private Boolean isRectangularCornered ;

        public  Chart  isRectangularCornered(Boolean  isRectangularCornered) {
            this.isRectangularCornered =  isRectangularCornered;
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
        private Legend legend ;

        public  Chart  legend(Legend  legend) {
            this.legend =  legend;
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
        private String name ;

        public  Chart  name(String  name) {
            this.name =  name;
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
        private SeriesItems nSeries ;

        public  Chart  nSeries(SeriesItems  nSeries) {
            this.nSeries =  nSeries;
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
        private LinkElement pageSetup ;

        public  Chart  pageSetup(LinkElement  pageSetup) {
            this.pageSetup =  pageSetup;
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
        private Integer perspective ;

        public  Chart  perspective(Integer  perspective) {
            this.perspective =  perspective;
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
        private String pivotSource ;

        public  Chart  pivotSource(String  pivotSource) {
            this.pivotSource =  pivotSource;
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
        private String placement ;

        public  Chart  placement(String  placement) {
            this.placement =  placement;
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
        private PlotArea plotArea ;

        public  Chart  plotArea(PlotArea  plotArea) {
            this.plotArea =  plotArea;
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
        private String plotEmptyCellsType ;

        public  Chart  plotEmptyCellsType(String  plotEmptyCellsType) {
            this.plotEmptyCellsType =  plotEmptyCellsType;
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
        private Boolean plotVisibleCells ;

        public  Chart  plotVisibleCells(Boolean  plotVisibleCells) {
            this.plotVisibleCells =  plotVisibleCells;
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
        private String printSize ;

        public  Chart  printSize(String  printSize) {
            this.printSize =  printSize;
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
        private Boolean rightAngleAxes ;

        public  Chart  rightAngleAxes(Boolean  rightAngleAxes) {
            this.rightAngleAxes =  rightAngleAxes;
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
        private Integer rotationAngle ;

        public  Chart  rotationAngle(Integer  rotationAngle) {
            this.rotationAngle =  rotationAngle;
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
        private LinkElement secondCategoryAxis ;

        public  Chart  secondCategoryAxis(LinkElement  secondCategoryAxis) {
            this.secondCategoryAxis =  secondCategoryAxis;
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
        private LinkElement secondValueAxis ;

        public  Chart  secondValueAxis(LinkElement  secondValueAxis) {
            this.secondValueAxis =  secondValueAxis;
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
        private LinkElement seriesAxis ;

        public  Chart  seriesAxis(LinkElement  seriesAxis) {
            this.seriesAxis =  seriesAxis;
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
        private LinkElement shapes ;

        public  Chart  shapes(LinkElement  shapes) {
            this.shapes =  shapes;
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
        private Boolean showDataTable ;

        public  Chart  showDataTable(Boolean  showDataTable) {
            this.showDataTable =  showDataTable;
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
        private Boolean showLegend ;

        public  Chart  showLegend(Boolean  showLegend) {
            this.showLegend =  showLegend;
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
        private LinkElement sideWall ;

        public  Chart  sideWall(LinkElement  sideWall) {
            this.sideWall =  sideWall;
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
        private Boolean sizeWithWindow ;

        public  Chart  sizeWithWindow(Boolean  sizeWithWindow) {
            this.sizeWithWindow =  sizeWithWindow;
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
        private Integer style ;

        public  Chart  style(Integer  style) {
            this.style =  style;
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
        private LinkElement title ;

        public  Chart  title(LinkElement  title) {
            this.title =  title;
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
        private String type ;

        public  Chart  type(String  type) {
            this.type =  type;
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
        private Axis valueAxis ;

        public  Chart  valueAxis(Axis  valueAxis) {
            this.valueAxis =  valueAxis;
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
        private LinkElement walls ;

        public  Chart  walls(LinkElement  walls) {
            this.walls =  walls;
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
        private Boolean wallsAndGridlines2D ;

        public  Chart  wallsAndGridlines2D(Boolean  wallsAndGridlines2D) {
            this.wallsAndGridlines2D =  wallsAndGridlines2D;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Chart chart = (Chart) o;
            return
                Objects.equals(this.autoScaling, chart.autoScaling) &&
                Objects.equals(this.backWall, chart.backWall) &&
                Objects.equals(this.categoryAxis, chart.categoryAxis) &&
                Objects.equals(this.chartArea, chart.chartArea) &&
                Objects.equals(this.chartDataTable, chart.chartDataTable) &&
                Objects.equals(this.chartObject, chart.chartObject) &&
                Objects.equals(this.depthPercent, chart.depthPercent) &&
                Objects.equals(this.elevation, chart.elevation) &&
                Objects.equals(this.firstSliceAngle, chart.firstSliceAngle) &&
                Objects.equals(this.floor, chart.floor) &&
                Objects.equals(this.gapDepth, chart.gapDepth) &&
                Objects.equals(this.gapWidth, chart.gapWidth) &&
                Objects.equals(this.heightPercent, chart.heightPercent) &&
                Objects.equals(this.hidePivotFieldButtons, chart.hidePivotFieldButtons) &&
                Objects.equals(this.is3D, chart.is3D) &&
                Objects.equals(this.isRectangularCornered, chart.isRectangularCornered) &&
                Objects.equals(this.legend, chart.legend) &&
                Objects.equals(this.name, chart.name) &&
                Objects.equals(this.nSeries, chart.nSeries) &&
                Objects.equals(this.pageSetup, chart.pageSetup) &&
                Objects.equals(this.perspective, chart.perspective) &&
                Objects.equals(this.pivotSource, chart.pivotSource) &&
                Objects.equals(this.placement, chart.placement) &&
                Objects.equals(this.plotArea, chart.plotArea) &&
                Objects.equals(this.plotEmptyCellsType, chart.plotEmptyCellsType) &&
                Objects.equals(this.plotVisibleCells, chart.plotVisibleCells) &&
                Objects.equals(this.printSize, chart.printSize) &&
                Objects.equals(this.rightAngleAxes, chart.rightAngleAxes) &&
                Objects.equals(this.rotationAngle, chart.rotationAngle) &&
                Objects.equals(this.secondCategoryAxis, chart.secondCategoryAxis) &&
                Objects.equals(this.secondValueAxis, chart.secondValueAxis) &&
                Objects.equals(this.seriesAxis, chart.seriesAxis) &&
                Objects.equals(this.shapes, chart.shapes) &&
                Objects.equals(this.showDataTable, chart.showDataTable) &&
                Objects.equals(this.showLegend, chart.showLegend) &&
                Objects.equals(this.sideWall, chart.sideWall) &&
                Objects.equals(this.sizeWithWindow, chart.sizeWithWindow) &&
                Objects.equals(this.style, chart.style) &&
                Objects.equals(this.title, chart.title) &&
                Objects.equals(this.type, chart.type) &&
                Objects.equals(this.valueAxis, chart.valueAxis) &&
                Objects.equals(this.walls, chart.walls) &&
                Objects.equals(this.wallsAndGridlines2D, chart.wallsAndGridlines2D) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoScaling, backWall, categoryAxis, chartArea, chartDataTable, chartObject, depthPercent, elevation, firstSliceAngle, floor, gapDepth, gapWidth, heightPercent, hidePivotFieldButtons, is3D, isRectangularCornered, legend, name, nSeries, pageSetup, perspective, pivotSource, placement, plotArea, plotEmptyCellsType, plotVisibleCells, printSize, rightAngleAxes, rotationAngle, secondCategoryAxis, secondValueAxis, seriesAxis, shapes, showDataTable, showLegend, sideWall, sizeWithWindow, style, title, type, valueAxis, walls, wallsAndGridlines2D, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Chart {\n");
            sb.append("    autoScaling: ").append(toIndentedString(getAutoScaling())).append("\n");
            sb.append("    backWall: ").append(toIndentedString(getBackWall())).append("\n");
            sb.append("    categoryAxis: ").append(toIndentedString(getCategoryAxis())).append("\n");
            sb.append("    chartArea: ").append(toIndentedString(getChartArea())).append("\n");
            sb.append("    chartDataTable: ").append(toIndentedString(getChartDataTable())).append("\n");
            sb.append("    chartObject: ").append(toIndentedString(getChartObject())).append("\n");
            sb.append("    depthPercent: ").append(toIndentedString(getDepthPercent())).append("\n");
            sb.append("    elevation: ").append(toIndentedString(getElevation())).append("\n");
            sb.append("    firstSliceAngle: ").append(toIndentedString(getFirstSliceAngle())).append("\n");
            sb.append("    floor: ").append(toIndentedString(getFloor())).append("\n");
            sb.append("    gapDepth: ").append(toIndentedString(getGapDepth())).append("\n");
            sb.append("    gapWidth: ").append(toIndentedString(getGapWidth())).append("\n");
            sb.append("    heightPercent: ").append(toIndentedString(getHeightPercent())).append("\n");
            sb.append("    hidePivotFieldButtons: ").append(toIndentedString(getHidePivotFieldButtons())).append("\n");
            sb.append("    is3D: ").append(toIndentedString(getIs3D())).append("\n");
            sb.append("    isRectangularCornered: ").append(toIndentedString(getIsRectangularCornered())).append("\n");
            sb.append("    legend: ").append(toIndentedString(getLegend())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    nSeries: ").append(toIndentedString(getNSeries())).append("\n");
            sb.append("    pageSetup: ").append(toIndentedString(getPageSetup())).append("\n");
            sb.append("    perspective: ").append(toIndentedString(getPerspective())).append("\n");
            sb.append("    pivotSource: ").append(toIndentedString(getPivotSource())).append("\n");
            sb.append("    placement: ").append(toIndentedString(getPlacement())).append("\n");
            sb.append("    plotArea: ").append(toIndentedString(getPlotArea())).append("\n");
            sb.append("    plotEmptyCellsType: ").append(toIndentedString(getPlotEmptyCellsType())).append("\n");
            sb.append("    plotVisibleCells: ").append(toIndentedString(getPlotVisibleCells())).append("\n");
            sb.append("    printSize: ").append(toIndentedString(getPrintSize())).append("\n");
            sb.append("    rightAngleAxes: ").append(toIndentedString(getRightAngleAxes())).append("\n");
            sb.append("    rotationAngle: ").append(toIndentedString(getRotationAngle())).append("\n");
            sb.append("    secondCategoryAxis: ").append(toIndentedString(getSecondCategoryAxis())).append("\n");
            sb.append("    secondValueAxis: ").append(toIndentedString(getSecondValueAxis())).append("\n");
            sb.append("    seriesAxis: ").append(toIndentedString(getSeriesAxis())).append("\n");
            sb.append("    shapes: ").append(toIndentedString(getShapes())).append("\n");
            sb.append("    showDataTable: ").append(toIndentedString(getShowDataTable())).append("\n");
            sb.append("    showLegend: ").append(toIndentedString(getShowLegend())).append("\n");
            sb.append("    sideWall: ").append(toIndentedString(getSideWall())).append("\n");
            sb.append("    sizeWithWindow: ").append(toIndentedString(getSizeWithWindow())).append("\n");
            sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
            sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    valueAxis: ").append(toIndentedString(getValueAxis())).append("\n");
            sb.append("    walls: ").append(toIndentedString(getWalls())).append("\n");
            sb.append("    wallsAndGridlines2D: ").append(toIndentedString(getWallsAndGridlines2D())).append("\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}


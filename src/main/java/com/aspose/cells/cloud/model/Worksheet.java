/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Worksheet.java">
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

public class Worksheet {

    @SerializedName("Links")
    @JsonProperty("Links")
    private List<Link> links;

    public Worksheet links(List<Link> links) {
        this.links = links;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @SerializedName("DisplayRightToLeft")
    @JsonProperty("DisplayRightToLeft")
    private Boolean displayRightToLeft;

    public Worksheet displayRightToLeft(Boolean displayRightToLeft) {
        this.displayRightToLeft = displayRightToLeft;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDisplayRightToLeft() {
        return displayRightToLeft;
    }

    public void setDisplayRightToLeft(Boolean displayRightToLeft) {
        this.displayRightToLeft = displayRightToLeft;
    }

    @SerializedName("DisplayZeros")
    @JsonProperty("DisplayZeros")
    private Boolean displayZeros;

    public Worksheet displayZeros(Boolean displayZeros) {
        this.displayZeros = displayZeros;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDisplayZeros() {
        return displayZeros;
    }

    public void setDisplayZeros(Boolean displayZeros) {
        this.displayZeros = displayZeros;
    }

    @SerializedName("FirstVisibleColumn")
    @JsonProperty("FirstVisibleColumn")
    private Integer firstVisibleColumn;

    public Worksheet firstVisibleColumn(Integer firstVisibleColumn) {
        this.firstVisibleColumn = firstVisibleColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstVisibleColumn() {
        return firstVisibleColumn;
    }

    public void setFirstVisibleColumn(Integer firstVisibleColumn) {
        this.firstVisibleColumn = firstVisibleColumn;
    }

    @SerializedName("FirstVisibleRow")
    @JsonProperty("FirstVisibleRow")
    private Integer firstVisibleRow;

    public Worksheet firstVisibleRow(Integer firstVisibleRow) {
        this.firstVisibleRow = firstVisibleRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstVisibleRow() {
        return firstVisibleRow;
    }

    public void setFirstVisibleRow(Integer firstVisibleRow) {
        this.firstVisibleRow = firstVisibleRow;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Worksheet name(String name) {
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

    @SerializedName("Index")
    @JsonProperty("Index")
    private Integer index;

    public Worksheet index(Integer index) {
        this.index = index;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @SerializedName("IsGridlinesVisible")
    @JsonProperty("IsGridlinesVisible")
    private Boolean isGridlinesVisible;

    public Worksheet isGridlinesVisible(Boolean isGridlinesVisible) {
        this.isGridlinesVisible = isGridlinesVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsGridlinesVisible() {
        return isGridlinesVisible;
    }

    public void setIsGridlinesVisible(Boolean isGridlinesVisible) {
        this.isGridlinesVisible = isGridlinesVisible;
    }

    @SerializedName("IsOutlineShown")
    @JsonProperty("IsOutlineShown")
    private Boolean isOutlineShown;

    public Worksheet isOutlineShown(Boolean isOutlineShown) {
        this.isOutlineShown = isOutlineShown;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsOutlineShown() {
        return isOutlineShown;
    }

    public void setIsOutlineShown(Boolean isOutlineShown) {
        this.isOutlineShown = isOutlineShown;
    }

    @SerializedName("IsPageBreakPreview")
    @JsonProperty("IsPageBreakPreview")
    private Boolean isPageBreakPreview;

    public Worksheet isPageBreakPreview(Boolean isPageBreakPreview) {
        this.isPageBreakPreview = isPageBreakPreview;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsPageBreakPreview() {
        return isPageBreakPreview;
    }

    public void setIsPageBreakPreview(Boolean isPageBreakPreview) {
        this.isPageBreakPreview = isPageBreakPreview;
    }

    @SerializedName("IsVisible")
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    public Worksheet isVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @SerializedName("IsProtected")
    @JsonProperty("IsProtected")
    private Boolean isProtected;

    public Worksheet isProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    @SerializedName("IsRowColumnHeadersVisible")
    @JsonProperty("IsRowColumnHeadersVisible")
    private Boolean isRowColumnHeadersVisible;

    public Worksheet isRowColumnHeadersVisible(Boolean isRowColumnHeadersVisible) {
        this.isRowColumnHeadersVisible = isRowColumnHeadersVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsRowColumnHeadersVisible() {
        return isRowColumnHeadersVisible;
    }

    public void setIsRowColumnHeadersVisible(Boolean isRowColumnHeadersVisible) {
        this.isRowColumnHeadersVisible = isRowColumnHeadersVisible;
    }

    @SerializedName("IsRulerVisible")
    @JsonProperty("IsRulerVisible")
    private Boolean isRulerVisible;

    public Worksheet isRulerVisible(Boolean isRulerVisible) {
        this.isRulerVisible = isRulerVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsRulerVisible() {
        return isRulerVisible;
    }

    public void setIsRulerVisible(Boolean isRulerVisible) {
        this.isRulerVisible = isRulerVisible;
    }

    @SerializedName("IsSelected")
    @JsonProperty("IsSelected")
    private Boolean isSelected;

    public Worksheet isSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    @SerializedName("TabColor")
    @JsonProperty("TabColor")
    private Color tabColor;

    public Worksheet tabColor(Color tabColor) {
        this.tabColor = tabColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getTabColor() {
        return tabColor;
    }

    public void setTabColor(Color tabColor) {
        this.tabColor = tabColor;
    }

    @SerializedName("TransitionEntry")
    @JsonProperty("TransitionEntry")
    private Boolean transitionEntry;

    public Worksheet transitionEntry(Boolean transitionEntry) {
        this.transitionEntry = transitionEntry;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getTransitionEntry() {
        return transitionEntry;
    }

    public void setTransitionEntry(Boolean transitionEntry) {
        this.transitionEntry = transitionEntry;
    }

    @SerializedName("TransitionEvaluation")
    @JsonProperty("TransitionEvaluation")
    private Boolean transitionEvaluation;

    public Worksheet transitionEvaluation(Boolean transitionEvaluation) {
        this.transitionEvaluation = transitionEvaluation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getTransitionEvaluation() {
        return transitionEvaluation;
    }

    public void setTransitionEvaluation(Boolean transitionEvaluation) {
        this.transitionEvaluation = transitionEvaluation;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public Worksheet type(String type) {
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

    @SerializedName("ViewType")
    @JsonProperty("ViewType")
    private String viewType;

    public Worksheet viewType(String viewType) {
        this.viewType = viewType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    @SerializedName("VisibilityType")
    @JsonProperty("VisibilityType")
    private String visibilityType;

    public Worksheet visibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getVisibilityType() {
        return visibilityType;
    }

    public void setVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
    }

    @SerializedName("Zoom")
    @JsonProperty("Zoom")
    private Integer zoom;

    public Worksheet zoom(Integer zoom) {
        this.zoom = zoom;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    @SerializedName("Cells")
    @JsonProperty("Cells")
    private LinkElement cells;

    public Worksheet cells(LinkElement cells) {
        this.cells = cells;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getCells() {
        return cells;
    }

    public void setCells(LinkElement cells) {
        this.cells = cells;
    }

    @SerializedName("Charts")
    @JsonProperty("Charts")
    private LinkElement charts;

    public Worksheet charts(LinkElement charts) {
        this.charts = charts;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getCharts() {
        return charts;
    }

    public void setCharts(LinkElement charts) {
        this.charts = charts;
    }

    @SerializedName("AutoShapes")
    @JsonProperty("AutoShapes")
    private LinkElement autoShapes;

    public Worksheet autoShapes(LinkElement autoShapes) {
        this.autoShapes = autoShapes;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getAutoShapes() {
        return autoShapes;
    }

    public void setAutoShapes(LinkElement autoShapes) {
        this.autoShapes = autoShapes;
    }

    @SerializedName("OleObjects")
    @JsonProperty("OleObjects")
    private LinkElement oleObjects;

    public Worksheet oleObjects(LinkElement oleObjects) {
        this.oleObjects = oleObjects;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getOleObjects() {
        return oleObjects;
    }

    public void setOleObjects(LinkElement oleObjects) {
        this.oleObjects = oleObjects;
    }

    @SerializedName("Comments")
    @JsonProperty("Comments")
    private LinkElement comments;

    public Worksheet comments(LinkElement comments) {
        this.comments = comments;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getComments() {
        return comments;
    }

    public void setComments(LinkElement comments) {
        this.comments = comments;
    }

    @SerializedName("Pictures")
    @JsonProperty("Pictures")
    private LinkElement pictures;

    public Worksheet pictures(LinkElement pictures) {
        this.pictures = pictures;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getPictures() {
        return pictures;
    }

    public void setPictures(LinkElement pictures) {
        this.pictures = pictures;
    }

    @SerializedName("MergedCells")
    @JsonProperty("MergedCells")
    private LinkElement mergedCells;

    public Worksheet mergedCells(LinkElement mergedCells) {
        this.mergedCells = mergedCells;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getMergedCells() {
        return mergedCells;
    }

    public void setMergedCells(LinkElement mergedCells) {
        this.mergedCells = mergedCells;
    }

    @SerializedName("Validations")
    @JsonProperty("Validations")
    private LinkElement validations;

    public Worksheet validations(LinkElement validations) {
        this.validations = validations;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getValidations() {
        return validations;
    }

    public void setValidations(LinkElement validations) {
        this.validations = validations;
    }

    @SerializedName("ConditionalFormattings")
    @JsonProperty("ConditionalFormattings")
    private LinkElement conditionalFormattings;

    public Worksheet conditionalFormattings(LinkElement conditionalFormattings) {
        this.conditionalFormattings = conditionalFormattings;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getConditionalFormattings() {
        return conditionalFormattings;
    }

    public void setConditionalFormattings(LinkElement conditionalFormattings) {
        this.conditionalFormattings = conditionalFormattings;
    }

    @SerializedName("Hyperlinks")
    @JsonProperty("Hyperlinks")
    private LinkElement hyperlinks;

    public Worksheet hyperlinks(LinkElement hyperlinks) {
        this.hyperlinks = hyperlinks;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getHyperlinks() {
        return hyperlinks;
    }

    public void setHyperlinks(LinkElement hyperlinks) {
        this.hyperlinks = hyperlinks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Worksheet other = (Worksheet) o;
        return Objects.equals(this.links, other.links)
            && Objects.equals(this.displayRightToLeft, other.displayRightToLeft)
            && Objects.equals(this.displayZeros, other.displayZeros)
            && Objects.equals(this.firstVisibleColumn, other.firstVisibleColumn)
            && Objects.equals(this.firstVisibleRow, other.firstVisibleRow)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.index, other.index)
            && Objects.equals(this.isGridlinesVisible, other.isGridlinesVisible)
            && Objects.equals(this.isOutlineShown, other.isOutlineShown)
            && Objects.equals(this.isPageBreakPreview, other.isPageBreakPreview)
            && Objects.equals(this.isVisible, other.isVisible)
            && Objects.equals(this.isProtected, other.isProtected)
            && Objects.equals(this.isRowColumnHeadersVisible, other.isRowColumnHeadersVisible)
            && Objects.equals(this.isRulerVisible, other.isRulerVisible)
            && Objects.equals(this.isSelected, other.isSelected)
            && Objects.equals(this.tabColor, other.tabColor)
            && Objects.equals(this.transitionEntry, other.transitionEntry)
            && Objects.equals(this.transitionEvaluation, other.transitionEvaluation)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.viewType, other.viewType)
            && Objects.equals(this.visibilityType, other.visibilityType)
            && Objects.equals(this.zoom, other.zoom)
            && Objects.equals(this.cells, other.cells)
            && Objects.equals(this.charts, other.charts)
            && Objects.equals(this.autoShapes, other.autoShapes)
            && Objects.equals(this.oleObjects, other.oleObjects)
            && Objects.equals(this.comments, other.comments)
            && Objects.equals(this.pictures, other.pictures)
            && Objects.equals(this.mergedCells, other.mergedCells)
            && Objects.equals(this.validations, other.validations)
            && Objects.equals(this.conditionalFormattings, other.conditionalFormattings)
            && Objects.equals(this.hyperlinks, other.hyperlinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, displayRightToLeft, displayZeros, firstVisibleColumn, firstVisibleRow, name, index, isGridlinesVisible, isOutlineShown, isPageBreakPreview, isVisible, isProtected, isRowColumnHeadersVisible, isRulerVisible, isSelected, tabColor, transitionEntry, transitionEvaluation, type, viewType, visibilityType, zoom, cells, charts, autoShapes, oleObjects, comments, pictures, mergedCells, validations, conditionalFormattings, hyperlinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Worksheet {\n");
        sb.append("    links: ").append(links).append("\n");
        sb.append("    displayRightToLeft: ").append(displayRightToLeft).append("\n");
        sb.append("    displayZeros: ").append(displayZeros).append("\n");
        sb.append("    firstVisibleColumn: ").append(firstVisibleColumn).append("\n");
        sb.append("    firstVisibleRow: ").append(firstVisibleRow).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    isGridlinesVisible: ").append(isGridlinesVisible).append("\n");
        sb.append("    isOutlineShown: ").append(isOutlineShown).append("\n");
        sb.append("    isPageBreakPreview: ").append(isPageBreakPreview).append("\n");
        sb.append("    isVisible: ").append(isVisible).append("\n");
        sb.append("    isProtected: ").append(isProtected).append("\n");
        sb.append("    isRowColumnHeadersVisible: ").append(isRowColumnHeadersVisible).append("\n");
        sb.append("    isRulerVisible: ").append(isRulerVisible).append("\n");
        sb.append("    isSelected: ").append(isSelected).append("\n");
        sb.append("    tabColor: ").append(tabColor).append("\n");
        sb.append("    transitionEntry: ").append(transitionEntry).append("\n");
        sb.append("    transitionEvaluation: ").append(transitionEvaluation).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    viewType: ").append(viewType).append("\n");
        sb.append("    visibilityType: ").append(visibilityType).append("\n");
        sb.append("    zoom: ").append(zoom).append("\n");
        sb.append("    cells: ").append(cells).append("\n");
        sb.append("    charts: ").append(charts).append("\n");
        sb.append("    autoShapes: ").append(autoShapes).append("\n");
        sb.append("    oleObjects: ").append(oleObjects).append("\n");
        sb.append("    comments: ").append(comments).append("\n");
        sb.append("    pictures: ").append(pictures).append("\n");
        sb.append("    mergedCells: ").append(mergedCells).append("\n");
        sb.append("    validations: ").append(validations).append("\n");
        sb.append("    conditionalFormattings: ").append(conditionalFormattings).append("\n");
        sb.append("    hyperlinks: ").append(hyperlinks).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

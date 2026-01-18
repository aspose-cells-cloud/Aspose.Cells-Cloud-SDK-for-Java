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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Worksheet {
        @SerializedName("Links")
        private List<Link> links ;

        public  Worksheet  links(List<Link>  links) {
            this.links =  links;
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
        private Boolean displayRightToLeft ;

        public  Worksheet  displayRightToLeft(Boolean  displayRightToLeft) {
            this.displayRightToLeft =  displayRightToLeft;
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
        private Boolean displayZeros ;

        public  Worksheet  displayZeros(Boolean  displayZeros) {
            this.displayZeros =  displayZeros;
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
        private Integer firstVisibleColumn ;

        public  Worksheet  firstVisibleColumn(Integer  firstVisibleColumn) {
            this.firstVisibleColumn =  firstVisibleColumn;
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
        private Integer firstVisibleRow ;

        public  Worksheet  firstVisibleRow(Integer  firstVisibleRow) {
            this.firstVisibleRow =  firstVisibleRow;
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
        private String name ;

        public  Worksheet  name(String  name) {
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

        @SerializedName("Index")
        private Integer index ;

        public  Worksheet  index(Integer  index) {
            this.index =  index;
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
        private Boolean isGridlinesVisible ;

        public  Worksheet  isGridlinesVisible(Boolean  isGridlinesVisible) {
            this.isGridlinesVisible =  isGridlinesVisible;
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
        private Boolean isOutlineShown ;

        public  Worksheet  isOutlineShown(Boolean  isOutlineShown) {
            this.isOutlineShown =  isOutlineShown;
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
        private Boolean isPageBreakPreview ;

        public  Worksheet  isPageBreakPreview(Boolean  isPageBreakPreview) {
            this.isPageBreakPreview =  isPageBreakPreview;
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
        private Boolean isVisible ;

        public  Worksheet  isVisible(Boolean  isVisible) {
            this.isVisible =  isVisible;
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
        private Boolean isProtected ;

        public  Worksheet  isProtected(Boolean  isProtected) {
            this.isProtected =  isProtected;
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
        private Boolean isRowColumnHeadersVisible ;

        public  Worksheet  isRowColumnHeadersVisible(Boolean  isRowColumnHeadersVisible) {
            this.isRowColumnHeadersVisible =  isRowColumnHeadersVisible;
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
        private Boolean isRulerVisible ;

        public  Worksheet  isRulerVisible(Boolean  isRulerVisible) {
            this.isRulerVisible =  isRulerVisible;
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
        private Boolean isSelected ;

        public  Worksheet  isSelected(Boolean  isSelected) {
            this.isSelected =  isSelected;
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
        private Color tabColor ;

        public  Worksheet  tabColor(Color  tabColor) {
            this.tabColor =  tabColor;
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
        private Boolean transitionEntry ;

        public  Worksheet  transitionEntry(Boolean  transitionEntry) {
            this.transitionEntry =  transitionEntry;
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
        private Boolean transitionEvaluation ;

        public  Worksheet  transitionEvaluation(Boolean  transitionEvaluation) {
            this.transitionEvaluation =  transitionEvaluation;
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
        private String type ;

        public  Worksheet  type(String  type) {
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

        @SerializedName("ViewType")
        private String viewType ;

        public  Worksheet  viewType(String  viewType) {
            this.viewType =  viewType;
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
        private String visibilityType ;

        public  Worksheet  visibilityType(String  visibilityType) {
            this.visibilityType =  visibilityType;
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
        private Integer zoom ;

        public  Worksheet  zoom(Integer  zoom) {
            this.zoom =  zoom;
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
        private LinkElement cells ;

        public  Worksheet  cells(LinkElement  cells) {
            this.cells =  cells;
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
        private LinkElement charts ;

        public  Worksheet  charts(LinkElement  charts) {
            this.charts =  charts;
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
        private LinkElement autoShapes ;

        public  Worksheet  autoShapes(LinkElement  autoShapes) {
            this.autoShapes =  autoShapes;
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
        private LinkElement oleObjects ;

        public  Worksheet  oleObjects(LinkElement  oleObjects) {
            this.oleObjects =  oleObjects;
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
        private LinkElement comments ;

        public  Worksheet  comments(LinkElement  comments) {
            this.comments =  comments;
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
        private LinkElement pictures ;

        public  Worksheet  pictures(LinkElement  pictures) {
            this.pictures =  pictures;
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
        private LinkElement mergedCells ;

        public  Worksheet  mergedCells(LinkElement  mergedCells) {
            this.mergedCells =  mergedCells;
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
        private LinkElement validations ;

        public  Worksheet  validations(LinkElement  validations) {
            this.validations =  validations;
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
        private LinkElement conditionalFormattings ;

        public  Worksheet  conditionalFormattings(LinkElement  conditionalFormattings) {
            this.conditionalFormattings =  conditionalFormattings;
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
        private LinkElement hyperlinks ;

        public  Worksheet  hyperlinks(LinkElement  hyperlinks) {
            this.hyperlinks =  hyperlinks;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Worksheet worksheet = (Worksheet) o;
            return
                Objects.equals(this.links, worksheet.links) &&
                Objects.equals(this.displayRightToLeft, worksheet.displayRightToLeft) &&
                Objects.equals(this.displayZeros, worksheet.displayZeros) &&
                Objects.equals(this.firstVisibleColumn, worksheet.firstVisibleColumn) &&
                Objects.equals(this.firstVisibleRow, worksheet.firstVisibleRow) &&
                Objects.equals(this.name, worksheet.name) &&
                Objects.equals(this.index, worksheet.index) &&
                Objects.equals(this.isGridlinesVisible, worksheet.isGridlinesVisible) &&
                Objects.equals(this.isOutlineShown, worksheet.isOutlineShown) &&
                Objects.equals(this.isPageBreakPreview, worksheet.isPageBreakPreview) &&
                Objects.equals(this.isVisible, worksheet.isVisible) &&
                Objects.equals(this.isProtected, worksheet.isProtected) &&
                Objects.equals(this.isRowColumnHeadersVisible, worksheet.isRowColumnHeadersVisible) &&
                Objects.equals(this.isRulerVisible, worksheet.isRulerVisible) &&
                Objects.equals(this.isSelected, worksheet.isSelected) &&
                Objects.equals(this.tabColor, worksheet.tabColor) &&
                Objects.equals(this.transitionEntry, worksheet.transitionEntry) &&
                Objects.equals(this.transitionEvaluation, worksheet.transitionEvaluation) &&
                Objects.equals(this.type, worksheet.type) &&
                Objects.equals(this.viewType, worksheet.viewType) &&
                Objects.equals(this.visibilityType, worksheet.visibilityType) &&
                Objects.equals(this.zoom, worksheet.zoom) &&
                Objects.equals(this.cells, worksheet.cells) &&
                Objects.equals(this.charts, worksheet.charts) &&
                Objects.equals(this.autoShapes, worksheet.autoShapes) &&
                Objects.equals(this.oleObjects, worksheet.oleObjects) &&
                Objects.equals(this.comments, worksheet.comments) &&
                Objects.equals(this.pictures, worksheet.pictures) &&
                Objects.equals(this.mergedCells, worksheet.mergedCells) &&
                Objects.equals(this.validations, worksheet.validations) &&
                Objects.equals(this.conditionalFormattings, worksheet.conditionalFormattings) &&
                Objects.equals(this.hyperlinks, worksheet.hyperlinks);
      }

      @Override
      public int hashCode() {
        return Objects.hash(links, displayRightToLeft, displayZeros, firstVisibleColumn, firstVisibleRow, name, index, isGridlinesVisible, isOutlineShown, isPageBreakPreview, isVisible, isProtected, isRowColumnHeadersVisible, isRulerVisible, isSelected, tabColor, transitionEntry, transitionEvaluation, type, viewType, visibilityType, zoom, cells, charts, autoShapes, oleObjects, comments, pictures, mergedCells, validations, conditionalFormattings, hyperlinks);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Worksheet {\n");
            sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
            sb.append("    displayRightToLeft: ").append(toIndentedString(getDisplayRightToLeft())).append("\n");
            sb.append("    displayZeros: ").append(toIndentedString(getDisplayZeros())).append("\n");
            sb.append("    firstVisibleColumn: ").append(toIndentedString(getFirstVisibleColumn())).append("\n");
            sb.append("    firstVisibleRow: ").append(toIndentedString(getFirstVisibleRow())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    index: ").append(toIndentedString(getIndex())).append("\n");
            sb.append("    isGridlinesVisible: ").append(toIndentedString(getIsGridlinesVisible())).append("\n");
            sb.append("    isOutlineShown: ").append(toIndentedString(getIsOutlineShown())).append("\n");
            sb.append("    isPageBreakPreview: ").append(toIndentedString(getIsPageBreakPreview())).append("\n");
            sb.append("    isVisible: ").append(toIndentedString(getIsVisible())).append("\n");
            sb.append("    isProtected: ").append(toIndentedString(getIsProtected())).append("\n");
            sb.append("    isRowColumnHeadersVisible: ").append(toIndentedString(getIsRowColumnHeadersVisible())).append("\n");
            sb.append("    isRulerVisible: ").append(toIndentedString(getIsRulerVisible())).append("\n");
            sb.append("    isSelected: ").append(toIndentedString(getIsSelected())).append("\n");
            sb.append("    tabColor: ").append(toIndentedString(getTabColor())).append("\n");
            sb.append("    transitionEntry: ").append(toIndentedString(getTransitionEntry())).append("\n");
            sb.append("    transitionEvaluation: ").append(toIndentedString(getTransitionEvaluation())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    viewType: ").append(toIndentedString(getViewType())).append("\n");
            sb.append("    visibilityType: ").append(toIndentedString(getVisibilityType())).append("\n");
            sb.append("    zoom: ").append(toIndentedString(getZoom())).append("\n");
            sb.append("    cells: ").append(toIndentedString(getCells())).append("\n");
            sb.append("    charts: ").append(toIndentedString(getCharts())).append("\n");
            sb.append("    autoShapes: ").append(toIndentedString(getAutoShapes())).append("\n");
            sb.append("    oleObjects: ").append(toIndentedString(getOleObjects())).append("\n");
            sb.append("    comments: ").append(toIndentedString(getComments())).append("\n");
            sb.append("    pictures: ").append(toIndentedString(getPictures())).append("\n");
            sb.append("    mergedCells: ").append(toIndentedString(getMergedCells())).append("\n");
            sb.append("    validations: ").append(toIndentedString(getValidations())).append("\n");
            sb.append("    conditionalFormattings: ").append(toIndentedString(getConditionalFormattings())).append("\n");
            sb.append("    hyperlinks: ").append(toIndentedString(getHyperlinks())).append("\n");
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


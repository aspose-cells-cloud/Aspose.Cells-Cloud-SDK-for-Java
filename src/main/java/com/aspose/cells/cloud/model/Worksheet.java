package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Worksheet — Encapsulates the object that represents a single worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Worksheet {
    /** Property Summary: Contains a list of links represented by the class link. */
    @JsonProperty("Links")
    private List<Link> links;

    /** Indicates if the specified worksheet is displayed from right to left instead of from left to right. Default is false. */
    @JsonProperty("DisplayRightToLeft")
    private Boolean displayRightToLeft;

    /** True if zero values are displayed. */
    @JsonProperty("DisplayZeros")
    private Boolean displayZeros;

    /** Represents first visible column index. */
    @JsonProperty("FirstVisibleColumn")
    private Integer firstVisibleColumn;

    /** Represents first visible row index. */
    @JsonProperty("FirstVisibleRow")
    private Integer firstVisibleRow;

    /** Gets or sets the name of the worksheet. */
    @JsonProperty("Name")
    private String name;

    /** Gets the index of sheet in the worksheet collection. */
    @JsonProperty("Index")
    private Integer index;

    /** Gets or sets a value indicating whether the gridlines are visible.Default is true. */
    @JsonProperty("IsGridlinesVisible")
    private Boolean isGridlinesVisible;

    /** Indicates whether to show outline. */
    @JsonProperty("IsOutlineShown")
    private Boolean isOutlineShown;

    /** Indicates whether the specified worksheet is shown in normal view or page break preview. */
    @JsonProperty("IsPageBreakPreview")
    private Boolean isPageBreakPreview;

    /** Represents if the worksheet is visible. */
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    /** Indicates if the worksheet is protected. */
    @JsonProperty("IsProtected")
    private Boolean isProtected;

    /** Gets or sets a value indicating whether the worksheet will display row and column headers. Default is true. */
    @JsonProperty("IsRowColumnHeadersVisible")
    private Boolean isRowColumnHeadersVisible;

    /** Indicates whether the ruler is visible. This property is only applied for page break preview. */
    @JsonProperty("IsRulerVisible")
    private Boolean isRulerVisible;

    /** Indicates whether this worksheet is selected when the workbook is opened. */
    @JsonProperty("IsSelected")
    private Boolean isSelected;

    /** Represents worksheet tab color. */
    @JsonProperty("TabColor")
    private Color tabColor;

    /** Indicates whether the Transition Formula Entry (Lotus compatibility) option is enabled. */
    @JsonProperty("TransitionEntry")
    private Boolean transitionEntry;

    /** Indicates whether the Transition Formula Evaluation (Lotus compatibility) option is enabled. */
    @JsonProperty("TransitionEvaluation")
    private Boolean transitionEvaluation;

    /** Represents worksheet type. */
    @JsonProperty("Type")
    private String type;

    /** Gets and sets the view type. */
    @JsonProperty("ViewType")
    private String viewType;

    /** Indicates the visible state for this sheet. */
    @JsonProperty("VisibilityType")
    private String visibilityType;

    /** Represents the scaling factor in percentage. It should be between 10 and 400. */
    @JsonProperty("Zoom")
    private Integer zoom;

    /** Gets the  collection. */
    @JsonProperty("Cells")
    private LinkElement cells;

    /** Gets a  collection */
    @JsonProperty("Charts")
    private LinkElement charts;

    /** Gets or sets AutoShapes. */
    @JsonProperty("AutoShapes")
    private LinkElement autoShapes;

    /** Represents a collection of  in a worksheet. */
    @JsonProperty("OleObjects")
    private LinkElement oleObjects;

    /** Gets the  collection. */
    @JsonProperty("Comments")
    private LinkElement comments;

    /** Gets a  collection. */
    @JsonProperty("Pictures")
    private LinkElement pictures;

    /** Gets or sets MergedCells. */
    @JsonProperty("MergedCells")
    private LinkElement mergedCells;

    /** Gets the data validation setting collection in the worksheet. */
    @JsonProperty("Validations")
    private LinkElement validations;

    /** Gets the ConditionalFormattings in the worksheet. */
    @JsonProperty("ConditionalFormattings")
    private LinkElement conditionalFormattings;

    /** Gets the  collection. */
    @JsonProperty("Hyperlinks")
    private LinkElement hyperlinks;

    public List<Link> getLinks() { return links; }
    public Worksheet setLinks(List<Link> links) { this.links = links; return this; }

    public Boolean getDisplayRightToLeft() { return displayRightToLeft; }
    public Worksheet setDisplayRightToLeft(Boolean displayRightToLeft) { this.displayRightToLeft = displayRightToLeft; return this; }

    public Boolean getDisplayZeros() { return displayZeros; }
    public Worksheet setDisplayZeros(Boolean displayZeros) { this.displayZeros = displayZeros; return this; }

    public Integer getFirstVisibleColumn() { return firstVisibleColumn; }
    public Worksheet setFirstVisibleColumn(Integer firstVisibleColumn) { this.firstVisibleColumn = firstVisibleColumn; return this; }

    public Integer getFirstVisibleRow() { return firstVisibleRow; }
    public Worksheet setFirstVisibleRow(Integer firstVisibleRow) { this.firstVisibleRow = firstVisibleRow; return this; }

    public String getName() { return name; }
    public Worksheet setName(String name) { this.name = name; return this; }

    public Integer getIndex() { return index; }
    public Worksheet setIndex(Integer index) { this.index = index; return this; }

    public Boolean getIsGridlinesVisible() { return isGridlinesVisible; }
    public Worksheet setIsGridlinesVisible(Boolean isGridlinesVisible) { this.isGridlinesVisible = isGridlinesVisible; return this; }

    public Boolean getIsOutlineShown() { return isOutlineShown; }
    public Worksheet setIsOutlineShown(Boolean isOutlineShown) { this.isOutlineShown = isOutlineShown; return this; }

    public Boolean getIsPageBreakPreview() { return isPageBreakPreview; }
    public Worksheet setIsPageBreakPreview(Boolean isPageBreakPreview) { this.isPageBreakPreview = isPageBreakPreview; return this; }

    public Boolean getIsVisible() { return isVisible; }
    public Worksheet setIsVisible(Boolean isVisible) { this.isVisible = isVisible; return this; }

    public Boolean getIsProtected() { return isProtected; }
    public Worksheet setIsProtected(Boolean isProtected) { this.isProtected = isProtected; return this; }

    public Boolean getIsRowColumnHeadersVisible() { return isRowColumnHeadersVisible; }
    public Worksheet setIsRowColumnHeadersVisible(Boolean isRowColumnHeadersVisible) { this.isRowColumnHeadersVisible = isRowColumnHeadersVisible; return this; }

    public Boolean getIsRulerVisible() { return isRulerVisible; }
    public Worksheet setIsRulerVisible(Boolean isRulerVisible) { this.isRulerVisible = isRulerVisible; return this; }

    public Boolean getIsSelected() { return isSelected; }
    public Worksheet setIsSelected(Boolean isSelected) { this.isSelected = isSelected; return this; }

    public Color getTabColor() { return tabColor; }
    public Worksheet setTabColor(Color tabColor) { this.tabColor = tabColor; return this; }

    public Boolean getTransitionEntry() { return transitionEntry; }
    public Worksheet setTransitionEntry(Boolean transitionEntry) { this.transitionEntry = transitionEntry; return this; }

    public Boolean getTransitionEvaluation() { return transitionEvaluation; }
    public Worksheet setTransitionEvaluation(Boolean transitionEvaluation) { this.transitionEvaluation = transitionEvaluation; return this; }

    public String getType() { return type; }
    public Worksheet setType(String type) { this.type = type; return this; }

    public String getViewType() { return viewType; }
    public Worksheet setViewType(String viewType) { this.viewType = viewType; return this; }

    public String getVisibilityType() { return visibilityType; }
    public Worksheet setVisibilityType(String visibilityType) { this.visibilityType = visibilityType; return this; }

    public Integer getZoom() { return zoom; }
    public Worksheet setZoom(Integer zoom) { this.zoom = zoom; return this; }

    public LinkElement getCells() { return cells; }
    public Worksheet setCells(LinkElement cells) { this.cells = cells; return this; }

    public LinkElement getCharts() { return charts; }
    public Worksheet setCharts(LinkElement charts) { this.charts = charts; return this; }

    public LinkElement getAutoShapes() { return autoShapes; }
    public Worksheet setAutoShapes(LinkElement autoShapes) { this.autoShapes = autoShapes; return this; }

    public LinkElement getOleObjects() { return oleObjects; }
    public Worksheet setOleObjects(LinkElement oleObjects) { this.oleObjects = oleObjects; return this; }

    public LinkElement getComments() { return comments; }
    public Worksheet setComments(LinkElement comments) { this.comments = comments; return this; }

    public LinkElement getPictures() { return pictures; }
    public Worksheet setPictures(LinkElement pictures) { this.pictures = pictures; return this; }

    public LinkElement getMergedCells() { return mergedCells; }
    public Worksheet setMergedCells(LinkElement mergedCells) { this.mergedCells = mergedCells; return this; }

    public LinkElement getValidations() { return validations; }
    public Worksheet setValidations(LinkElement validations) { this.validations = validations; return this; }

    public LinkElement getConditionalFormattings() { return conditionalFormattings; }
    public Worksheet setConditionalFormattings(LinkElement conditionalFormattings) { this.conditionalFormattings = conditionalFormattings; return this; }

    public LinkElement getHyperlinks() { return hyperlinks; }
    public Worksheet setHyperlinks(LinkElement hyperlinks) { this.hyperlinks = hyperlinks; return this; }

}

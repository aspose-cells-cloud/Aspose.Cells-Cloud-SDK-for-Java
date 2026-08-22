package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotField — Represents a field in a PivotTable report. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotField {
    /** Represent the number of top or bottom items            that are automatically shown in the specified PivotTable field. */
    @JsonProperty("AutoShowCount")
    private Integer autoShowCount;

    /** Gets or sets AutoShowField. */
    @JsonProperty("AutoShowField")
    private Integer autoShowField;

    /** Gets or sets AutoSortField. */
    @JsonProperty("AutoSortField")
    private Integer autoSortField;

    /** Gets or sets BaseField. */
    @JsonProperty("BaseField")
    private Integer baseField;

    /** Gets or sets BaseIndex. */
    @JsonProperty("BaseIndex")
    private Integer baseIndex;

    /** Gets or sets BaseItem. */
    @JsonProperty("BaseItem")
    private Integer baseItem;

    /** Gets or sets BaseItemPosition. */
    @JsonProperty("BaseItemPosition")
    private String baseItemPosition;

    /** Gets or sets CurrentPageItem. */
    @JsonProperty("CurrentPageItem")
    private Integer currentPageItem;

    /** Gets or sets DataDisplayFormat. */
    @JsonProperty("DataDisplayFormat")
    private String dataDisplayFormat;

    /** Gets or sets DisplayName. */
    @JsonProperty("DisplayName")
    private String displayName;

    /** Gets or sets DragToColumn. */
    @JsonProperty("DragToColumn")
    private Boolean dragToColumn;

    /** Gets or sets DragToData. */
    @JsonProperty("DragToData")
    private Boolean dragToData;

    /** Gets or sets DragToHide. */
    @JsonProperty("DragToHide")
    private Boolean dragToHide;

    /** Gets or sets DragToPage. */
    @JsonProperty("DragToPage")
    private Boolean dragToPage;

    /** Gets or sets DragToRow. */
    @JsonProperty("DragToRow")
    private Boolean dragToRow;

    /** Gets or sets Function. */
    @JsonProperty("Function")
    private String function;

    /** Gets or sets InsertBlankRow. */
    @JsonProperty("InsertBlankRow")
    private Boolean insertBlankRow;

    /** Gets or sets IsAscendShow. */
    @JsonProperty("IsAscendShow")
    private Boolean isAscendShow;

    /** Gets or sets IsAscendSort. */
    @JsonProperty("IsAscendSort")
    private Boolean isAscendSort;

    /** Gets or sets IsAutoShow. */
    @JsonProperty("IsAutoShow")
    private Boolean isAutoShow;

    /** Gets or sets IsAutoSort. */
    @JsonProperty("IsAutoSort")
    private Boolean isAutoSort;

    /** Gets or sets IsAutoSubtotals. */
    @JsonProperty("IsAutoSubtotals")
    private Boolean isAutoSubtotals;

    /** Gets or sets IsCalculatedField. */
    @JsonProperty("IsCalculatedField")
    private Boolean isCalculatedField;

    /** Gets or sets IsIncludeNewItemsInFilter. */
    @JsonProperty("IsIncludeNewItemsInFilter")
    private Boolean isIncludeNewItemsInFilter;

    /** Gets or sets IsInsertPageBreaksBetweenItems. */
    @JsonProperty("IsInsertPageBreaksBetweenItems")
    private Boolean isInsertPageBreaksBetweenItems;

    /** Gets or sets IsMultipleItemSelectionAllowed. */
    @JsonProperty("IsMultipleItemSelectionAllowed")
    private Boolean isMultipleItemSelectionAllowed;

    /** Gets or sets IsRepeatItemLabels. */
    @JsonProperty("IsRepeatItemLabels")
    private Boolean isRepeatItemLabels;

    /** Gets or sets ItemCount. */
    @JsonProperty("ItemCount")
    private Integer itemCount;

    /** Gets or sets Items. */
    @JsonProperty("Items")
    private List<String> items;

    /** Gets or sets Name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets Number. */
    @JsonProperty("Number")
    private Integer number;

    /** Gets or sets NumberFormat. */
    @JsonProperty("NumberFormat")
    private String numberFormat;

    /** Gets or sets OriginalItems. */
    @JsonProperty("OriginalItems")
    private List<String> originalItems;

    /** Gets or sets PivotItems. */
    @JsonProperty("PivotItems")
    private List<PivotItem> pivotItems;

    /** Gets or sets Position. */
    @JsonProperty("Position")
    private Integer position;

    /** Gets or sets ShowAllItems. */
    @JsonProperty("ShowAllItems")
    private Boolean showAllItems;

    /** Gets or sets ShowCompact. */
    @JsonProperty("ShowCompact")
    private Boolean showCompact;

    /** Gets or sets ShowInOutlineForm. */
    @JsonProperty("ShowInOutlineForm")
    private Boolean showInOutlineForm;

    /** Gets or sets ShowSubtotalAtTop. */
    @JsonProperty("ShowSubtotalAtTop")
    private Boolean showSubtotalAtTop;

    public Integer getAutoShowCount() { return autoShowCount; }
    public PivotField setAutoShowCount(Integer autoShowCount) { this.autoShowCount = autoShowCount; return this; }

    public Integer getAutoShowField() { return autoShowField; }
    public PivotField setAutoShowField(Integer autoShowField) { this.autoShowField = autoShowField; return this; }

    public Integer getAutoSortField() { return autoSortField; }
    public PivotField setAutoSortField(Integer autoSortField) { this.autoSortField = autoSortField; return this; }

    public Integer getBaseField() { return baseField; }
    public PivotField setBaseField(Integer baseField) { this.baseField = baseField; return this; }

    public Integer getBaseIndex() { return baseIndex; }
    public PivotField setBaseIndex(Integer baseIndex) { this.baseIndex = baseIndex; return this; }

    public Integer getBaseItem() { return baseItem; }
    public PivotField setBaseItem(Integer baseItem) { this.baseItem = baseItem; return this; }

    public String getBaseItemPosition() { return baseItemPosition; }
    public PivotField setBaseItemPosition(String baseItemPosition) { this.baseItemPosition = baseItemPosition; return this; }

    public Integer getCurrentPageItem() { return currentPageItem; }
    public PivotField setCurrentPageItem(Integer currentPageItem) { this.currentPageItem = currentPageItem; return this; }

    public String getDataDisplayFormat() { return dataDisplayFormat; }
    public PivotField setDataDisplayFormat(String dataDisplayFormat) { this.dataDisplayFormat = dataDisplayFormat; return this; }

    public String getDisplayName() { return displayName; }
    public PivotField setDisplayName(String displayName) { this.displayName = displayName; return this; }

    public Boolean getDragToColumn() { return dragToColumn; }
    public PivotField setDragToColumn(Boolean dragToColumn) { this.dragToColumn = dragToColumn; return this; }

    public Boolean getDragToData() { return dragToData; }
    public PivotField setDragToData(Boolean dragToData) { this.dragToData = dragToData; return this; }

    public Boolean getDragToHide() { return dragToHide; }
    public PivotField setDragToHide(Boolean dragToHide) { this.dragToHide = dragToHide; return this; }

    public Boolean getDragToPage() { return dragToPage; }
    public PivotField setDragToPage(Boolean dragToPage) { this.dragToPage = dragToPage; return this; }

    public Boolean getDragToRow() { return dragToRow; }
    public PivotField setDragToRow(Boolean dragToRow) { this.dragToRow = dragToRow; return this; }

    public String getFunction() { return function; }
    public PivotField setFunction(String function) { this.function = function; return this; }

    public Boolean getInsertBlankRow() { return insertBlankRow; }
    public PivotField setInsertBlankRow(Boolean insertBlankRow) { this.insertBlankRow = insertBlankRow; return this; }

    public Boolean getIsAscendShow() { return isAscendShow; }
    public PivotField setIsAscendShow(Boolean isAscendShow) { this.isAscendShow = isAscendShow; return this; }

    public Boolean getIsAscendSort() { return isAscendSort; }
    public PivotField setIsAscendSort(Boolean isAscendSort) { this.isAscendSort = isAscendSort; return this; }

    public Boolean getIsAutoShow() { return isAutoShow; }
    public PivotField setIsAutoShow(Boolean isAutoShow) { this.isAutoShow = isAutoShow; return this; }

    public Boolean getIsAutoSort() { return isAutoSort; }
    public PivotField setIsAutoSort(Boolean isAutoSort) { this.isAutoSort = isAutoSort; return this; }

    public Boolean getIsAutoSubtotals() { return isAutoSubtotals; }
    public PivotField setIsAutoSubtotals(Boolean isAutoSubtotals) { this.isAutoSubtotals = isAutoSubtotals; return this; }

    public Boolean getIsCalculatedField() { return isCalculatedField; }
    public PivotField setIsCalculatedField(Boolean isCalculatedField) { this.isCalculatedField = isCalculatedField; return this; }

    public Boolean getIsIncludeNewItemsInFilter() { return isIncludeNewItemsInFilter; }
    public PivotField setIsIncludeNewItemsInFilter(Boolean isIncludeNewItemsInFilter) { this.isIncludeNewItemsInFilter = isIncludeNewItemsInFilter; return this; }

    public Boolean getIsInsertPageBreaksBetweenItems() { return isInsertPageBreaksBetweenItems; }
    public PivotField setIsInsertPageBreaksBetweenItems(Boolean isInsertPageBreaksBetweenItems) { this.isInsertPageBreaksBetweenItems = isInsertPageBreaksBetweenItems; return this; }

    public Boolean getIsMultipleItemSelectionAllowed() { return isMultipleItemSelectionAllowed; }
    public PivotField setIsMultipleItemSelectionAllowed(Boolean isMultipleItemSelectionAllowed) { this.isMultipleItemSelectionAllowed = isMultipleItemSelectionAllowed; return this; }

    public Boolean getIsRepeatItemLabels() { return isRepeatItemLabels; }
    public PivotField setIsRepeatItemLabels(Boolean isRepeatItemLabels) { this.isRepeatItemLabels = isRepeatItemLabels; return this; }

    public Integer getItemCount() { return itemCount; }
    public PivotField setItemCount(Integer itemCount) { this.itemCount = itemCount; return this; }

    public List<String> getItems() { return items; }
    public PivotField setItems(List<String> items) { this.items = items; return this; }

    public String getName() { return name; }
    public PivotField setName(String name) { this.name = name; return this; }

    public Integer getNumber() { return number; }
    public PivotField setNumber(Integer number) { this.number = number; return this; }

    public String getNumberFormat() { return numberFormat; }
    public PivotField setNumberFormat(String numberFormat) { this.numberFormat = numberFormat; return this; }

    public List<String> getOriginalItems() { return originalItems; }
    public PivotField setOriginalItems(List<String> originalItems) { this.originalItems = originalItems; return this; }

    public List<PivotItem> getPivotItems() { return pivotItems; }
    public PivotField setPivotItems(List<PivotItem> pivotItems) { this.pivotItems = pivotItems; return this; }

    public Integer getPosition() { return position; }
    public PivotField setPosition(Integer position) { this.position = position; return this; }

    public Boolean getShowAllItems() { return showAllItems; }
    public PivotField setShowAllItems(Boolean showAllItems) { this.showAllItems = showAllItems; return this; }

    public Boolean getShowCompact() { return showCompact; }
    public PivotField setShowCompact(Boolean showCompact) { this.showCompact = showCompact; return this; }

    public Boolean getShowInOutlineForm() { return showInOutlineForm; }
    public PivotField setShowInOutlineForm(Boolean showInOutlineForm) { this.showInOutlineForm = showInOutlineForm; return this; }

    public Boolean getShowSubtotalAtTop() { return showSubtotalAtTop; }
    public PivotField setShowSubtotalAtTop(Boolean showSubtotalAtTop) { this.showSubtotalAtTop = showSubtotalAtTop; return this; }

}

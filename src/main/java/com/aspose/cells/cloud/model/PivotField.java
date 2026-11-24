/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotField.java">
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

public class PivotField {

    @SerializedName("AutoShowCount")
    @JsonProperty("AutoShowCount")
    private Integer autoShowCount;

    public PivotField autoShowCount(Integer autoShowCount) {
        this.autoShowCount = autoShowCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getAutoShowCount() {
        return autoShowCount;
    }

    public void setAutoShowCount(Integer autoShowCount) {
        this.autoShowCount = autoShowCount;
    }

    @SerializedName("AutoShowField")
    @JsonProperty("AutoShowField")
    private Integer autoShowField;

    public PivotField autoShowField(Integer autoShowField) {
        this.autoShowField = autoShowField;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getAutoShowField() {
        return autoShowField;
    }

    public void setAutoShowField(Integer autoShowField) {
        this.autoShowField = autoShowField;
    }

    @SerializedName("AutoSortField")
    @JsonProperty("AutoSortField")
    private Integer autoSortField;

    public PivotField autoSortField(Integer autoSortField) {
        this.autoSortField = autoSortField;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getAutoSortField() {
        return autoSortField;
    }

    public void setAutoSortField(Integer autoSortField) {
        this.autoSortField = autoSortField;
    }

    @SerializedName("BaseField")
    @JsonProperty("BaseField")
    private Integer baseField;

    public PivotField baseField(Integer baseField) {
        this.baseField = baseField;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBaseField() {
        return baseField;
    }

    public void setBaseField(Integer baseField) {
        this.baseField = baseField;
    }

    @SerializedName("BaseIndex")
    @JsonProperty("BaseIndex")
    private Integer baseIndex;

    public PivotField baseIndex(Integer baseIndex) {
        this.baseIndex = baseIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBaseIndex() {
        return baseIndex;
    }

    public void setBaseIndex(Integer baseIndex) {
        this.baseIndex = baseIndex;
    }

    @SerializedName("BaseItem")
    @JsonProperty("BaseItem")
    private Integer baseItem;

    public PivotField baseItem(Integer baseItem) {
        this.baseItem = baseItem;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBaseItem() {
        return baseItem;
    }

    public void setBaseItem(Integer baseItem) {
        this.baseItem = baseItem;
    }

    @SerializedName("BaseItemPosition")
    @JsonProperty("BaseItemPosition")
    private String baseItemPosition;

    public PivotField baseItemPosition(String baseItemPosition) {
        this.baseItemPosition = baseItemPosition;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBaseItemPosition() {
        return baseItemPosition;
    }

    public void setBaseItemPosition(String baseItemPosition) {
        this.baseItemPosition = baseItemPosition;
    }

    @SerializedName("CurrentPageItem")
    @JsonProperty("CurrentPageItem")
    private Integer currentPageItem;

    public PivotField currentPageItem(Integer currentPageItem) {
        this.currentPageItem = currentPageItem;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCurrentPageItem() {
        return currentPageItem;
    }

    public void setCurrentPageItem(Integer currentPageItem) {
        this.currentPageItem = currentPageItem;
    }

    @SerializedName("DataDisplayFormat")
    @JsonProperty("DataDisplayFormat")
    private String dataDisplayFormat;

    public PivotField dataDisplayFormat(String dataDisplayFormat) {
        this.dataDisplayFormat = dataDisplayFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataDisplayFormat() {
        return dataDisplayFormat;
    }

    public void setDataDisplayFormat(String dataDisplayFormat) {
        this.dataDisplayFormat = dataDisplayFormat;
    }

    @SerializedName("DisplayName")
    @JsonProperty("DisplayName")
    private String displayName;

    public PivotField displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @SerializedName("DragToColumn")
    @JsonProperty("DragToColumn")
    private Boolean dragToColumn;

    public PivotField dragToColumn(Boolean dragToColumn) {
        this.dragToColumn = dragToColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDragToColumn() {
        return dragToColumn;
    }

    public void setDragToColumn(Boolean dragToColumn) {
        this.dragToColumn = dragToColumn;
    }

    @SerializedName("DragToData")
    @JsonProperty("DragToData")
    private Boolean dragToData;

    public PivotField dragToData(Boolean dragToData) {
        this.dragToData = dragToData;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDragToData() {
        return dragToData;
    }

    public void setDragToData(Boolean dragToData) {
        this.dragToData = dragToData;
    }

    @SerializedName("DragToHide")
    @JsonProperty("DragToHide")
    private Boolean dragToHide;

    public PivotField dragToHide(Boolean dragToHide) {
        this.dragToHide = dragToHide;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDragToHide() {
        return dragToHide;
    }

    public void setDragToHide(Boolean dragToHide) {
        this.dragToHide = dragToHide;
    }

    @SerializedName("DragToPage")
    @JsonProperty("DragToPage")
    private Boolean dragToPage;

    public PivotField dragToPage(Boolean dragToPage) {
        this.dragToPage = dragToPage;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDragToPage() {
        return dragToPage;
    }

    public void setDragToPage(Boolean dragToPage) {
        this.dragToPage = dragToPage;
    }

    @SerializedName("DragToRow")
    @JsonProperty("DragToRow")
    private Boolean dragToRow;

    public PivotField dragToRow(Boolean dragToRow) {
        this.dragToRow = dragToRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDragToRow() {
        return dragToRow;
    }

    public void setDragToRow(Boolean dragToRow) {
        this.dragToRow = dragToRow;
    }

    @SerializedName("Function")
    @JsonProperty("Function")
    private String function;

    public PivotField function(String function) {
        this.function = function;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @SerializedName("InsertBlankRow")
    @JsonProperty("InsertBlankRow")
    private Boolean insertBlankRow;

    public PivotField insertBlankRow(Boolean insertBlankRow) {
        this.insertBlankRow = insertBlankRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getInsertBlankRow() {
        return insertBlankRow;
    }

    public void setInsertBlankRow(Boolean insertBlankRow) {
        this.insertBlankRow = insertBlankRow;
    }

    @SerializedName("IsAscendShow")
    @JsonProperty("IsAscendShow")
    private Boolean isAscendShow;

    public PivotField isAscendShow(Boolean isAscendShow) {
        this.isAscendShow = isAscendShow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAscendShow() {
        return isAscendShow;
    }

    public void setIsAscendShow(Boolean isAscendShow) {
        this.isAscendShow = isAscendShow;
    }

    @SerializedName("IsAscendSort")
    @JsonProperty("IsAscendSort")
    private Boolean isAscendSort;

    public PivotField isAscendSort(Boolean isAscendSort) {
        this.isAscendSort = isAscendSort;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAscendSort() {
        return isAscendSort;
    }

    public void setIsAscendSort(Boolean isAscendSort) {
        this.isAscendSort = isAscendSort;
    }

    @SerializedName("IsAutoShow")
    @JsonProperty("IsAutoShow")
    private Boolean isAutoShow;

    public PivotField isAutoShow(Boolean isAutoShow) {
        this.isAutoShow = isAutoShow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoShow() {
        return isAutoShow;
    }

    public void setIsAutoShow(Boolean isAutoShow) {
        this.isAutoShow = isAutoShow;
    }

    @SerializedName("IsAutoSort")
    @JsonProperty("IsAutoSort")
    private Boolean isAutoSort;

    public PivotField isAutoSort(Boolean isAutoSort) {
        this.isAutoSort = isAutoSort;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoSort() {
        return isAutoSort;
    }

    public void setIsAutoSort(Boolean isAutoSort) {
        this.isAutoSort = isAutoSort;
    }

    @SerializedName("IsAutoSubtotals")
    @JsonProperty("IsAutoSubtotals")
    private Boolean isAutoSubtotals;

    public PivotField isAutoSubtotals(Boolean isAutoSubtotals) {
        this.isAutoSubtotals = isAutoSubtotals;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoSubtotals() {
        return isAutoSubtotals;
    }

    public void setIsAutoSubtotals(Boolean isAutoSubtotals) {
        this.isAutoSubtotals = isAutoSubtotals;
    }

    @SerializedName("IsCalculatedField")
    @JsonProperty("IsCalculatedField")
    private Boolean isCalculatedField;

    public PivotField isCalculatedField(Boolean isCalculatedField) {
        this.isCalculatedField = isCalculatedField;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsCalculatedField() {
        return isCalculatedField;
    }

    public void setIsCalculatedField(Boolean isCalculatedField) {
        this.isCalculatedField = isCalculatedField;
    }

    @SerializedName("IsIncludeNewItemsInFilter")
    @JsonProperty("IsIncludeNewItemsInFilter")
    private Boolean isIncludeNewItemsInFilter;

    public PivotField isIncludeNewItemsInFilter(Boolean isIncludeNewItemsInFilter) {
        this.isIncludeNewItemsInFilter = isIncludeNewItemsInFilter;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsIncludeNewItemsInFilter() {
        return isIncludeNewItemsInFilter;
    }

    public void setIsIncludeNewItemsInFilter(Boolean isIncludeNewItemsInFilter) {
        this.isIncludeNewItemsInFilter = isIncludeNewItemsInFilter;
    }

    @SerializedName("IsInsertPageBreaksBetweenItems")
    @JsonProperty("IsInsertPageBreaksBetweenItems")
    private Boolean isInsertPageBreaksBetweenItems;

    public PivotField isInsertPageBreaksBetweenItems(Boolean isInsertPageBreaksBetweenItems) {
        this.isInsertPageBreaksBetweenItems = isInsertPageBreaksBetweenItems;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsInsertPageBreaksBetweenItems() {
        return isInsertPageBreaksBetweenItems;
    }

    public void setIsInsertPageBreaksBetweenItems(Boolean isInsertPageBreaksBetweenItems) {
        this.isInsertPageBreaksBetweenItems = isInsertPageBreaksBetweenItems;
    }

    @SerializedName("IsMultipleItemSelectionAllowed")
    @JsonProperty("IsMultipleItemSelectionAllowed")
    private Boolean isMultipleItemSelectionAllowed;

    public PivotField isMultipleItemSelectionAllowed(Boolean isMultipleItemSelectionAllowed) {
        this.isMultipleItemSelectionAllowed = isMultipleItemSelectionAllowed;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsMultipleItemSelectionAllowed() {
        return isMultipleItemSelectionAllowed;
    }

    public void setIsMultipleItemSelectionAllowed(Boolean isMultipleItemSelectionAllowed) {
        this.isMultipleItemSelectionAllowed = isMultipleItemSelectionAllowed;
    }

    @SerializedName("IsRepeatItemLabels")
    @JsonProperty("IsRepeatItemLabels")
    private Boolean isRepeatItemLabels;

    public PivotField isRepeatItemLabels(Boolean isRepeatItemLabels) {
        this.isRepeatItemLabels = isRepeatItemLabels;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsRepeatItemLabels() {
        return isRepeatItemLabels;
    }

    public void setIsRepeatItemLabels(Boolean isRepeatItemLabels) {
        this.isRepeatItemLabels = isRepeatItemLabels;
    }

    @SerializedName("ItemCount")
    @JsonProperty("ItemCount")
    private Integer itemCount;

    public PivotField itemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    @SerializedName("Items")
    @JsonProperty("Items")
    private List<String> items;

    public PivotField items(List<String> items) {
        this.items = items;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public PivotField name(String name) {
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

    @SerializedName("Number")
    @JsonProperty("Number")
    private Integer number;

    public PivotField number(Integer number) {
        this.number = number;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @SerializedName("NumberFormat")
    @JsonProperty("NumberFormat")
    private String numberFormat;

    public PivotField numberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    @SerializedName("OriginalItems")
    @JsonProperty("OriginalItems")
    private List<String> originalItems;

    public PivotField originalItems(List<String> originalItems) {
        this.originalItems = originalItems;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<String> getOriginalItems() {
        return originalItems;
    }

    public void setOriginalItems(List<String> originalItems) {
        this.originalItems = originalItems;
    }

    @SerializedName("PivotItems")
    @JsonProperty("PivotItems")
    private List<PivotItem> pivotItems;

    public PivotField pivotItems(List<PivotItem> pivotItems) {
        this.pivotItems = pivotItems;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<PivotItem> getPivotItems() {
        return pivotItems;
    }

    public void setPivotItems(List<PivotItem> pivotItems) {
        this.pivotItems = pivotItems;
    }

    @SerializedName("Position")
    @JsonProperty("Position")
    private Integer position;

    public PivotField position(Integer position) {
        this.position = position;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @SerializedName("ShowAllItems")
    @JsonProperty("ShowAllItems")
    private Boolean showAllItems;

    public PivotField showAllItems(Boolean showAllItems) {
        this.showAllItems = showAllItems;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowAllItems() {
        return showAllItems;
    }

    public void setShowAllItems(Boolean showAllItems) {
        this.showAllItems = showAllItems;
    }

    @SerializedName("ShowCompact")
    @JsonProperty("ShowCompact")
    private Boolean showCompact;

    public PivotField showCompact(Boolean showCompact) {
        this.showCompact = showCompact;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowCompact() {
        return showCompact;
    }

    public void setShowCompact(Boolean showCompact) {
        this.showCompact = showCompact;
    }

    @SerializedName("ShowInOutlineForm")
    @JsonProperty("ShowInOutlineForm")
    private Boolean showInOutlineForm;

    public PivotField showInOutlineForm(Boolean showInOutlineForm) {
        this.showInOutlineForm = showInOutlineForm;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowInOutlineForm() {
        return showInOutlineForm;
    }

    public void setShowInOutlineForm(Boolean showInOutlineForm) {
        this.showInOutlineForm = showInOutlineForm;
    }

    @SerializedName("ShowSubtotalAtTop")
    @JsonProperty("ShowSubtotalAtTop")
    private Boolean showSubtotalAtTop;

    public PivotField showSubtotalAtTop(Boolean showSubtotalAtTop) {
        this.showSubtotalAtTop = showSubtotalAtTop;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowSubtotalAtTop() {
        return showSubtotalAtTop;
    }

    public void setShowSubtotalAtTop(Boolean showSubtotalAtTop) {
        this.showSubtotalAtTop = showSubtotalAtTop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PivotField other = (PivotField) o;
        return Objects.equals(this.autoShowCount, other.autoShowCount)
            && Objects.equals(this.autoShowField, other.autoShowField)
            && Objects.equals(this.autoSortField, other.autoSortField)
            && Objects.equals(this.baseField, other.baseField)
            && Objects.equals(this.baseIndex, other.baseIndex)
            && Objects.equals(this.baseItem, other.baseItem)
            && Objects.equals(this.baseItemPosition, other.baseItemPosition)
            && Objects.equals(this.currentPageItem, other.currentPageItem)
            && Objects.equals(this.dataDisplayFormat, other.dataDisplayFormat)
            && Objects.equals(this.displayName, other.displayName)
            && Objects.equals(this.dragToColumn, other.dragToColumn)
            && Objects.equals(this.dragToData, other.dragToData)
            && Objects.equals(this.dragToHide, other.dragToHide)
            && Objects.equals(this.dragToPage, other.dragToPage)
            && Objects.equals(this.dragToRow, other.dragToRow)
            && Objects.equals(this.function, other.function)
            && Objects.equals(this.insertBlankRow, other.insertBlankRow)
            && Objects.equals(this.isAscendShow, other.isAscendShow)
            && Objects.equals(this.isAscendSort, other.isAscendSort)
            && Objects.equals(this.isAutoShow, other.isAutoShow)
            && Objects.equals(this.isAutoSort, other.isAutoSort)
            && Objects.equals(this.isAutoSubtotals, other.isAutoSubtotals)
            && Objects.equals(this.isCalculatedField, other.isCalculatedField)
            && Objects.equals(this.isIncludeNewItemsInFilter, other.isIncludeNewItemsInFilter)
            && Objects.equals(this.isInsertPageBreaksBetweenItems, other.isInsertPageBreaksBetweenItems)
            && Objects.equals(this.isMultipleItemSelectionAllowed, other.isMultipleItemSelectionAllowed)
            && Objects.equals(this.isRepeatItemLabels, other.isRepeatItemLabels)
            && Objects.equals(this.itemCount, other.itemCount)
            && Objects.equals(this.items, other.items)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.number, other.number)
            && Objects.equals(this.numberFormat, other.numberFormat)
            && Objects.equals(this.originalItems, other.originalItems)
            && Objects.equals(this.pivotItems, other.pivotItems)
            && Objects.equals(this.position, other.position)
            && Objects.equals(this.showAllItems, other.showAllItems)
            && Objects.equals(this.showCompact, other.showCompact)
            && Objects.equals(this.showInOutlineForm, other.showInOutlineForm)
            && Objects.equals(this.showSubtotalAtTop, other.showSubtotalAtTop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoShowCount, autoShowField, autoSortField, baseField, baseIndex, baseItem, baseItemPosition, currentPageItem, dataDisplayFormat, displayName, dragToColumn, dragToData, dragToHide, dragToPage, dragToRow, function, insertBlankRow, isAscendShow, isAscendSort, isAutoShow, isAutoSort, isAutoSubtotals, isCalculatedField, isIncludeNewItemsInFilter, isInsertPageBreaksBetweenItems, isMultipleItemSelectionAllowed, isRepeatItemLabels, itemCount, items, name, number, numberFormat, originalItems, pivotItems, position, showAllItems, showCompact, showInOutlineForm, showSubtotalAtTop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PivotField {\n");
        sb.append("    autoShowCount: ").append(autoShowCount).append("\n");
        sb.append("    autoShowField: ").append(autoShowField).append("\n");
        sb.append("    autoSortField: ").append(autoSortField).append("\n");
        sb.append("    baseField: ").append(baseField).append("\n");
        sb.append("    baseIndex: ").append(baseIndex).append("\n");
        sb.append("    baseItem: ").append(baseItem).append("\n");
        sb.append("    baseItemPosition: ").append(baseItemPosition).append("\n");
        sb.append("    currentPageItem: ").append(currentPageItem).append("\n");
        sb.append("    dataDisplayFormat: ").append(dataDisplayFormat).append("\n");
        sb.append("    displayName: ").append(displayName).append("\n");
        sb.append("    dragToColumn: ").append(dragToColumn).append("\n");
        sb.append("    dragToData: ").append(dragToData).append("\n");
        sb.append("    dragToHide: ").append(dragToHide).append("\n");
        sb.append("    dragToPage: ").append(dragToPage).append("\n");
        sb.append("    dragToRow: ").append(dragToRow).append("\n");
        sb.append("    function: ").append(function).append("\n");
        sb.append("    insertBlankRow: ").append(insertBlankRow).append("\n");
        sb.append("    isAscendShow: ").append(isAscendShow).append("\n");
        sb.append("    isAscendSort: ").append(isAscendSort).append("\n");
        sb.append("    isAutoShow: ").append(isAutoShow).append("\n");
        sb.append("    isAutoSort: ").append(isAutoSort).append("\n");
        sb.append("    isAutoSubtotals: ").append(isAutoSubtotals).append("\n");
        sb.append("    isCalculatedField: ").append(isCalculatedField).append("\n");
        sb.append("    isIncludeNewItemsInFilter: ").append(isIncludeNewItemsInFilter).append("\n");
        sb.append("    isInsertPageBreaksBetweenItems: ").append(isInsertPageBreaksBetweenItems).append("\n");
        sb.append("    isMultipleItemSelectionAllowed: ").append(isMultipleItemSelectionAllowed).append("\n");
        sb.append("    isRepeatItemLabels: ").append(isRepeatItemLabels).append("\n");
        sb.append("    itemCount: ").append(itemCount).append("\n");
        sb.append("    items: ").append(items).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    number: ").append(number).append("\n");
        sb.append("    numberFormat: ").append(numberFormat).append("\n");
        sb.append("    originalItems: ").append(originalItems).append("\n");
        sb.append("    pivotItems: ").append(pivotItems).append("\n");
        sb.append("    position: ").append(position).append("\n");
        sb.append("    showAllItems: ").append(showAllItems).append("\n");
        sb.append("    showCompact: ").append(showCompact).append("\n");
        sb.append("    showInOutlineForm: ").append(showInOutlineForm).append("\n");
        sb.append("    showSubtotalAtTop: ").append(showSubtotalAtTop).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotTable.java">
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


public class PivotTable  extends  LinkElement {
        @SerializedName("AltTextDescription")
        private String altTextDescription ;

        public  PivotTable  altTextDescription(String  altTextDescription) {
            this.altTextDescription =  altTextDescription;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAltTextDescription() {
            return altTextDescription;
        }

        public void setAltTextDescription(String altTextDescription) {
            this.altTextDescription = altTextDescription;
        }

        @SerializedName("AltTextTitle")
        private String altTextTitle ;

        public  PivotTable  altTextTitle(String  altTextTitle) {
            this.altTextTitle =  altTextTitle;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAltTextTitle() {
            return altTextTitle;
        }

        public void setAltTextTitle(String altTextTitle) {
            this.altTextTitle = altTextTitle;
        }

        @SerializedName("AutoFormatType")
        private String autoFormatType ;

        public  PivotTable  autoFormatType(String  autoFormatType) {
            this.autoFormatType =  autoFormatType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAutoFormatType() {
            return autoFormatType;
        }

        public void setAutoFormatType(String autoFormatType) {
            this.autoFormatType = autoFormatType;
        }

        @SerializedName("BaseFields")
        private List<PivotField> baseFields ;

        public  PivotTable  baseFields(List<PivotField>  baseFields) {
            this.baseFields =  baseFields;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PivotField> getBaseFields() {
            return baseFields;
        }

        public void setBaseFields(List<PivotField> baseFields) {
            this.baseFields = baseFields;
        }

        @SerializedName("ColumnFields")
        private List<PivotField> columnFields ;

        public  PivotTable  columnFields(List<PivotField>  columnFields) {
            this.columnFields =  columnFields;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PivotField> getColumnFields() {
            return columnFields;
        }

        public void setColumnFields(List<PivotField> columnFields) {
            this.columnFields = columnFields;
        }

        @SerializedName("ColumnGrand")
        private Boolean columnGrand ;

        public  PivotTable  columnGrand(Boolean  columnGrand) {
            this.columnGrand =  columnGrand;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getColumnGrand() {
            return columnGrand;
        }

        public void setColumnGrand(Boolean columnGrand) {
            this.columnGrand = columnGrand;
        }

        @SerializedName("ColumnHeaderCaption")
        private String columnHeaderCaption ;

        public  PivotTable  columnHeaderCaption(String  columnHeaderCaption) {
            this.columnHeaderCaption =  columnHeaderCaption;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColumnHeaderCaption() {
            return columnHeaderCaption;
        }

        public void setColumnHeaderCaption(String columnHeaderCaption) {
            this.columnHeaderCaption = columnHeaderCaption;
        }

        @SerializedName("ColumnRange")
        private CellArea columnRange ;

        public  PivotTable  columnRange(CellArea  columnRange) {
            this.columnRange =  columnRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellArea getColumnRange() {
            return columnRange;
        }

        public void setColumnRange(CellArea columnRange) {
            this.columnRange = columnRange;
        }

        @SerializedName("CustomListSort")
        private Boolean customListSort ;

        public  PivotTable  customListSort(Boolean  customListSort) {
            this.customListSort =  customListSort;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCustomListSort() {
            return customListSort;
        }

        public void setCustomListSort(Boolean customListSort) {
            this.customListSort = customListSort;
        }

        @SerializedName("DataBodyRange")
        private CellArea dataBodyRange ;

        public  PivotTable  dataBodyRange(CellArea  dataBodyRange) {
            this.dataBodyRange =  dataBodyRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellArea getDataBodyRange() {
            return dataBodyRange;
        }

        public void setDataBodyRange(CellArea dataBodyRange) {
            this.dataBodyRange = dataBodyRange;
        }

        @SerializedName("DataField")
        private PivotField dataField ;

        public  PivotTable  dataField(PivotField  dataField) {
            this.dataField =  dataField;
            return this;
        }

        @ApiModelProperty(value = "")
        public PivotField getDataField() {
            return dataField;
        }

        public void setDataField(PivotField dataField) {
            this.dataField = dataField;
        }

        @SerializedName("DataFields")
        private List<PivotField> dataFields ;

        public  PivotTable  dataFields(List<PivotField>  dataFields) {
            this.dataFields =  dataFields;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PivotField> getDataFields() {
            return dataFields;
        }

        public void setDataFields(List<PivotField> dataFields) {
            this.dataFields = dataFields;
        }

        @SerializedName("DataSource")
        private List<String> dataSource ;

        public  PivotTable  dataSource(List<String>  dataSource) {
            this.dataSource =  dataSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<String> getDataSource() {
            return dataSource;
        }

        public void setDataSource(List<String> dataSource) {
            this.dataSource = dataSource;
        }

        @SerializedName("DisplayErrorString")
        private Boolean displayErrorString ;

        public  PivotTable  displayErrorString(Boolean  displayErrorString) {
            this.displayErrorString =  displayErrorString;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDisplayErrorString() {
            return displayErrorString;
        }

        public void setDisplayErrorString(Boolean displayErrorString) {
            this.displayErrorString = displayErrorString;
        }

        @SerializedName("DisplayImmediateItems")
        private Boolean displayImmediateItems ;

        public  PivotTable  displayImmediateItems(Boolean  displayImmediateItems) {
            this.displayImmediateItems =  displayImmediateItems;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDisplayImmediateItems() {
            return displayImmediateItems;
        }

        public void setDisplayImmediateItems(Boolean displayImmediateItems) {
            this.displayImmediateItems = displayImmediateItems;
        }

        @SerializedName("DisplayNullString")
        private Boolean displayNullString ;

        public  PivotTable  displayNullString(Boolean  displayNullString) {
            this.displayNullString =  displayNullString;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDisplayNullString() {
            return displayNullString;
        }

        public void setDisplayNullString(Boolean displayNullString) {
            this.displayNullString = displayNullString;
        }

        @SerializedName("EnableDataValueEditing")
        private Boolean enableDataValueEditing ;

        public  PivotTable  enableDataValueEditing(Boolean  enableDataValueEditing) {
            this.enableDataValueEditing =  enableDataValueEditing;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getEnableDataValueEditing() {
            return enableDataValueEditing;
        }

        public void setEnableDataValueEditing(Boolean enableDataValueEditing) {
            this.enableDataValueEditing = enableDataValueEditing;
        }

        @SerializedName("EnableDrilldown")
        private Boolean enableDrilldown ;

        public  PivotTable  enableDrilldown(Boolean  enableDrilldown) {
            this.enableDrilldown =  enableDrilldown;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getEnableDrilldown() {
            return enableDrilldown;
        }

        public void setEnableDrilldown(Boolean enableDrilldown) {
            this.enableDrilldown = enableDrilldown;
        }

        @SerializedName("EnableFieldDialog")
        private Boolean enableFieldDialog ;

        public  PivotTable  enableFieldDialog(Boolean  enableFieldDialog) {
            this.enableFieldDialog =  enableFieldDialog;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getEnableFieldDialog() {
            return enableFieldDialog;
        }

        public void setEnableFieldDialog(Boolean enableFieldDialog) {
            this.enableFieldDialog = enableFieldDialog;
        }

        @SerializedName("EnableFieldList")
        private Boolean enableFieldList ;

        public  PivotTable  enableFieldList(Boolean  enableFieldList) {
            this.enableFieldList =  enableFieldList;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getEnableFieldList() {
            return enableFieldList;
        }

        public void setEnableFieldList(Boolean enableFieldList) {
            this.enableFieldList = enableFieldList;
        }

        @SerializedName("EnableWizard")
        private Boolean enableWizard ;

        public  PivotTable  enableWizard(Boolean  enableWizard) {
            this.enableWizard =  enableWizard;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getEnableWizard() {
            return enableWizard;
        }

        public void setEnableWizard(Boolean enableWizard) {
            this.enableWizard = enableWizard;
        }

        @SerializedName("ErrorString")
        private String errorString ;

        public  PivotTable  errorString(String  errorString) {
            this.errorString =  errorString;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getErrorString() {
            return errorString;
        }

        public void setErrorString(String errorString) {
            this.errorString = errorString;
        }

        @SerializedName("FieldListSortAscending")
        private Boolean fieldListSortAscending ;

        public  PivotTable  fieldListSortAscending(Boolean  fieldListSortAscending) {
            this.fieldListSortAscending =  fieldListSortAscending;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getFieldListSortAscending() {
            return fieldListSortAscending;
        }

        public void setFieldListSortAscending(Boolean fieldListSortAscending) {
            this.fieldListSortAscending = fieldListSortAscending;
        }

        @SerializedName("GrandTotalName")
        private String grandTotalName ;

        public  PivotTable  grandTotalName(String  grandTotalName) {
            this.grandTotalName =  grandTotalName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getGrandTotalName() {
            return grandTotalName;
        }

        public void setGrandTotalName(String grandTotalName) {
            this.grandTotalName = grandTotalName;
        }

        @SerializedName("HasBlankRows")
        private Boolean hasBlankRows ;

        public  PivotTable  hasBlankRows(Boolean  hasBlankRows) {
            this.hasBlankRows =  hasBlankRows;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasBlankRows() {
            return hasBlankRows;
        }

        public void setHasBlankRows(Boolean hasBlankRows) {
            this.hasBlankRows = hasBlankRows;
        }

        @SerializedName("Indent")
        private Integer indent ;

        public  PivotTable  indent(Integer  indent) {
            this.indent =  indent;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getIndent() {
            return indent;
        }

        public void setIndent(Integer indent) {
            this.indent = indent;
        }

        @SerializedName("IsAutoFormat")
        private Boolean isAutoFormat ;

        public  PivotTable  isAutoFormat(Boolean  isAutoFormat) {
            this.isAutoFormat =  isAutoFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsAutoFormat() {
            return isAutoFormat;
        }

        public void setIsAutoFormat(Boolean isAutoFormat) {
            this.isAutoFormat = isAutoFormat;
        }

        @SerializedName("IsGridDropZones")
        private Boolean isGridDropZones ;

        public  PivotTable  isGridDropZones(Boolean  isGridDropZones) {
            this.isGridDropZones =  isGridDropZones;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsGridDropZones() {
            return isGridDropZones;
        }

        public void setIsGridDropZones(Boolean isGridDropZones) {
            this.isGridDropZones = isGridDropZones;
        }

        @SerializedName("IsMultipleFieldFilters")
        private Boolean isMultipleFieldFilters ;

        public  PivotTable  isMultipleFieldFilters(Boolean  isMultipleFieldFilters) {
            this.isMultipleFieldFilters =  isMultipleFieldFilters;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsMultipleFieldFilters() {
            return isMultipleFieldFilters;
        }

        public void setIsMultipleFieldFilters(Boolean isMultipleFieldFilters) {
            this.isMultipleFieldFilters = isMultipleFieldFilters;
        }

        @SerializedName("IsSelected")
        private Boolean isSelected ;

        public  PivotTable  isSelected(Boolean  isSelected) {
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

        @SerializedName("ItemPrintTitles")
        private Boolean itemPrintTitles ;

        public  PivotTable  itemPrintTitles(Boolean  itemPrintTitles) {
            this.itemPrintTitles =  itemPrintTitles;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getItemPrintTitles() {
            return itemPrintTitles;
        }

        public void setItemPrintTitles(Boolean itemPrintTitles) {
            this.itemPrintTitles = itemPrintTitles;
        }

        @SerializedName("ManualUpdate")
        private Boolean manualUpdate ;

        public  PivotTable  manualUpdate(Boolean  manualUpdate) {
            this.manualUpdate =  manualUpdate;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getManualUpdate() {
            return manualUpdate;
        }

        public void setManualUpdate(Boolean manualUpdate) {
            this.manualUpdate = manualUpdate;
        }

        @SerializedName("MergeLabels")
        private Boolean mergeLabels ;

        public  PivotTable  mergeLabels(Boolean  mergeLabels) {
            this.mergeLabels =  mergeLabels;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getMergeLabels() {
            return mergeLabels;
        }

        public void setMergeLabels(Boolean mergeLabels) {
            this.mergeLabels = mergeLabels;
        }

        @SerializedName("MissingItemsLimit")
        private String missingItemsLimit ;

        public  PivotTable  missingItemsLimit(String  missingItemsLimit) {
            this.missingItemsLimit =  missingItemsLimit;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getMissingItemsLimit() {
            return missingItemsLimit;
        }

        public void setMissingItemsLimit(String missingItemsLimit) {
            this.missingItemsLimit = missingItemsLimit;
        }

        @SerializedName("Name")
        private String name ;

        public  PivotTable  name(String  name) {
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

        @SerializedName("NullString")
        private String nullString ;

        public  PivotTable  nullString(String  nullString) {
            this.nullString =  nullString;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getNullString() {
            return nullString;
        }

        public void setNullString(String nullString) {
            this.nullString = nullString;
        }

        @SerializedName("PageFieldOrder")
        private String pageFieldOrder ;

        public  PivotTable  pageFieldOrder(String  pageFieldOrder) {
            this.pageFieldOrder =  pageFieldOrder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPageFieldOrder() {
            return pageFieldOrder;
        }

        public void setPageFieldOrder(String pageFieldOrder) {
            this.pageFieldOrder = pageFieldOrder;
        }

        @SerializedName("PageFields")
        private List<PivotField> pageFields ;

        public  PivotTable  pageFields(List<PivotField>  pageFields) {
            this.pageFields =  pageFields;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PivotField> getPageFields() {
            return pageFields;
        }

        public void setPageFields(List<PivotField> pageFields) {
            this.pageFields = pageFields;
        }

        @SerializedName("PageFieldWrapCount")
        private Integer pageFieldWrapCount ;

        public  PivotTable  pageFieldWrapCount(Integer  pageFieldWrapCount) {
            this.pageFieldWrapCount =  pageFieldWrapCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPageFieldWrapCount() {
            return pageFieldWrapCount;
        }

        public void setPageFieldWrapCount(Integer pageFieldWrapCount) {
            this.pageFieldWrapCount = pageFieldWrapCount;
        }

        @SerializedName("PivotFilters")
        private List<PivotFilter> pivotFilters ;

        public  PivotTable  pivotFilters(List<PivotFilter>  pivotFilters) {
            this.pivotFilters =  pivotFilters;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PivotFilter> getPivotFilters() {
            return pivotFilters;
        }

        public void setPivotFilters(List<PivotFilter> pivotFilters) {
            this.pivotFilters = pivotFilters;
        }

        @SerializedName("PivotTableStyleName")
        private String pivotTableStyleName ;

        public  PivotTable  pivotTableStyleName(String  pivotTableStyleName) {
            this.pivotTableStyleName =  pivotTableStyleName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPivotTableStyleName() {
            return pivotTableStyleName;
        }

        public void setPivotTableStyleName(String pivotTableStyleName) {
            this.pivotTableStyleName = pivotTableStyleName;
        }

        @SerializedName("PivotTableStyleType")
        private String pivotTableStyleType ;

        public  PivotTable  pivotTableStyleType(String  pivotTableStyleType) {
            this.pivotTableStyleType =  pivotTableStyleType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPivotTableStyleType() {
            return pivotTableStyleType;
        }

        public void setPivotTableStyleType(String pivotTableStyleType) {
            this.pivotTableStyleType = pivotTableStyleType;
        }

        @SerializedName("PreserveFormatting")
        private Boolean preserveFormatting ;

        public  PivotTable  preserveFormatting(Boolean  preserveFormatting) {
            this.preserveFormatting =  preserveFormatting;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPreserveFormatting() {
            return preserveFormatting;
        }

        public void setPreserveFormatting(Boolean preserveFormatting) {
            this.preserveFormatting = preserveFormatting;
        }

        @SerializedName("PrintDrill")
        private Boolean printDrill ;

        public  PivotTable  printDrill(Boolean  printDrill) {
            this.printDrill =  printDrill;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintDrill() {
            return printDrill;
        }

        public void setPrintDrill(Boolean printDrill) {
            this.printDrill = printDrill;
        }

        @SerializedName("PrintTitles")
        private Boolean printTitles ;

        public  PivotTable  printTitles(Boolean  printTitles) {
            this.printTitles =  printTitles;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintTitles() {
            return printTitles;
        }

        public void setPrintTitles(Boolean printTitles) {
            this.printTitles = printTitles;
        }

        @SerializedName("RefreshDataFlag")
        private Boolean refreshDataFlag ;

        public  PivotTable  refreshDataFlag(Boolean  refreshDataFlag) {
            this.refreshDataFlag =  refreshDataFlag;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRefreshDataFlag() {
            return refreshDataFlag;
        }

        public void setRefreshDataFlag(Boolean refreshDataFlag) {
            this.refreshDataFlag = refreshDataFlag;
        }

        @SerializedName("RefreshDataOnOpeningFile")
        private Boolean refreshDataOnOpeningFile ;

        public  PivotTable  refreshDataOnOpeningFile(Boolean  refreshDataOnOpeningFile) {
            this.refreshDataOnOpeningFile =  refreshDataOnOpeningFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRefreshDataOnOpeningFile() {
            return refreshDataOnOpeningFile;
        }

        public void setRefreshDataOnOpeningFile(Boolean refreshDataOnOpeningFile) {
            this.refreshDataOnOpeningFile = refreshDataOnOpeningFile;
        }

        @SerializedName("RowFields")
        private List<PivotField> rowFields ;

        public  PivotTable  rowFields(List<PivotField>  rowFields) {
            this.rowFields =  rowFields;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<PivotField> getRowFields() {
            return rowFields;
        }

        public void setRowFields(List<PivotField> rowFields) {
            this.rowFields = rowFields;
        }

        @SerializedName("RowGrand")
        private Boolean rowGrand ;

        public  PivotTable  rowGrand(Boolean  rowGrand) {
            this.rowGrand =  rowGrand;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRowGrand() {
            return rowGrand;
        }

        public void setRowGrand(Boolean rowGrand) {
            this.rowGrand = rowGrand;
        }

        @SerializedName("RowHeaderCaption")
        private String rowHeaderCaption ;

        public  PivotTable  rowHeaderCaption(String  rowHeaderCaption) {
            this.rowHeaderCaption =  rowHeaderCaption;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRowHeaderCaption() {
            return rowHeaderCaption;
        }

        public void setRowHeaderCaption(String rowHeaderCaption) {
            this.rowHeaderCaption = rowHeaderCaption;
        }

        @SerializedName("RowRange")
        private CellArea rowRange ;

        public  PivotTable  rowRange(CellArea  rowRange) {
            this.rowRange =  rowRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellArea getRowRange() {
            return rowRange;
        }

        public void setRowRange(CellArea rowRange) {
            this.rowRange = rowRange;
        }

        @SerializedName("SaveData")
        private Boolean saveData ;

        public  PivotTable  saveData(Boolean  saveData) {
            this.saveData =  saveData;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getSaveData() {
            return saveData;
        }

        public void setSaveData(Boolean saveData) {
            this.saveData = saveData;
        }

        @SerializedName("ShowDataTips")
        private Boolean showDataTips ;

        public  PivotTable  showDataTips(Boolean  showDataTips) {
            this.showDataTips =  showDataTips;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowDataTips() {
            return showDataTips;
        }

        public void setShowDataTips(Boolean showDataTips) {
            this.showDataTips = showDataTips;
        }

        @SerializedName("ShowDrill")
        private Boolean showDrill ;

        public  PivotTable  showDrill(Boolean  showDrill) {
            this.showDrill =  showDrill;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowDrill() {
            return showDrill;
        }

        public void setShowDrill(Boolean showDrill) {
            this.showDrill = showDrill;
        }

        @SerializedName("ShowEmptyCol")
        private Boolean showEmptyCol ;

        public  PivotTable  showEmptyCol(Boolean  showEmptyCol) {
            this.showEmptyCol =  showEmptyCol;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowEmptyCol() {
            return showEmptyCol;
        }

        public void setShowEmptyCol(Boolean showEmptyCol) {
            this.showEmptyCol = showEmptyCol;
        }

        @SerializedName("ShowEmptyRow")
        private Boolean showEmptyRow ;

        public  PivotTable  showEmptyRow(Boolean  showEmptyRow) {
            this.showEmptyRow =  showEmptyRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowEmptyRow() {
            return showEmptyRow;
        }

        public void setShowEmptyRow(Boolean showEmptyRow) {
            this.showEmptyRow = showEmptyRow;
        }

        @SerializedName("ShowMemberPropertyTips")
        private Boolean showMemberPropertyTips ;

        public  PivotTable  showMemberPropertyTips(Boolean  showMemberPropertyTips) {
            this.showMemberPropertyTips =  showMemberPropertyTips;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowMemberPropertyTips() {
            return showMemberPropertyTips;
        }

        public void setShowMemberPropertyTips(Boolean showMemberPropertyTips) {
            this.showMemberPropertyTips = showMemberPropertyTips;
        }

        @SerializedName("ShowPivotStyleColumnHeader")
        private Boolean showPivotStyleColumnHeader ;

        public  PivotTable  showPivotStyleColumnHeader(Boolean  showPivotStyleColumnHeader) {
            this.showPivotStyleColumnHeader =  showPivotStyleColumnHeader;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowPivotStyleColumnHeader() {
            return showPivotStyleColumnHeader;
        }

        public void setShowPivotStyleColumnHeader(Boolean showPivotStyleColumnHeader) {
            this.showPivotStyleColumnHeader = showPivotStyleColumnHeader;
        }

        @SerializedName("ShowPivotStyleColumnStripes")
        private Boolean showPivotStyleColumnStripes ;

        public  PivotTable  showPivotStyleColumnStripes(Boolean  showPivotStyleColumnStripes) {
            this.showPivotStyleColumnStripes =  showPivotStyleColumnStripes;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowPivotStyleColumnStripes() {
            return showPivotStyleColumnStripes;
        }

        public void setShowPivotStyleColumnStripes(Boolean showPivotStyleColumnStripes) {
            this.showPivotStyleColumnStripes = showPivotStyleColumnStripes;
        }

        @SerializedName("ShowPivotStyleLastColumn")
        private Boolean showPivotStyleLastColumn ;

        public  PivotTable  showPivotStyleLastColumn(Boolean  showPivotStyleLastColumn) {
            this.showPivotStyleLastColumn =  showPivotStyleLastColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowPivotStyleLastColumn() {
            return showPivotStyleLastColumn;
        }

        public void setShowPivotStyleLastColumn(Boolean showPivotStyleLastColumn) {
            this.showPivotStyleLastColumn = showPivotStyleLastColumn;
        }

        @SerializedName("ShowPivotStyleRowHeader")
        private Boolean showPivotStyleRowHeader ;

        public  PivotTable  showPivotStyleRowHeader(Boolean  showPivotStyleRowHeader) {
            this.showPivotStyleRowHeader =  showPivotStyleRowHeader;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowPivotStyleRowHeader() {
            return showPivotStyleRowHeader;
        }

        public void setShowPivotStyleRowHeader(Boolean showPivotStyleRowHeader) {
            this.showPivotStyleRowHeader = showPivotStyleRowHeader;
        }

        @SerializedName("ShowPivotStyleRowStripes")
        private Boolean showPivotStyleRowStripes ;

        public  PivotTable  showPivotStyleRowStripes(Boolean  showPivotStyleRowStripes) {
            this.showPivotStyleRowStripes =  showPivotStyleRowStripes;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowPivotStyleRowStripes() {
            return showPivotStyleRowStripes;
        }

        public void setShowPivotStyleRowStripes(Boolean showPivotStyleRowStripes) {
            this.showPivotStyleRowStripes = showPivotStyleRowStripes;
        }

        @SerializedName("ShowRowHeaderCaption")
        private Boolean showRowHeaderCaption ;

        public  PivotTable  showRowHeaderCaption(Boolean  showRowHeaderCaption) {
            this.showRowHeaderCaption =  showRowHeaderCaption;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowRowHeaderCaption() {
            return showRowHeaderCaption;
        }

        public void setShowRowHeaderCaption(Boolean showRowHeaderCaption) {
            this.showRowHeaderCaption = showRowHeaderCaption;
        }

        @SerializedName("ShowValuesRow")
        private Boolean showValuesRow ;

        public  PivotTable  showValuesRow(Boolean  showValuesRow) {
            this.showValuesRow =  showValuesRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowValuesRow() {
            return showValuesRow;
        }

        public void setShowValuesRow(Boolean showValuesRow) {
            this.showValuesRow = showValuesRow;
        }

        @SerializedName("SubtotalHiddenPageItems")
        private Boolean subtotalHiddenPageItems ;

        public  PivotTable  subtotalHiddenPageItems(Boolean  subtotalHiddenPageItems) {
            this.subtotalHiddenPageItems =  subtotalHiddenPageItems;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getSubtotalHiddenPageItems() {
            return subtotalHiddenPageItems;
        }

        public void setSubtotalHiddenPageItems(Boolean subtotalHiddenPageItems) {
            this.subtotalHiddenPageItems = subtotalHiddenPageItems;
        }

        @SerializedName("TableRange1")
        private CellArea tableRange1 ;

        public  PivotTable  tableRange1(CellArea  tableRange1) {
            this.tableRange1 =  tableRange1;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellArea getTableRange1() {
            return tableRange1;
        }

        public void setTableRange1(CellArea tableRange1) {
            this.tableRange1 = tableRange1;
        }

        @SerializedName("TableRange2")
        private CellArea tableRange2 ;

        public  PivotTable  tableRange2(CellArea  tableRange2) {
            this.tableRange2 =  tableRange2;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellArea getTableRange2() {
            return tableRange2;
        }

        public void setTableRange2(CellArea tableRange2) {
            this.tableRange2 = tableRange2;
        }

        @SerializedName("Tag")
        private String tag ;

        public  PivotTable  tag(String  tag) {
            this.tag =  tag;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PivotTable pivotTable = (PivotTable) o;
            return
                Objects.equals(this.altTextDescription, pivotTable.altTextDescription) &&
                Objects.equals(this.altTextTitle, pivotTable.altTextTitle) &&
                Objects.equals(this.autoFormatType, pivotTable.autoFormatType) &&
                Objects.equals(this.baseFields, pivotTable.baseFields) &&
                Objects.equals(this.columnFields, pivotTable.columnFields) &&
                Objects.equals(this.columnGrand, pivotTable.columnGrand) &&
                Objects.equals(this.columnHeaderCaption, pivotTable.columnHeaderCaption) &&
                Objects.equals(this.columnRange, pivotTable.columnRange) &&
                Objects.equals(this.customListSort, pivotTable.customListSort) &&
                Objects.equals(this.dataBodyRange, pivotTable.dataBodyRange) &&
                Objects.equals(this.dataField, pivotTable.dataField) &&
                Objects.equals(this.dataFields, pivotTable.dataFields) &&
                Objects.equals(this.dataSource, pivotTable.dataSource) &&
                Objects.equals(this.displayErrorString, pivotTable.displayErrorString) &&
                Objects.equals(this.displayImmediateItems, pivotTable.displayImmediateItems) &&
                Objects.equals(this.displayNullString, pivotTable.displayNullString) &&
                Objects.equals(this.enableDataValueEditing, pivotTable.enableDataValueEditing) &&
                Objects.equals(this.enableDrilldown, pivotTable.enableDrilldown) &&
                Objects.equals(this.enableFieldDialog, pivotTable.enableFieldDialog) &&
                Objects.equals(this.enableFieldList, pivotTable.enableFieldList) &&
                Objects.equals(this.enableWizard, pivotTable.enableWizard) &&
                Objects.equals(this.errorString, pivotTable.errorString) &&
                Objects.equals(this.fieldListSortAscending, pivotTable.fieldListSortAscending) &&
                Objects.equals(this.grandTotalName, pivotTable.grandTotalName) &&
                Objects.equals(this.hasBlankRows, pivotTable.hasBlankRows) &&
                Objects.equals(this.indent, pivotTable.indent) &&
                Objects.equals(this.isAutoFormat, pivotTable.isAutoFormat) &&
                Objects.equals(this.isGridDropZones, pivotTable.isGridDropZones) &&
                Objects.equals(this.isMultipleFieldFilters, pivotTable.isMultipleFieldFilters) &&
                Objects.equals(this.isSelected, pivotTable.isSelected) &&
                Objects.equals(this.itemPrintTitles, pivotTable.itemPrintTitles) &&
                Objects.equals(this.manualUpdate, pivotTable.manualUpdate) &&
                Objects.equals(this.mergeLabels, pivotTable.mergeLabels) &&
                Objects.equals(this.missingItemsLimit, pivotTable.missingItemsLimit) &&
                Objects.equals(this.name, pivotTable.name) &&
                Objects.equals(this.nullString, pivotTable.nullString) &&
                Objects.equals(this.pageFieldOrder, pivotTable.pageFieldOrder) &&
                Objects.equals(this.pageFields, pivotTable.pageFields) &&
                Objects.equals(this.pageFieldWrapCount, pivotTable.pageFieldWrapCount) &&
                Objects.equals(this.pivotFilters, pivotTable.pivotFilters) &&
                Objects.equals(this.pivotTableStyleName, pivotTable.pivotTableStyleName) &&
                Objects.equals(this.pivotTableStyleType, pivotTable.pivotTableStyleType) &&
                Objects.equals(this.preserveFormatting, pivotTable.preserveFormatting) &&
                Objects.equals(this.printDrill, pivotTable.printDrill) &&
                Objects.equals(this.printTitles, pivotTable.printTitles) &&
                Objects.equals(this.refreshDataFlag, pivotTable.refreshDataFlag) &&
                Objects.equals(this.refreshDataOnOpeningFile, pivotTable.refreshDataOnOpeningFile) &&
                Objects.equals(this.rowFields, pivotTable.rowFields) &&
                Objects.equals(this.rowGrand, pivotTable.rowGrand) &&
                Objects.equals(this.rowHeaderCaption, pivotTable.rowHeaderCaption) &&
                Objects.equals(this.rowRange, pivotTable.rowRange) &&
                Objects.equals(this.saveData, pivotTable.saveData) &&
                Objects.equals(this.showDataTips, pivotTable.showDataTips) &&
                Objects.equals(this.showDrill, pivotTable.showDrill) &&
                Objects.equals(this.showEmptyCol, pivotTable.showEmptyCol) &&
                Objects.equals(this.showEmptyRow, pivotTable.showEmptyRow) &&
                Objects.equals(this.showMemberPropertyTips, pivotTable.showMemberPropertyTips) &&
                Objects.equals(this.showPivotStyleColumnHeader, pivotTable.showPivotStyleColumnHeader) &&
                Objects.equals(this.showPivotStyleColumnStripes, pivotTable.showPivotStyleColumnStripes) &&
                Objects.equals(this.showPivotStyleLastColumn, pivotTable.showPivotStyleLastColumn) &&
                Objects.equals(this.showPivotStyleRowHeader, pivotTable.showPivotStyleRowHeader) &&
                Objects.equals(this.showPivotStyleRowStripes, pivotTable.showPivotStyleRowStripes) &&
                Objects.equals(this.showRowHeaderCaption, pivotTable.showRowHeaderCaption) &&
                Objects.equals(this.showValuesRow, pivotTable.showValuesRow) &&
                Objects.equals(this.subtotalHiddenPageItems, pivotTable.subtotalHiddenPageItems) &&
                Objects.equals(this.tableRange1, pivotTable.tableRange1) &&
                Objects.equals(this.tableRange2, pivotTable.tableRange2) &&
                Objects.equals(this.tag, pivotTable.tag) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(altTextDescription, altTextTitle, autoFormatType, baseFields, columnFields, columnGrand, columnHeaderCaption, columnRange, customListSort, dataBodyRange, dataField, dataFields, dataSource, displayErrorString, displayImmediateItems, displayNullString, enableDataValueEditing, enableDrilldown, enableFieldDialog, enableFieldList, enableWizard, errorString, fieldListSortAscending, grandTotalName, hasBlankRows, indent, isAutoFormat, isGridDropZones, isMultipleFieldFilters, isSelected, itemPrintTitles, manualUpdate, mergeLabels, missingItemsLimit, name, nullString, pageFieldOrder, pageFields, pageFieldWrapCount, pivotFilters, pivotTableStyleName, pivotTableStyleType, preserveFormatting, printDrill, printTitles, refreshDataFlag, refreshDataOnOpeningFile, rowFields, rowGrand, rowHeaderCaption, rowRange, saveData, showDataTips, showDrill, showEmptyCol, showEmptyRow, showMemberPropertyTips, showPivotStyleColumnHeader, showPivotStyleColumnStripes, showPivotStyleLastColumn, showPivotStyleRowHeader, showPivotStyleRowStripes, showRowHeaderCaption, showValuesRow, subtotalHiddenPageItems, tableRange1, tableRange2, tag, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PivotTable {\n");
            sb.append("    altTextDescription: ").append(toIndentedString(getAltTextDescription())).append("\n");
            sb.append("    altTextTitle: ").append(toIndentedString(getAltTextTitle())).append("\n");
            sb.append("    autoFormatType: ").append(toIndentedString(getAutoFormatType())).append("\n");
            sb.append("    baseFields: ").append(toIndentedString(getBaseFields())).append("\n");
            sb.append("    columnFields: ").append(toIndentedString(getColumnFields())).append("\n");
            sb.append("    columnGrand: ").append(toIndentedString(getColumnGrand())).append("\n");
            sb.append("    columnHeaderCaption: ").append(toIndentedString(getColumnHeaderCaption())).append("\n");
            sb.append("    columnRange: ").append(toIndentedString(getColumnRange())).append("\n");
            sb.append("    customListSort: ").append(toIndentedString(getCustomListSort())).append("\n");
            sb.append("    dataBodyRange: ").append(toIndentedString(getDataBodyRange())).append("\n");
            sb.append("    dataField: ").append(toIndentedString(getDataField())).append("\n");
            sb.append("    dataFields: ").append(toIndentedString(getDataFields())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    displayErrorString: ").append(toIndentedString(getDisplayErrorString())).append("\n");
            sb.append("    displayImmediateItems: ").append(toIndentedString(getDisplayImmediateItems())).append("\n");
            sb.append("    displayNullString: ").append(toIndentedString(getDisplayNullString())).append("\n");
            sb.append("    enableDataValueEditing: ").append(toIndentedString(getEnableDataValueEditing())).append("\n");
            sb.append("    enableDrilldown: ").append(toIndentedString(getEnableDrilldown())).append("\n");
            sb.append("    enableFieldDialog: ").append(toIndentedString(getEnableFieldDialog())).append("\n");
            sb.append("    enableFieldList: ").append(toIndentedString(getEnableFieldList())).append("\n");
            sb.append("    enableWizard: ").append(toIndentedString(getEnableWizard())).append("\n");
            sb.append("    errorString: ").append(toIndentedString(getErrorString())).append("\n");
            sb.append("    fieldListSortAscending: ").append(toIndentedString(getFieldListSortAscending())).append("\n");
            sb.append("    grandTotalName: ").append(toIndentedString(getGrandTotalName())).append("\n");
            sb.append("    hasBlankRows: ").append(toIndentedString(getHasBlankRows())).append("\n");
            sb.append("    indent: ").append(toIndentedString(getIndent())).append("\n");
            sb.append("    isAutoFormat: ").append(toIndentedString(getIsAutoFormat())).append("\n");
            sb.append("    isGridDropZones: ").append(toIndentedString(getIsGridDropZones())).append("\n");
            sb.append("    isMultipleFieldFilters: ").append(toIndentedString(getIsMultipleFieldFilters())).append("\n");
            sb.append("    isSelected: ").append(toIndentedString(getIsSelected())).append("\n");
            sb.append("    itemPrintTitles: ").append(toIndentedString(getItemPrintTitles())).append("\n");
            sb.append("    manualUpdate: ").append(toIndentedString(getManualUpdate())).append("\n");
            sb.append("    mergeLabels: ").append(toIndentedString(getMergeLabels())).append("\n");
            sb.append("    missingItemsLimit: ").append(toIndentedString(getMissingItemsLimit())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    nullString: ").append(toIndentedString(getNullString())).append("\n");
            sb.append("    pageFieldOrder: ").append(toIndentedString(getPageFieldOrder())).append("\n");
            sb.append("    pageFields: ").append(toIndentedString(getPageFields())).append("\n");
            sb.append("    pageFieldWrapCount: ").append(toIndentedString(getPageFieldWrapCount())).append("\n");
            sb.append("    pivotFilters: ").append(toIndentedString(getPivotFilters())).append("\n");
            sb.append("    pivotTableStyleName: ").append(toIndentedString(getPivotTableStyleName())).append("\n");
            sb.append("    pivotTableStyleType: ").append(toIndentedString(getPivotTableStyleType())).append("\n");
            sb.append("    preserveFormatting: ").append(toIndentedString(getPreserveFormatting())).append("\n");
            sb.append("    printDrill: ").append(toIndentedString(getPrintDrill())).append("\n");
            sb.append("    printTitles: ").append(toIndentedString(getPrintTitles())).append("\n");
            sb.append("    refreshDataFlag: ").append(toIndentedString(getRefreshDataFlag())).append("\n");
            sb.append("    refreshDataOnOpeningFile: ").append(toIndentedString(getRefreshDataOnOpeningFile())).append("\n");
            sb.append("    rowFields: ").append(toIndentedString(getRowFields())).append("\n");
            sb.append("    rowGrand: ").append(toIndentedString(getRowGrand())).append("\n");
            sb.append("    rowHeaderCaption: ").append(toIndentedString(getRowHeaderCaption())).append("\n");
            sb.append("    rowRange: ").append(toIndentedString(getRowRange())).append("\n");
            sb.append("    saveData: ").append(toIndentedString(getSaveData())).append("\n");
            sb.append("    showDataTips: ").append(toIndentedString(getShowDataTips())).append("\n");
            sb.append("    showDrill: ").append(toIndentedString(getShowDrill())).append("\n");
            sb.append("    showEmptyCol: ").append(toIndentedString(getShowEmptyCol())).append("\n");
            sb.append("    showEmptyRow: ").append(toIndentedString(getShowEmptyRow())).append("\n");
            sb.append("    showMemberPropertyTips: ").append(toIndentedString(getShowMemberPropertyTips())).append("\n");
            sb.append("    showPivotStyleColumnHeader: ").append(toIndentedString(getShowPivotStyleColumnHeader())).append("\n");
            sb.append("    showPivotStyleColumnStripes: ").append(toIndentedString(getShowPivotStyleColumnStripes())).append("\n");
            sb.append("    showPivotStyleLastColumn: ").append(toIndentedString(getShowPivotStyleLastColumn())).append("\n");
            sb.append("    showPivotStyleRowHeader: ").append(toIndentedString(getShowPivotStyleRowHeader())).append("\n");
            sb.append("    showPivotStyleRowStripes: ").append(toIndentedString(getShowPivotStyleRowStripes())).append("\n");
            sb.append("    showRowHeaderCaption: ").append(toIndentedString(getShowRowHeaderCaption())).append("\n");
            sb.append("    showValuesRow: ").append(toIndentedString(getShowValuesRow())).append("\n");
            sb.append("    subtotalHiddenPageItems: ").append(toIndentedString(getSubtotalHiddenPageItems())).append("\n");
            sb.append("    tableRange1: ").append(toIndentedString(getTableRange1())).append("\n");
            sb.append("    tableRange2: ").append(toIndentedString(getTableRange2())).append("\n");
            sb.append("    tag: ").append(toIndentedString(getTag())).append("\n");
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


package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotTable — Summary description for PivotTable. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTable extends LinkElement {
    /** Gets the description of the alt text */
    @JsonProperty("AltTextDescription")
    private String altTextDescription;

    /** Gets or sets AltTextTitle. */
    @JsonProperty("AltTextTitle")
    private String altTextTitle;

    /** Gets or sets AutoFormatType. */
    @JsonProperty("AutoFormatType")
    private String autoFormatType;

    /** Gets or sets BaseFields. */
    @JsonProperty("BaseFields")
    private List<PivotField> baseFields;

    /** Gets or sets ColumnFields. */
    @JsonProperty("ColumnFields")
    private List<PivotField> columnFields;

    /** Gets or sets ColumnGrand. */
    @JsonProperty("ColumnGrand")
    private Boolean columnGrand;

    /** Gets or sets ColumnHeaderCaption. */
    @JsonProperty("ColumnHeaderCaption")
    private String columnHeaderCaption;

    /** Gets or sets ColumnRange. */
    @JsonProperty("ColumnRange")
    private CellArea columnRange;

    /** Gets or sets CustomListSort. */
    @JsonProperty("CustomListSort")
    private Boolean customListSort;

    /** Gets or sets DataBodyRange. */
    @JsonProperty("DataBodyRange")
    private CellArea dataBodyRange;

    /** Gets or sets DataField. */
    @JsonProperty("DataField")
    private PivotField dataField;

    /** Gets or sets DataFields. */
    @JsonProperty("DataFields")
    private List<PivotField> dataFields;

    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private List<String> dataSource;

    /** Gets or sets DisplayErrorString. */
    @JsonProperty("DisplayErrorString")
    private Boolean displayErrorString;

    /** Gets or sets DisplayImmediateItems. */
    @JsonProperty("DisplayImmediateItems")
    private Boolean displayImmediateItems;

    /** Gets or sets DisplayNullString. */
    @JsonProperty("DisplayNullString")
    private Boolean displayNullString;

    /** Gets or sets EnableDataValueEditing. */
    @JsonProperty("EnableDataValueEditing")
    private Boolean enableDataValueEditing;

    /** Gets or sets EnableDrilldown. */
    @JsonProperty("EnableDrilldown")
    private Boolean enableDrilldown;

    /** Gets or sets EnableFieldDialog. */
    @JsonProperty("EnableFieldDialog")
    private Boolean enableFieldDialog;

    /** Gets or sets EnableFieldList. */
    @JsonProperty("EnableFieldList")
    private Boolean enableFieldList;

    /** Gets or sets EnableWizard. */
    @JsonProperty("EnableWizard")
    private Boolean enableWizard;

    /** Gets or sets ErrorString. */
    @JsonProperty("ErrorString")
    private String errorString;

    /** Gets or sets FieldListSortAscending. */
    @JsonProperty("FieldListSortAscending")
    private Boolean fieldListSortAscending;

    /** Gets or sets GrandTotalName. */
    @JsonProperty("GrandTotalName")
    private String grandTotalName;

    /** Gets or sets HasBlankRows. */
    @JsonProperty("HasBlankRows")
    private Boolean hasBlankRows;

    /** Gets or sets Indent. */
    @JsonProperty("Indent")
    private Integer indent;

    /** Gets or sets IsAutoFormat. */
    @JsonProperty("IsAutoFormat")
    private Boolean isAutoFormat;

    /** Gets or sets IsGridDropZones. */
    @JsonProperty("IsGridDropZones")
    private Boolean isGridDropZones;

    /** Gets or sets IsMultipleFieldFilters. */
    @JsonProperty("IsMultipleFieldFilters")
    private Boolean isMultipleFieldFilters;

    /** Gets or sets IsSelected. */
    @JsonProperty("IsSelected")
    private Boolean isSelected;

    /** Gets or sets ItemPrintTitles. */
    @JsonProperty("ItemPrintTitles")
    private Boolean itemPrintTitles;

    /** Gets or sets ManualUpdate. */
    @JsonProperty("ManualUpdate")
    private Boolean manualUpdate;

    /** Gets or sets MergeLabels. */
    @JsonProperty("MergeLabels")
    private Boolean mergeLabels;

    /** Gets or sets MissingItemsLimit. */
    @JsonProperty("MissingItemsLimit")
    private String missingItemsLimit;

    /** Represents pivot table name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets NullString. */
    @JsonProperty("NullString")
    private String nullString;

    /** Gets or sets PageFieldOrder. */
    @JsonProperty("PageFieldOrder")
    private String pageFieldOrder;

    /** Gets or sets PageFields. */
    @JsonProperty("PageFields")
    private List<PivotField> pageFields;

    /** Gets or sets PageFieldWrapCount. */
    @JsonProperty("PageFieldWrapCount")
    private Integer pageFieldWrapCount;

    /** Gets or sets PivotFilters. */
    @JsonProperty("PivotFilters")
    private List<PivotFilter> pivotFilters;

    /** Gets or sets PivotTableStyleName. */
    @JsonProperty("PivotTableStyleName")
    private String pivotTableStyleName;

    /** Gets or sets PivotTableStyleType. */
    @JsonProperty("PivotTableStyleType")
    private String pivotTableStyleType;

    /** Gets or sets PreserveFormatting. */
    @JsonProperty("PreserveFormatting")
    private Boolean preserveFormatting;

    /** Gets or sets PrintDrill. */
    @JsonProperty("PrintDrill")
    private Boolean printDrill;

    /** Gets or sets PrintTitles. */
    @JsonProperty("PrintTitles")
    private Boolean printTitles;

    /** Gets or sets RefreshDataFlag. */
    @JsonProperty("RefreshDataFlag")
    private Boolean refreshDataFlag;

    /** Gets or sets RefreshDataOnOpeningFile. */
    @JsonProperty("RefreshDataOnOpeningFile")
    private Boolean refreshDataOnOpeningFile;

    /** Gets or sets RowFields. */
    @JsonProperty("RowFields")
    private List<PivotField> rowFields;

    /** Gets or sets RowGrand. */
    @JsonProperty("RowGrand")
    private Boolean rowGrand;

    /** Gets or sets RowHeaderCaption. */
    @JsonProperty("RowHeaderCaption")
    private String rowHeaderCaption;

    /** Gets or sets RowRange. */
    @JsonProperty("RowRange")
    private CellArea rowRange;

    /** Gets or sets SaveData. */
    @JsonProperty("SaveData")
    private Boolean saveData;

    /** Gets or sets ShowDataTips. */
    @JsonProperty("ShowDataTips")
    private Boolean showDataTips;

    /** Gets or sets ShowDrill. */
    @JsonProperty("ShowDrill")
    private Boolean showDrill;

    /** Gets or sets ShowEmptyCol. */
    @JsonProperty("ShowEmptyCol")
    private Boolean showEmptyCol;

    /** Gets or sets ShowEmptyRow. */
    @JsonProperty("ShowEmptyRow")
    private Boolean showEmptyRow;

    /** Gets or sets ShowMemberPropertyTips. */
    @JsonProperty("ShowMemberPropertyTips")
    private Boolean showMemberPropertyTips;

    /** Gets or sets ShowPivotStyleColumnHeader. */
    @JsonProperty("ShowPivotStyleColumnHeader")
    private Boolean showPivotStyleColumnHeader;

    /** Gets or sets ShowPivotStyleColumnStripes. */
    @JsonProperty("ShowPivotStyleColumnStripes")
    private Boolean showPivotStyleColumnStripes;

    /** Gets or sets ShowPivotStyleLastColumn. */
    @JsonProperty("ShowPivotStyleLastColumn")
    private Boolean showPivotStyleLastColumn;

    /** Gets or sets ShowPivotStyleRowHeader. */
    @JsonProperty("ShowPivotStyleRowHeader")
    private Boolean showPivotStyleRowHeader;

    /** Gets or sets ShowPivotStyleRowStripes. */
    @JsonProperty("ShowPivotStyleRowStripes")
    private Boolean showPivotStyleRowStripes;

    /** Gets or sets ShowRowHeaderCaption. */
    @JsonProperty("ShowRowHeaderCaption")
    private Boolean showRowHeaderCaption;

    /** Gets or sets ShowValuesRow. */
    @JsonProperty("ShowValuesRow")
    private Boolean showValuesRow;

    /** Gets or sets SubtotalHiddenPageItems. */
    @JsonProperty("SubtotalHiddenPageItems")
    private Boolean subtotalHiddenPageItems;

    /** Gets or sets TableRange1. */
    @JsonProperty("TableRange1")
    private CellArea tableRange1;

    /** Gets or sets TableRange2. */
    @JsonProperty("TableRange2")
    private CellArea tableRange2;

    /** Gets or sets Tag. */
    @JsonProperty("Tag")
    private String tag;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public String getAltTextDescription() { return altTextDescription; }
    public PivotTable setAltTextDescription(String altTextDescription) { this.altTextDescription = altTextDescription; return this; }

    public String getAltTextTitle() { return altTextTitle; }
    public PivotTable setAltTextTitle(String altTextTitle) { this.altTextTitle = altTextTitle; return this; }

    public String getAutoFormatType() { return autoFormatType; }
    public PivotTable setAutoFormatType(String autoFormatType) { this.autoFormatType = autoFormatType; return this; }

    public List<PivotField> getBaseFields() { return baseFields; }
    public PivotTable setBaseFields(List<PivotField> baseFields) { this.baseFields = baseFields; return this; }

    public List<PivotField> getColumnFields() { return columnFields; }
    public PivotTable setColumnFields(List<PivotField> columnFields) { this.columnFields = columnFields; return this; }

    public Boolean getColumnGrand() { return columnGrand; }
    public PivotTable setColumnGrand(Boolean columnGrand) { this.columnGrand = columnGrand; return this; }

    public String getColumnHeaderCaption() { return columnHeaderCaption; }
    public PivotTable setColumnHeaderCaption(String columnHeaderCaption) { this.columnHeaderCaption = columnHeaderCaption; return this; }

    public CellArea getColumnRange() { return columnRange; }
    public PivotTable setColumnRange(CellArea columnRange) { this.columnRange = columnRange; return this; }

    public Boolean getCustomListSort() { return customListSort; }
    public PivotTable setCustomListSort(Boolean customListSort) { this.customListSort = customListSort; return this; }

    public CellArea getDataBodyRange() { return dataBodyRange; }
    public PivotTable setDataBodyRange(CellArea dataBodyRange) { this.dataBodyRange = dataBodyRange; return this; }

    public PivotField getDataField() { return dataField; }
    public PivotTable setDataField(PivotField dataField) { this.dataField = dataField; return this; }

    public List<PivotField> getDataFields() { return dataFields; }
    public PivotTable setDataFields(List<PivotField> dataFields) { this.dataFields = dataFields; return this; }

    public List<String> getDataSource() { return dataSource; }
    public PivotTable setDataSource(List<String> dataSource) { this.dataSource = dataSource; return this; }

    public Boolean getDisplayErrorString() { return displayErrorString; }
    public PivotTable setDisplayErrorString(Boolean displayErrorString) { this.displayErrorString = displayErrorString; return this; }

    public Boolean getDisplayImmediateItems() { return displayImmediateItems; }
    public PivotTable setDisplayImmediateItems(Boolean displayImmediateItems) { this.displayImmediateItems = displayImmediateItems; return this; }

    public Boolean getDisplayNullString() { return displayNullString; }
    public PivotTable setDisplayNullString(Boolean displayNullString) { this.displayNullString = displayNullString; return this; }

    public Boolean getEnableDataValueEditing() { return enableDataValueEditing; }
    public PivotTable setEnableDataValueEditing(Boolean enableDataValueEditing) { this.enableDataValueEditing = enableDataValueEditing; return this; }

    public Boolean getEnableDrilldown() { return enableDrilldown; }
    public PivotTable setEnableDrilldown(Boolean enableDrilldown) { this.enableDrilldown = enableDrilldown; return this; }

    public Boolean getEnableFieldDialog() { return enableFieldDialog; }
    public PivotTable setEnableFieldDialog(Boolean enableFieldDialog) { this.enableFieldDialog = enableFieldDialog; return this; }

    public Boolean getEnableFieldList() { return enableFieldList; }
    public PivotTable setEnableFieldList(Boolean enableFieldList) { this.enableFieldList = enableFieldList; return this; }

    public Boolean getEnableWizard() { return enableWizard; }
    public PivotTable setEnableWizard(Boolean enableWizard) { this.enableWizard = enableWizard; return this; }

    public String getErrorString() { return errorString; }
    public PivotTable setErrorString(String errorString) { this.errorString = errorString; return this; }

    public Boolean getFieldListSortAscending() { return fieldListSortAscending; }
    public PivotTable setFieldListSortAscending(Boolean fieldListSortAscending) { this.fieldListSortAscending = fieldListSortAscending; return this; }

    public String getGrandTotalName() { return grandTotalName; }
    public PivotTable setGrandTotalName(String grandTotalName) { this.grandTotalName = grandTotalName; return this; }

    public Boolean getHasBlankRows() { return hasBlankRows; }
    public PivotTable setHasBlankRows(Boolean hasBlankRows) { this.hasBlankRows = hasBlankRows; return this; }

    public Integer getIndent() { return indent; }
    public PivotTable setIndent(Integer indent) { this.indent = indent; return this; }

    public Boolean getIsAutoFormat() { return isAutoFormat; }
    public PivotTable setIsAutoFormat(Boolean isAutoFormat) { this.isAutoFormat = isAutoFormat; return this; }

    public Boolean getIsGridDropZones() { return isGridDropZones; }
    public PivotTable setIsGridDropZones(Boolean isGridDropZones) { this.isGridDropZones = isGridDropZones; return this; }

    public Boolean getIsMultipleFieldFilters() { return isMultipleFieldFilters; }
    public PivotTable setIsMultipleFieldFilters(Boolean isMultipleFieldFilters) { this.isMultipleFieldFilters = isMultipleFieldFilters; return this; }

    public Boolean getIsSelected() { return isSelected; }
    public PivotTable setIsSelected(Boolean isSelected) { this.isSelected = isSelected; return this; }

    public Boolean getItemPrintTitles() { return itemPrintTitles; }
    public PivotTable setItemPrintTitles(Boolean itemPrintTitles) { this.itemPrintTitles = itemPrintTitles; return this; }

    public Boolean getManualUpdate() { return manualUpdate; }
    public PivotTable setManualUpdate(Boolean manualUpdate) { this.manualUpdate = manualUpdate; return this; }

    public Boolean getMergeLabels() { return mergeLabels; }
    public PivotTable setMergeLabels(Boolean mergeLabels) { this.mergeLabels = mergeLabels; return this; }

    public String getMissingItemsLimit() { return missingItemsLimit; }
    public PivotTable setMissingItemsLimit(String missingItemsLimit) { this.missingItemsLimit = missingItemsLimit; return this; }

    public String getName() { return name; }
    public PivotTable setName(String name) { this.name = name; return this; }

    public String getNullString() { return nullString; }
    public PivotTable setNullString(String nullString) { this.nullString = nullString; return this; }

    public String getPageFieldOrder() { return pageFieldOrder; }
    public PivotTable setPageFieldOrder(String pageFieldOrder) { this.pageFieldOrder = pageFieldOrder; return this; }

    public List<PivotField> getPageFields() { return pageFields; }
    public PivotTable setPageFields(List<PivotField> pageFields) { this.pageFields = pageFields; return this; }

    public Integer getPageFieldWrapCount() { return pageFieldWrapCount; }
    public PivotTable setPageFieldWrapCount(Integer pageFieldWrapCount) { this.pageFieldWrapCount = pageFieldWrapCount; return this; }

    public List<PivotFilter> getPivotFilters() { return pivotFilters; }
    public PivotTable setPivotFilters(List<PivotFilter> pivotFilters) { this.pivotFilters = pivotFilters; return this; }

    public String getPivotTableStyleName() { return pivotTableStyleName; }
    public PivotTable setPivotTableStyleName(String pivotTableStyleName) { this.pivotTableStyleName = pivotTableStyleName; return this; }

    public String getPivotTableStyleType() { return pivotTableStyleType; }
    public PivotTable setPivotTableStyleType(String pivotTableStyleType) { this.pivotTableStyleType = pivotTableStyleType; return this; }

    public Boolean getPreserveFormatting() { return preserveFormatting; }
    public PivotTable setPreserveFormatting(Boolean preserveFormatting) { this.preserveFormatting = preserveFormatting; return this; }

    public Boolean getPrintDrill() { return printDrill; }
    public PivotTable setPrintDrill(Boolean printDrill) { this.printDrill = printDrill; return this; }

    public Boolean getPrintTitles() { return printTitles; }
    public PivotTable setPrintTitles(Boolean printTitles) { this.printTitles = printTitles; return this; }

    public Boolean getRefreshDataFlag() { return refreshDataFlag; }
    public PivotTable setRefreshDataFlag(Boolean refreshDataFlag) { this.refreshDataFlag = refreshDataFlag; return this; }

    public Boolean getRefreshDataOnOpeningFile() { return refreshDataOnOpeningFile; }
    public PivotTable setRefreshDataOnOpeningFile(Boolean refreshDataOnOpeningFile) { this.refreshDataOnOpeningFile = refreshDataOnOpeningFile; return this; }

    public List<PivotField> getRowFields() { return rowFields; }
    public PivotTable setRowFields(List<PivotField> rowFields) { this.rowFields = rowFields; return this; }

    public Boolean getRowGrand() { return rowGrand; }
    public PivotTable setRowGrand(Boolean rowGrand) { this.rowGrand = rowGrand; return this; }

    public String getRowHeaderCaption() { return rowHeaderCaption; }
    public PivotTable setRowHeaderCaption(String rowHeaderCaption) { this.rowHeaderCaption = rowHeaderCaption; return this; }

    public CellArea getRowRange() { return rowRange; }
    public PivotTable setRowRange(CellArea rowRange) { this.rowRange = rowRange; return this; }

    public Boolean getSaveData() { return saveData; }
    public PivotTable setSaveData(Boolean saveData) { this.saveData = saveData; return this; }

    public Boolean getShowDataTips() { return showDataTips; }
    public PivotTable setShowDataTips(Boolean showDataTips) { this.showDataTips = showDataTips; return this; }

    public Boolean getShowDrill() { return showDrill; }
    public PivotTable setShowDrill(Boolean showDrill) { this.showDrill = showDrill; return this; }

    public Boolean getShowEmptyCol() { return showEmptyCol; }
    public PivotTable setShowEmptyCol(Boolean showEmptyCol) { this.showEmptyCol = showEmptyCol; return this; }

    public Boolean getShowEmptyRow() { return showEmptyRow; }
    public PivotTable setShowEmptyRow(Boolean showEmptyRow) { this.showEmptyRow = showEmptyRow; return this; }

    public Boolean getShowMemberPropertyTips() { return showMemberPropertyTips; }
    public PivotTable setShowMemberPropertyTips(Boolean showMemberPropertyTips) { this.showMemberPropertyTips = showMemberPropertyTips; return this; }

    public Boolean getShowPivotStyleColumnHeader() { return showPivotStyleColumnHeader; }
    public PivotTable setShowPivotStyleColumnHeader(Boolean showPivotStyleColumnHeader) { this.showPivotStyleColumnHeader = showPivotStyleColumnHeader; return this; }

    public Boolean getShowPivotStyleColumnStripes() { return showPivotStyleColumnStripes; }
    public PivotTable setShowPivotStyleColumnStripes(Boolean showPivotStyleColumnStripes) { this.showPivotStyleColumnStripes = showPivotStyleColumnStripes; return this; }

    public Boolean getShowPivotStyleLastColumn() { return showPivotStyleLastColumn; }
    public PivotTable setShowPivotStyleLastColumn(Boolean showPivotStyleLastColumn) { this.showPivotStyleLastColumn = showPivotStyleLastColumn; return this; }

    public Boolean getShowPivotStyleRowHeader() { return showPivotStyleRowHeader; }
    public PivotTable setShowPivotStyleRowHeader(Boolean showPivotStyleRowHeader) { this.showPivotStyleRowHeader = showPivotStyleRowHeader; return this; }

    public Boolean getShowPivotStyleRowStripes() { return showPivotStyleRowStripes; }
    public PivotTable setShowPivotStyleRowStripes(Boolean showPivotStyleRowStripes) { this.showPivotStyleRowStripes = showPivotStyleRowStripes; return this; }

    public Boolean getShowRowHeaderCaption() { return showRowHeaderCaption; }
    public PivotTable setShowRowHeaderCaption(Boolean showRowHeaderCaption) { this.showRowHeaderCaption = showRowHeaderCaption; return this; }

    public Boolean getShowValuesRow() { return showValuesRow; }
    public PivotTable setShowValuesRow(Boolean showValuesRow) { this.showValuesRow = showValuesRow; return this; }

    public Boolean getSubtotalHiddenPageItems() { return subtotalHiddenPageItems; }
    public PivotTable setSubtotalHiddenPageItems(Boolean subtotalHiddenPageItems) { this.subtotalHiddenPageItems = subtotalHiddenPageItems; return this; }

    public CellArea getTableRange1() { return tableRange1; }
    public PivotTable setTableRange1(CellArea tableRange1) { this.tableRange1 = tableRange1; return this; }

    public CellArea getTableRange2() { return tableRange2; }
    public PivotTable setTableRange2(CellArea tableRange2) { this.tableRange2 = tableRange2; return this; }

    public String getTag() { return tag; }
    public PivotTable setTag(String tag) { this.tag = tag; return this; }

    public Link getLink() { return link; }
    public PivotTable setLink(Link link) { this.link = link; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ListObject — Represents a list object on a worksheet.            The ListObject object is a member of the ListObjects collection.             The ListObjects collection contains all the list objects on a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListObject extends LinkElement {
    /** Gets auto filter. */
    @JsonProperty("AutoFilter")
    private AutoFilter autoFilter;

    /** Gets and sets the display name. */
    @JsonProperty("DisplayName")
    private String displayName;

    /** Gets the start column of the range. */
    @JsonProperty("StartColumn")
    private Integer startColumn;

    /** Gets the start row of the range. */
    @JsonProperty("StartRow")
    private Integer startRow;

    /** Gets the end column of the range. */
    @JsonProperty("EndColumn")
    private Integer endColumn;

    /** Gets the end  row of the range. */
    @JsonProperty("EndRow")
    private Integer endRow;

    /** Gets ListColumns of the ListObject. */
    @JsonProperty("ListColumns")
    private List<ListColumn> listColumns;

    /** Gets and sets whether this ListObject show header row. */
    @JsonProperty("ShowHeaderRow")
    private Boolean showHeaderRow;

    /** Indicates whether column stripe formatting is applied. */
    @JsonProperty("ShowTableStyleColumnStripes")
    private Boolean showTableStyleColumnStripes;

    /** Indicates whether the first column in the table should have the style applied. */
    @JsonProperty("ShowTableStyleFirstColumn")
    private Boolean showTableStyleFirstColumn;

    /** Indicates whether the last column in the table should have the style applied. */
    @JsonProperty("ShowTableStyleLastColumn")
    private Boolean showTableStyleLastColumn;

    /** Indicates whether row stripe formatting is applied. */
    @JsonProperty("ShowTableStyleRowStripes")
    private Boolean showTableStyleRowStripes;

    /** Gets and sets whether this ListObject show total row. */
    @JsonProperty("ShowTotals")
    private Boolean showTotals;

    /** Gets and sets the table style name. */
    @JsonProperty("TableStyleName")
    private String tableStyleName;

    /** Gets and the built-in table style. */
    @JsonProperty("TableStyleType")
    private String tableStyleType;

    /** Gets the data range of the ListObject. */
    @JsonProperty("DataRange")
    private Range dataRange;

    /** Gets the data source type of the table. */
    @JsonProperty("DataSourceType")
    private String dataSourceType;

    /** Gets and sets the comment of the table. */
    @JsonProperty("Comment")
    private String comment;

    /** Gets an  used for this list. */
    @JsonProperty("XmlMap")
    private XmlMap xmlMap;

    /** Gets and sets the alternative text. */
    @JsonProperty("AlternativeText")
    private String alternativeText;

    /** Gets and sets the alternative description. */
    @JsonProperty("AlternativeDescription")
    private String alternativeDescription;

    public AutoFilter getAutoFilter() { return autoFilter; }
    public ListObject setAutoFilter(AutoFilter autoFilter) { this.autoFilter = autoFilter; return this; }

    public String getDisplayName() { return displayName; }
    public ListObject setDisplayName(String displayName) { this.displayName = displayName; return this; }

    public Integer getStartColumn() { return startColumn; }
    public ListObject setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }

    public Integer getStartRow() { return startRow; }
    public ListObject setStartRow(Integer startRow) { this.startRow = startRow; return this; }

    public Integer getEndColumn() { return endColumn; }
    public ListObject setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }

    public Integer getEndRow() { return endRow; }
    public ListObject setEndRow(Integer endRow) { this.endRow = endRow; return this; }

    public List<ListColumn> getListColumns() { return listColumns; }
    public ListObject setListColumns(List<ListColumn> listColumns) { this.listColumns = listColumns; return this; }

    public Boolean getShowHeaderRow() { return showHeaderRow; }
    public ListObject setShowHeaderRow(Boolean showHeaderRow) { this.showHeaderRow = showHeaderRow; return this; }

    public Boolean getShowTableStyleColumnStripes() { return showTableStyleColumnStripes; }
    public ListObject setShowTableStyleColumnStripes(Boolean showTableStyleColumnStripes) { this.showTableStyleColumnStripes = showTableStyleColumnStripes; return this; }

    public Boolean getShowTableStyleFirstColumn() { return showTableStyleFirstColumn; }
    public ListObject setShowTableStyleFirstColumn(Boolean showTableStyleFirstColumn) { this.showTableStyleFirstColumn = showTableStyleFirstColumn; return this; }

    public Boolean getShowTableStyleLastColumn() { return showTableStyleLastColumn; }
    public ListObject setShowTableStyleLastColumn(Boolean showTableStyleLastColumn) { this.showTableStyleLastColumn = showTableStyleLastColumn; return this; }

    public Boolean getShowTableStyleRowStripes() { return showTableStyleRowStripes; }
    public ListObject setShowTableStyleRowStripes(Boolean showTableStyleRowStripes) { this.showTableStyleRowStripes = showTableStyleRowStripes; return this; }

    public Boolean getShowTotals() { return showTotals; }
    public ListObject setShowTotals(Boolean showTotals) { this.showTotals = showTotals; return this; }

    public String getTableStyleName() { return tableStyleName; }
    public ListObject setTableStyleName(String tableStyleName) { this.tableStyleName = tableStyleName; return this; }

    public String getTableStyleType() { return tableStyleType; }
    public ListObject setTableStyleType(String tableStyleType) { this.tableStyleType = tableStyleType; return this; }

    public Range getDataRange() { return dataRange; }
    public ListObject setDataRange(Range dataRange) { this.dataRange = dataRange; return this; }

    public String getDataSourceType() { return dataSourceType; }
    public ListObject setDataSourceType(String dataSourceType) { this.dataSourceType = dataSourceType; return this; }

    public String getComment() { return comment; }
    public ListObject setComment(String comment) { this.comment = comment; return this; }

    public XmlMap getXmlMap() { return xmlMap; }
    public ListObject setXmlMap(XmlMap xmlMap) { this.xmlMap = xmlMap; return this; }

    public String getAlternativeText() { return alternativeText; }
    public ListObject setAlternativeText(String alternativeText) { this.alternativeText = alternativeText; return this; }

    public String getAlternativeDescription() { return alternativeDescription; }
    public ListObject setAlternativeDescription(String alternativeDescription) { this.alternativeDescription = alternativeDescription; return this; }


    /** Covariant override: keeps fluent chains returning ListObject. */
    @Override public ListObject setLink(Link link) { return (ListObject) super.setLink(link); }

}

/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListObject.java">
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

public class ListObject extends LinkElement {

    @SerializedName("AutoFilter")
    @JsonProperty("AutoFilter")
    private AutoFilter autoFilter;

    public ListObject autoFilter(AutoFilter autoFilter) {
        this.autoFilter = autoFilter;
        return this;
    }

    @ApiModelProperty(value = "")
    public AutoFilter getAutoFilter() {
        return autoFilter;
    }

    public void setAutoFilter(AutoFilter autoFilter) {
        this.autoFilter = autoFilter;
    }

    @SerializedName("DisplayName")
    @JsonProperty("DisplayName")
    private String displayName;

    public ListObject displayName(String displayName) {
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

    @SerializedName("StartColumn")
    @JsonProperty("StartColumn")
    private Integer startColumn;

    public ListObject startColumn(Integer startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    @SerializedName("StartRow")
    @JsonProperty("StartRow")
    private Integer startRow;

    public ListObject startRow(Integer startRow) {
        this.startRow = startRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    @SerializedName("EndColumn")
    @JsonProperty("EndColumn")
    private Integer endColumn;

    public ListObject endColumn(Integer endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    @SerializedName("EndRow")
    @JsonProperty("EndRow")
    private Integer endRow;

    public ListObject endRow(Integer endRow) {
        this.endRow = endRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    @SerializedName("ListColumns")
    @JsonProperty("ListColumns")
    private List<ListColumn> listColumns;

    public ListObject listColumns(List<ListColumn> listColumns) {
        this.listColumns = listColumns;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<ListColumn> getListColumns() {
        return listColumns;
    }

    public void setListColumns(List<ListColumn> listColumns) {
        this.listColumns = listColumns;
    }

    @SerializedName("ShowHeaderRow")
    @JsonProperty("ShowHeaderRow")
    private Boolean showHeaderRow;

    public ListObject showHeaderRow(Boolean showHeaderRow) {
        this.showHeaderRow = showHeaderRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowHeaderRow() {
        return showHeaderRow;
    }

    public void setShowHeaderRow(Boolean showHeaderRow) {
        this.showHeaderRow = showHeaderRow;
    }

    @SerializedName("ShowTableStyleColumnStripes")
    @JsonProperty("ShowTableStyleColumnStripes")
    private Boolean showTableStyleColumnStripes;

    public ListObject showTableStyleColumnStripes(Boolean showTableStyleColumnStripes) {
        this.showTableStyleColumnStripes = showTableStyleColumnStripes;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowTableStyleColumnStripes() {
        return showTableStyleColumnStripes;
    }

    public void setShowTableStyleColumnStripes(Boolean showTableStyleColumnStripes) {
        this.showTableStyleColumnStripes = showTableStyleColumnStripes;
    }

    @SerializedName("ShowTableStyleFirstColumn")
    @JsonProperty("ShowTableStyleFirstColumn")
    private Boolean showTableStyleFirstColumn;

    public ListObject showTableStyleFirstColumn(Boolean showTableStyleFirstColumn) {
        this.showTableStyleFirstColumn = showTableStyleFirstColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowTableStyleFirstColumn() {
        return showTableStyleFirstColumn;
    }

    public void setShowTableStyleFirstColumn(Boolean showTableStyleFirstColumn) {
        this.showTableStyleFirstColumn = showTableStyleFirstColumn;
    }

    @SerializedName("ShowTableStyleLastColumn")
    @JsonProperty("ShowTableStyleLastColumn")
    private Boolean showTableStyleLastColumn;

    public ListObject showTableStyleLastColumn(Boolean showTableStyleLastColumn) {
        this.showTableStyleLastColumn = showTableStyleLastColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowTableStyleLastColumn() {
        return showTableStyleLastColumn;
    }

    public void setShowTableStyleLastColumn(Boolean showTableStyleLastColumn) {
        this.showTableStyleLastColumn = showTableStyleLastColumn;
    }

    @SerializedName("ShowTableStyleRowStripes")
    @JsonProperty("ShowTableStyleRowStripes")
    private Boolean showTableStyleRowStripes;

    public ListObject showTableStyleRowStripes(Boolean showTableStyleRowStripes) {
        this.showTableStyleRowStripes = showTableStyleRowStripes;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowTableStyleRowStripes() {
        return showTableStyleRowStripes;
    }

    public void setShowTableStyleRowStripes(Boolean showTableStyleRowStripes) {
        this.showTableStyleRowStripes = showTableStyleRowStripes;
    }

    @SerializedName("ShowTotals")
    @JsonProperty("ShowTotals")
    private Boolean showTotals;

    public ListObject showTotals(Boolean showTotals) {
        this.showTotals = showTotals;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowTotals() {
        return showTotals;
    }

    public void setShowTotals(Boolean showTotals) {
        this.showTotals = showTotals;
    }

    @SerializedName("TableStyleName")
    @JsonProperty("TableStyleName")
    private String tableStyleName;

    public ListObject tableStyleName(String tableStyleName) {
        this.tableStyleName = tableStyleName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTableStyleName() {
        return tableStyleName;
    }

    public void setTableStyleName(String tableStyleName) {
        this.tableStyleName = tableStyleName;
    }

    @SerializedName("TableStyleType")
    @JsonProperty("TableStyleType")
    private String tableStyleType;

    public ListObject tableStyleType(String tableStyleType) {
        this.tableStyleType = tableStyleType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTableStyleType() {
        return tableStyleType;
    }

    public void setTableStyleType(String tableStyleType) {
        this.tableStyleType = tableStyleType;
    }

    @SerializedName("DataRange")
    @JsonProperty("DataRange")
    private Range dataRange;

    public ListObject dataRange(Range dataRange) {
        this.dataRange = dataRange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Range getDataRange() {
        return dataRange;
    }

    public void setDataRange(Range dataRange) {
        this.dataRange = dataRange;
    }

    @SerializedName("DataSourceType")
    @JsonProperty("DataSourceType")
    private String dataSourceType;

    public ListObject dataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @SerializedName("Comment")
    @JsonProperty("Comment")
    private String comment;

    public ListObject comment(String comment) {
        this.comment = comment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @SerializedName("XmlMap")
    @JsonProperty("XmlMap")
    private XmlMap xmlMap;

    public ListObject xmlMap(XmlMap xmlMap) {
        this.xmlMap = xmlMap;
        return this;
    }

    @ApiModelProperty(value = "")
    public XmlMap getXmlMap() {
        return xmlMap;
    }

    public void setXmlMap(XmlMap xmlMap) {
        this.xmlMap = xmlMap;
    }

    @SerializedName("AlternativeText")
    @JsonProperty("AlternativeText")
    private String alternativeText;

    public ListObject alternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAlternativeText() {
        return alternativeText;
    }

    public void setAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
    }

    @SerializedName("AlternativeDescription")
    @JsonProperty("AlternativeDescription")
    private String alternativeDescription;

    public ListObject alternativeDescription(String alternativeDescription) {
        this.alternativeDescription = alternativeDescription;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAlternativeDescription() {
        return alternativeDescription;
    }

    public void setAlternativeDescription(String alternativeDescription) {
        this.alternativeDescription = alternativeDescription;
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
        ListObject other = (ListObject) o;
        return Objects.equals(this.autoFilter, other.autoFilter)
            && Objects.equals(this.displayName, other.displayName)
            && Objects.equals(this.startColumn, other.startColumn)
            && Objects.equals(this.startRow, other.startRow)
            && Objects.equals(this.endColumn, other.endColumn)
            && Objects.equals(this.endRow, other.endRow)
            && Objects.equals(this.listColumns, other.listColumns)
            && Objects.equals(this.showHeaderRow, other.showHeaderRow)
            && Objects.equals(this.showTableStyleColumnStripes, other.showTableStyleColumnStripes)
            && Objects.equals(this.showTableStyleFirstColumn, other.showTableStyleFirstColumn)
            && Objects.equals(this.showTableStyleLastColumn, other.showTableStyleLastColumn)
            && Objects.equals(this.showTableStyleRowStripes, other.showTableStyleRowStripes)
            && Objects.equals(this.showTotals, other.showTotals)
            && Objects.equals(this.tableStyleName, other.tableStyleName)
            && Objects.equals(this.tableStyleType, other.tableStyleType)
            && Objects.equals(this.dataRange, other.dataRange)
            && Objects.equals(this.dataSourceType, other.dataSourceType)
            && Objects.equals(this.comment, other.comment)
            && Objects.equals(this.xmlMap, other.xmlMap)
            && Objects.equals(this.alternativeText, other.alternativeText)
            && Objects.equals(this.alternativeDescription, other.alternativeDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoFilter, displayName, startColumn, startRow, endColumn, endRow, listColumns, showHeaderRow, showTableStyleColumnStripes, showTableStyleFirstColumn, showTableStyleLastColumn, showTableStyleRowStripes, showTotals, tableStyleName, tableStyleType, dataRange, dataSourceType, comment, xmlMap, alternativeText, alternativeDescription, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObject {\n");
        sb.append("    autoFilter: ").append(autoFilter).append("\n");
        sb.append("    displayName: ").append(displayName).append("\n");
        sb.append("    startColumn: ").append(startColumn).append("\n");
        sb.append("    startRow: ").append(startRow).append("\n");
        sb.append("    endColumn: ").append(endColumn).append("\n");
        sb.append("    endRow: ").append(endRow).append("\n");
        sb.append("    listColumns: ").append(listColumns).append("\n");
        sb.append("    showHeaderRow: ").append(showHeaderRow).append("\n");
        sb.append("    showTableStyleColumnStripes: ").append(showTableStyleColumnStripes).append("\n");
        sb.append("    showTableStyleFirstColumn: ").append(showTableStyleFirstColumn).append("\n");
        sb.append("    showTableStyleLastColumn: ").append(showTableStyleLastColumn).append("\n");
        sb.append("    showTableStyleRowStripes: ").append(showTableStyleRowStripes).append("\n");
        sb.append("    showTotals: ").append(showTotals).append("\n");
        sb.append("    tableStyleName: ").append(tableStyleName).append("\n");
        sb.append("    tableStyleType: ").append(tableStyleType).append("\n");
        sb.append("    dataRange: ").append(dataRange).append("\n");
        sb.append("    dataSourceType: ").append(dataSourceType).append("\n");
        sb.append("    comment: ").append(comment).append("\n");
        sb.append("    xmlMap: ").append(xmlMap).append("\n");
        sb.append("    alternativeText: ").append(alternativeText).append("\n");
        sb.append("    alternativeDescription: ").append(alternativeDescription).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class ListObject  extends  LinkElement {
        @SerializedName("AutoFilter")
        private AutoFilter autoFilter ;

        public  ListObject  autoFilter(AutoFilter  autoFilter) {
            this.autoFilter =  autoFilter;
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
        private String displayName ;

        public  ListObject  displayName(String  displayName) {
            this.displayName =  displayName;
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
        private Integer startColumn ;

        public  ListObject  startColumn(Integer  startColumn) {
            this.startColumn =  startColumn;
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
        private Integer startRow ;

        public  ListObject  startRow(Integer  startRow) {
            this.startRow =  startRow;
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
        private Integer endColumn ;

        public  ListObject  endColumn(Integer  endColumn) {
            this.endColumn =  endColumn;
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
        private Integer endRow ;

        public  ListObject  endRow(Integer  endRow) {
            this.endRow =  endRow;
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
        private List<ListColumn> listColumns ;

        public  ListObject  listColumns(List<ListColumn>  listColumns) {
            this.listColumns =  listColumns;
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
        private Boolean showHeaderRow ;

        public  ListObject  showHeaderRow(Boolean  showHeaderRow) {
            this.showHeaderRow =  showHeaderRow;
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
        private Boolean showTableStyleColumnStripes ;

        public  ListObject  showTableStyleColumnStripes(Boolean  showTableStyleColumnStripes) {
            this.showTableStyleColumnStripes =  showTableStyleColumnStripes;
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
        private Boolean showTableStyleFirstColumn ;

        public  ListObject  showTableStyleFirstColumn(Boolean  showTableStyleFirstColumn) {
            this.showTableStyleFirstColumn =  showTableStyleFirstColumn;
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
        private Boolean showTableStyleLastColumn ;

        public  ListObject  showTableStyleLastColumn(Boolean  showTableStyleLastColumn) {
            this.showTableStyleLastColumn =  showTableStyleLastColumn;
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
        private Boolean showTableStyleRowStripes ;

        public  ListObject  showTableStyleRowStripes(Boolean  showTableStyleRowStripes) {
            this.showTableStyleRowStripes =  showTableStyleRowStripes;
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
        private Boolean showTotals ;

        public  ListObject  showTotals(Boolean  showTotals) {
            this.showTotals =  showTotals;
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
        private String tableStyleName ;

        public  ListObject  tableStyleName(String  tableStyleName) {
            this.tableStyleName =  tableStyleName;
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
        private String tableStyleType ;

        public  ListObject  tableStyleType(String  tableStyleType) {
            this.tableStyleType =  tableStyleType;
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
        private Range dataRange ;

        public  ListObject  dataRange(Range  dataRange) {
            this.dataRange =  dataRange;
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
        private String dataSourceType ;

        public  ListObject  dataSourceType(String  dataSourceType) {
            this.dataSourceType =  dataSourceType;
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
        private String comment ;

        public  ListObject  comment(String  comment) {
            this.comment =  comment;
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
        private XmlMap xmlMap ;

        public  ListObject  xmlMap(XmlMap  xmlMap) {
            this.xmlMap =  xmlMap;
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
        private String alternativeText ;

        public  ListObject  alternativeText(String  alternativeText) {
            this.alternativeText =  alternativeText;
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
        private String alternativeDescription ;

        public  ListObject  alternativeDescription(String  alternativeDescription) {
            this.alternativeDescription =  alternativeDescription;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ListObject listObject = (ListObject) o;
            return
                Objects.equals(this.autoFilter, listObject.autoFilter) &&
                Objects.equals(this.displayName, listObject.displayName) &&
                Objects.equals(this.startColumn, listObject.startColumn) &&
                Objects.equals(this.startRow, listObject.startRow) &&
                Objects.equals(this.endColumn, listObject.endColumn) &&
                Objects.equals(this.endRow, listObject.endRow) &&
                Objects.equals(this.listColumns, listObject.listColumns) &&
                Objects.equals(this.showHeaderRow, listObject.showHeaderRow) &&
                Objects.equals(this.showTableStyleColumnStripes, listObject.showTableStyleColumnStripes) &&
                Objects.equals(this.showTableStyleFirstColumn, listObject.showTableStyleFirstColumn) &&
                Objects.equals(this.showTableStyleLastColumn, listObject.showTableStyleLastColumn) &&
                Objects.equals(this.showTableStyleRowStripes, listObject.showTableStyleRowStripes) &&
                Objects.equals(this.showTotals, listObject.showTotals) &&
                Objects.equals(this.tableStyleName, listObject.tableStyleName) &&
                Objects.equals(this.tableStyleType, listObject.tableStyleType) &&
                Objects.equals(this.dataRange, listObject.dataRange) &&
                Objects.equals(this.dataSourceType, listObject.dataSourceType) &&
                Objects.equals(this.comment, listObject.comment) &&
                Objects.equals(this.xmlMap, listObject.xmlMap) &&
                Objects.equals(this.alternativeText, listObject.alternativeText) &&
                Objects.equals(this.alternativeDescription, listObject.alternativeDescription) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoFilter, displayName, startColumn, startRow, endColumn, endRow, listColumns, showHeaderRow, showTableStyleColumnStripes, showTableStyleFirstColumn, showTableStyleLastColumn, showTableStyleRowStripes, showTotals, tableStyleName, tableStyleType, dataRange, dataSourceType, comment, xmlMap, alternativeText, alternativeDescription, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ListObject {\n");
            sb.append("    autoFilter: ").append(toIndentedString(getAutoFilter())).append("\n");
            sb.append("    displayName: ").append(toIndentedString(getDisplayName())).append("\n");
            sb.append("    startColumn: ").append(toIndentedString(getStartColumn())).append("\n");
            sb.append("    startRow: ").append(toIndentedString(getStartRow())).append("\n");
            sb.append("    endColumn: ").append(toIndentedString(getEndColumn())).append("\n");
            sb.append("    endRow: ").append(toIndentedString(getEndRow())).append("\n");
            sb.append("    listColumns: ").append(toIndentedString(getListColumns())).append("\n");
            sb.append("    showHeaderRow: ").append(toIndentedString(getShowHeaderRow())).append("\n");
            sb.append("    showTableStyleColumnStripes: ").append(toIndentedString(getShowTableStyleColumnStripes())).append("\n");
            sb.append("    showTableStyleFirstColumn: ").append(toIndentedString(getShowTableStyleFirstColumn())).append("\n");
            sb.append("    showTableStyleLastColumn: ").append(toIndentedString(getShowTableStyleLastColumn())).append("\n");
            sb.append("    showTableStyleRowStripes: ").append(toIndentedString(getShowTableStyleRowStripes())).append("\n");
            sb.append("    showTotals: ").append(toIndentedString(getShowTotals())).append("\n");
            sb.append("    tableStyleName: ").append(toIndentedString(getTableStyleName())).append("\n");
            sb.append("    tableStyleType: ").append(toIndentedString(getTableStyleType())).append("\n");
            sb.append("    dataRange: ").append(toIndentedString(getDataRange())).append("\n");
            sb.append("    dataSourceType: ").append(toIndentedString(getDataSourceType())).append("\n");
            sb.append("    comment: ").append(toIndentedString(getComment())).append("\n");
            sb.append("    xmlMap: ").append(toIndentedString(getXmlMap())).append("\n");
            sb.append("    alternativeText: ").append(toIndentedString(getAlternativeText())).append("\n");
            sb.append("    alternativeDescription: ").append(toIndentedString(getAlternativeDescription())).append("\n");
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


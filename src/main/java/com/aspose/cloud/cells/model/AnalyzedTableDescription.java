/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzedTableDescription.java">
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


public class AnalyzedTableDescription {
        @SerializedName("Name")
        private String name ;

        public  AnalyzedTableDescription  name(String  name) {
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

        @SerializedName("SheetName")
        private String sheetName ;

        public  AnalyzedTableDescription  sheetName(String  sheetName) {
            this.sheetName =  sheetName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSheetName() {
            return sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }

        @SerializedName("Columns")
        private List<AnalyzedColumnDescription> columns ;

        public  AnalyzedTableDescription  columns(List<AnalyzedColumnDescription>  columns) {
            this.columns =  columns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<AnalyzedColumnDescription> getColumns() {
            return columns;
        }

        public void setColumns(List<AnalyzedColumnDescription> columns) {
            this.columns = columns;
        }

        @SerializedName("DateColumns")
        private List<Integer> dateColumns ;

        public  AnalyzedTableDescription  dateColumns(List<Integer>  dateColumns) {
            this.dateColumns =  dateColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getDateColumns() {
            return dateColumns;
        }

        public void setDateColumns(List<Integer> dateColumns) {
            this.dateColumns = dateColumns;
        }

        @SerializedName("NumberColumns")
        private List<Integer> numberColumns ;

        public  AnalyzedTableDescription  numberColumns(List<Integer>  numberColumns) {
            this.numberColumns =  numberColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getNumberColumns() {
            return numberColumns;
        }

        public void setNumberColumns(List<Integer> numberColumns) {
            this.numberColumns = numberColumns;
        }

        @SerializedName("TextColumns")
        private List<Integer> textColumns ;

        public  AnalyzedTableDescription  textColumns(List<Integer>  textColumns) {
            this.textColumns =  textColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getTextColumns() {
            return textColumns;
        }

        public void setTextColumns(List<Integer> textColumns) {
            this.textColumns = textColumns;
        }

        @SerializedName("ExceptionColumns")
        private List<Integer> exceptionColumns ;

        public  AnalyzedTableDescription  exceptionColumns(List<Integer>  exceptionColumns) {
            this.exceptionColumns =  exceptionColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getExceptionColumns() {
            return exceptionColumns;
        }

        public void setExceptionColumns(List<Integer> exceptionColumns) {
            this.exceptionColumns = exceptionColumns;
        }

        @SerializedName("HasTableHeaderRow")
        private Boolean hasTableHeaderRow ;

        public  AnalyzedTableDescription  hasTableHeaderRow(Boolean  hasTableHeaderRow) {
            this.hasTableHeaderRow =  hasTableHeaderRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasTableHeaderRow() {
            return hasTableHeaderRow;
        }

        public void setHasTableHeaderRow(Boolean hasTableHeaderRow) {
            this.hasTableHeaderRow = hasTableHeaderRow;
        }

        @SerializedName("HasTableTotalRow")
        private Boolean hasTableTotalRow ;

        public  AnalyzedTableDescription  hasTableTotalRow(Boolean  hasTableTotalRow) {
            this.hasTableTotalRow =  hasTableTotalRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasTableTotalRow() {
            return hasTableTotalRow;
        }

        public void setHasTableTotalRow(Boolean hasTableTotalRow) {
            this.hasTableTotalRow = hasTableTotalRow;
        }

        @SerializedName("StartDataColumnIndex")
        private Integer startDataColumnIndex ;

        public  AnalyzedTableDescription  startDataColumnIndex(Integer  startDataColumnIndex) {
            this.startDataColumnIndex =  startDataColumnIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getStartDataColumnIndex() {
            return startDataColumnIndex;
        }

        public void setStartDataColumnIndex(Integer startDataColumnIndex) {
            this.startDataColumnIndex = startDataColumnIndex;
        }

        @SerializedName("EndDataColumnIndex")
        private Integer endDataColumnIndex ;

        public  AnalyzedTableDescription  endDataColumnIndex(Integer  endDataColumnIndex) {
            this.endDataColumnIndex =  endDataColumnIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getEndDataColumnIndex() {
            return endDataColumnIndex;
        }

        public void setEndDataColumnIndex(Integer endDataColumnIndex) {
            this.endDataColumnIndex = endDataColumnIndex;
        }

        @SerializedName("StartDataRowIndex")
        private Integer startDataRowIndex ;

        public  AnalyzedTableDescription  startDataRowIndex(Integer  startDataRowIndex) {
            this.startDataRowIndex =  startDataRowIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getStartDataRowIndex() {
            return startDataRowIndex;
        }

        public void setStartDataRowIndex(Integer startDataRowIndex) {
            this.startDataRowIndex = startDataRowIndex;
        }

        @SerializedName("EndDataRowIndex")
        private Integer endDataRowIndex ;

        public  AnalyzedTableDescription  endDataRowIndex(Integer  endDataRowIndex) {
            this.endDataRowIndex =  endDataRowIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getEndDataRowIndex() {
            return endDataRowIndex;
        }

        public void setEndDataRowIndex(Integer endDataRowIndex) {
            this.endDataRowIndex = endDataRowIndex;
        }

        @SerializedName("Thumbnail")
        private String thumbnail ;

        public  AnalyzedTableDescription  thumbnail(String  thumbnail) {
            this.thumbnail =  thumbnail;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        @SerializedName("DiscoverCharts")
        private List<DiscoverChart> discoverCharts ;

        public  AnalyzedTableDescription  discoverCharts(List<DiscoverChart>  discoverCharts) {
            this.discoverCharts =  discoverCharts;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<DiscoverChart> getDiscoverCharts() {
            return discoverCharts;
        }

        public void setDiscoverCharts(List<DiscoverChart> discoverCharts) {
            this.discoverCharts = discoverCharts;
        }

        @SerializedName("DiscoverPivotTables")
        private List<DiscoverPivotTable> discoverPivotTables ;

        public  AnalyzedTableDescription  discoverPivotTables(List<DiscoverPivotTable>  discoverPivotTables) {
            this.discoverPivotTables =  discoverPivotTables;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<DiscoverPivotTable> getDiscoverPivotTables() {
            return discoverPivotTables;
        }

        public void setDiscoverPivotTables(List<DiscoverPivotTable> discoverPivotTables) {
            this.discoverPivotTables = discoverPivotTables;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AnalyzedTableDescription analyzedTableDescription = (AnalyzedTableDescription) o;
            return
                Objects.equals(this.name, analyzedTableDescription.name) &&
                Objects.equals(this.sheetName, analyzedTableDescription.sheetName) &&
                Objects.equals(this.columns, analyzedTableDescription.columns) &&
                Objects.equals(this.dateColumns, analyzedTableDescription.dateColumns) &&
                Objects.equals(this.numberColumns, analyzedTableDescription.numberColumns) &&
                Objects.equals(this.textColumns, analyzedTableDescription.textColumns) &&
                Objects.equals(this.exceptionColumns, analyzedTableDescription.exceptionColumns) &&
                Objects.equals(this.hasTableHeaderRow, analyzedTableDescription.hasTableHeaderRow) &&
                Objects.equals(this.hasTableTotalRow, analyzedTableDescription.hasTableTotalRow) &&
                Objects.equals(this.startDataColumnIndex, analyzedTableDescription.startDataColumnIndex) &&
                Objects.equals(this.endDataColumnIndex, analyzedTableDescription.endDataColumnIndex) &&
                Objects.equals(this.startDataRowIndex, analyzedTableDescription.startDataRowIndex) &&
                Objects.equals(this.endDataRowIndex, analyzedTableDescription.endDataRowIndex) &&
                Objects.equals(this.thumbnail, analyzedTableDescription.thumbnail) &&
                Objects.equals(this.discoverCharts, analyzedTableDescription.discoverCharts) &&
                Objects.equals(this.discoverPivotTables, analyzedTableDescription.discoverPivotTables);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, sheetName, columns, dateColumns, numberColumns, textColumns, exceptionColumns, hasTableHeaderRow, hasTableTotalRow, startDataColumnIndex, endDataColumnIndex, startDataRowIndex, endDataRowIndex, thumbnail, discoverCharts, discoverPivotTables);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalyzedTableDescription {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    sheetName: ").append(toIndentedString(getSheetName())).append("\n");
            sb.append("    columns: ").append(toIndentedString(getColumns())).append("\n");
            sb.append("    dateColumns: ").append(toIndentedString(getDateColumns())).append("\n");
            sb.append("    numberColumns: ").append(toIndentedString(getNumberColumns())).append("\n");
            sb.append("    textColumns: ").append(toIndentedString(getTextColumns())).append("\n");
            sb.append("    exceptionColumns: ").append(toIndentedString(getExceptionColumns())).append("\n");
            sb.append("    hasTableHeaderRow: ").append(toIndentedString(getHasTableHeaderRow())).append("\n");
            sb.append("    hasTableTotalRow: ").append(toIndentedString(getHasTableTotalRow())).append("\n");
            sb.append("    startDataColumnIndex: ").append(toIndentedString(getStartDataColumnIndex())).append("\n");
            sb.append("    endDataColumnIndex: ").append(toIndentedString(getEndDataColumnIndex())).append("\n");
            sb.append("    startDataRowIndex: ").append(toIndentedString(getStartDataRowIndex())).append("\n");
            sb.append("    endDataRowIndex: ").append(toIndentedString(getEndDataRowIndex())).append("\n");
            sb.append("    thumbnail: ").append(toIndentedString(getThumbnail())).append("\n");
            sb.append("    discoverCharts: ").append(toIndentedString(getDiscoverCharts())).append("\n");
            sb.append("    discoverPivotTables: ").append(toIndentedString(getDiscoverPivotTables())).append("\n");
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


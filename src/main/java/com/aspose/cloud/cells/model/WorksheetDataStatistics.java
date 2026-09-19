/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorksheetDataStatistics.java">
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


public class WorksheetDataStatistics {
        @SerializedName("Name")
        private String name ;

        public  WorksheetDataStatistics  name(String  name) {
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

        @SerializedName("ChartsCount")
        private Integer chartsCount ;

        public  WorksheetDataStatistics  chartsCount(Integer  chartsCount) {
            this.chartsCount =  chartsCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getChartsCount() {
            return chartsCount;
        }

        public void setChartsCount(Integer chartsCount) {
            this.chartsCount = chartsCount;
        }

        @SerializedName("TablesCount")
        private Integer tablesCount ;

        public  WorksheetDataStatistics  tablesCount(Integer  tablesCount) {
            this.tablesCount =  tablesCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getTablesCount() {
            return tablesCount;
        }

        public void setTablesCount(Integer tablesCount) {
            this.tablesCount = tablesCount;
        }

        @SerializedName("PivotTablesCount")
        private Integer pivotTablesCount ;

        public  WorksheetDataStatistics  pivotTablesCount(Integer  pivotTablesCount) {
            this.pivotTablesCount =  pivotTablesCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPivotTablesCount() {
            return pivotTablesCount;
        }

        public void setPivotTablesCount(Integer pivotTablesCount) {
            this.pivotTablesCount = pivotTablesCount;
        }

        @SerializedName("ShapesCount")
        private Integer shapesCount ;

        public  WorksheetDataStatistics  shapesCount(Integer  shapesCount) {
            this.shapesCount =  shapesCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getShapesCount() {
            return shapesCount;
        }

        public void setShapesCount(Integer shapesCount) {
            this.shapesCount = shapesCount;
        }

        @SerializedName("HyperlinksCount")
        private Integer hyperlinksCount ;

        public  WorksheetDataStatistics  hyperlinksCount(Integer  hyperlinksCount) {
            this.hyperlinksCount =  hyperlinksCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getHyperlinksCount() {
            return hyperlinksCount;
        }

        public void setHyperlinksCount(Integer hyperlinksCount) {
            this.hyperlinksCount = hyperlinksCount;
        }

        @SerializedName("QueryTablesCount")
        private Integer queryTablesCount ;

        public  WorksheetDataStatistics  queryTablesCount(Integer  queryTablesCount) {
            this.queryTablesCount =  queryTablesCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getQueryTablesCount() {
            return queryTablesCount;
        }

        public void setQueryTablesCount(Integer queryTablesCount) {
            this.queryTablesCount = queryTablesCount;
        }

        @SerializedName("CellsCount")
        private Integer cellsCount ;

        public  WorksheetDataStatistics  cellsCount(Integer  cellsCount) {
            this.cellsCount =  cellsCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCellsCount() {
            return cellsCount;
        }

        public void setCellsCount(Integer cellsCount) {
            this.cellsCount = cellsCount;
        }

        @SerializedName("CellsCountInTable")
        private Integer cellsCountInTable ;

        public  WorksheetDataStatistics  cellsCountInTable(Integer  cellsCountInTable) {
            this.cellsCountInTable =  cellsCountInTable;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCellsCountInTable() {
            return cellsCountInTable;
        }

        public void setCellsCountInTable(Integer cellsCountInTable) {
            this.cellsCountInTable = cellsCountInTable;
        }

        @SerializedName("CellsCountIsFormula")
        private Integer cellsCountIsFormula ;

        public  WorksheetDataStatistics  cellsCountIsFormula(Integer  cellsCountIsFormula) {
            this.cellsCountIsFormula =  cellsCountIsFormula;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCellsCountIsFormula() {
            return cellsCountIsFormula;
        }

        public void setCellsCountIsFormula(Integer cellsCountIsFormula) {
            this.cellsCountIsFormula = cellsCountIsFormula;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            WorksheetDataStatistics worksheetDataStatistics = (WorksheetDataStatistics) o;
            return
                Objects.equals(this.name, worksheetDataStatistics.name) &&
                Objects.equals(this.chartsCount, worksheetDataStatistics.chartsCount) &&
                Objects.equals(this.tablesCount, worksheetDataStatistics.tablesCount) &&
                Objects.equals(this.pivotTablesCount, worksheetDataStatistics.pivotTablesCount) &&
                Objects.equals(this.shapesCount, worksheetDataStatistics.shapesCount) &&
                Objects.equals(this.hyperlinksCount, worksheetDataStatistics.hyperlinksCount) &&
                Objects.equals(this.queryTablesCount, worksheetDataStatistics.queryTablesCount) &&
                Objects.equals(this.cellsCount, worksheetDataStatistics.cellsCount) &&
                Objects.equals(this.cellsCountInTable, worksheetDataStatistics.cellsCountInTable) &&
                Objects.equals(this.cellsCountIsFormula, worksheetDataStatistics.cellsCountIsFormula);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, chartsCount, tablesCount, pivotTablesCount, shapesCount, hyperlinksCount, queryTablesCount, cellsCount, cellsCountInTable, cellsCountIsFormula);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class WorksheetDataStatistics {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    chartsCount: ").append(toIndentedString(getChartsCount())).append("\n");
            sb.append("    tablesCount: ").append(toIndentedString(getTablesCount())).append("\n");
            sb.append("    pivotTablesCount: ").append(toIndentedString(getPivotTablesCount())).append("\n");
            sb.append("    shapesCount: ").append(toIndentedString(getShapesCount())).append("\n");
            sb.append("    hyperlinksCount: ").append(toIndentedString(getHyperlinksCount())).append("\n");
            sb.append("    queryTablesCount: ").append(toIndentedString(getQueryTablesCount())).append("\n");
            sb.append("    cellsCount: ").append(toIndentedString(getCellsCount())).append("\n");
            sb.append("    cellsCountInTable: ").append(toIndentedString(getCellsCountInTable())).append("\n");
            sb.append("    cellsCountIsFormula: ").append(toIndentedString(getCellsCountIsFormula())).append("\n");
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


/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Cells.java">
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


public class Cells  extends  LinkElement {
        @SerializedName("MaxRow")
        private Integer maxRow ;

        public  Cells  maxRow(Integer  maxRow) {
            this.maxRow =  maxRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMaxRow() {
            return maxRow;
        }

        public void setMaxRow(Integer maxRow) {
            this.maxRow = maxRow;
        }

        @SerializedName("MaxColumn")
        private Integer maxColumn ;

        public  Cells  maxColumn(Integer  maxColumn) {
            this.maxColumn =  maxColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMaxColumn() {
            return maxColumn;
        }

        public void setMaxColumn(Integer maxColumn) {
            this.maxColumn = maxColumn;
        }

        @SerializedName("CellCount")
        private Integer cellCount ;

        public  Cells  cellCount(Integer  cellCount) {
            this.cellCount =  cellCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCellCount() {
            return cellCount;
        }

        public void setCellCount(Integer cellCount) {
            this.cellCount = cellCount;
        }

        @SerializedName("Rows")
        private LinkElement rows ;

        public  Cells  rows(LinkElement  rows) {
            this.rows =  rows;
            return this;
        }

        @ApiModelProperty(value = "")
        public LinkElement getRows() {
            return rows;
        }

        public void setRows(LinkElement rows) {
            this.rows = rows;
        }

        @SerializedName("Columns")
        private LinkElement columns ;

        public  Cells  columns(LinkElement  columns) {
            this.columns =  columns;
            return this;
        }

        @ApiModelProperty(value = "")
        public LinkElement getColumns() {
            return columns;
        }

        public void setColumns(LinkElement columns) {
            this.columns = columns;
        }

        @SerializedName("CellList")
        private List<LinkElement> cellList ;

        public  Cells  cellList(List<LinkElement>  cellList) {
            this.cellList =  cellList;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<LinkElement> getCellList() {
            return cellList;
        }

        public void setCellList(List<LinkElement> cellList) {
            this.cellList = cellList;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Cells cells = (Cells) o;
            return
                Objects.equals(this.maxRow, cells.maxRow) &&
                Objects.equals(this.maxColumn, cells.maxColumn) &&
                Objects.equals(this.cellCount, cells.cellCount) &&
                Objects.equals(this.rows, cells.rows) &&
                Objects.equals(this.columns, cells.columns) &&
                Objects.equals(this.cellList, cells.cellList) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(maxRow, maxColumn, cellCount, rows, columns, cellList, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Cells {\n");
            sb.append("    maxRow: ").append(toIndentedString(getMaxRow())).append("\n");
            sb.append("    maxColumn: ").append(toIndentedString(getMaxColumn())).append("\n");
            sb.append("    cellCount: ").append(toIndentedString(getCellCount())).append("\n");
            sb.append("    rows: ").append(toIndentedString(getRows())).append("\n");
            sb.append("    columns: ").append(toIndentedString(getColumns())).append("\n");
            sb.append("    cellList: ").append(toIndentedString(getCellList())).append("\n");
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


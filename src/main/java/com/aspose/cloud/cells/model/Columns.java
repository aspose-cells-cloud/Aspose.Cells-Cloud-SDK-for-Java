/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Columns.java">
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


public class Columns  extends  LinkElement {
        @SerializedName("MaxColumn")
        private Integer maxColumn ;

        public  Columns  maxColumn(Integer  maxColumn) {
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

        @SerializedName("ColumnsCount")
        private Integer columnsCount ;

        public  Columns  columnsCount(Integer  columnsCount) {
            this.columnsCount =  columnsCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getColumnsCount() {
            return columnsCount;
        }

        public void setColumnsCount(Integer columnsCount) {
            this.columnsCount = columnsCount;
        }

        @SerializedName("ColumnsList")
        private List<LinkElement> columnsList ;

        public  Columns  columnsList(List<LinkElement>  columnsList) {
            this.columnsList =  columnsList;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<LinkElement> getColumnsList() {
            return columnsList;
        }

        public void setColumnsList(List<LinkElement> columnsList) {
            this.columnsList = columnsList;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Columns columns = (Columns) o;
            return
                Objects.equals(this.maxColumn, columns.maxColumn) &&
                Objects.equals(this.columnsCount, columns.columnsCount) &&
                Objects.equals(this.columnsList, columns.columnsList) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(maxColumn, columnsCount, columnsList, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Columns {\n");
            sb.append("    maxColumn: ").append(toIndentedString(getMaxColumn())).append("\n");
            sb.append("    columnsCount: ").append(toIndentedString(getColumnsCount())).append("\n");
            sb.append("    columnsList: ").append(toIndentedString(getColumnsList())).append("\n");
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


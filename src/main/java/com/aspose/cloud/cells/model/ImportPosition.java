/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportPosition.java">
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


public class ImportPosition {
        @SerializedName("SheetName")
        private String sheetName ;

        public  ImportPosition  sheetName(String  sheetName) {
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

        @SerializedName("RowIndex")
        private Integer rowIndex ;

        public  ImportPosition  rowIndex(Integer  rowIndex) {
            this.rowIndex =  rowIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getRowIndex() {
            return rowIndex;
        }

        public void setRowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
        }

        @SerializedName("ColumnIndex")
        private Integer columnIndex ;

        public  ImportPosition  columnIndex(Integer  columnIndex) {
            this.columnIndex =  columnIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getColumnIndex() {
            return columnIndex;
        }

        public void setColumnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImportPosition importPosition = (ImportPosition) o;
            return
                Objects.equals(this.sheetName, importPosition.sheetName) &&
                Objects.equals(this.rowIndex, importPosition.rowIndex) &&
                Objects.equals(this.columnIndex, importPosition.columnIndex);
      }

      @Override
      public int hashCode() {
        return Objects.hash(sheetName, rowIndex, columnIndex);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImportPosition {\n");
            sb.append("    sheetName: ").append(toIndentedString(getSheetName())).append("\n");
            sb.append("    rowIndex: ").append(toIndentedString(getRowIndex())).append("\n");
            sb.append("    columnIndex: ").append(toIndentedString(getColumnIndex())).append("\n");
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


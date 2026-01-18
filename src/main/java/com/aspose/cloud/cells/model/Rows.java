/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Rows.java">
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


public class Rows  extends  LinkElement {
        @SerializedName("MaxRow")
        private Integer maxRow ;

        public  Rows  maxRow(Integer  maxRow) {
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

        @SerializedName("RowsCount")
        private Integer rowsCount ;

        public  Rows  rowsCount(Integer  rowsCount) {
            this.rowsCount =  rowsCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getRowsCount() {
            return rowsCount;
        }

        public void setRowsCount(Integer rowsCount) {
            this.rowsCount = rowsCount;
        }

        @SerializedName("RowsList")
        private List<LinkElement> rowsList ;

        public  Rows  rowsList(List<LinkElement>  rowsList) {
            this.rowsList =  rowsList;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<LinkElement> getRowsList() {
            return rowsList;
        }

        public void setRowsList(List<LinkElement> rowsList) {
            this.rowsList = rowsList;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Rows rows = (Rows) o;
            return
                Objects.equals(this.maxRow, rows.maxRow) &&
                Objects.equals(this.rowsCount, rows.rowsCount) &&
                Objects.equals(this.rowsList, rows.rowsList) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(maxRow, rowsCount, rowsList, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Rows {\n");
            sb.append("    maxRow: ").append(toIndentedString(getMaxRow())).append("\n");
            sb.append("    rowsCount: ").append(toIndentedString(getRowsCount())).append("\n");
            sb.append("    rowsList: ").append(toIndentedString(getRowsList())).append("\n");
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


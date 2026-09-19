/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Sparkline.java">
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


public class Sparkline {
        @SerializedName("Column")
        private Integer column ;

        public  Sparkline  column(Integer  column) {
            this.column =  column;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getColumn() {
            return column;
        }

        public void setColumn(Integer column) {
            this.column = column;
        }

        @SerializedName("DataRange")
        private String dataRange ;

        public  Sparkline  dataRange(String  dataRange) {
            this.dataRange =  dataRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDataRange() {
            return dataRange;
        }

        public void setDataRange(String dataRange) {
            this.dataRange = dataRange;
        }

        @SerializedName("Row")
        private Integer row ;

        public  Sparkline  row(Integer  row) {
            this.row =  row;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getRow() {
            return row;
        }

        public void setRow(Integer row) {
            this.row = row;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Sparkline sparkline = (Sparkline) o;
            return
                Objects.equals(this.column, sparkline.column) &&
                Objects.equals(this.dataRange, sparkline.dataRange) &&
                Objects.equals(this.row, sparkline.row);
      }

      @Override
      public int hashCode() {
        return Objects.hash(column, dataRange, row);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Sparkline {\n");
            sb.append("    column: ").append(toIndentedString(getColumn())).append("\n");
            sb.append("    dataRange: ").append(toIndentedString(getDataRange())).append("\n");
            sb.append("    row: ").append(toIndentedString(getRow())).append("\n");
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


/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellValue.java">
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


public class CellValue {
        @SerializedName("RowIndex")
        private Integer rowIndex ;

        public  CellValue  rowIndex(Integer  rowIndex) {
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

        public  CellValue  columnIndex(Integer  columnIndex) {
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

        @SerializedName("Type")
        private String type ;

        public  CellValue  type(String  type) {
            this.type =  type;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @SerializedName("Value")
        private String value ;

        public  CellValue  value(String  value) {
            this.value =  value;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @SerializedName("Formula")
        private String formula ;

        public  CellValue  formula(String  formula) {
            this.formula =  formula;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormula() {
            return formula;
        }

        public void setFormula(String formula) {
            this.formula = formula;
        }

        @SerializedName("Style")
        private Style style ;

        public  CellValue  style(Style  style) {
            this.style =  style;
            return this;
        }

        @ApiModelProperty(value = "")
        public Style getStyle() {
            return style;
        }

        public void setStyle(Style style) {
            this.style = style;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CellValue cellValue = (CellValue) o;
            return
                Objects.equals(this.rowIndex, cellValue.rowIndex) &&
                Objects.equals(this.columnIndex, cellValue.columnIndex) &&
                Objects.equals(this.type, cellValue.type) &&
                Objects.equals(this.value, cellValue.value) &&
                Objects.equals(this.formula, cellValue.formula) &&
                Objects.equals(this.style, cellValue.style);
      }

      @Override
      public int hashCode() {
        return Objects.hash(rowIndex, columnIndex, type, value, formula, style);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CellValue {\n");
            sb.append("    rowIndex: ").append(toIndentedString(getRowIndex())).append("\n");
            sb.append("    columnIndex: ").append(toIndentedString(getColumnIndex())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
            sb.append("    formula: ").append(toIndentedString(getFormula())).append("\n");
            sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
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


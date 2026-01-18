/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Cell.java">
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


public class Cell  extends  LinkElement {
        @SerializedName("Name")
        private String name ;

        public  Cell  name(String  name) {
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

        @SerializedName("Row")
        private Integer row ;

        public  Cell  row(Integer  row) {
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

        @SerializedName("Column")
        private Integer column ;

        public  Cell  column(Integer  column) {
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

        @SerializedName("Value")
        private String value ;

        public  Cell  value(String  value) {
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

        @SerializedName("Type")
        private String type ;

        public  Cell  type(String  type) {
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

        @SerializedName("Formula")
        private String formula ;

        public  Cell  formula(String  formula) {
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

        @SerializedName("IsFormula")
        private Boolean isFormula ;

        public  Cell  isFormula(Boolean  isFormula) {
            this.isFormula =  isFormula;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsFormula() {
            return isFormula;
        }

        public void setIsFormula(Boolean isFormula) {
            this.isFormula = isFormula;
        }

        @SerializedName("IsMerged")
        private Boolean isMerged ;

        public  Cell  isMerged(Boolean  isMerged) {
            this.isMerged =  isMerged;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsMerged() {
            return isMerged;
        }

        public void setIsMerged(Boolean isMerged) {
            this.isMerged = isMerged;
        }

        @SerializedName("IsArrayHeader")
        private Boolean isArrayHeader ;

        public  Cell  isArrayHeader(Boolean  isArrayHeader) {
            this.isArrayHeader =  isArrayHeader;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsArrayHeader() {
            return isArrayHeader;
        }

        public void setIsArrayHeader(Boolean isArrayHeader) {
            this.isArrayHeader = isArrayHeader;
        }

        @SerializedName("IsInArray")
        private Boolean isInArray ;

        public  Cell  isInArray(Boolean  isInArray) {
            this.isInArray =  isInArray;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsInArray() {
            return isInArray;
        }

        public void setIsInArray(Boolean isInArray) {
            this.isInArray = isInArray;
        }

        @SerializedName("IsErrorValue")
        private Boolean isErrorValue ;

        public  Cell  isErrorValue(Boolean  isErrorValue) {
            this.isErrorValue =  isErrorValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsErrorValue() {
            return isErrorValue;
        }

        public void setIsErrorValue(Boolean isErrorValue) {
            this.isErrorValue = isErrorValue;
        }

        @SerializedName("IsInTable")
        private Boolean isInTable ;

        public  Cell  isInTable(Boolean  isInTable) {
            this.isInTable =  isInTable;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsInTable() {
            return isInTable;
        }

        public void setIsInTable(Boolean isInTable) {
            this.isInTable = isInTable;
        }

        @SerializedName("IsStyleSet")
        private Boolean isStyleSet ;

        public  Cell  isStyleSet(Boolean  isStyleSet) {
            this.isStyleSet =  isStyleSet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsStyleSet() {
            return isStyleSet;
        }

        public void setIsStyleSet(Boolean isStyleSet) {
            this.isStyleSet = isStyleSet;
        }

        @SerializedName("HtmlString")
        private String htmlString ;

        public  Cell  htmlString(String  htmlString) {
            this.htmlString =  htmlString;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHtmlString() {
            return htmlString;
        }

        public void setHtmlString(String htmlString) {
            this.htmlString = htmlString;
        }

        @SerializedName("Style")
        private LinkElement style ;

        public  Cell  style(LinkElement  style) {
            this.style =  style;
            return this;
        }

        @ApiModelProperty(value = "")
        public LinkElement getStyle() {
            return style;
        }

        public void setStyle(LinkElement style) {
            this.style = style;
        }

        @SerializedName("Worksheet")
        private String worksheet ;

        public  Cell  worksheet(String  worksheet) {
            this.worksheet =  worksheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getWorksheet() {
            return worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Cell cell = (Cell) o;
            return
                Objects.equals(this.name, cell.name) &&
                Objects.equals(this.row, cell.row) &&
                Objects.equals(this.column, cell.column) &&
                Objects.equals(this.value, cell.value) &&
                Objects.equals(this.type, cell.type) &&
                Objects.equals(this.formula, cell.formula) &&
                Objects.equals(this.isFormula, cell.isFormula) &&
                Objects.equals(this.isMerged, cell.isMerged) &&
                Objects.equals(this.isArrayHeader, cell.isArrayHeader) &&
                Objects.equals(this.isInArray, cell.isInArray) &&
                Objects.equals(this.isErrorValue, cell.isErrorValue) &&
                Objects.equals(this.isInTable, cell.isInTable) &&
                Objects.equals(this.isStyleSet, cell.isStyleSet) &&
                Objects.equals(this.htmlString, cell.htmlString) &&
                Objects.equals(this.style, cell.style) &&
                Objects.equals(this.worksheet, cell.worksheet) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, row, column, value, type, formula, isFormula, isMerged, isArrayHeader, isInArray, isErrorValue, isInTable, isStyleSet, htmlString, style, worksheet, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Cell {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    row: ").append(toIndentedString(getRow())).append("\n");
            sb.append("    column: ").append(toIndentedString(getColumn())).append("\n");
            sb.append("    value: ").append(toIndentedString(getValue())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    formula: ").append(toIndentedString(getFormula())).append("\n");
            sb.append("    isFormula: ").append(toIndentedString(getIsFormula())).append("\n");
            sb.append("    isMerged: ").append(toIndentedString(getIsMerged())).append("\n");
            sb.append("    isArrayHeader: ").append(toIndentedString(getIsArrayHeader())).append("\n");
            sb.append("    isInArray: ").append(toIndentedString(getIsInArray())).append("\n");
            sb.append("    isErrorValue: ").append(toIndentedString(getIsErrorValue())).append("\n");
            sb.append("    isInTable: ").append(toIndentedString(getIsInTable())).append("\n");
            sb.append("    isStyleSet: ").append(toIndentedString(getIsStyleSet())).append("\n");
            sb.append("    htmlString: ").append(toIndentedString(getHtmlString())).append("\n");
            sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
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


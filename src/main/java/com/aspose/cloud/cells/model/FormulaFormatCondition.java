/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormulaFormatCondition.java">
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


public class FormulaFormatCondition {
        @SerializedName("Formula1")
        private String formula1 ;

        public  FormulaFormatCondition  formula1(String  formula1) {
            this.formula1 =  formula1;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormula1() {
            return formula1;
        }

        public void setFormula1(String formula1) {
            this.formula1 = formula1;
        }

        @SerializedName("Formula2")
        private String formula2 ;

        public  FormulaFormatCondition  formula2(String  formula2) {
            this.formula2 =  formula2;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormula2() {
            return formula2;
        }

        public void setFormula2(String formula2) {
            this.formula2 = formula2;
        }

        @SerializedName("Operator")
        private String operator ;

        public  FormulaFormatCondition  operator(String  operator) {
            this.operator =  operator;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            FormulaFormatCondition formulaFormatCondition = (FormulaFormatCondition) o;
            return
                Objects.equals(this.formula1, formulaFormatCondition.formula1) &&
                Objects.equals(this.formula2, formulaFormatCondition.formula2) &&
                Objects.equals(this.operator, formulaFormatCondition.operator);
      }

      @Override
      public int hashCode() {
        return Objects.hash(formula1, formula2, operator);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FormulaFormatCondition {\n");
            sb.append("    formula1: ").append(toIndentedString(getFormula1())).append("\n");
            sb.append("    formula2: ").append(toIndentedString(getFormula2())).append("\n");
            sb.append("    operator: ").append(toIndentedString(getOperator())).append("\n");
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


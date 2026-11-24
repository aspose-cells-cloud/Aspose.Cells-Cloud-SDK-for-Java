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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FormulaFormatCondition {

    @SerializedName("Formula1")
    @JsonProperty("Formula1")
    private String formula1;

    public FormulaFormatCondition formula1(String formula1) {
        this.formula1 = formula1;
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
    @JsonProperty("Formula2")
    private String formula2;

    public FormulaFormatCondition formula2(String formula2) {
        this.formula2 = formula2;
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
    @JsonProperty("Operator")
    private String operator;

    public FormulaFormatCondition operator(String operator) {
        this.operator = operator;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormulaFormatCondition other = (FormulaFormatCondition) o;
        return Objects.equals(this.formula1, other.formula1)
            && Objects.equals(this.formula2, other.formula2)
            && Objects.equals(this.operator, other.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formula1, formula2, operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormulaFormatCondition {\n");
        sb.append("    formula1: ").append(formula1).append("\n");
        sb.append("    formula2: ").append(formula2).append("\n");
        sb.append("    operator: ").append(operator).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

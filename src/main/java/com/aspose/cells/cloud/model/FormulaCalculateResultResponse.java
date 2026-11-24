/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormulaCalculateResultResponse.java">
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

public class FormulaCalculateResultResponse extends CellsCloudResponse {

    @SerializedName("Worksheet")
    @JsonProperty("Worksheet")
    private String worksheet;

    public FormulaCalculateResultResponse worksheet(String worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(String worksheet) {
        this.worksheet = worksheet;
    }

    @SerializedName("Formula")
    @JsonProperty("Formula")
    private String formula;

    public FormulaCalculateResultResponse formula(String formula) {
        this.formula = formula;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @SerializedName("Result")
    @JsonProperty("Result")
    private Object result;

    public FormulaCalculateResultResponse result(Object result) {
        this.result = result;
        return this;
    }

    @ApiModelProperty(value = "")
    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        FormulaCalculateResultResponse other = (FormulaCalculateResultResponse) o;
        return Objects.equals(this.worksheet, other.worksheet)
            && Objects.equals(this.formula, other.formula)
            && Objects.equals(this.result, other.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worksheet, formula, result, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormulaCalculateResultResponse {\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("    formula: ").append(formula).append("\n");
        sb.append("    result: ").append(result).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

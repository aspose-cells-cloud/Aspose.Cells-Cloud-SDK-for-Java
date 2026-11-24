/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListColumn.java">
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

public class ListColumn {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public ListColumn name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("Range")
    @JsonProperty("Range")
    private Range range;

    public ListColumn range(Range range) {
        this.range = range;
        return this;
    }

    @ApiModelProperty(value = "")
    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    @SerializedName("TotalsCalculation")
    @JsonProperty("TotalsCalculation")
    private String totalsCalculation;

    public ListColumn totalsCalculation(String totalsCalculation) {
        this.totalsCalculation = totalsCalculation;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTotalsCalculation() {
        return totalsCalculation;
    }

    public void setTotalsCalculation(String totalsCalculation) {
        this.totalsCalculation = totalsCalculation;
    }

    @SerializedName("Formula")
    @JsonProperty("Formula")
    private String formula;

    public ListColumn formula(String formula) {
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

    @SerializedName("TotalsRowLabel")
    @JsonProperty("TotalsRowLabel")
    private String totalsRowLabel;

    public ListColumn totalsRowLabel(String totalsRowLabel) {
        this.totalsRowLabel = totalsRowLabel;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTotalsRowLabel() {
        return totalsRowLabel;
    }

    public void setTotalsRowLabel(String totalsRowLabel) {
        this.totalsRowLabel = totalsRowLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListColumn other = (ListColumn) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.range, other.range)
            && Objects.equals(this.totalsCalculation, other.totalsCalculation)
            && Objects.equals(this.formula, other.formula)
            && Objects.equals(this.totalsRowLabel, other.totalsRowLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, range, totalsCalculation, formula, totalsRowLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListColumn {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    range: ").append(range).append("\n");
        sb.append("    totalsCalculation: ").append(totalsCalculation).append("\n");
        sb.append("    formula: ").append(formula).append("\n");
        sb.append("    totalsRowLabel: ").append(totalsRowLabel).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

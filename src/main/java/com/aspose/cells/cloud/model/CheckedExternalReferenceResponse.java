/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CheckedExternalReferenceResponse.java">
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

public class CheckedExternalReferenceResponse extends CellsCloudResponse {

    @SerializedName("ReferenceOtherWorkbook")
    @JsonProperty("ReferenceOtherWorkbook")
    private Boolean referenceOtherWorkbook;

    public CheckedExternalReferenceResponse referenceOtherWorkbook(Boolean referenceOtherWorkbook) {
        this.referenceOtherWorkbook = referenceOtherWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getReferenceOtherWorkbook() {
        return referenceOtherWorkbook;
    }

    public void setReferenceOtherWorkbook(Boolean referenceOtherWorkbook) {
        this.referenceOtherWorkbook = referenceOtherWorkbook;
    }

    @SerializedName("ReferenceOtherWorksheet")
    @JsonProperty("ReferenceOtherWorksheet")
    private Boolean referenceOtherWorksheet;

    public CheckedExternalReferenceResponse referenceOtherWorksheet(Boolean referenceOtherWorksheet) {
        this.referenceOtherWorksheet = referenceOtherWorksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getReferenceOtherWorksheet() {
        return referenceOtherWorksheet;
    }

    public void setReferenceOtherWorksheet(Boolean referenceOtherWorksheet) {
        this.referenceOtherWorksheet = referenceOtherWorksheet;
    }

    @SerializedName("Formulas")
    @JsonProperty("Formulas")
    private List<String> formulas;

    public CheckedExternalReferenceResponse formulas(List<String> formulas) {
        this.formulas = formulas;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<String> getFormulas() {
        return formulas;
    }

    public void setFormulas(List<String> formulas) {
        this.formulas = formulas;
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
        CheckedExternalReferenceResponse other = (CheckedExternalReferenceResponse) o;
        return Objects.equals(this.referenceOtherWorkbook, other.referenceOtherWorkbook)
            && Objects.equals(this.referenceOtherWorksheet, other.referenceOtherWorksheet)
            && Objects.equals(this.formulas, other.formulas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceOtherWorkbook, referenceOtherWorksheet, formulas, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckedExternalReferenceResponse {\n");
        sb.append("    referenceOtherWorkbook: ").append(referenceOtherWorkbook).append("\n");
        sb.append("    referenceOtherWorksheet: ").append(referenceOtherWorksheet).append("\n");
        sb.append("    formulas: ").append(formulas).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

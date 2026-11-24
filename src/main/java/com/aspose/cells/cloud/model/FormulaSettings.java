/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormulaSettings.java">
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

public class FormulaSettings {

    @SerializedName("CalculateOnOpen")
    @JsonProperty("CalculateOnOpen")
    private Boolean calculateOnOpen;

    public FormulaSettings calculateOnOpen(Boolean calculateOnOpen) {
        this.calculateOnOpen = calculateOnOpen;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCalculateOnOpen() {
        return calculateOnOpen;
    }

    public void setCalculateOnOpen(Boolean calculateOnOpen) {
        this.calculateOnOpen = calculateOnOpen;
    }

    @SerializedName("CalculateOnSave")
    @JsonProperty("CalculateOnSave")
    private Boolean calculateOnSave;

    public FormulaSettings calculateOnSave(Boolean calculateOnSave) {
        this.calculateOnSave = calculateOnSave;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCalculateOnSave() {
        return calculateOnSave;
    }

    public void setCalculateOnSave(Boolean calculateOnSave) {
        this.calculateOnSave = calculateOnSave;
    }

    @SerializedName("ForceFullCalculation")
    @JsonProperty("ForceFullCalculation")
    private Boolean forceFullCalculation;

    public FormulaSettings forceFullCalculation(Boolean forceFullCalculation) {
        this.forceFullCalculation = forceFullCalculation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getForceFullCalculation() {
        return forceFullCalculation;
    }

    public void setForceFullCalculation(Boolean forceFullCalculation) {
        this.forceFullCalculation = forceFullCalculation;
    }

    @SerializedName("CalculationMode")
    @JsonProperty("CalculationMode")
    private String calculationMode;

    public FormulaSettings calculationMode(String calculationMode) {
        this.calculationMode = calculationMode;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCalculationMode() {
        return calculationMode;
    }

    public void setCalculationMode(String calculationMode) {
        this.calculationMode = calculationMode;
    }

    @SerializedName("CalculationId")
    @JsonProperty("CalculationId")
    private String calculationId;

    public FormulaSettings calculationId(String calculationId) {
        this.calculationId = calculationId;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCalculationId() {
        return calculationId;
    }

    public void setCalculationId(String calculationId) {
        this.calculationId = calculationId;
    }

    @SerializedName("EnableIterativeCalculation")
    @JsonProperty("EnableIterativeCalculation")
    private Boolean enableIterativeCalculation;

    public FormulaSettings enableIterativeCalculation(Boolean enableIterativeCalculation) {
        this.enableIterativeCalculation = enableIterativeCalculation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEnableIterativeCalculation() {
        return enableIterativeCalculation;
    }

    public void setEnableIterativeCalculation(Boolean enableIterativeCalculation) {
        this.enableIterativeCalculation = enableIterativeCalculation;
    }

    @SerializedName("MaxIteration")
    @JsonProperty("MaxIteration")
    private Integer maxIteration;

    public FormulaSettings maxIteration(Integer maxIteration) {
        this.maxIteration = maxIteration;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxIteration() {
        return maxIteration;
    }

    public void setMaxIteration(Integer maxIteration) {
        this.maxIteration = maxIteration;
    }

    @SerializedName("MaxChange")
    @JsonProperty("MaxChange")
    private Double maxChange;

    public FormulaSettings maxChange(Double maxChange) {
        this.maxChange = maxChange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Double maxChange) {
        this.maxChange = maxChange;
    }

    @SerializedName("PrecisionAsDisplayed")
    @JsonProperty("PrecisionAsDisplayed")
    private Boolean precisionAsDisplayed;

    public FormulaSettings precisionAsDisplayed(Boolean precisionAsDisplayed) {
        this.precisionAsDisplayed = precisionAsDisplayed;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPrecisionAsDisplayed() {
        return precisionAsDisplayed;
    }

    public void setPrecisionAsDisplayed(Boolean precisionAsDisplayed) {
        this.precisionAsDisplayed = precisionAsDisplayed;
    }

    @SerializedName("EnableCalculationChain")
    @JsonProperty("EnableCalculationChain")
    private Boolean enableCalculationChain;

    public FormulaSettings enableCalculationChain(Boolean enableCalculationChain) {
        this.enableCalculationChain = enableCalculationChain;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEnableCalculationChain() {
        return enableCalculationChain;
    }

    public void setEnableCalculationChain(Boolean enableCalculationChain) {
        this.enableCalculationChain = enableCalculationChain;
    }

    @SerializedName("PreservePaddingSpaces")
    @JsonProperty("PreservePaddingSpaces")
    private Boolean preservePaddingSpaces;

    public FormulaSettings preservePaddingSpaces(Boolean preservePaddingSpaces) {
        this.preservePaddingSpaces = preservePaddingSpaces;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPreservePaddingSpaces() {
        return preservePaddingSpaces;
    }

    public void setPreservePaddingSpaces(Boolean preservePaddingSpaces) {
        this.preservePaddingSpaces = preservePaddingSpaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormulaSettings other = (FormulaSettings) o;
        return Objects.equals(this.calculateOnOpen, other.calculateOnOpen)
            && Objects.equals(this.calculateOnSave, other.calculateOnSave)
            && Objects.equals(this.forceFullCalculation, other.forceFullCalculation)
            && Objects.equals(this.calculationMode, other.calculationMode)
            && Objects.equals(this.calculationId, other.calculationId)
            && Objects.equals(this.enableIterativeCalculation, other.enableIterativeCalculation)
            && Objects.equals(this.maxIteration, other.maxIteration)
            && Objects.equals(this.maxChange, other.maxChange)
            && Objects.equals(this.precisionAsDisplayed, other.precisionAsDisplayed)
            && Objects.equals(this.enableCalculationChain, other.enableCalculationChain)
            && Objects.equals(this.preservePaddingSpaces, other.preservePaddingSpaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calculateOnOpen, calculateOnSave, forceFullCalculation, calculationMode, calculationId, enableIterativeCalculation, maxIteration, maxChange, precisionAsDisplayed, enableCalculationChain, preservePaddingSpaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormulaSettings {\n");
        sb.append("    calculateOnOpen: ").append(calculateOnOpen).append("\n");
        sb.append("    calculateOnSave: ").append(calculateOnSave).append("\n");
        sb.append("    forceFullCalculation: ").append(forceFullCalculation).append("\n");
        sb.append("    calculationMode: ").append(calculationMode).append("\n");
        sb.append("    calculationId: ").append(calculationId).append("\n");
        sb.append("    enableIterativeCalculation: ").append(enableIterativeCalculation).append("\n");
        sb.append("    maxIteration: ").append(maxIteration).append("\n");
        sb.append("    maxChange: ").append(maxChange).append("\n");
        sb.append("    precisionAsDisplayed: ").append(precisionAsDisplayed).append("\n");
        sb.append("    enableCalculationChain: ").append(enableCalculationChain).append("\n");
        sb.append("    preservePaddingSpaces: ").append(preservePaddingSpaces).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

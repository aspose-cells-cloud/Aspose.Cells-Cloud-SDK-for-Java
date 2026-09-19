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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class FormulaSettings {
        @SerializedName("CalculateOnOpen")
        private Boolean calculateOnOpen ;

        public  FormulaSettings  calculateOnOpen(Boolean  calculateOnOpen) {
            this.calculateOnOpen =  calculateOnOpen;
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
        private Boolean calculateOnSave ;

        public  FormulaSettings  calculateOnSave(Boolean  calculateOnSave) {
            this.calculateOnSave =  calculateOnSave;
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
        private Boolean forceFullCalculation ;

        public  FormulaSettings  forceFullCalculation(Boolean  forceFullCalculation) {
            this.forceFullCalculation =  forceFullCalculation;
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
        private String calculationMode ;

        public  FormulaSettings  calculationMode(String  calculationMode) {
            this.calculationMode =  calculationMode;
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
        private String calculationId ;

        public  FormulaSettings  calculationId(String  calculationId) {
            this.calculationId =  calculationId;
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
        private Boolean enableIterativeCalculation ;

        public  FormulaSettings  enableIterativeCalculation(Boolean  enableIterativeCalculation) {
            this.enableIterativeCalculation =  enableIterativeCalculation;
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
        private Integer maxIteration ;

        public  FormulaSettings  maxIteration(Integer  maxIteration) {
            this.maxIteration =  maxIteration;
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
        private Double maxChange ;

        public  FormulaSettings  maxChange(Double  maxChange) {
            this.maxChange =  maxChange;
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
        private Boolean precisionAsDisplayed ;

        public  FormulaSettings  precisionAsDisplayed(Boolean  precisionAsDisplayed) {
            this.precisionAsDisplayed =  precisionAsDisplayed;
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
        private Boolean enableCalculationChain ;

        public  FormulaSettings  enableCalculationChain(Boolean  enableCalculationChain) {
            this.enableCalculationChain =  enableCalculationChain;
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
        private Boolean preservePaddingSpaces ;

        public  FormulaSettings  preservePaddingSpaces(Boolean  preservePaddingSpaces) {
            this.preservePaddingSpaces =  preservePaddingSpaces;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            FormulaSettings formulaSettings = (FormulaSettings) o;
            return
                Objects.equals(this.calculateOnOpen, formulaSettings.calculateOnOpen) &&
                Objects.equals(this.calculateOnSave, formulaSettings.calculateOnSave) &&
                Objects.equals(this.forceFullCalculation, formulaSettings.forceFullCalculation) &&
                Objects.equals(this.calculationMode, formulaSettings.calculationMode) &&
                Objects.equals(this.calculationId, formulaSettings.calculationId) &&
                Objects.equals(this.enableIterativeCalculation, formulaSettings.enableIterativeCalculation) &&
                Objects.equals(this.maxIteration, formulaSettings.maxIteration) &&
                Objects.equals(this.maxChange, formulaSettings.maxChange) &&
                Objects.equals(this.precisionAsDisplayed, formulaSettings.precisionAsDisplayed) &&
                Objects.equals(this.enableCalculationChain, formulaSettings.enableCalculationChain) &&
                Objects.equals(this.preservePaddingSpaces, formulaSettings.preservePaddingSpaces);
      }

      @Override
      public int hashCode() {
        return Objects.hash(calculateOnOpen, calculateOnSave, forceFullCalculation, calculationMode, calculationId, enableIterativeCalculation, maxIteration, maxChange, precisionAsDisplayed, enableCalculationChain, preservePaddingSpaces);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FormulaSettings {\n");
            sb.append("    calculateOnOpen: ").append(toIndentedString(getCalculateOnOpen())).append("\n");
            sb.append("    calculateOnSave: ").append(toIndentedString(getCalculateOnSave())).append("\n");
            sb.append("    forceFullCalculation: ").append(toIndentedString(getForceFullCalculation())).append("\n");
            sb.append("    calculationMode: ").append(toIndentedString(getCalculationMode())).append("\n");
            sb.append("    calculationId: ").append(toIndentedString(getCalculationId())).append("\n");
            sb.append("    enableIterativeCalculation: ").append(toIndentedString(getEnableIterativeCalculation())).append("\n");
            sb.append("    maxIteration: ").append(toIndentedString(getMaxIteration())).append("\n");
            sb.append("    maxChange: ").append(toIndentedString(getMaxChange())).append("\n");
            sb.append("    precisionAsDisplayed: ").append(toIndentedString(getPrecisionAsDisplayed())).append("\n");
            sb.append("    enableCalculationChain: ").append(toIndentedString(getEnableCalculationChain())).append("\n");
            sb.append("    preservePaddingSpaces: ").append(toIndentedString(getPreservePaddingSpaces())).append("\n");
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


/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CalculationOptions.java">
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


public class CalculationOptions {
        @SerializedName("CalcStackSize")
        private Integer calcStackSize ;

        public  CalculationOptions  calcStackSize(Integer  calcStackSize) {
            this.calcStackSize =  calcStackSize;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCalcStackSize() {
            return calcStackSize;
        }

        public void setCalcStackSize(Integer calcStackSize) {
            this.calcStackSize = calcStackSize;
        }

        @SerializedName("IgnoreError")
        private Boolean ignoreError ;

        public  CalculationOptions  ignoreError(Boolean  ignoreError) {
            this.ignoreError =  ignoreError;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIgnoreError() {
            return ignoreError;
        }

        public void setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
        }

        @SerializedName("PrecisionStrategy")
        private String precisionStrategy ;

        public  CalculationOptions  precisionStrategy(String  precisionStrategy) {
            this.precisionStrategy =  precisionStrategy;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrecisionStrategy() {
            return precisionStrategy;
        }

        public void setPrecisionStrategy(String precisionStrategy) {
            this.precisionStrategy = precisionStrategy;
        }

        @SerializedName("Recursive")
        private Boolean recursive ;

        public  CalculationOptions  recursive(Boolean  recursive) {
            this.recursive =  recursive;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRecursive() {
            return recursive;
        }

        public void setRecursive(Boolean recursive) {
            this.recursive = recursive;
        }

        @SerializedName("CustomEngine")
        private AbstractCalculationEngine customEngine ;

        public  CalculationOptions  customEngine(AbstractCalculationEngine  customEngine) {
            this.customEngine =  customEngine;
            return this;
        }

        @ApiModelProperty(value = "")
        public AbstractCalculationEngine getCustomEngine() {
            return customEngine;
        }

        public void setCustomEngine(AbstractCalculationEngine customEngine) {
            this.customEngine = customEngine;
        }

        @SerializedName("CalculationMonitor")
        private AbstractCalculationMonitor calculationMonitor ;

        public  CalculationOptions  calculationMonitor(AbstractCalculationMonitor  calculationMonitor) {
            this.calculationMonitor =  calculationMonitor;
            return this;
        }

        @ApiModelProperty(value = "")
        public AbstractCalculationMonitor getCalculationMonitor() {
            return calculationMonitor;
        }

        public void setCalculationMonitor(AbstractCalculationMonitor calculationMonitor) {
            this.calculationMonitor = calculationMonitor;
        }

        @SerializedName("LinkedDataSources")
        private List<Workbook> linkedDataSources ;

        public  CalculationOptions  linkedDataSources(List<Workbook>  linkedDataSources) {
            this.linkedDataSources =  linkedDataSources;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Workbook> getLinkedDataSources() {
            return linkedDataSources;
        }

        public void setLinkedDataSources(List<Workbook> linkedDataSources) {
            this.linkedDataSources = linkedDataSources;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CalculationOptions calculationOptions = (CalculationOptions) o;
            return
                Objects.equals(this.calcStackSize, calculationOptions.calcStackSize) &&
                Objects.equals(this.ignoreError, calculationOptions.ignoreError) &&
                Objects.equals(this.precisionStrategy, calculationOptions.precisionStrategy) &&
                Objects.equals(this.recursive, calculationOptions.recursive) &&
                Objects.equals(this.customEngine, calculationOptions.customEngine) &&
                Objects.equals(this.calculationMonitor, calculationOptions.calculationMonitor) &&
                Objects.equals(this.linkedDataSources, calculationOptions.linkedDataSources);
      }

      @Override
      public int hashCode() {
        return Objects.hash(calcStackSize, ignoreError, precisionStrategy, recursive, customEngine, calculationMonitor, linkedDataSources);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CalculationOptions {\n");
            sb.append("    calcStackSize: ").append(toIndentedString(getCalcStackSize())).append("\n");
            sb.append("    ignoreError: ").append(toIndentedString(getIgnoreError())).append("\n");
            sb.append("    precisionStrategy: ").append(toIndentedString(getPrecisionStrategy())).append("\n");
            sb.append("    recursive: ").append(toIndentedString(getRecursive())).append("\n");
            sb.append("    customEngine: ").append(toIndentedString(getCustomEngine())).append("\n");
            sb.append("    calculationMonitor: ").append(toIndentedString(getCalculationMonitor())).append("\n");
            sb.append("    linkedDataSources: ").append(toIndentedString(getLinkedDataSources())).append("\n");
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


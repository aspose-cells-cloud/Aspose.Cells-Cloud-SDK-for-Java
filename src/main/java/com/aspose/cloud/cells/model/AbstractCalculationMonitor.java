/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AbstractCalculationMonitor.java">
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


public class AbstractCalculationMonitor {
        @SerializedName("OriginalValue")
        private Object originalValue ;

        public  AbstractCalculationMonitor  originalValue(Object  originalValue) {
            this.originalValue =  originalValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Object getOriginalValue() {
            return originalValue;
        }

        public void setOriginalValue(Object originalValue) {
            this.originalValue = originalValue;
        }

        @SerializedName("ValueChanged")
        private Boolean valueChanged ;

        public  AbstractCalculationMonitor  valueChanged(Boolean  valueChanged) {
            this.valueChanged =  valueChanged;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getValueChanged() {
            return valueChanged;
        }

        public void setValueChanged(Boolean valueChanged) {
            this.valueChanged = valueChanged;
        }

        @SerializedName("CalculatedValue")
        private Object calculatedValue ;

        public  AbstractCalculationMonitor  calculatedValue(Object  calculatedValue) {
            this.calculatedValue =  calculatedValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Object getCalculatedValue() {
            return calculatedValue;
        }

        public void setCalculatedValue(Object calculatedValue) {
            this.calculatedValue = calculatedValue;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AbstractCalculationMonitor abstractCalculationMonitor = (AbstractCalculationMonitor) o;
            return
                Objects.equals(this.originalValue, abstractCalculationMonitor.originalValue) &&
                Objects.equals(this.valueChanged, abstractCalculationMonitor.valueChanged) &&
                Objects.equals(this.calculatedValue, abstractCalculationMonitor.calculatedValue);
      }

      @Override
      public int hashCode() {
        return Objects.hash(originalValue, valueChanged, calculatedValue);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AbstractCalculationMonitor {\n");
            sb.append("    originalValue: ").append(toIndentedString(getOriginalValue())).append("\n");
            sb.append("    valueChanged: ").append(toIndentedString(getValueChanged())).append("\n");
            sb.append("    calculatedValue: ").append(toIndentedString(getCalculatedValue())).append("\n");
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


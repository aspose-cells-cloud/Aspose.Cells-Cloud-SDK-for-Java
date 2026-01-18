/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AggregateResultByColor.java">
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


public class AggregateResultByColor {
        @SerializedName("AggregateOperation")
        private String aggregateOperation ;

        public  AggregateResultByColor  aggregateOperation(String  aggregateOperation) {
            this.aggregateOperation =  aggregateOperation;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAggregateOperation() {
            return aggregateOperation;
        }

        public void setAggregateOperation(String aggregateOperation) {
            this.aggregateOperation = aggregateOperation;
        }

        @SerializedName("ColorName")
        private String colorName ;

        public  AggregateResultByColor  colorName(String  colorName) {
            this.colorName =  colorName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColorName() {
            return colorName;
        }

        public void setColorName(String colorName) {
            this.colorName = colorName;
        }

        @SerializedName("Count")
        private Integer count ;

        public  AggregateResultByColor  count(Integer  count) {
            this.count =  count;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        @SerializedName("Sum")
        private Double sum ;

        public  AggregateResultByColor  sum(Double  sum) {
            this.sum =  sum;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getSum() {
            return sum;
        }

        public void setSum(Double sum) {
            this.sum = sum;
        }

        @SerializedName("MaxValue")
        private Double maxValue ;

        public  AggregateResultByColor  maxValue(Double  maxValue) {
            this.maxValue =  maxValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
        }

        @SerializedName("MinValue")
        private Double minValue ;

        public  AggregateResultByColor  minValue(Double  minValue) {
            this.minValue =  minValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getMinValue() {
            return minValue;
        }

        public void setMinValue(Double minValue) {
            this.minValue = minValue;
        }

        @SerializedName("AverageValue")
        private Double averageValue ;

        public  AggregateResultByColor  averageValue(Double  averageValue) {
            this.averageValue =  averageValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getAverageValue() {
            return averageValue;
        }

        public void setAverageValue(Double averageValue) {
            this.averageValue = averageValue;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AggregateResultByColor aggregateResultByColor = (AggregateResultByColor) o;
            return
                Objects.equals(this.aggregateOperation, aggregateResultByColor.aggregateOperation) &&
                Objects.equals(this.colorName, aggregateResultByColor.colorName) &&
                Objects.equals(this.count, aggregateResultByColor.count) &&
                Objects.equals(this.sum, aggregateResultByColor.sum) &&
                Objects.equals(this.maxValue, aggregateResultByColor.maxValue) &&
                Objects.equals(this.minValue, aggregateResultByColor.minValue) &&
                Objects.equals(this.averageValue, aggregateResultByColor.averageValue);
      }

      @Override
      public int hashCode() {
        return Objects.hash(aggregateOperation, colorName, count, sum, maxValue, minValue, averageValue);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AggregateResultByColor {\n");
            sb.append("    aggregateOperation: ").append(toIndentedString(getAggregateOperation())).append("\n");
            sb.append("    colorName: ").append(toIndentedString(getColorName())).append("\n");
            sb.append("    count: ").append(toIndentedString(getCount())).append("\n");
            sb.append("    sum: ").append(toIndentedString(getSum())).append("\n");
            sb.append("    maxValue: ").append(toIndentedString(getMaxValue())).append("\n");
            sb.append("    minValue: ").append(toIndentedString(getMinValue())).append("\n");
            sb.append("    averageValue: ").append(toIndentedString(getAverageValue())).append("\n");
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


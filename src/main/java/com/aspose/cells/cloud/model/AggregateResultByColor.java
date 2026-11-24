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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AggregateResultByColor {

    @SerializedName("AggregateOperation")
    @JsonProperty("AggregateOperation")
    private String aggregateOperation;

    public AggregateResultByColor aggregateOperation(String aggregateOperation) {
        this.aggregateOperation = aggregateOperation;
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
    @JsonProperty("ColorName")
    private String colorName;

    public AggregateResultByColor colorName(String colorName) {
        this.colorName = colorName;
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
    @JsonProperty("Count")
    private Integer count;

    public AggregateResultByColor count(Integer count) {
        this.count = count;
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
    @JsonProperty("Sum")
    private Double sum;

    public AggregateResultByColor sum(Double sum) {
        this.sum = sum;
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
    @JsonProperty("MaxValue")
    private Double maxValue;

    public AggregateResultByColor maxValue(Double maxValue) {
        this.maxValue = maxValue;
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
    @JsonProperty("MinValue")
    private Double minValue;

    public AggregateResultByColor minValue(Double minValue) {
        this.minValue = minValue;
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
    @JsonProperty("AverageValue")
    private Double averageValue;

    public AggregateResultByColor averageValue(Double averageValue) {
        this.averageValue = averageValue;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregateResultByColor other = (AggregateResultByColor) o;
        return Objects.equals(this.aggregateOperation, other.aggregateOperation)
            && Objects.equals(this.colorName, other.colorName)
            && Objects.equals(this.count, other.count)
            && Objects.equals(this.sum, other.sum)
            && Objects.equals(this.maxValue, other.maxValue)
            && Objects.equals(this.minValue, other.minValue)
            && Objects.equals(this.averageValue, other.averageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregateOperation, colorName, count, sum, maxValue, minValue, averageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateResultByColor {\n");
        sb.append("    aggregateOperation: ").append(aggregateOperation).append("\n");
        sb.append("    colorName: ").append(colorName).append("\n");
        sb.append("    count: ").append(count).append("\n");
        sb.append("    sum: ").append(sum).append("\n");
        sb.append("    maxValue: ").append(maxValue).append("\n");
        sb.append("    minValue: ").append(minValue).append("\n");
        sb.append("    averageValue: ").append(averageValue).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

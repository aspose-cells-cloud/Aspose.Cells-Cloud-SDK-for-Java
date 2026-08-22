package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AggregateResultByColor model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregateResultByColor {
    /** Gets or sets AggregateOperation. */
    @JsonProperty("AggregateOperation")
    private String aggregateOperation;

    /** Gets or sets ColorName. */
    @JsonProperty("ColorName")
    private String colorName;

    /** Gets or sets Count. */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets Sum. */
    @JsonProperty("Sum")
    private Double sum;

    /** Gets or sets MaxValue. */
    @JsonProperty("MaxValue")
    private Double maxValue;

    /** Gets or sets MinValue. */
    @JsonProperty("MinValue")
    private Double minValue;

    /** Gets or sets AverageValue. */
    @JsonProperty("AverageValue")
    private Double averageValue;

    public String getAggregateOperation() { return aggregateOperation; }
    public AggregateResultByColor setAggregateOperation(String aggregateOperation) { this.aggregateOperation = aggregateOperation; return this; }

    public String getColorName() { return colorName; }
    public AggregateResultByColor setColorName(String colorName) { this.colorName = colorName; return this; }

    public Integer getCount() { return count; }
    public AggregateResultByColor setCount(Integer count) { this.count = count; return this; }

    public Double getSum() { return sum; }
    public AggregateResultByColor setSum(Double sum) { this.sum = sum; return this; }

    public Double getMaxValue() { return maxValue; }
    public AggregateResultByColor setMaxValue(Double maxValue) { this.maxValue = maxValue; return this; }

    public Double getMinValue() { return minValue; }
    public AggregateResultByColor setMinValue(Double minValue) { this.minValue = minValue; return this; }

    public Double getAverageValue() { return averageValue; }
    public AggregateResultByColor setAverageValue(Double averageValue) { this.averageValue = averageValue; return this; }

}

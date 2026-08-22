package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DynamicFilter — Represents the dynamic filter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicFilter {
    /** Gets and sets the dynamic filter type. */
    @JsonProperty("DynamicFilterType")
    private String dynamicFilterType;

    /** Gets and sets the dynamic filter max value. */
    @JsonProperty("MaxValue")
    private Object maxValue;

    /** Gets and sets the dynamic filter value. */
    @JsonProperty("Value")
    private Object value;

    public String getDynamicFilterType() { return dynamicFilterType; }
    public DynamicFilter setDynamicFilterType(String dynamicFilterType) { this.dynamicFilterType = dynamicFilterType; return this; }

    public Object getMaxValue() { return maxValue; }
    public DynamicFilter setMaxValue(Object maxValue) { this.maxValue = maxValue; return this; }

    public Object getValue() { return value; }
    public DynamicFilter setValue(Object value) { this.value = value; return this; }

}

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SingleValue — Represents single value. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleValue {
    /** Represents value. */
    @JsonProperty("Value")
    private String value;

    /** Represents value type. */
    @JsonProperty("ValueType")
    private Object valueType;

    public String getValue() { return value; }
    public SingleValue setValue(String value) { this.value = value; return this; }

    public Object getValueType() { return valueType; }
    public SingleValue setValueType(Object valueType) { this.valueType = valueType; return this; }

}

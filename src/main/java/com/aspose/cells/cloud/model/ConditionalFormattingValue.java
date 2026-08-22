package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConditionalFormattingValue — Describes the values of the interpolation points in a gradient scale, dataBar or iconSet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattingValue {
    /** Get or set the Greater Than Or Equal flag. Use only for icon sets, determines whether this threshold value uses the greater than or equal to operator. 'false' indicates 'greater than' is used instead of 'greater than or equal to'. Default value is true. */
    @JsonProperty("IsGTE")
    private Boolean isGTE;

    /** Get or set the type of this conditional formatting value object. Setting the type to FormatConditionValueType.Min or FormatConditionValueType.Max will auto set "Value" to null. */
    @JsonProperty("Type")
    private String type;

    /** Get or set the value of this conditional formatting value object. It should be used in conjunction with Type. */
    @JsonProperty("Value")
    private Object value;

    public Boolean getIsGTE() { return isGTE; }
    public ConditionalFormattingValue setIsGTE(Boolean isGTE) { this.isGTE = isGTE; return this; }

    public String getType() { return type; }
    public ConditionalFormattingValue setType(String type) { this.type = type; return this; }

    public Object getValue() { return value; }
    public ConditionalFormattingValue setValue(Object value) { this.value = value; return this; }

}

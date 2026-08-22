package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AbstractCalculationMonitor — Monitor for user to track the progress of formula calculation. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbstractCalculationMonitor {
    /** Gets the old value of the calculated cell. Should be used only in  and . */
    @JsonProperty("OriginalValue")
    private Object originalValue;

    /** Whether the cell's value has been changed after the calculation.  Should be used only in . */
    @JsonProperty("ValueChanged")
    private Boolean valueChanged;

    /** Gets the newly calculated value of the cell. Should be used only in . */
    @JsonProperty("CalculatedValue")
    private Object calculatedValue;

    public Object getOriginalValue() { return originalValue; }
    public AbstractCalculationMonitor setOriginalValue(Object originalValue) { this.originalValue = originalValue; return this; }

    public Boolean getValueChanged() { return valueChanged; }
    public AbstractCalculationMonitor setValueChanged(Boolean valueChanged) { this.valueChanged = valueChanged; return this; }

    public Object getCalculatedValue() { return calculatedValue; }
    public AbstractCalculationMonitor setCalculatedValue(Object calculatedValue) { this.calculatedValue = calculatedValue; return this; }

}

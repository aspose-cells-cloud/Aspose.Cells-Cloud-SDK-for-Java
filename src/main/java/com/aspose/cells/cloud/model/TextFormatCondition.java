package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextFormatCondition — Represents text format condition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextFormatCondition extends FormulaFormatCondition {
    /** The text value in a "text contains" conditional formatting rule. Valid only for type = containsText, notContainsText, beginsWith and endsWith.  The default value is null. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets Formula1. */
    @JsonProperty("Formula1")
    private String formula1;

    /** Gets or sets Formula2. */
    @JsonProperty("Formula2")
    private String formula2;

    /** Gets or sets Operator. */
    @JsonProperty("Operator")
    private String operator;

    public String getText() { return text; }
    public TextFormatCondition setText(String text) { this.text = text; return this; }

    public String getFormula1() { return formula1; }
    public TextFormatCondition setFormula1(String formula1) { this.formula1 = formula1; return this; }

    public String getFormula2() { return formula2; }
    public TextFormatCondition setFormula2(String formula2) { this.formula2 = formula2; return this; }

    public String getOperator() { return operator; }
    public TextFormatCondition setOperator(String operator) { this.operator = operator; return this; }

}

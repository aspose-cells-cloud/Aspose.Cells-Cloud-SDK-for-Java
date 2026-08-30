package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextFormatCondition — Represents text format condition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextFormatCondition extends FormulaFormatCondition {
    /** The text value in a "text contains" conditional formatting rule. Valid only for type = containsText, notContainsText, beginsWith and endsWith.  The default value is null. */
    @JsonProperty("Text")
    private String text;

    public String getText() { return text; }
    public TextFormatCondition setText(String text) { this.text = text; return this; }


    /** Covariant override: keeps fluent chains returning TextFormatCondition. */
    @Override public TextFormatCondition setFormula1(String formula1) { return (TextFormatCondition) super.setFormula1(formula1); }
    /** Covariant override: keeps fluent chains returning TextFormatCondition. */
    @Override public TextFormatCondition setFormula2(String formula2) { return (TextFormatCondition) super.setFormula2(formula2); }
    /** Covariant override: keeps fluent chains returning TextFormatCondition. */
    @Override public TextFormatCondition setOperator(String operator) { return (TextFormatCondition) super.setOperator(operator); }

}

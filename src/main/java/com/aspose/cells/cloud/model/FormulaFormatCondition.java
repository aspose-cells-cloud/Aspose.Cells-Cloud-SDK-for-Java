package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormulaFormatCondition — Class summary: This class covers various features related to data visualization and graphical representation of data sets. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaFormatCondition {
    /** Gets and sets the value or expression associated with conditional formatting. */
    @JsonProperty("Formula1")
    private String formula1;

    /** Gets and sets the value or expression associated with conditional formatting. */
    @JsonProperty("Formula2")
    private String formula2;

    /** Gets and sets the conditional format operator type. */
    @JsonProperty("Operator")
    private String operator;

    public String getFormula1() { return formula1; }
    public FormulaFormatCondition setFormula1(String formula1) { this.formula1 = formula1; return this; }

    public String getFormula2() { return formula2; }
    public FormulaFormatCondition setFormula2(String formula2) { this.formula2 = formula2; return this; }

    public String getOperator() { return operator; }
    public FormulaFormatCondition setOperator(String operator) { this.operator = operator; return this; }

}

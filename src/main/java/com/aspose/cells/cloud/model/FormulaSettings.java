package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormulaSettings — Settings of formulas and calculation. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaSettings {
    /** Indicates whether the application is required to perform a full calculation when the workbook is opened. */
    @JsonProperty("CalculateOnOpen")
    private Boolean calculateOnOpen;

    /** Indicates whether recalculate the workbook before saving the document, when in manual calculation mode. */
    @JsonProperty("CalculateOnSave")
    private Boolean calculateOnSave;

    /** Indicates whether calculates all formulas every time when a calculation is triggered. */
    @JsonProperty("ForceFullCalculation")
    private Boolean forceFullCalculation;

    /** Gets or sets the mode for workbook calculation in ms excel. */
    @JsonProperty("CalculationMode")
    private String calculationMode;

    /** Specifies the version of the calculation engine used to calculate values in the workbook. */
    @JsonProperty("CalculationId")
    private String calculationId;

    /** Indicates whether enable iterative calculation to resolve circular references. */
    @JsonProperty("EnableIterativeCalculation")
    private Boolean enableIterativeCalculation;

    /** The maximum iterations to resolve a circular reference. */
    @JsonProperty("MaxIteration")
    private Integer maxIteration;

    /** The maximum change to resolve a circular reference. */
    @JsonProperty("MaxChange")
    private Double maxChange;

    /** Whether the precision of calculated result be set as they are displayed while calculating formulas */
    @JsonProperty("PrecisionAsDisplayed")
    private Boolean precisionAsDisplayed;

    /** Whether enable calculation chain for formulas. Default is false. */
    @JsonProperty("EnableCalculationChain")
    private Boolean enableCalculationChain;

    /** Indicates whether preserve those spaces and line breaks that are padded between formula tokens while getting and setting formulas. Default value is false. */
    @JsonProperty("PreservePaddingSpaces")
    private Boolean preservePaddingSpaces;

    public Boolean getCalculateOnOpen() { return calculateOnOpen; }
    public FormulaSettings setCalculateOnOpen(Boolean calculateOnOpen) { this.calculateOnOpen = calculateOnOpen; return this; }

    public Boolean getCalculateOnSave() { return calculateOnSave; }
    public FormulaSettings setCalculateOnSave(Boolean calculateOnSave) { this.calculateOnSave = calculateOnSave; return this; }

    public Boolean getForceFullCalculation() { return forceFullCalculation; }
    public FormulaSettings setForceFullCalculation(Boolean forceFullCalculation) { this.forceFullCalculation = forceFullCalculation; return this; }

    public String getCalculationMode() { return calculationMode; }
    public FormulaSettings setCalculationMode(String calculationMode) { this.calculationMode = calculationMode; return this; }

    public String getCalculationId() { return calculationId; }
    public FormulaSettings setCalculationId(String calculationId) { this.calculationId = calculationId; return this; }

    public Boolean getEnableIterativeCalculation() { return enableIterativeCalculation; }
    public FormulaSettings setEnableIterativeCalculation(Boolean enableIterativeCalculation) { this.enableIterativeCalculation = enableIterativeCalculation; return this; }

    public Integer getMaxIteration() { return maxIteration; }
    public FormulaSettings setMaxIteration(Integer maxIteration) { this.maxIteration = maxIteration; return this; }

    public Double getMaxChange() { return maxChange; }
    public FormulaSettings setMaxChange(Double maxChange) { this.maxChange = maxChange; return this; }

    public Boolean getPrecisionAsDisplayed() { return precisionAsDisplayed; }
    public FormulaSettings setPrecisionAsDisplayed(Boolean precisionAsDisplayed) { this.precisionAsDisplayed = precisionAsDisplayed; return this; }

    public Boolean getEnableCalculationChain() { return enableCalculationChain; }
    public FormulaSettings setEnableCalculationChain(Boolean enableCalculationChain) { this.enableCalculationChain = enableCalculationChain; return this; }

    public Boolean getPreservePaddingSpaces() { return preservePaddingSpaces; }
    public FormulaSettings setPreservePaddingSpaces(Boolean preservePaddingSpaces) { this.preservePaddingSpaces = preservePaddingSpaces; return this; }

}

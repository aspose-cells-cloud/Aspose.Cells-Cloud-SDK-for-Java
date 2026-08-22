package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CalculationOptions — Represents options for calculation. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculationOptions {
    /** Specifies the stack size for calculating cells recursively. */
    @JsonProperty("CalcStackSize")
    private Integer calcStackSize;

    /** Indicates whether errors encountered while calculating formulas should be ignored. The error may be unsupported function, external links, etc. The default value is true. */
    @JsonProperty("IgnoreError")
    private Boolean ignoreError;

    /** Specifies the strategy for processing precision of calculation. */
    @JsonProperty("PrecisionStrategy")
    private String precisionStrategy;

    /** Indicates whether calculate the dependent cells recursively when calculating one cell and it depends on other cells. The default value is true. */
    @JsonProperty("Recursive")
    private Boolean recursive;

    /** The custom formula calculation engine to extend the default calculation engine of Aspose.Cells. */
    @JsonProperty("CustomEngine")
    private AbstractCalculationEngine customEngine;

    /** The monitor for user to track the progress of formula calculation. */
    @JsonProperty("CalculationMonitor")
    private AbstractCalculationMonitor calculationMonitor;

    /** Specifies the data sources for external links used in formulas. */
    @JsonProperty("LinkedDataSources")
    private List<Workbook> linkedDataSources;

    public Integer getCalcStackSize() { return calcStackSize; }
    public CalculationOptions setCalcStackSize(Integer calcStackSize) { this.calcStackSize = calcStackSize; return this; }

    public Boolean getIgnoreError() { return ignoreError; }
    public CalculationOptions setIgnoreError(Boolean ignoreError) { this.ignoreError = ignoreError; return this; }

    public String getPrecisionStrategy() { return precisionStrategy; }
    public CalculationOptions setPrecisionStrategy(String precisionStrategy) { this.precisionStrategy = precisionStrategy; return this; }

    public Boolean getRecursive() { return recursive; }
    public CalculationOptions setRecursive(Boolean recursive) { this.recursive = recursive; return this; }

    public AbstractCalculationEngine getCustomEngine() { return customEngine; }
    public CalculationOptions setCustomEngine(AbstractCalculationEngine customEngine) { this.customEngine = customEngine; return this; }

    public AbstractCalculationMonitor getCalculationMonitor() { return calculationMonitor; }
    public CalculationOptions setCalculationMonitor(AbstractCalculationMonitor calculationMonitor) { this.calculationMonitor = calculationMonitor; return this; }

    public List<Workbook> getLinkedDataSources() { return linkedDataSources; }
    public CalculationOptions setLinkedDataSources(List<Workbook> linkedDataSources) { this.linkedDataSources = linkedDataSources; return this; }

}

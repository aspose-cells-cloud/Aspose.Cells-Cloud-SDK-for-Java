package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AbstractCalculationEngine — Represents user's custom calculation engine to extend the default calculation engine of Aspose.Cells. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbstractCalculationEngine {
    /** Indicates whether this engine needs the literal text of parameter while doing calculation. Default value is false. */
    @JsonProperty("IsParamLiteralRequired")
    private Boolean isParamLiteralRequired;

    /** Indicates whether this engine needs the parameter to be calculated in array mode. Default value is false. If  is required when calculating custom functions, this property needs to be set as true. */
    @JsonProperty("IsParamArrayModeRequired")
    private Boolean isParamArrayModeRequired;

    /** Whether built-in functions that have been supported by the built-in engine should be checked and processed by this implementation. Default is false. If user needs to change the calculation logic of some built-in functions, this property should be set as true. Otherwise please leave this property as false for performance consideration. */
    @JsonProperty("ProcessBuiltInFunctions")
    private Boolean processBuiltInFunctions;

    public Boolean getIsParamLiteralRequired() { return isParamLiteralRequired; }
    public AbstractCalculationEngine setIsParamLiteralRequired(Boolean isParamLiteralRequired) { this.isParamLiteralRequired = isParamLiteralRequired; return this; }

    public Boolean getIsParamArrayModeRequired() { return isParamArrayModeRequired; }
    public AbstractCalculationEngine setIsParamArrayModeRequired(Boolean isParamArrayModeRequired) { this.isParamArrayModeRequired = isParamArrayModeRequired; return this; }

    public Boolean getProcessBuiltInFunctions() { return processBuiltInFunctions; }
    public AbstractCalculationEngine setProcessBuiltInFunctions(Boolean processBuiltInFunctions) { this.processBuiltInFunctions = processBuiltInFunctions; return this; }

}

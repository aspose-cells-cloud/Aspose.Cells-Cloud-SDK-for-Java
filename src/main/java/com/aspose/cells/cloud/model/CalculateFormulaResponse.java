package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CalculateFormulaResponse — Represents the CalculateFormula Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateFormulaResponse extends CellsCloudResponse {
    /** A public property "Result" that can be accessed and modified with a string data type. */
    @JsonProperty("Result")
    private String result;

    public String getResult() { return result; }
    public CalculateFormulaResponse setResult(String result) { this.result = result; return this; }


    /** Covariant override: keeps fluent chains returning CalculateFormulaResponse. */
    @Override public CalculateFormulaResponse setCode(Integer code) { return (CalculateFormulaResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CalculateFormulaResponse. */
    @Override public CalculateFormulaResponse setStatus(String status) { return (CalculateFormulaResponse) super.setStatus(status); }

}

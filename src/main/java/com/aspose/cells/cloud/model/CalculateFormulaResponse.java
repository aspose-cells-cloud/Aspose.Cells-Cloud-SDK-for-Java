package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CalculateFormulaResponse — Represents the CalculateFormula Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalculateFormulaResponse extends CellsCloudResponse {
    /** A public property "Result" that can be accessed and modified with a string data type. */
    @JsonProperty("Result")
    private String result;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public String getResult() { return result; }
    public CalculateFormulaResponse setResult(String result) { this.result = result; return this; }

    public Integer getCode() { return code; }
    public CalculateFormulaResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CalculateFormulaResponse setStatus(String status) { this.status = status; return this; }

}

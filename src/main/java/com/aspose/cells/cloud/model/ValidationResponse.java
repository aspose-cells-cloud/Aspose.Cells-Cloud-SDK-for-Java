package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ValidationResponse — Represents the Validation Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationResponse extends CellsCloudResponse {
    /** The class has a public property for Validation. */
    @JsonProperty("Validation")
    private Validation validation;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Validation getValidation() { return validation; }
    public ValidationResponse setValidation(Validation validation) { this.validation = validation; return this; }

    public Integer getCode() { return code; }
    public ValidationResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ValidationResponse setStatus(String status) { this.status = status; return this; }

}

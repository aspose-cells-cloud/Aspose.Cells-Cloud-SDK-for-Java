package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ValidationResponse — Represents the Validation Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationResponse extends CellsCloudResponse {
    /** The class has a public property for Validation. */
    @JsonProperty("Validation")
    private Validation validation;

    public Validation getValidation() { return validation; }
    public ValidationResponse setValidation(Validation validation) { this.validation = validation; return this; }


    /** Covariant override: keeps fluent chains returning ValidationResponse. */
    @Override public ValidationResponse setCode(Integer code) { return (ValidationResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ValidationResponse. */
    @Override public ValidationResponse setStatus(String status) { return (ValidationResponse) super.setStatus(status); }

}

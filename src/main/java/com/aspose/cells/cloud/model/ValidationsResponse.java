package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ValidationsResponse — Represents the Validations Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationsResponse extends CellsCloudResponse {
    /** This class has a public property named "Validations" of type "Validations" that includes both a getter and a setter. */
    @JsonProperty("Validations")
    private Validations validations;

    public Validations getValidations() { return validations; }
    public ValidationsResponse setValidations(Validations validations) { this.validations = validations; return this; }


    /** Covariant override: keeps fluent chains returning ValidationsResponse. */
    @Override public ValidationsResponse setCode(Integer code) { return (ValidationsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ValidationsResponse. */
    @Override public ValidationsResponse setStatus(String status) { return (ValidationsResponse) super.setStatus(status); }

}

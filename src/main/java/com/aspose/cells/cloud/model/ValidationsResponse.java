package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ValidationsResponse — Represents the Validations Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationsResponse extends CellsCloudResponse {
    /** This class has a public property named "Validations" of type "Validations" that includes both a getter and a setter. */
    @JsonProperty("Validations")
    private Validations validations;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Validations getValidations() { return validations; }
    public ValidationsResponse setValidations(Validations validations) { this.validations = validations; return this; }

    public Integer getCode() { return code; }
    public ValidationsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ValidationsResponse setStatus(String status) { this.status = status; return this; }

}

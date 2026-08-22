package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CheckedFormulaErrorsResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckedFormulaErrorsResponse extends CellsCloudResponse {
    /** Gets or sets IsFormulasErrors. */
    @JsonProperty("IsFormulasErrors")
    private Boolean isFormulasErrors;

    /** Gets or sets FormulasErrors. */
    @JsonProperty("FormulasErrors")
    private List<String> formulasErrors;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Boolean getIsFormulasErrors() { return isFormulasErrors; }
    public CheckedFormulaErrorsResponse setIsFormulasErrors(Boolean isFormulasErrors) { this.isFormulasErrors = isFormulasErrors; return this; }

    public List<String> getFormulasErrors() { return formulasErrors; }
    public CheckedFormulaErrorsResponse setFormulasErrors(List<String> formulasErrors) { this.formulasErrors = formulasErrors; return this; }

    public Integer getCode() { return code; }
    public CheckedFormulaErrorsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CheckedFormulaErrorsResponse setStatus(String status) { this.status = status; return this; }

}

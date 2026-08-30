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

    public Boolean getIsFormulasErrors() { return isFormulasErrors; }
    public CheckedFormulaErrorsResponse setIsFormulasErrors(Boolean isFormulasErrors) { this.isFormulasErrors = isFormulasErrors; return this; }

    public List<String> getFormulasErrors() { return formulasErrors; }
    public CheckedFormulaErrorsResponse setFormulasErrors(List<String> formulasErrors) { this.formulasErrors = formulasErrors; return this; }


    /** Covariant override: keeps fluent chains returning CheckedFormulaErrorsResponse. */
    @Override public CheckedFormulaErrorsResponse setCode(Integer code) { return (CheckedFormulaErrorsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CheckedFormulaErrorsResponse. */
    @Override public CheckedFormulaErrorsResponse setStatus(String status) { return (CheckedFormulaErrorsResponse) super.setStatus(status); }

}

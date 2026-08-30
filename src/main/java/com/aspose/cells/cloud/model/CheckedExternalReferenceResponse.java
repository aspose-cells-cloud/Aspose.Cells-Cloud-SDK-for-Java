package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CheckedExternalReferenceResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckedExternalReferenceResponse extends CellsCloudResponse {
    /** Gets or sets ReferenceOtherWorkbook. */
    @JsonProperty("ReferenceOtherWorkbook")
    private Boolean referenceOtherWorkbook;

    /** Gets or sets ReferenceOtherWorksheet. */
    @JsonProperty("ReferenceOtherWorksheet")
    private Boolean referenceOtherWorksheet;

    /** Gets or sets Formulas. */
    @JsonProperty("Formulas")
    private List<String> formulas;

    public Boolean getReferenceOtherWorkbook() { return referenceOtherWorkbook; }
    public CheckedExternalReferenceResponse setReferenceOtherWorkbook(Boolean referenceOtherWorkbook) { this.referenceOtherWorkbook = referenceOtherWorkbook; return this; }

    public Boolean getReferenceOtherWorksheet() { return referenceOtherWorksheet; }
    public CheckedExternalReferenceResponse setReferenceOtherWorksheet(Boolean referenceOtherWorksheet) { this.referenceOtherWorksheet = referenceOtherWorksheet; return this; }

    public List<String> getFormulas() { return formulas; }
    public CheckedExternalReferenceResponse setFormulas(List<String> formulas) { this.formulas = formulas; return this; }


    /** Covariant override: keeps fluent chains returning CheckedExternalReferenceResponse. */
    @Override public CheckedExternalReferenceResponse setCode(Integer code) { return (CheckedExternalReferenceResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CheckedExternalReferenceResponse. */
    @Override public CheckedExternalReferenceResponse setStatus(String status) { return (CheckedExternalReferenceResponse) super.setStatus(status); }

}

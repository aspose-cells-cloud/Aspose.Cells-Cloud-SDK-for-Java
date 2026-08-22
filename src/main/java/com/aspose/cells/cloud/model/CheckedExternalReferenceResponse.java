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

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Boolean getReferenceOtherWorkbook() { return referenceOtherWorkbook; }
    public CheckedExternalReferenceResponse setReferenceOtherWorkbook(Boolean referenceOtherWorkbook) { this.referenceOtherWorkbook = referenceOtherWorkbook; return this; }

    public Boolean getReferenceOtherWorksheet() { return referenceOtherWorksheet; }
    public CheckedExternalReferenceResponse setReferenceOtherWorksheet(Boolean referenceOtherWorksheet) { this.referenceOtherWorksheet = referenceOtherWorksheet; return this; }

    public List<String> getFormulas() { return formulas; }
    public CheckedExternalReferenceResponse setFormulas(List<String> formulas) { this.formulas = formulas; return this; }

    public Integer getCode() { return code; }
    public CheckedExternalReferenceResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CheckedExternalReferenceResponse setStatus(String status) { this.status = status; return this; }

}

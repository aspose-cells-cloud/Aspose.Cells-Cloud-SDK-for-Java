package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookResponse — Represents the Workbook Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookResponse extends CellsCloudResponse {
    /** Workbook property of the class allows access to and modification of a Workbook object. */
    @JsonProperty("Workbook")
    private Workbook workbook;

    public Workbook getWorkbook() { return workbook; }
    public WorkbookResponse setWorkbook(Workbook workbook) { this.workbook = workbook; return this; }


    /** Covariant override: keeps fluent chains returning WorkbookResponse. */
    @Override public WorkbookResponse setCode(Integer code) { return (WorkbookResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorkbookResponse. */
    @Override public WorkbookResponse setStatus(String status) { return (WorkbookResponse) super.setStatus(status); }

}

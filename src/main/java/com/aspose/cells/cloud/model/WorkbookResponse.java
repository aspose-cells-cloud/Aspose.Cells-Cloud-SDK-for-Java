package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookResponse — Represents the Workbook Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookResponse extends CellsCloudResponse {
    /** Workbook property of the class allows access to and modification of a Workbook object. */
    @JsonProperty("Workbook")
    private Workbook workbook;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Workbook getWorkbook() { return workbook; }
    public WorkbookResponse setWorkbook(Workbook workbook) { this.workbook = workbook; return this; }

    public Integer getCode() { return code; }
    public WorkbookResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorkbookResponse setStatus(String status) { this.status = status; return this; }

}

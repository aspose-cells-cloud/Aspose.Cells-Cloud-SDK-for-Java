package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetResponse — Represents the Worksheet Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetResponse extends CellsCloudResponse {
    /** The class has a property called "Worksheet" of type "Worksheet" that can be accessed and modified. */
    @JsonProperty("Worksheet")
    private Worksheet worksheet;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Worksheet getWorksheet() { return worksheet; }
    public WorksheetResponse setWorksheet(Worksheet worksheet) { this.worksheet = worksheet; return this; }

    public Integer getCode() { return code; }
    public WorksheetResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorksheetResponse setStatus(String status) { this.status = status; return this; }

}

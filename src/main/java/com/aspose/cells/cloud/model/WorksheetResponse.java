package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetResponse — Represents the Worksheet Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetResponse extends CellsCloudResponse {
    /** The class has a property called "Worksheet" of type "Worksheet" that can be accessed and modified. */
    @JsonProperty("Worksheet")
    private Worksheet worksheet;

    public Worksheet getWorksheet() { return worksheet; }
    public WorksheetResponse setWorksheet(Worksheet worksheet) { this.worksheet = worksheet; return this; }


    /** Covariant override: keeps fluent chains returning WorksheetResponse. */
    @Override public WorksheetResponse setCode(Integer code) { return (WorksheetResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorksheetResponse. */
    @Override public WorksheetResponse setStatus(String status) { return (WorksheetResponse) super.setStatus(status); }

}

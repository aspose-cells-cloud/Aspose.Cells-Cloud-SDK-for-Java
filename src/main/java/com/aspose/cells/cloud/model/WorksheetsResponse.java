package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetsResponse — Represents the Worksheets Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetsResponse extends CellsCloudResponse {
    /** Property `Worksheets` of type `Worksheets` with the XML element name "worksheets" is defined in the class. */
    @JsonProperty("Worksheets")
    private Worksheets worksheets;

    public Worksheets getWorksheets() { return worksheets; }
    public WorksheetsResponse setWorksheets(Worksheets worksheets) { this.worksheets = worksheets; return this; }


    /** Covariant override: keeps fluent chains returning WorksheetsResponse. */
    @Override public WorksheetsResponse setCode(Integer code) { return (WorksheetsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorksheetsResponse. */
    @Override public WorksheetsResponse setStatus(String status) { return (WorksheetsResponse) super.setStatus(status); }

}

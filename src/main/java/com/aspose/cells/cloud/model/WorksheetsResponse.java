package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetsResponse — Represents the Worksheets Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetsResponse extends CellsCloudResponse {
    /** Property `Worksheets` of type `Worksheets` with the XML element name "worksheets" is defined in the class. */
    @JsonProperty("Worksheets")
    private Worksheets worksheets;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Worksheets getWorksheets() { return worksheets; }
    public WorksheetsResponse setWorksheets(Worksheets worksheets) { this.worksheets = worksheets; return this; }

    public Integer getCode() { return code; }
    public WorksheetsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorksheetsResponse setStatus(String status) { this.status = status; return this; }

}

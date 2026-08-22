package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetReplaceResponse — Represents the WorksheetReplace Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetReplaceResponse extends CellsCloudResponse {
    /** "An integer property named Matches decorated with the XmlElement attribute." */
    @JsonProperty("Matches")
    private Integer matches;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private LinkElement worksheet;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Integer getMatches() { return matches; }
    public WorksheetReplaceResponse setMatches(Integer matches) { this.matches = matches; return this; }

    public LinkElement getWorksheet() { return worksheet; }
    public WorksheetReplaceResponse setWorksheet(LinkElement worksheet) { this.worksheet = worksheet; return this; }

    public Integer getCode() { return code; }
    public WorksheetReplaceResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorksheetReplaceResponse setStatus(String status) { this.status = status; return this; }

}

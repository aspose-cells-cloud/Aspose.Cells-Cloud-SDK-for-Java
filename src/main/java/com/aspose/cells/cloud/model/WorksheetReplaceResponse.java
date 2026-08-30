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

    public Integer getMatches() { return matches; }
    public WorksheetReplaceResponse setMatches(Integer matches) { this.matches = matches; return this; }

    public LinkElement getWorksheet() { return worksheet; }
    public WorksheetReplaceResponse setWorksheet(LinkElement worksheet) { this.worksheet = worksheet; return this; }


    /** Covariant override: keeps fluent chains returning WorksheetReplaceResponse. */
    @Override public WorksheetReplaceResponse setCode(Integer code) { return (WorksheetReplaceResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorksheetReplaceResponse. */
    @Override public WorksheetReplaceResponse setStatus(String status) { return (WorksheetReplaceResponse) super.setStatus(status); }

}

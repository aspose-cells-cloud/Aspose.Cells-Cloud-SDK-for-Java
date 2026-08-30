package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookReplaceResponse — Represents the WorkbookReplace Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookReplaceResponse extends CellsCloudResponse {
    /** Property summary: An integer property named "Matches" with an XmlElement attribute. */
    @JsonProperty("Matches")
    private Integer matches;

    /** Gets or sets Workbook. */
    @JsonProperty("Workbook")
    private LinkElement workbook;

    public Integer getMatches() { return matches; }
    public WorkbookReplaceResponse setMatches(Integer matches) { this.matches = matches; return this; }

    public LinkElement getWorkbook() { return workbook; }
    public WorkbookReplaceResponse setWorkbook(LinkElement workbook) { this.workbook = workbook; return this; }


    /** Covariant override: keeps fluent chains returning WorkbookReplaceResponse. */
    @Override public WorkbookReplaceResponse setCode(Integer code) { return (WorkbookReplaceResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorkbookReplaceResponse. */
    @Override public WorkbookReplaceResponse setStatus(String status) { return (WorkbookReplaceResponse) super.setStatus(status); }

}

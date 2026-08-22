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

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Integer getMatches() { return matches; }
    public WorkbookReplaceResponse setMatches(Integer matches) { this.matches = matches; return this; }

    public LinkElement getWorkbook() { return workbook; }
    public WorkbookReplaceResponse setWorkbook(LinkElement workbook) { this.workbook = workbook; return this; }

    public Integer getCode() { return code; }
    public WorkbookReplaceResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorkbookReplaceResponse setStatus(String status) { this.status = status; return this; }

}

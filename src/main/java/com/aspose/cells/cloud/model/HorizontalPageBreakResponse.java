package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HorizontalPageBreakResponse — Represents the HorizontalPageBreak Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HorizontalPageBreakResponse extends CellsCloudResponse {
    /** HorizontalPageBreak is a property of the class that represents a horizontal page break. */
    @JsonProperty("HorizontalPageBreak")
    private HorizontalPageBreak horizontalPageBreak;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public HorizontalPageBreak getHorizontalPageBreak() { return horizontalPageBreak; }
    public HorizontalPageBreakResponse setHorizontalPageBreak(HorizontalPageBreak horizontalPageBreak) { this.horizontalPageBreak = horizontalPageBreak; return this; }

    public Integer getCode() { return code; }
    public HorizontalPageBreakResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public HorizontalPageBreakResponse setStatus(String status) { this.status = status; return this; }

}

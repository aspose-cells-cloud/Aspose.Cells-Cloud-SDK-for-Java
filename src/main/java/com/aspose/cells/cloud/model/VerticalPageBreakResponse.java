package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VerticalPageBreakResponse — Represents the VerticalPageBreak Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerticalPageBreakResponse extends CellsCloudResponse {
    /** The class has a property that represents a vertical page break. */
    @JsonProperty("VerticalPageBreak")
    private VerticalPageBreak verticalPageBreak;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public VerticalPageBreak getVerticalPageBreak() { return verticalPageBreak; }
    public VerticalPageBreakResponse setVerticalPageBreak(VerticalPageBreak verticalPageBreak) { this.verticalPageBreak = verticalPageBreak; return this; }

    public Integer getCode() { return code; }
    public VerticalPageBreakResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public VerticalPageBreakResponse setStatus(String status) { this.status = status; return this; }

}

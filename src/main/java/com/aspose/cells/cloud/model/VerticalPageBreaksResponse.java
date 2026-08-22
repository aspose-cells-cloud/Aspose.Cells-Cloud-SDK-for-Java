package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VerticalPageBreaksResponse — Represents the VerticalPageBreaks Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerticalPageBreaksResponse extends CellsCloudResponse {
    /** This class has a property named VerticalPageBreaks of type VerticalPageBreaks that can be both read from and written to. */
    @JsonProperty("VerticalPageBreaks")
    private VerticalPageBreaks verticalPageBreaks;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public VerticalPageBreaks getVerticalPageBreaks() { return verticalPageBreaks; }
    public VerticalPageBreaksResponse setVerticalPageBreaks(VerticalPageBreaks verticalPageBreaks) { this.verticalPageBreaks = verticalPageBreaks; return this; }

    public Integer getCode() { return code; }
    public VerticalPageBreaksResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public VerticalPageBreaksResponse setStatus(String status) { this.status = status; return this; }

}

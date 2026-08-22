package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HorizontalPageBreaksResponse — Represents the HorizontalPageBreaks Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HorizontalPageBreaksResponse extends CellsCloudResponse {
    /** The property "HorizontalPageBreaks" allows getting and setting horizontal page breaks for the class. */
    @JsonProperty("HorizontalPageBreaks")
    private HorizontalPageBreaks horizontalPageBreaks;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public HorizontalPageBreaks getHorizontalPageBreaks() { return horizontalPageBreaks; }
    public HorizontalPageBreaksResponse setHorizontalPageBreaks(HorizontalPageBreaks horizontalPageBreaks) { this.horizontalPageBreaks = horizontalPageBreaks; return this; }

    public Integer getCode() { return code; }
    public HorizontalPageBreaksResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public HorizontalPageBreaksResponse setStatus(String status) { this.status = status; return this; }

}

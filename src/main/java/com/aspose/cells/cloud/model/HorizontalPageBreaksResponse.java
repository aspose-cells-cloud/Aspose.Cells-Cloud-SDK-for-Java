package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HorizontalPageBreaksResponse — Represents the HorizontalPageBreaks Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HorizontalPageBreaksResponse extends CellsCloudResponse {
    /** The property "HorizontalPageBreaks" allows getting and setting horizontal page breaks for the class. */
    @JsonProperty("HorizontalPageBreaks")
    private HorizontalPageBreaks horizontalPageBreaks;

    public HorizontalPageBreaks getHorizontalPageBreaks() { return horizontalPageBreaks; }
    public HorizontalPageBreaksResponse setHorizontalPageBreaks(HorizontalPageBreaks horizontalPageBreaks) { this.horizontalPageBreaks = horizontalPageBreaks; return this; }


    /** Covariant override: keeps fluent chains returning HorizontalPageBreaksResponse. */
    @Override public HorizontalPageBreaksResponse setCode(Integer code) { return (HorizontalPageBreaksResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning HorizontalPageBreaksResponse. */
    @Override public HorizontalPageBreaksResponse setStatus(String status) { return (HorizontalPageBreaksResponse) super.setStatus(status); }

}

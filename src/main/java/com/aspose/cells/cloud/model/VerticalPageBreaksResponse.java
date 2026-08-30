package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VerticalPageBreaksResponse — Represents the VerticalPageBreaks Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerticalPageBreaksResponse extends CellsCloudResponse {
    /** This class has a property named VerticalPageBreaks of type VerticalPageBreaks that can be both read from and written to. */
    @JsonProperty("VerticalPageBreaks")
    private VerticalPageBreaks verticalPageBreaks;

    public VerticalPageBreaks getVerticalPageBreaks() { return verticalPageBreaks; }
    public VerticalPageBreaksResponse setVerticalPageBreaks(VerticalPageBreaks verticalPageBreaks) { this.verticalPageBreaks = verticalPageBreaks; return this; }


    /** Covariant override: keeps fluent chains returning VerticalPageBreaksResponse. */
    @Override public VerticalPageBreaksResponse setCode(Integer code) { return (VerticalPageBreaksResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning VerticalPageBreaksResponse. */
    @Override public VerticalPageBreaksResponse setStatus(String status) { return (VerticalPageBreaksResponse) super.setStatus(status); }

}

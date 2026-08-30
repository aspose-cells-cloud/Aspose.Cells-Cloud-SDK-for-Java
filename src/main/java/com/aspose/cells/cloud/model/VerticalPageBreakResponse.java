package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VerticalPageBreakResponse — Represents the VerticalPageBreak Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerticalPageBreakResponse extends CellsCloudResponse {
    /** The class has a property that represents a vertical page break. */
    @JsonProperty("VerticalPageBreak")
    private VerticalPageBreak verticalPageBreak;

    public VerticalPageBreak getVerticalPageBreak() { return verticalPageBreak; }
    public VerticalPageBreakResponse setVerticalPageBreak(VerticalPageBreak verticalPageBreak) { this.verticalPageBreak = verticalPageBreak; return this; }


    /** Covariant override: keeps fluent chains returning VerticalPageBreakResponse. */
    @Override public VerticalPageBreakResponse setCode(Integer code) { return (VerticalPageBreakResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning VerticalPageBreakResponse. */
    @Override public VerticalPageBreakResponse setStatus(String status) { return (VerticalPageBreakResponse) super.setStatus(status); }

}

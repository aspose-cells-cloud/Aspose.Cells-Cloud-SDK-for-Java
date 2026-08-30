package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HorizontalPageBreakResponse — Represents the HorizontalPageBreak Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HorizontalPageBreakResponse extends CellsCloudResponse {
    /** HorizontalPageBreak is a property of the class that represents a horizontal page break. */
    @JsonProperty("HorizontalPageBreak")
    private HorizontalPageBreak horizontalPageBreak;

    public HorizontalPageBreak getHorizontalPageBreak() { return horizontalPageBreak; }
    public HorizontalPageBreakResponse setHorizontalPageBreak(HorizontalPageBreak horizontalPageBreak) { this.horizontalPageBreak = horizontalPageBreak; return this; }


    /** Covariant override: keeps fluent chains returning HorizontalPageBreakResponse. */
    @Override public HorizontalPageBreakResponse setCode(Integer code) { return (HorizontalPageBreakResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning HorizontalPageBreakResponse. */
    @Override public HorizontalPageBreakResponse setStatus(String status) { return (HorizontalPageBreakResponse) super.setStatus(status); }

}

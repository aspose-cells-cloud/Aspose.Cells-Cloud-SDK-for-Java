package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeSetStyleRequest — Indicates range set style request. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeSetStyleRequest {
    /** Encapsulates the object that represents a range of cells within a spreadsheet. */
    @JsonProperty("Range")
    private Range range;

    /** Represents display style of excel document,such as font,color,alignment,border,etc. */
    @JsonProperty("Style")
    private Style style;

    public Range getRange() { return range; }
    public RangeSetStyleRequest setRange(Range range) { this.range = range; return this; }

    public Style getStyle() { return style; }
    public RangeSetStyleRequest setStyle(Style style) { this.style = style; return this; }

}
